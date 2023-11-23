package gen;

import java.util.ArrayList;

public class MyVisitor extends GrammarBaseVisitor<Thompson>{

    private Thompson t;
    private final ArrayList<String> toAccept;

    public MyVisitor() {
        this.t = new Thompson();
        this.toAccept = new ArrayList<>();
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

        System.out.println("TESTO :"+ctx.FINAl().getText());
        for (char c : ctx.FINAl().getText().toCharArray())  {
            this.t.aggiungiConcatenazioneAllaFIne( Character.toString(c));
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
        System.out.println("Sto in Espressi");
        boolean contieneUnione = this.visit(ctx.espressioneUnione())!= null;
        if(!contieneUnione) this.t = this.visit(ctx.terminali());
        else this.t = this.t.creaOr(this.visit(ctx.terminali()),this.visit(ctx.espressioneUnione()));
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
        System.out.println("OPERATORE");
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
    public Thompson visitProdCaratteri(GrammarParser.ProdCaratteriContext ctx) {
        this.toAccept.add(ctx.FINAl().toString());
        return super.visitProdCaratteri(ctx);
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

        for (int i = ctx.children.size() - 1; i >= 0; i--) {
            visit(ctx.children.get(i));
        }
        for (String s :this.toAccept){
            if (this.t.accept(s)) System.out.println("OK");
            else System.out.println("KO");
        }
        return this.t;
    }
}
