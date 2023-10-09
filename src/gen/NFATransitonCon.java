package gen;

public class NFATransitonCon implements NFATransition{
    private final NFAState start;
    private final NFAState finish;
    private final String simbolo;

    public NFATransitonCon(NFAState start, NFAState finish, String simbolo) {
        this.start = start;
        this.finish = finish;
        this.simbolo = simbolo;
    }

    @Override
    public NFAState statoPartenza() {
        return this.start;
    }

    @Override
    public NFAState statoArrivo() {
        return this.finish;
    }

    @Override
    public String simboloAssociato() {
        return this.simbolo;
    }
}
