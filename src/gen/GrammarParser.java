package gen;// Generated from C:/Users/maria/compil/src/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, FINAl=3, KLEENE=4, COMMA=5, UNION=6, WS=7;
	public static final int
		RULE_start = 0, RULE_listaCaratteri = 1, RULE_listaCaratteri1 = 2, RULE_espressione = 3, 
		RULE_espressioneUnione = 4, RULE_kleene = 5, RULE_terminali = 6, RULE_nuovaEsp = 7, 
		RULE_esprConc = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "listaCaratteri", "listaCaratteri1", "espressione", "espressioneUnione", 
			"kleene", "terminali", "nuovaEsp", "esprConc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, "'*'", "','", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "FINAl", "KLEENE", "COMMA", "UNION", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends StartContext {
		public EspressioneContext espressione() {
			return getRuleContext(EspressioneContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public ListaCaratteriContext listaCaratteri() {
			return getRuleContext(ListaCaratteriContext.class,0);
		}
		public ListContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			_localctx = new ListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			espressione();
			setState(19);
			match(COMMA);
			setState(20);
			listaCaratteri();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaCaratteriContext extends ParserRuleContext {
		public ListaCaratteriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaCaratteri; }
	 
		public ListaCaratteriContext() { }
		public void copyFrom(ListaCaratteriContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProdCaratteriContext extends ListaCaratteriContext {
		public TerminalNode FINAl() { return getToken(GrammarParser.FINAl, 0); }
		public ListaCaratteri1Context listaCaratteri1() {
			return getRuleContext(ListaCaratteri1Context.class,0);
		}
		public ProdCaratteriContext(ListaCaratteriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProdCaratteri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProdCaratteri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProdCaratteri(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProdEpsilonCaratteriContext extends ListaCaratteriContext {
		public ProdEpsilonCaratteriContext(ListaCaratteriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProdEpsilonCaratteri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProdEpsilonCaratteri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProdEpsilonCaratteri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaCaratteriContext listaCaratteri() throws RecognitionException {
		ListaCaratteriContext _localctx = new ListaCaratteriContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaCaratteri);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAl:
				_localctx = new ProdCaratteriContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(FINAl);
				setState(23);
				listaCaratteri1();
				}
				break;
			case EOF:
				_localctx = new ProdEpsilonCaratteriContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaCaratteri1Context extends ParserRuleContext {
		public ListaCaratteri1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaCaratteri1; }
	 
		public ListaCaratteri1Context() { }
		public void copyFrom(ListaCaratteri1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VirgolaEpsilonCaratteriContext extends ListaCaratteri1Context {
		public VirgolaEpsilonCaratteriContext(ListaCaratteri1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVirgolaEpsilonCaratteri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVirgolaEpsilonCaratteri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVirgolaEpsilonCaratteri(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VirgolaCaratteriContext extends ListaCaratteri1Context {
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public ListaCaratteriContext listaCaratteri() {
			return getRuleContext(ListaCaratteriContext.class,0);
		}
		public VirgolaCaratteriContext(ListaCaratteri1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVirgolaCaratteri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVirgolaCaratteri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitVirgolaCaratteri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaCaratteri1Context listaCaratteri1() throws RecognitionException {
		ListaCaratteri1Context _localctx = new ListaCaratteri1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_listaCaratteri1);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				_localctx = new VirgolaCaratteriContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(COMMA);
				setState(28);
				listaCaratteri();
				}
				break;
			case EOF:
				_localctx = new VirgolaEpsilonCaratteriContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspressioneContext extends ParserRuleContext {
		public EspressioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espressione; }
	 
		public EspressioneContext() { }
		public void copyFrom(EspressioneContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EspressiContext extends EspressioneContext {
		public TerminaliContext terminali() {
			return getRuleContext(TerminaliContext.class,0);
		}
		public EspressioneUnioneContext espressioneUnione() {
			return getRuleContext(EspressioneUnioneContext.class,0);
		}
		public EspressiContext(EspressioneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEspressi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEspressi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEspressi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspressioneContext espressione() throws RecognitionException {
		EspressioneContext _localctx = new EspressioneContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_espressione);
		try {
			_localctx = new EspressiContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			terminali();
			setState(33);
			espressioneUnione();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspressioneUnioneContext extends ParserRuleContext {
		public EspressioneUnioneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espressioneUnione; }
	 
		public EspressioneUnioneContext() { }
		public void copyFrom(EspressioneUnioneContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EsprUnioneContext extends EspressioneUnioneContext {
		public TerminalNode UNION() { return getToken(GrammarParser.UNION, 0); }
		public TerminaliContext terminali() {
			return getRuleContext(TerminaliContext.class,0);
		}
		public EspressioneUnioneContext espressioneUnione() {
			return getRuleContext(EspressioneUnioneContext.class,0);
		}
		public EsprUnioneContext(EspressioneUnioneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEsprUnione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEsprUnione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEsprUnione(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EpsilonUnioneContext extends EspressioneUnioneContext {
		public EpsilonUnioneContext(EspressioneUnioneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEpsilonUnione(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEpsilonUnione(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEpsilonUnione(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspressioneUnioneContext espressioneUnione() throws RecognitionException {
		EspressioneUnioneContext _localctx = new EspressioneUnioneContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_espressioneUnione);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNION:
				_localctx = new EsprUnioneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(UNION);
				setState(36);
				terminali();
				setState(37);
				espressioneUnione();
				}
				break;
			case T__1:
			case COMMA:
				_localctx = new EpsilonUnioneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KleeneContext extends ParserRuleContext {
		public KleeneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kleene; }
	 
		public KleeneContext() { }
		public void copyFrom(KleeneContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EsprKleeneContext extends KleeneContext {
		public TerminalNode KLEENE() { return getToken(GrammarParser.KLEENE, 0); }
		public EsprKleeneContext(KleeneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEsprKleene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEsprKleene(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEsprKleene(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EsprEpsilonKleeneContext extends KleeneContext {
		public EsprEpsilonKleeneContext(KleeneContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEsprEpsilonKleene(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEsprEpsilonKleene(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEsprEpsilonKleene(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KleeneContext kleene() throws RecognitionException {
		KleeneContext _localctx = new KleeneContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_kleene);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KLEENE:
				_localctx = new EsprKleeneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(KLEENE);
				}
				break;
			case T__0:
			case T__1:
			case FINAl:
			case COMMA:
			case UNION:
				_localctx = new EsprEpsilonKleeneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminaliContext extends ParserRuleContext {
		public TerminaliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminali; }
	 
		public TerminaliContext() { }
		public void copyFrom(TerminaliContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperatoreContext extends TerminaliContext {
		public NuovaEspContext nuovaEsp() {
			return getRuleContext(NuovaEspContext.class,0);
		}
		public EsprConcContext esprConc() {
			return getRuleContext(EsprConcContext.class,0);
		}
		public OperatoreContext(TerminaliContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOperatore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOperatore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOperatore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminaliContext terminali() throws RecognitionException {
		TerminaliContext _localctx = new TerminaliContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_terminali);
		try {
			_localctx = new OperatoreContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			nuovaEsp();
			setState(47);
			esprConc();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NuovaEspContext extends ParserRuleContext {
		public NuovaEspContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuovaEsp; }
	 
		public NuovaEspContext() { }
		public void copyFrom(NuovaEspContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CarattereContext extends NuovaEspContext {
		public TerminalNode FINAl() { return getToken(GrammarParser.FINAl, 0); }
		public CarattereContext(NuovaEspContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCarattere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCarattere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCarattere(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NuovaEsprParentesiContext extends NuovaEspContext {
		public EspressioneContext espressione() {
			return getRuleContext(EspressioneContext.class,0);
		}
		public KleeneContext kleene() {
			return getRuleContext(KleeneContext.class,0);
		}
		public NuovaEsprParentesiContext(NuovaEspContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNuovaEsprParentesi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNuovaEsprParentesi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNuovaEsprParentesi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NuovaEspContext nuovaEsp() throws RecognitionException {
		NuovaEspContext _localctx = new NuovaEspContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nuovaEsp);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new NuovaEsprParentesiContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__0);
				setState(50);
				espressione();
				setState(51);
				match(T__1);
				setState(52);
				kleene();
				}
				break;
			case FINAl:
				_localctx = new CarattereContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(FINAl);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EsprConcContext extends ParserRuleContext {
		public EsprConcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_esprConc; }
	 
		public EsprConcContext() { }
		public void copyFrom(EsprConcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatEpsilonContext extends EsprConcContext {
		public ConcatEpsilonContext(EsprConcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConcatEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConcatEpsilon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitConcatEpsilon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatContext extends EsprConcContext {
		public NuovaEspContext nuovaEsp() {
			return getRuleContext(NuovaEspContext.class,0);
		}
		public EsprConcContext esprConc() {
			return getRuleContext(EsprConcContext.class,0);
		}
		public ConcatContext(EsprConcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsprConcContext esprConc() throws RecognitionException {
		EsprConcContext _localctx = new EsprConcContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_esprConc);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case FINAl:
				_localctx = new ConcatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				nuovaEsp();
				setState(58);
				esprConc();
				}
				break;
			case T__1:
			case COMMA:
			case UNION:
				_localctx = new ConcatEpsilonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0007@\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u001f\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		")\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005-\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u00078\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b>\b\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0000\u0000<\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0019\u0001"+
		"\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000\u0000\u0006 \u0001\u0000"+
		"\u0000\u0000\b(\u0001\u0000\u0000\u0000\n,\u0001\u0000\u0000\u0000\f."+
		"\u0001\u0000\u0000\u0000\u000e7\u0001\u0000\u0000\u0000\u0010=\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0003\u0006\u0003\u0000\u0013\u0014\u0005\u0005"+
		"\u0000\u0000\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0001\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005\u0003\u0000\u0000\u0017\u001a\u0003\u0004"+
		"\u0002\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000"+
		"\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0005\u0005\u0000\u0000\u001c\u001f\u0003\u0002"+
		"\u0001\u0000\u001d\u001f\u0001\u0000\u0000\u0000\u001e\u001b\u0001\u0000"+
		"\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\u0005\u0001\u0000"+
		"\u0000\u0000 !\u0003\f\u0006\u0000!\"\u0003\b\u0004\u0000\"\u0007\u0001"+
		"\u0000\u0000\u0000#$\u0005\u0006\u0000\u0000$%\u0003\f\u0006\u0000%&\u0003"+
		"\b\u0004\u0000&)\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(#"+
		"\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\t\u0001\u0000\u0000"+
		"\u0000*-\u0005\u0004\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,+\u0001\u0000\u0000\u0000-\u000b\u0001\u0000\u0000\u0000"+
		"./\u0003\u000e\u0007\u0000/0\u0003\u0010\b\u00000\r\u0001\u0000\u0000"+
		"\u000012\u0005\u0001\u0000\u000023\u0003\u0006\u0003\u000034\u0005\u0002"+
		"\u0000\u000045\u0003\n\u0005\u000058\u0001\u0000\u0000\u000068\u0005\u0003"+
		"\u0000\u000071\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008\u000f"+
		"\u0001\u0000\u0000\u00009:\u0003\u000e\u0007\u0000:;\u0003\u0010\b\u0000"+
		";>\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000"+
		"\u0000=<\u0001\u0000\u0000\u0000>\u0011\u0001\u0000\u0000\u0000\u0006"+
		"\u0019\u001e(,7=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}