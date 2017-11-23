// Generated from VisualNovel.g4 by ANTLR 4.7
package visual.novel.test.vnlanguage;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VisualNovelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CADEIA=8, PERSONAGEM=9, 
		WS=10;
	public static final int
		RULE_programa = 0, RULE_cabecalho = 1, RULE_corpo = 2, RULE_titulo = 3, 
		RULE_personagens = 4, RULE_cenarios = 5, RULE_recursos = 6, RULE_recurso = 7;
	public static final String[] ruleNames = {
		"programa", "cabecalho", "corpo", "titulo", "personagens", "cenarios", 
		"recursos", "recurso"
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

	@Override
	public String getGrammarFileName() { return "VisualNovel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VisualNovelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public CabecalhoContext cabecalho() {
			return getRuleContext(CabecalhoContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			cabecalho();
			setState(17);
			corpo();
			setState(18);
			match(T__0);
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

	public static class CabecalhoContext extends ParserRuleContext {
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public PersonagensContext personagens() {
			return getRuleContext(PersonagensContext.class,0);
		}
		public CenariosContext cenarios() {
			return getRuleContext(CenariosContext.class,0);
		}
		public RecursosContext recursos() {
			return getRuleContext(RecursosContext.class,0);
		}
		public CabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterCabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitCabecalho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitCabecalho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabecalhoContext cabecalho() throws RecognitionException {
		CabecalhoContext _localctx = new CabecalhoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			titulo();
			setState(21);
			personagens();
			setState(22);
			cenarios();
			setState(23);
			recursos();
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

	public static class CorpoContext extends ParserRuleContext {
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class TituloContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(VisualNovelParser.CADEIA, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T__1);
			setState(28);
			match(CADEIA);
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

	public static class PersonagensContext extends ParserRuleContext {
		public PersonagensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personagens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterPersonagens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitPersonagens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitPersonagens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonagensContext personagens() throws RecognitionException {
		PersonagensContext _localctx = new PersonagensContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_personagens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__2);
			setState(31);
			match(T__3);
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

	public static class CenariosContext extends ParserRuleContext {
		public CenariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cenarios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterCenarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitCenarios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitCenarios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenariosContext cenarios() throws RecognitionException {
		CenariosContext _localctx = new CenariosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cenarios);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__4);
			setState(34);
			match(T__3);
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

	public static class RecursosContext extends ParserRuleContext {
		public RecursoContext recurso() {
			return getRuleContext(RecursoContext.class,0);
		}
		public RecursosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterRecursos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitRecursos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitRecursos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursosContext recursos() throws RecognitionException {
		RecursosContext _localctx = new RecursosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_recursos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__5);
			setState(37);
			recurso();
			setState(38);
			match(T__3);
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

	public static class RecursoContext extends ParserRuleContext {
		public TerminalNode PERSONAGEM() { return getToken(VisualNovelParser.PERSONAGEM, 0); }
		public TerminalNode CADEIA() { return getToken(VisualNovelParser.CADEIA, 0); }
		public RecursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recurso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterRecurso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitRecurso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitRecurso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursoContext recurso() throws RecognitionException {
		RecursoContext _localctx = new RecursoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_recurso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(PERSONAGEM);
			setState(41);
			match(T__6);
			setState(42);
			match(CADEIA);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\2&\2\22\3\2\2\2"+
		"\4\26\3\2\2\2\6\33\3\2\2\2\b\35\3\2\2\2\n \3\2\2\2\f#\3\2\2\2\16&\3\2"+
		"\2\2\20*\3\2\2\2\22\23\5\4\3\2\23\24\5\6\4\2\24\25\7\3\2\2\25\3\3\2\2"+
		"\2\26\27\5\b\5\2\27\30\5\n\6\2\30\31\5\f\7\2\31\32\5\16\b\2\32\5\3\2\2"+
		"\2\33\34\3\2\2\2\34\7\3\2\2\2\35\36\7\4\2\2\36\37\7\n\2\2\37\t\3\2\2\2"+
		" !\7\5\2\2!\"\7\6\2\2\"\13\3\2\2\2#$\7\7\2\2$%\7\6\2\2%\r\3\2\2\2&\'\7"+
		"\b\2\2\'(\5\20\t\2()\7\6\2\2)\17\3\2\2\2*+\7\13\2\2+,\7\t\2\2,-\7\n\2"+
		"\2-\21\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}