package gen;

import java.util.ArrayList;

public interface NFAState {
    /**
     * @return il nome dello stato
     */
    public String getName();

    /**
     * Ti dice se lo stato è finale o meno
     * @return true se è finale
     */
    public boolean isFinal();

    /**
     * Ti dice se sia iniziale o meno
     * @return true se è lo stato iniziale
     */
    public boolean inStart();

    /**
     * @return le transizioni uscenti dal nodo
     */
    public ArrayList<NFATransition> transizioniUscenti();

    public void addTransizione(NFATransition t);

    public void setFinale(boolean finale);
    public void setIniziale(boolean iniziale);

}
