package gen;// Generated from C:/Users/maria/compil/src/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class
GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, FINAl=3, KLEENE=4, COMMA=5, UNION=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "FINAl", "KLEENE", "COMMA", "UNION", "WS"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0007A\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002\u0015\b\u0002"+
		"\u000b\u0002\f\u0002\u0016\u0001\u0002\u0003\u0002\u001a\b\u0002\u0001"+
		"\u0002\u0004\u0002\u001d\b\u0002\u000b\u0002\f\u0002\u001e\u0001\u0002"+
		"\u0003\u0002\"\b\u0002\u0001\u0002\u0004\u0002%\b\u0002\u000b\u0002\f"+
		"\u0002&\u0001\u0002\u0003\u0002*\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00023\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0004\u0006<\b\u0006\u000b\u0006\f\u0006=\u0001\u0006"+
		"\u0001\u0006\u0000\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u0001\u0000\u0004\u0001\u0000az\u0001"+
		"\u0000AZ\u0001\u000009\u0002\u0000\t\n\r\rJ\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001"+
		"\u000f\u0001\u0000\u0000\u0000\u0003\u0011\u0001\u0000\u0000\u0000\u0005"+
		"2\u0001\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000\t6\u0001\u0000"+
		"\u0000\u0000\u000b8\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0005(\u0000\u0000\u0010\u0002\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005)\u0000\u0000\u0012\u0004\u0001\u0000\u0000\u0000\u0013\u0015"+
		"\u0007\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0017"+
		"\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000\u0018\u001a"+
		"\u0005*\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a3\u0001\u0000\u0000\u0000\u001b\u001d\u0007\u0001"+
		"\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \"\u0005*\u0000\u0000! \u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"3\u0001\u0000\u0000\u0000"+
		"#%\u0007\u0002\u0000\u0000$#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000"+
		"\u0000\u0000(*\u0005*\u0000\u0000)(\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*3\u0001\u0000\u0000\u0000+,\u0005e\u0000\u0000,-\u0005p\u0000"+
		"\u0000-.\u0005s\u0000\u0000./\u0005i\u0000\u0000/0\u0005l\u0000\u0000"+
		"01\u0005o\u0000\u000013\u0005n\u0000\u00002\u0014\u0001\u0000\u0000\u0000"+
		"2\u001c\u0001\u0000\u0000\u00002$\u0001\u0000\u0000\u00002+\u0001\u0000"+
		"\u0000\u00003\u0006\u0001\u0000\u0000\u000045\u0005*\u0000\u00005\b\u0001"+
		"\u0000\u0000\u000067\u0005,\u0000\u00007\n\u0001\u0000\u0000\u000089\u0005"+
		"+\u0000\u00009\f\u0001\u0000\u0000\u0000:<\u0007\u0003\u0000\u0000;:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		"=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0006\u0006\u0000"+
		"\u0000@\u000e\u0001\u0000\u0000\u0000\t\u0000\u0016\u0019\u001e!&)2=\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}