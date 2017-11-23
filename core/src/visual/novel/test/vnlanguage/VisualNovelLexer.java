// Generated from VisualNovel.g4 by ANTLR 4.7
package visual.novel.test.vnlanguage;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VisualNovelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CADEIA=8, PERSONAGEM=9, 
		WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "CADEIA", "PERSONAGEM", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FIM'", "'TITULO:'", "'PERSONAGENS:'", "'.'", "'CENARIOS:'", "'RECURSOS:'", 
		"'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "CADEIA", "PERSONAGEM", 
		"WS"
	};
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


	public VisualNovelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VisualNovel.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f_\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\7"+
		"\tK\n\t\f\t\16\tN\13\t\3\t\3\t\3\n\3\n\7\nT\n\n\f\n\16\nW\13\n\3\13\6"+
		"\13Z\n\13\r\13\16\13[\3\13\3\13\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\3\2\6\4\2\f\f\17\17\3\2C\\\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3"+
		"\2\2\2\5\33\3\2\2\2\7#\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r<\3\2\2\2\17"+
		"F\3\2\2\2\21H\3\2\2\2\23Q\3\2\2\2\25Y\3\2\2\2\27\30\7H\2\2\30\31\7K\2"+
		"\2\31\32\7O\2\2\32\4\3\2\2\2\33\34\7V\2\2\34\35\7K\2\2\35\36\7V\2\2\36"+
		"\37\7W\2\2\37 \7N\2\2 !\7Q\2\2!\"\7<\2\2\"\6\3\2\2\2#$\7R\2\2$%\7G\2\2"+
		"%&\7T\2\2&\'\7U\2\2\'(\7Q\2\2()\7P\2\2)*\7C\2\2*+\7I\2\2+,\7G\2\2,-\7"+
		"P\2\2-.\7U\2\2./\7<\2\2/\b\3\2\2\2\60\61\7\60\2\2\61\n\3\2\2\2\62\63\7"+
		"E\2\2\63\64\7G\2\2\64\65\7P\2\2\65\66\7C\2\2\66\67\7T\2\2\678\7K\2\28"+
		"9\7Q\2\29:\7U\2\2:;\7<\2\2;\f\3\2\2\2<=\7T\2\2=>\7G\2\2>?\7E\2\2?@\7W"+
		"\2\2@A\7T\2\2AB\7U\2\2BC\7Q\2\2CD\7U\2\2DE\7<\2\2E\16\3\2\2\2FG\7?\2\2"+
		"G\20\3\2\2\2HL\7$\2\2IK\n\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2"+
		"\2MO\3\2\2\2NL\3\2\2\2OP\7$\2\2P\22\3\2\2\2QU\t\3\2\2RT\t\4\2\2SR\3\2"+
		"\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\24\3\2\2\2WU\3\2\2\2XZ\t\5\2\2YX\3"+
		"\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\13\2\2^\26\3\2\2"+
		"\2\6\2LU[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}