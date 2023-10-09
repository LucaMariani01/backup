package gen;

public interface NFATransition {
    /**
     * @return stato di partenza della transizione
     */
    public NFAState statoPartenza();

    /**
     * @return stato di arrivo della transizione
     */
    public NFAState statoArrivo();

    /**
     * @return restituisce il simbolo associato nella transizione
     */
    public String simboloAssociato();
}
