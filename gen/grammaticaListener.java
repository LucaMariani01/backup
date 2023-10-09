// Generated from C:/Users/maria/compil/src/grammatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammaticaParser}.
 */
public interface grammaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code list}
	 * labeled alternative in {@link grammaticaParser#start}.
	 * @param ctx the parse tree
	 */
	void enterList(grammaticaParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list}
	 * labeled alternative in {@link grammaticaParser#start}.
	 * @param ctx the parse tree
	 */
	void exitList(grammaticaParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accept}
	 * labeled alternative in {@link grammaticaParser#start1}.
	 * @param ctx the parse tree
	 */
	void enterAccept(grammaticaParser.AcceptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accept}
	 * labeled alternative in {@link grammaticaParser#start1}.
	 * @param ctx the parse tree
	 */
	void exitAccept(grammaticaParser.AcceptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nuovaEspressioneParantesi}
	 * labeled alternative in {@link grammaticaParser#generatore}.
	 * @param ctx the parse tree
	 */
	void enterNuovaEspressioneParantesi(grammaticaParser.NuovaEspressioneParantesiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nuovaEspressioneParantesi}
	 * labeled alternative in {@link grammaticaParser#generatore}.
	 * @param ctx the parse tree
	 */
	void exitNuovaEspressioneParantesi(grammaticaParser.NuovaEspressioneParantesiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nuovaEspressione}
	 * labeled alternative in {@link grammaticaParser#generatore}.
	 * @param ctx the parse tree
	 */
	void enterNuovaEspressione(grammaticaParser.NuovaEspressioneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nuovaEspressione}
	 * labeled alternative in {@link grammaticaParser#generatore}.
	 * @param ctx the parse tree
	 */
	void exitNuovaEspressione(grammaticaParser.NuovaEspressioneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rigenera}
	 * labeled alternative in {@link grammaticaParser#gen1}.
	 * @param ctx the parse tree
	 */
	void enterRigenera(grammaticaParser.RigeneraContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rigenera}
	 * labeled alternative in {@link grammaticaParser#gen1}.
	 * @param ctx the parse tree
	 */
	void exitRigenera(grammaticaParser.RigeneraContext ctx);
	/**
	 * Enter a parse tree produced by the {@code somma}
	 * labeled alternative in {@link grammaticaParser#gen1}.
	 * @param ctx the parse tree
	 */
	void enterSomma(grammaticaParser.SommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code somma}
	 * labeled alternative in {@link grammaticaParser#gen1}.
	 * @param ctx the parse tree
	 */
	void exitSomma(grammaticaParser.SommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stellaSi}
	 * labeled alternative in {@link grammaticaParser#stella}.
	 * @param ctx the parse tree
	 */
	void enterStellaSi(grammaticaParser.StellaSiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stellaSi}
	 * labeled alternative in {@link grammaticaParser#stella}.
	 * @param ctx the parse tree
	 */
	void exitStellaSi(grammaticaParser.StellaSiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stellaNO}
	 * labeled alternative in {@link grammaticaParser#stella}.
	 * @param ctx the parse tree
	 */
	void enterStellaNO(grammaticaParser.StellaNOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stellaNO}
	 * labeled alternative in {@link grammaticaParser#stella}.
	 * @param ctx the parse tree
	 */
	void exitStellaNO(grammaticaParser.StellaNOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conct}
	 * labeled alternative in {@link grammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConct(grammaticaParser.ConctContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conct}
	 * labeled alternative in {@link grammaticaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConct(grammaticaParser.ConctContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chiudo}
	 * labeled alternative in {@link grammaticaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterChiudo(grammaticaParser.ChiudoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chiudo}
	 * labeled alternative in {@link grammaticaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitChiudo(grammaticaParser.ChiudoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sommaParentesi}
	 * labeled alternative in {@link grammaticaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSommaParentesi(grammaticaParser.SommaParentesiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sommaParentesi}
	 * labeled alternative in {@link grammaticaParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSommaParentesi(grammaticaParser.SommaParentesiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link grammaticaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterOr(grammaticaParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link grammaticaParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitOr(grammaticaParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rigenero}
	 * labeled alternative in {@link grammaticaParser#possibilita}.
	 * @param ctx the parse tree
	 */
	void enterRigenero(grammaticaParser.RigeneroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rigenero}
	 * labeled alternative in {@link grammaticaParser#possibilita}.
	 * @param ctx the parse tree
	 */
	void exitRigenero(grammaticaParser.RigeneroContext ctx);
}