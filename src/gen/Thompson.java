package gen;

public class Thompson implements ThompsonNFA{
    private  NFAState start;
    private  NFAState finale;

    public void setStart(NFAState start) {
        this.start = start;
    }

    public void setFinale(NFAState finale) {
        this.finale = finale;
    }

    public Thompson(NFAState start, NFAState finale) {
        if (start.inStart() && finale.isFinal()) {
            this.start = start;
            this.finale = finale;
        }else throw new IllegalArgumentException();
    }

    @Override
    public NFAState getStatoIniziale() {
        return this.start;
    }

    @Override
    public NFAState getStatoFinale() {
        return this.finale;
    }

    @Override
    public boolean accept(String s) {
        NFAState temp =this.start;

        for (int i=0 ; i<=s.length();i++){
            int finalI = i;
            if(temp.transizioniUscenti().
                    stream().anyMatch(e->(e.simboloAssociato()==s.charAt(finalI))))
                temp = temp.transizioniUscenti().stream().filter(e->(e.simboloAssociato()==s.charAt(finalI))).findFirst().get().statoArrivo();
            else{
                //utilizzo & come "espilon"
                if(temp.transizioniUscenti().
                        stream().anyMatch(e->(e.simboloAssociato()=='&')))
                    temp = temp.transizioniUscenti().stream().filter(e->(e.simboloAssociato()=='&')).findFirst().get().statoArrivo();
                else return false;
            }
        }

        return temp.isFinal();

    }
}
