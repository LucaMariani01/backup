// Generated from C:/Users/maria/compil/src/grammatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code list}
	 * labeled alternative in {@link grammaticaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(grammaticaParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code accept}
	 * labeled alternative in {@link grammaticaParser#start1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccept(grammaticaParser.AcceptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nuovaEspressioneParantesi}
	 * labeled alternative in {@link grammaticaParser#generatore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNuovaEspressioneParantesi(grammaticaParser.NuovaEspressioneParantesiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nuovaEspressione}
	 * labeled alternative in {@link grammaticaParser#generatore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNuovaEspressione(grammaticaParser.NuovaEspressioneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rigenera}
	 * labeled alternative in {@link grammaticaParser#gen1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRigenera(grammaticaParser.RigeneraContext ctx);
	/**
	 * Visit a parse tree produced by the {@code somma}
	 * labeled alternative in {@link grammaticaParser#gen1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomma(grammaticaParser.SommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stellaSi}
	 * labeled alternative in {@link grammaticaParser#stella}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStellaSi(grammaticaParser.StellaSiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stellaNO}
	 * labeled alternative in {@link grammaticaParser#stella}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStellaNO(grammaticaParser.StellaNOContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conct}
	 * labeled alternative in {@link grammaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConct(grammaticaParser.ConctContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chiudo}
	 * labeled alternative in {@link grammaticaParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChiudo(grammaticaParser.ChiudoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sommaParentesi}
	 * labeled alternative in {@link grammaticaParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSommaParentesi(grammaticaParser.SommaParentesiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link grammaticaParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(grammaticaParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rigenero}
	 * labeled alternative in {@link grammaticaParser#possibilita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRigenero(grammaticaParser.RigeneroContext ctx);
}