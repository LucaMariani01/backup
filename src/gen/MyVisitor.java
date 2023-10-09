package gen;

public class MyVisitor extends grammaticaBaseVisitor{

    private Thompson t;
    private int contatoreStati;

    public MyVisitor() {
        this.t = new Thompson();
        this.contatoreStati = 0;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitList(grammaticaParser.ListContext ctx) {
        if (this.contatoreStati == 0){
            this.t = new Thompson();
        }
        return super.visitList(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitAccept(grammaticaParser.AcceptContext ctx) {
        if (this.t.accept("??")) System.out.println("OKOKOK");
        else System.out.println("KOKOKOKO");
        return super.visitAccept(ctx);
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitNuovaEspressioneParantesi(grammaticaParser.NuovaEspressioneParantesiContext ctx) {

        ctx.getChild(0);
        ctx.expr().
        return super.visitNuovaEspressioneParantesi(ctx);
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitChiudo(grammaticaParser.ChiudoContext ctx) {
        NFAState sIn = new NFAStateCon(""+this.contatoreStati,true,false);
        this.contatoreStati++;
        NFAState sFin = new NFAStateCon(""+this.contatoreStati,false,true);

        NFATransition arco = new NFATransitonCon(sIn,sFin,ctx.FINAl().getSymbol().getText());
        sIn.addTransizione(arco);
        Thompson t = new Thompson(sIn,sFin);
        return super.visitChiudo(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitConct(grammaticaParser.ConctContext ctx) {

        NFAState sIn = new NFAStateCon(""+this.contatoreStati,true,false);
        this.contatoreStati++;
        NFATransition arco = new NFATransitonCon(sIn,this.t.getStatoIniziale(),ctx.FINAl().getSymbol().getText());
        sIn.addTransizione(arco);
        t.getStatoIniziale().setIniziale(false);
         t.setStart(sIn);
        return super.visitConct(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitOr(grammaticaParser.OrContext ctx) {
       NFAState nodoIniziale = new NFAStateCon("or",false,true);
       NFATransition tran = new NFATransitonCon(nodoIniziale,this.t.getStatoIniziale(),"£");
       nodoIniziale.addTransizione(tran);
       this.t.getStatoIniziale().setIniziale(false);
       this.t.setStart(nodoIniziale);
       this.contatoreStati++;

       //todo uguale per destra
        return super.visitOr(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Object visitStellaSi(grammaticaParser.StellaSiContext ctx) {

        this.t.getStatoFinale().addTransizione( new NFATransitonCon(this.t.getStatoFinale(),this.t.getStatoIniziale(),"£"));
        NFAState nodoIniziale = new NFAStateCon("stella",false,true);
        nodoIniziale.addTransizione( new NFATransitonCon(nodoIniziale,this.t.getStatoIniziale(),"£"));
        this.t.getStatoIniziale().setIniziale(false);
        this.t.setStart(nodoIniziale);
        this.contatoreStati++;

        NFAState nodoFInale = new NFAStateCon("stella",false,true);
        nodoIniziale.addTransizione( new NFATransitonCon(this.t.getStatoFinale(),nodoFInale, "£"));
        this.t.getStatoFinale().setFinale(false);
        this.t.setFinale(nodoFInale);
        this.contatoreStati++;

        this.t.getStatoFinale().addTransizione(new NFATransitonCon(this.t.getStatoFinale(),this.t.getStatoIniziale(), "£"));

        return super.visitStellaSi(ctx);
    }

    
}
