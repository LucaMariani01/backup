package gen;// Generated from C:/Users/maria/compil/src/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code list}
	 * labeled alternative in {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterList(GrammarParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list}
	 * labeled alternative in {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitList(GrammarParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prodCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri}.
	 * @param ctx the parse tree
	 */
	void enterProdCaratteri(GrammarParser.ProdCaratteriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prodCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri}.
	 * @param ctx the parse tree
	 */
	void exitProdCaratteri(GrammarParser.ProdCaratteriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prodEpsilonCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri}.
	 * @param ctx the parse tree
	 */
	void enterProdEpsilonCaratteri(GrammarParser.ProdEpsilonCaratteriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prodEpsilonCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri}.
	 * @param ctx the parse tree
	 */
	void exitProdEpsilonCaratteri(GrammarParser.ProdEpsilonCaratteriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code virgolaCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri1}.
	 * @param ctx the parse tree
	 */
	void enterVirgolaCaratteri(GrammarParser.VirgolaCaratteriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code virgolaCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri1}.
	 * @param ctx the parse tree
	 */
	void exitVirgolaCaratteri(GrammarParser.VirgolaCaratteriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code virgolaEpsilonCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri1}.
	 * @param ctx the parse tree
	 */
	void enterVirgolaEpsilonCaratteri(GrammarParser.VirgolaEpsilonCaratteriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code virgolaEpsilonCaratteri}
	 * labeled alternative in {@link GrammarParser#listaCaratteri1}.
	 * @param ctx the parse tree
	 */
	void exitVirgolaEpsilonCaratteri(GrammarParser.VirgolaEpsilonCaratteriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code espressi}
	 * labeled alternative in {@link GrammarParser#espressione}.
	 * @param ctx the parse tree
	 */
	void enterEspressi(GrammarParser.EspressiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code espressi}
	 * labeled alternative in {@link GrammarParser#espressione}.
	 * @param ctx the parse tree
	 */
	void exitEspressi(GrammarParser.EspressiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code esprUnione}
	 * labeled alternative in {@link GrammarParser#espressioneUnione}.
	 * @param ctx the parse tree
	 */
	void enterEsprUnione(GrammarParser.EsprUnioneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code esprUnione}
	 * labeled alternative in {@link GrammarParser#espressioneUnione}.
	 * @param ctx the parse tree
	 */
	void exitEsprUnione(GrammarParser.EsprUnioneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code epsilonUnione}
	 * labeled alternative in {@link GrammarParser#espressioneUnione}.
	 * @param ctx the parse tree
	 */
	void enterEpsilonUnione(GrammarParser.EpsilonUnioneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code epsilonUnione}
	 * labeled alternative in {@link GrammarParser#espressioneUnione}.
	 * @param ctx the parse tree
	 */
	void exitEpsilonUnione(GrammarParser.EpsilonUnioneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code esprKleene}
	 * labeled alternative in {@link GrammarParser#kleene}.
	 * @param ctx the parse tree
	 */
	void enterEsprKleene(GrammarParser.EsprKleeneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code esprKleene}
	 * labeled alternative in {@link GrammarParser#kleene}.
	 * @param ctx the parse tree
	 */
	void exitEsprKleene(GrammarParser.EsprKleeneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code esprEpsilonKleene}
	 * labeled alternative in {@link GrammarParser#kleene}.
	 * @param ctx the parse tree
	 */
	void enterEsprEpsilonKleene(GrammarParser.EsprEpsilonKleeneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code esprEpsilonKleene}
	 * labeled alternative in {@link GrammarParser#kleene}.
	 * @param ctx the parse tree
	 */
	void exitEsprEpsilonKleene(GrammarParser.EsprEpsilonKleeneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operatore}
	 * labeled alternative in {@link GrammarParser#terminali}.
	 * @param ctx the parse tree
	 */
	void enterOperatore(GrammarParser.OperatoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operatore}
	 * labeled alternative in {@link GrammarParser#terminali}.
	 * @param ctx the parse tree
	 */
	void exitOperatore(GrammarParser.OperatoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nuovaEsprParentesi}
	 * labeled alternative in {@link GrammarParser#nuovaEsp}.
	 * @param ctx the parse tree
	 */
	void enterNuovaEsprParentesi(GrammarParser.NuovaEsprParentesiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nuovaEsprParentesi}
	 * labeled alternative in {@link GrammarParser#nuovaEsp}.
	 * @param ctx the parse tree
	 */
	void exitNuovaEsprParentesi(GrammarParser.NuovaEsprParentesiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code carattere}
	 * labeled alternative in {@link GrammarParser#nuovaEsp}.
	 * @param ctx the parse tree
	 */
	void enterCarattere(GrammarParser.CarattereContext ctx);
	/**
	 * Exit a parse tree produced by the {@code carattere}
	 * labeled alternative in {@link GrammarParser#nuovaEsp}.
	 * @param ctx the parse tree
	 */
	void exitCarattere(GrammarParser.CarattereContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concat}
	 * labeled alternative in {@link GrammarParser#esprConc}.
	 * @param ctx the parse tree
	 */
	void enterConcat(GrammarParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link GrammarParser#esprConc}.
	 * @param ctx the parse tree
	 */
	void exitConcat(GrammarParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatEpsilon}
	 * labeled alternative in {@link GrammarParser#esprConc}.
	 * @param ctx the parse tree
	 */
	void enterConcatEpsilon(GrammarParser.ConcatEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatEpsilon}
	 * labeled alternative in {@link GrammarParser#esprConc}.
	 * @param ctx the parse tree
	 */
	void exitConcatEpsilon(GrammarParser.ConcatEpsilonContext ctx);
}