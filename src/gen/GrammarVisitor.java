package gen;// Generated from C:/Users/maria/compil/src/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code list}
	 * labeled alternative in {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(GrammarParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prodCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdCaratteri(GrammarParser.ProdCaratteriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prodEpsilonCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdEpsilonCaratteri(GrammarParser.ProdEpsilonCaratteriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code virgolaCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirgolaCaratteri(GrammarParser.VirgolaCaratteriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code virgolaEpsilonCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirgolaEpsilonCaratteri(GrammarParser.VirgolaEpsilonCaratteriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code espressi}
	 * labeled alternative in {@link GrammarParser#espressione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspressi(GrammarParser.EspressiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code esprUnione}
	 * labeled alternative in {@link GrammarParser#espressioneUnione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsprUnione(GrammarParser.EsprUnioneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code epsilonUnione}
	 * labeled alternative in {@link GrammarParser#espressioneUnione}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEpsilonUnione(GrammarParser.EpsilonUnioneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code esprKleene}
	 * labeled alternative in {@link GrammarParser#kleene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsprKleene(GrammarParser.EsprKleeneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code esprEpsilonKleene}
	 * labeled alternative in {@link GrammarParser#kleene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEsprEpsilonKleene(GrammarParser.EsprEpsilonKleeneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operatore}
	 * labeled alternative in {@link GrammarParser#terminali}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatore(GrammarParser.OperatoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nuovaEsprParentesi}
	 * labeled alternative in {@link GrammarParser#nuovaEsp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNuovaEsprParentesi(GrammarParser.NuovaEsprParentesiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code carattere}
	 * labeled alternative in {@link GrammarParser#nuovaEsp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCarattere(GrammarParser.CarattereContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link GrammarParser#esprConc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(GrammarParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatEpsilon}
	 * labeled alternative in {@link GrammarParser#esprConc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatEpsilon(GrammarParser.ConcatEpsilonContext ctx);
}