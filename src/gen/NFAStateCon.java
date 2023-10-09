package gen;

import java.util.ArrayList;

public class NFAStateCon implements NFAState{

    private final String name;
    private boolean finale;
    private  boolean iniziale;

    private  ArrayList<NFATransition> transitionsM;

    public NFAStateCon(String name, boolean finale, boolean iniziale) {
        this.name = name;
        this.finale = finale;
        this.iniziale = iniziale;
        this.transitionsM = new ArrayList<>();
    }

    public void setFinale(boolean finale) {
        this.finale = finale;
    }

    public void setIniziale(boolean iniziale) {
        this.iniziale = iniziale;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFinal() {
        return this.finale;
    }

    @Override
    public boolean inStart() {
        return this.iniziale;
    }

    public void addTransizione(NFATransition t){this.transitionsM.add(t);}
    @Override
    public ArrayList<NFATransition> transizioniUscenti() {
        return this.transitionsM;
    }
}
