package gen;
import java.util.*;
import java.util.stream.Collectors;

public class Thompson implements ThompsonNFA{
    private  NFAState start;
    private  NFAState finale;

    public void setStart(NFAState start) {
        this.start.setIniziale(false);
        this.start = start;
    }

    public void setFinale(NFAState finale) {
        this.finale.setFinale(false);
        this.finale = finale;
    }

    public Thompson() {
        NFAStateCon nodoIn = new NFAStateCon("CON",false,true);
        NFAStateCon nodoFIn = new NFAStateCon("CON",true,false);
        this.start = nodoIn;
        this.finale = nodoFIn;

    }

    public Thompson(NFAState nodoIn,NFAState nodoFIn) {
        this.start = nodoIn;
        this.finale = nodoFIn;
    }

    @Override
    public NFAState getStatoIniziale() {
        return this.start;
    }

    @Override
    public NFAState getStatoFinale() {
        return this.finale;
    }

    public Thompson aggiungiConcatenazioneAllaFIne(String val){
        NFAStateCon nuovoFinale = new NFAStateCon("con", true, false);
        NFATransition arco = new NFATransitonCon(this.finale, nuovoFinale, val);
        this.finale.addTransizione(arco);
        if (this.getStatoIniziale().transizioniUscenti().size()==0) this.setStart(this.finale);

        this.setFinale(nuovoFinale);
        return new Thompson(this.start,this.finale);

    }

    public Thompson creaOr(Thompson t1,Thompson t2){

        NFAStateCon nodoIn = new NFAStateCon("OR",false,true);
        NFAStateCon nodoFIn = new NFAStateCon("OR",true,false);
        NFATransition arco1 = new NFATransitonCon(nodoIn, t1.getStatoIniziale(), "epsilon");
        NFATransition arco2 = new NFATransitonCon(nodoIn, t2.getStatoIniziale(), "epsilon");
        nodoIn.addTransizione(arco1); nodoIn.addTransizione(arco2);
        t1.getStatoIniziale().setIniziale(false); t2.getStatoIniziale().setIniziale(false);

        NFATransition arco3 = new NFATransitonCon(t1.getStatoFinale(),nodoFIn, "epsilon");
        t1.getStatoFinale().addTransizione(arco3); t1.setFinale(nodoFIn);
        NFATransition arco4 = new NFATransitonCon(t2.getStatoFinale(),nodoFIn ,"epsilon");
        t2.getStatoFinale().addTransizione(arco4); t2.setFinale(nodoFIn);
        return new Thompson(nodoIn,nodoFIn);

    }

    public Thompson concatenaDueAutomi(Thompson t1, Thompson t2) {
        t1.getStatoFinale().addTransizione(new NFATransitonCon(t1.getStatoFinale(), t2.getStatoIniziale(), "epsilon"));
        t1.setFinale(t2.getStatoFinale());
        t2.setStart(t1.getStatoIniziale());
        return new Thompson(t1.getStatoIniziale(), t2.getStatoFinale());
    }

    public Thompson createKleene(Thompson t) {
        NFAStateCon nodoIn = new NFAStateCon("kleene", false, true);
        NFAStateCon nodoFIn = new NFAStateCon("kleene", true, false);

        // Aggiungi un arco epsilon dal nuovo stato iniziale al nuovo stato finale
        nodoIn.addTransizione(new NFATransitonCon(nodoIn, nodoFIn, "epsilon"));

        // Aggiungi un arco epsilon dal vecchio stato finale al vecchio stato iniziale
        t.getStatoFinale().addTransizione(new NFATransitonCon(t.getStatoFinale(), t.getStatoIniziale(), "epsilon"));

        // Aggiungi un arco epsilon dal nuovo stato iniziale al vecchio stato iniziale
        nodoIn.addTransizione(new NFATransitonCon(nodoIn, t.getStatoIniziale(), "epsilon"));
        t.setStart(nodoIn);

        // Aggiungi un arco epsilon dal vecchio stato finale al nuovo stato finale
        t.getStatoFinale().addTransizione(new NFATransitonCon(t.getStatoFinale(), nodoFIn, "epsilon"));
        t.setFinale(nodoFIn);

        // Restituisci un nuovo oggetto Thompson che rappresenta l'operatore di chiusura di Kleene
        return new Thompson(nodoIn, nodoFIn);
    }

    public boolean accept(String input) {
        Set<NFAState> currentStates = epsilonClosure(Collections.singleton(start));

        for (char currentChar : input.toCharArray()) {
            Set<NFAState> nextStates = new HashSet<>();

            for (NFAState state : currentStates) {
                Set<NFAState> transitions = state.transizioniUscenti().stream()
                        .filter(e -> e.simboloAssociato().equals(String.valueOf(currentChar)))
                        .map(NFATransition::statoArrivo)  // Mappa le transizioni ai loro stati di arrivo
                        .collect(Collectors.toSet());
                nextStates.addAll(epsilonClosure(transitions));
            }
            currentStates = nextStates;
        }
        // Verifica se almeno uno degli stati raggiunti è finale
        return currentStates.stream().anyMatch(NFAState::isFinal);
    }

    private Set<NFAState> epsilonClosure(Set<NFAState> states) {
        Set<NFAState> closure = new HashSet<>(states);
        Queue<NFAState> queue = new LinkedList<>(states);

        while (!queue.isEmpty()) {
            NFAState state = queue.poll();
            Set<NFAState> epsilonTransitions = state.transizioniUscenti().stream()
                    .filter(e -> e.simboloAssociato().equals("epsilon"))
                    .map(NFATransition::statoArrivo)  // Mappa le transizioni ai loro stati di arrivo
                    .collect(Collectors.toSet());

            for (NFAState epsilonState : epsilonTransitions) {
                if (closure.add(epsilonState)) {
                    queue.add(epsilonState);
                }
            }
        }

        return closure;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Stato Iniziale: ").append(start).append("\n");
        stringBuilder.append("Stato Finale: ").append(finale).append("\n");

        // Utilizzo una visita in ampiezza per ottenere una rappresentazione dell'automa
        Queue<NFAState> queue = new LinkedList<>();
        Set<NFAState> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            NFAState currentState = queue.poll();
            stringBuilder.append(currentState).append("\n");

            for (NFATransition transition : currentState.transizioniUscenti()) {
                NFAState nextState = transition.statoArrivo();
                stringBuilder.append("  --(").append(transition.simboloAssociato()).append(")--> ").append(nextState);

                if (!visited.contains(nextState)) {
                    queue.add(nextState);
                    visited.add(nextState);
                }

                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

}
