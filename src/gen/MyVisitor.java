package gen;
public class MyVisitor extends GrammarBaseVisitor<Thompson>{
    private Thompson t;
    public MyVisitor() {
        this.t = new Thompson();
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
    public Thompson visitCarattere(GrammarParser.CarattereContext ctx) {
        this.t= new Thompson();
        for (char c : ctx.FINAl().getText().toCharArray())  {
           this.t =  this.t.aggiungiConcatenazioneAllaFIne( Character.toString(c));
        }

        return this.t;
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
    public Thompson visitEspressi(GrammarParser.EspressiContext ctx) {
        Thompson t1 = this.visit(ctx.terminali());
        Thompson t2 = this.visit(ctx.espressioneUnione());

        // Se t2 è null, crea un nuovo Thompson con t1 come iniziale e finale
        if (t2 == null) {
            this.t = new Thompson(t1.getStatoIniziale(), t1.getStatoFinale());
        } else {
            // Altrimenti, crea l'operazione di unione e assegna il risultato a this.t
            this.t = this.t.creaOr(t1, t2);
        }

        // Restituisci this.t
        return this.t;
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
    public Thompson visitEsprKleene(GrammarParser.EsprKleeneContext ctx) {
        return this.t;
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
    public Thompson visitNuovaEsprParentesi(GrammarParser.NuovaEsprParentesiContext ctx) {
        // Controlla se ci sono figli con il nome "epsilonKleene"
        boolean contieneKleene = ctx.children.stream()
                .anyMatch(e -> e instanceof GrammarParser.EsprKleeneContext);

        if (contieneKleene) this.t=this.t.createKleene(this.visit(ctx.espressione()));
        else this.t =this.visit(ctx.espressione());
       return this.t;
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
    public Thompson visitEsprUnione(GrammarParser.EsprUnioneContext ctx) {
        this.t = this.visit(ctx.terminali());
        return this.t;
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
    public Thompson visitConcat(GrammarParser.ConcatContext ctx) {
        boolean contieneCon = ctx.children.stream()
                .anyMatch(e -> e instanceof GrammarParser.ConcatEpsilonContext);
        if (contieneCon) this.t = this.visit(ctx.nuovaEsp());
        else this.t = this.t.concatenaDueAutomi(this.visit(ctx.nuovaEsp()),this.visit(ctx.esprConc()));
        return this.t;
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
    public Thompson visitOperatore(GrammarParser.OperatoreContext ctx) {
        boolean contieneCon = this.visit(ctx.esprConc())==null;
        if (contieneCon) this.t = this.visit(ctx.nuovaEsp());
        else this.t = this.t.concatenaDueAutomi(this.visit(ctx.nuovaEsp()),this.visit(ctx.esprConc()));

        return this.t;
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
    public Thompson visitProdCaratteri(GrammarParser.ProdCaratteriContext ctx) {
        Thompson app = this.visit(ctx.listaCaratteri1());
        if ( app!= null){
            this.t =app;
            this.t = this.t.aggiungiConcatenazioneAllaFIne(ctx.FINAl().getText());
        }
        else {
            this.t = this.t.aggiungiConcatenazioneAllaFIne(ctx.FINAl().getText());
        }
        return this.t;
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
    public Thompson visitVirgolaCaratteri(GrammarParser.VirgolaCaratteriContext ctx) {
        this.t = this.visit(ctx.listaCaratteri());
        return this.t;
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
    public Thompson visitList(GrammarParser.ListContext ctx) {
        NFAState app = this.visit(ctx.listaCaratteri()).getStatoIniziale();
        this.t = this.visit(ctx.espressione());

        while (!app.isFinal()){
            if(this.t.accept(app.transizioniUscenti().get(0).simboloAssociato()))  System.out.println("OKOKOKO");
            else  System.out.println("KOKOKOKO");
            app= app.transizioniUscenti().get(0).statoArrivo();
        }
        return this.t;
    }
}
