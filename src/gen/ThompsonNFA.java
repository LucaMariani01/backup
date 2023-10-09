package gen;

public interface ThompsonNFA {

    /**
     *
     * @return lo stato iniziale
     */
    public NFAState getStatoIniziale();

    /**
     *
     * @return lo stato finale
     */
    public NFAState getStatoFinale();

    /**
     * Metodo che verifica se la stringa passata sia o meno accettata dall'automa
     * @param s stringa da verificare
     * @return true se la stringa è accettata
     */
    public boolean accept(String s);

    public void setStart(NFAState start) ;

    public void setFinale(NFAState finale) ;
}
