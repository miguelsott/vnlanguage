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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		CADEIA=25, PERSONAGEM=26, CENARIO=27, EMOCAO=28, IDENT=29, NUM=30, WS=31;
	public static final int
		RULE_programa = 0, RULE_cabecalho = 1, RULE_corpo = 2, RULE_titulo = 3, 
		RULE_personagens = 4, RULE_cenarios = 5, RULE_recursos = 6, RULE_cena = 7, 
		RULE_nome_cena = 8, RULE_mais_cenas = 9, RULE_mais_personagens = 10, RULE_mais_cenarios = 11, 
		RULE_recurso = 12, RULE_mais_recursos = 13, RULE_narrativa = 14, RULE_estado_personagem = 15, 
		RULE_tipo_som = 16, RULE_entrelinhas = 17, RULE_dialogo = 18, RULE_escolha = 19, 
		RULE_mais_escolhas = 20, RULE_novo_cenario = 21, RULE_nova_entrada = 22, 
		RULE_nova_saida = 23, RULE_nova_musica = 24, RULE_novo_som = 25, RULE_outro_estado_personagem = 26, 
		RULE_outro_personagem = 27;
	public static final String[] ruleNames = {
		"programa", "cabecalho", "corpo", "titulo", "personagens", "cenarios", 
		"recursos", "cena", "nome_cena", "mais_cenas", "mais_personagens", "mais_cenarios", 
		"recurso", "mais_recursos", "narrativa", "estado_personagem", "tipo_som", 
		"entrelinhas", "dialogo", "escolha", "mais_escolhas", "novo_cenario", 
		"nova_entrada", "nova_saida", "nova_musica", "novo_som", "outro_estado_personagem", 
		"outro_personagem"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FIM'", "'TITULO:'", "'PERSONAGENS:'", "'.'", "'CENARIOS:'", "'RECURSOS:'", 
		"'- Cena '", "' -'", "','", "'='", "'('", "')'", "'['", "']'", "'musica'", 
		"'barulho'", "'-'", "'ESCOLHA:'", "'- va para '", "'cenario'", "'entra'", 
		"'sai'", "'som'", "'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "CADEIA", "PERSONAGEM", "CENARIO", "EMOCAO", "IDENT", "NUM", "WS"
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
			setState(56);
			cabecalho();
			setState(57);
			corpo();
			setState(58);
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
			setState(60);
			titulo();
			setState(61);
			personagens();
			setState(62);
			cenarios();
			setState(63);
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
		public CenaContext cena() {
			return getRuleContext(CenaContext.class,0);
		}
		public Mais_cenasContext mais_cenas() {
			return getRuleContext(Mais_cenasContext.class,0);
		}
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
			setState(65);
			cena();
			setState(66);
			mais_cenas();
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
			setState(68);
			match(T__1);
			setState(69);
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
		public TerminalNode PERSONAGEM() { return getToken(VisualNovelParser.PERSONAGEM, 0); }
		public Mais_personagensContext mais_personagens() {
			return getRuleContext(Mais_personagensContext.class,0);
		}
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
			setState(71);
			match(T__2);
			setState(72);
			match(PERSONAGEM);
			setState(73);
			mais_personagens();
			setState(74);
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
		public TerminalNode CENARIO() { return getToken(VisualNovelParser.CENARIO, 0); }
		public Mais_cenariosContext mais_cenarios() {
			return getRuleContext(Mais_cenariosContext.class,0);
		}
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
			setState(76);
			match(T__4);
			setState(77);
			match(CENARIO);
			setState(78);
			mais_cenarios();
			setState(79);
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
		public Mais_recursosContext mais_recursos() {
			return getRuleContext(Mais_recursosContext.class,0);
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
			setState(81);
			match(T__5);
			setState(82);
			recurso();
			setState(83);
			mais_recursos();
			setState(84);
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

	public static class CenaContext extends ParserRuleContext {
		public Nome_cenaContext nome_cena() {
			return getRuleContext(Nome_cenaContext.class,0);
		}
		public NarrativaContext narrativa() {
			return getRuleContext(NarrativaContext.class,0);
		}
		public CenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterCena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitCena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitCena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CenaContext cena() throws RecognitionException {
		CenaContext _localctx = new CenaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			nome_cena();
			setState(87);
			narrativa();
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

	public static class Nome_cenaContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(VisualNovelParser.NUM, 0); }
		public Nome_cenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_cena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterNome_cena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitNome_cena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitNome_cena(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_cenaContext nome_cena() throws RecognitionException {
		Nome_cenaContext _localctx = new Nome_cenaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nome_cena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__6);
			setState(90);
			match(NUM);
			setState(91);
			match(T__7);
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

	public static class Mais_cenasContext extends ParserRuleContext {
		public CenaContext cena() {
			return getRuleContext(CenaContext.class,0);
		}
		public Mais_cenasContext mais_cenas() {
			return getRuleContext(Mais_cenasContext.class,0);
		}
		public Mais_cenasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_cenas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterMais_cenas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitMais_cenas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitMais_cenas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_cenasContext mais_cenas() throws RecognitionException {
		Mais_cenasContext _localctx = new Mais_cenasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mais_cenas);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				cena();
				setState(94);
				mais_cenas();
				}
				break;
			case T__0:
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

	public static class Mais_personagensContext extends ParserRuleContext {
		public TerminalNode PERSONAGEM() { return getToken(VisualNovelParser.PERSONAGEM, 0); }
		public Mais_personagensContext mais_personagens() {
			return getRuleContext(Mais_personagensContext.class,0);
		}
		public Mais_personagensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_personagens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterMais_personagens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitMais_personagens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitMais_personagens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_personagensContext mais_personagens() throws RecognitionException {
		Mais_personagensContext _localctx = new Mais_personagensContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mais_personagens);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__8);
				setState(100);
				match(PERSONAGEM);
				setState(101);
				mais_personagens();
				}
				break;
			case T__3:
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

	public static class Mais_cenariosContext extends ParserRuleContext {
		public TerminalNode CENARIO() { return getToken(VisualNovelParser.CENARIO, 0); }
		public Mais_cenariosContext mais_cenarios() {
			return getRuleContext(Mais_cenariosContext.class,0);
		}
		public Mais_cenariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_cenarios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterMais_cenarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitMais_cenarios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitMais_cenarios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_cenariosContext mais_cenarios() throws RecognitionException {
		Mais_cenariosContext _localctx = new Mais_cenariosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_cenarios);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__8);
				setState(106);
				match(CENARIO);
				setState(107);
				mais_cenarios();
				}
				break;
			case T__3:
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

	public static class RecursoContext extends ParserRuleContext {
		public Estado_personagemContext estado_personagem() {
			return getRuleContext(Estado_personagemContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(VisualNovelParser.CADEIA, 0); }
		public TerminalNode CENARIO() { return getToken(VisualNovelParser.CENARIO, 0); }
		public TerminalNode IDENT() { return getToken(VisualNovelParser.IDENT, 0); }
		public Tipo_somContext tipo_som() {
			return getRuleContext(Tipo_somContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_recurso);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERSONAGEM:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				estado_personagem();
				setState(112);
				match(T__9);
				setState(113);
				match(CADEIA);
				}
				break;
			case CENARIO:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(CENARIO);
				setState(116);
				match(T__9);
				setState(117);
				match(CADEIA);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(IDENT);
				setState(119);
				match(T__10);
				setState(120);
				tipo_som();
				setState(121);
				match(T__11);
				setState(122);
				match(T__9);
				setState(123);
				match(CADEIA);
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

	public static class Mais_recursosContext extends ParserRuleContext {
		public RecursoContext recurso() {
			return getRuleContext(RecursoContext.class,0);
		}
		public Mais_recursosContext mais_recursos() {
			return getRuleContext(Mais_recursosContext.class,0);
		}
		public Mais_recursosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_recursos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterMais_recursos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitMais_recursos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitMais_recursos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_recursosContext mais_recursos() throws RecognitionException {
		Mais_recursosContext _localctx = new Mais_recursosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mais_recursos);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__8);
				setState(128);
				recurso();
				setState(129);
				mais_recursos();
				}
				break;
			case T__3:
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

	public static class NarrativaContext extends ParserRuleContext {
		public EntrelinhasContext entrelinhas() {
			return getRuleContext(EntrelinhasContext.class,0);
		}
		public DialogoContext dialogo() {
			return getRuleContext(DialogoContext.class,0);
		}
		public EscolhaContext escolha() {
			return getRuleContext(EscolhaContext.class,0);
		}
		public NarrativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_narrativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterNarrativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitNarrativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitNarrativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NarrativaContext narrativa() throws RecognitionException {
		NarrativaContext _localctx = new NarrativaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_narrativa);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				entrelinhas();
				}
				break;
			case CADEIA:
			case PERSONAGEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				dialogo();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				escolha();
				}
				break;
			case T__0:
			case T__6:
				enterOuterAlt(_localctx, 4);
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

	public static class Estado_personagemContext extends ParserRuleContext {
		public TerminalNode PERSONAGEM() { return getToken(VisualNovelParser.PERSONAGEM, 0); }
		public TerminalNode EMOCAO() { return getToken(VisualNovelParser.EMOCAO, 0); }
		public Estado_personagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado_personagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterEstado_personagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitEstado_personagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitEstado_personagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estado_personagemContext estado_personagem() throws RecognitionException {
		Estado_personagemContext _localctx = new Estado_personagemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_estado_personagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(PERSONAGEM);
			setState(141);
			match(T__12);
			setState(142);
			match(EMOCAO);
			setState(143);
			match(T__13);
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

	public static class Tipo_somContext extends ParserRuleContext {
		public Tipo_somContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_som; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterTipo_som(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitTipo_som(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitTipo_som(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_somContext tipo_som() throws RecognitionException {
		Tipo_somContext _localctx = new Tipo_somContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo_som);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class EntrelinhasContext extends ParserRuleContext {
		public Novo_cenarioContext novo_cenario() {
			return getRuleContext(Novo_cenarioContext.class,0);
		}
		public Nova_entradaContext nova_entrada() {
			return getRuleContext(Nova_entradaContext.class,0);
		}
		public Nova_saidaContext nova_saida() {
			return getRuleContext(Nova_saidaContext.class,0);
		}
		public Nova_musicaContext nova_musica() {
			return getRuleContext(Nova_musicaContext.class,0);
		}
		public Novo_somContext novo_som() {
			return getRuleContext(Novo_somContext.class,0);
		}
		public EntrelinhasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrelinhas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterEntrelinhas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitEntrelinhas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitEntrelinhas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntrelinhasContext entrelinhas() throws RecognitionException {
		EntrelinhasContext _localctx = new EntrelinhasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_entrelinhas);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				novo_cenario();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				nova_entrada();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				nova_saida();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				nova_musica();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				novo_som();
				}
				break;
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

	public static class DialogoContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(VisualNovelParser.CADEIA, 0); }
		public TerminalNode PERSONAGEM() { return getToken(VisualNovelParser.PERSONAGEM, 0); }
		public DialogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dialogo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterDialogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitDialogo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitDialogo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DialogoContext dialogo() throws RecognitionException {
		DialogoContext _localctx = new DialogoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dialogo);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CADEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(CADEIA);
				}
				break;
			case PERSONAGEM:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(PERSONAGEM);
				setState(156);
				match(T__16);
				setState(157);
				match(CADEIA);
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

	public static class EscolhaContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(VisualNovelParser.CADEIA, 0); }
		public Nome_cenaContext nome_cena() {
			return getRuleContext(Nome_cenaContext.class,0);
		}
		public Mais_escolhasContext mais_escolhas() {
			return getRuleContext(Mais_escolhasContext.class,0);
		}
		public EscolhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escolha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterEscolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitEscolha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitEscolha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscolhaContext escolha() throws RecognitionException {
		EscolhaContext _localctx = new EscolhaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_escolha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__17);
			setState(161);
			match(CADEIA);
			setState(162);
			match(T__18);
			setState(163);
			nome_cena();
			setState(164);
			mais_escolhas();
			setState(165);
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

	public static class Mais_escolhasContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(VisualNovelParser.CADEIA, 0); }
		public Nome_cenaContext nome_cena() {
			return getRuleContext(Nome_cenaContext.class,0);
		}
		public Mais_escolhasContext mais_escolhas() {
			return getRuleContext(Mais_escolhasContext.class,0);
		}
		public Mais_escolhasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_escolhas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterMais_escolhas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitMais_escolhas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitMais_escolhas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_escolhasContext mais_escolhas() throws RecognitionException {
		Mais_escolhasContext _localctx = new Mais_escolhasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mais_escolhas);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__8);
				setState(168);
				match(CADEIA);
				setState(169);
				match(T__18);
				setState(170);
				nome_cena();
				setState(171);
				mais_escolhas();
				}
				break;
			case T__3:
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

	public static class Novo_cenarioContext extends ParserRuleContext {
		public TerminalNode CENARIO() { return getToken(VisualNovelParser.CENARIO, 0); }
		public Novo_cenarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novo_cenario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterNovo_cenario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitNovo_cenario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitNovo_cenario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Novo_cenarioContext novo_cenario() throws RecognitionException {
		Novo_cenarioContext _localctx = new Novo_cenarioContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_novo_cenario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__10);
			setState(177);
			match(T__19);
			setState(178);
			match(CENARIO);
			setState(179);
			match(T__11);
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

	public static class Nova_entradaContext extends ParserRuleContext {
		public Estado_personagemContext estado_personagem() {
			return getRuleContext(Estado_personagemContext.class,0);
		}
		public Outro_estado_personagemContext outro_estado_personagem() {
			return getRuleContext(Outro_estado_personagemContext.class,0);
		}
		public Nova_entradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nova_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterNova_entrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitNova_entrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitNova_entrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nova_entradaContext nova_entrada() throws RecognitionException {
		Nova_entradaContext _localctx = new Nova_entradaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nova_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__10);
			setState(182);
			match(T__20);
			setState(183);
			estado_personagem();
			setState(184);
			outro_estado_personagem();
			setState(185);
			match(T__11);
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

	public static class Nova_saidaContext extends ParserRuleContext {
		public TerminalNode PERSONAGEM() { return getToken(VisualNovelParser.PERSONAGEM, 0); }
		public Outro_personagemContext outro_personagem() {
			return getRuleContext(Outro_personagemContext.class,0);
		}
		public Nova_saidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nova_saida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterNova_saida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitNova_saida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitNova_saida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nova_saidaContext nova_saida() throws RecognitionException {
		Nova_saidaContext _localctx = new Nova_saidaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_nova_saida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__10);
			setState(188);
			match(T__21);
			setState(189);
			match(PERSONAGEM);
			setState(190);
			outro_personagem();
			setState(191);
			match(T__11);
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

	public static class Nova_musicaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(VisualNovelParser.IDENT, 0); }
		public Nova_musicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nova_musica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterNova_musica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitNova_musica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitNova_musica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nova_musicaContext nova_musica() throws RecognitionException {
		Nova_musicaContext _localctx = new Nova_musicaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nova_musica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__10);
			setState(194);
			match(T__14);
			setState(195);
			match(IDENT);
			setState(196);
			match(T__11);
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

	public static class Novo_somContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(VisualNovelParser.IDENT, 0); }
		public Novo_somContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novo_som; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterNovo_som(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitNovo_som(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitNovo_som(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Novo_somContext novo_som() throws RecognitionException {
		Novo_somContext _localctx = new Novo_somContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_novo_som);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__10);
			setState(199);
			match(T__22);
			setState(200);
			match(IDENT);
			setState(201);
			match(T__11);
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

	public static class Outro_estado_personagemContext extends ParserRuleContext {
		public Estado_personagemContext estado_personagem() {
			return getRuleContext(Estado_personagemContext.class,0);
		}
		public Outro_estado_personagemContext outro_estado_personagem() {
			return getRuleContext(Outro_estado_personagemContext.class,0);
		}
		public Outro_estado_personagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outro_estado_personagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterOutro_estado_personagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitOutro_estado_personagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitOutro_estado_personagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outro_estado_personagemContext outro_estado_personagem() throws RecognitionException {
		Outro_estado_personagemContext _localctx = new Outro_estado_personagemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_outro_estado_personagem);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__23);
				setState(204);
				estado_personagem();
				setState(205);
				outro_estado_personagem();
				}
				break;
			case T__11:
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

	public static class Outro_personagemContext extends ParserRuleContext {
		public TerminalNode PERSONAGEM() { return getToken(VisualNovelParser.PERSONAGEM, 0); }
		public Outro_personagemContext outro_personagem() {
			return getRuleContext(Outro_personagemContext.class,0);
		}
		public Outro_personagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outro_personagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).enterOutro_personagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualNovelListener ) ((VisualNovelListener)listener).exitOutro_personagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VisualNovelVisitor ) return ((VisualNovelVisitor<? extends T>)visitor).visitOutro_personagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outro_personagemContext outro_personagem() throws RecognitionException {
		Outro_personagemContext _localctx = new Outro_personagemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_outro_personagem);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__23);
				setState(211);
				match(PERSONAGEM);
				setState(212);
				outro_personagem();
				}
				break;
			case T__11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5"+
		"\13d\n\13\3\f\3\f\3\f\3\f\5\fj\n\f\3\r\3\r\3\r\3\r\5\rp\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0080"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0087\n\17\3\20\3\20\3\20\3\20\5\20"+
		"\u008d\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u009b\n\23\3\24\3\24\3\24\3\24\5\24\u00a1\n\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00b1\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u00d3\n\34\3\35\3\35\3\35\3\35\5\35\u00d9\n"+
		"\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668\2\3\3\2\21\22\2\u00cf\2:\3\2\2\2\4>\3\2\2\2\6C\3\2\2\2\bF\3\2"+
		"\2\2\nI\3\2\2\2\fN\3\2\2\2\16S\3\2\2\2\20X\3\2\2\2\22[\3\2\2\2\24c\3\2"+
		"\2\2\26i\3\2\2\2\30o\3\2\2\2\32\177\3\2\2\2\34\u0086\3\2\2\2\36\u008c"+
		"\3\2\2\2 \u008e\3\2\2\2\"\u0093\3\2\2\2$\u009a\3\2\2\2&\u00a0\3\2\2\2"+
		"(\u00a2\3\2\2\2*\u00b0\3\2\2\2,\u00b2\3\2\2\2.\u00b7\3\2\2\2\60\u00bd"+
		"\3\2\2\2\62\u00c3\3\2\2\2\64\u00c8\3\2\2\2\66\u00d2\3\2\2\28\u00d8\3\2"+
		"\2\2:;\5\4\3\2;<\5\6\4\2<=\7\3\2\2=\3\3\2\2\2>?\5\b\5\2?@\5\n\6\2@A\5"+
		"\f\7\2AB\5\16\b\2B\5\3\2\2\2CD\5\20\t\2DE\5\24\13\2E\7\3\2\2\2FG\7\4\2"+
		"\2GH\7\33\2\2H\t\3\2\2\2IJ\7\5\2\2JK\7\34\2\2KL\5\26\f\2LM\7\6\2\2M\13"+
		"\3\2\2\2NO\7\7\2\2OP\7\35\2\2PQ\5\30\r\2QR\7\6\2\2R\r\3\2\2\2ST\7\b\2"+
		"\2TU\5\32\16\2UV\5\34\17\2VW\7\6\2\2W\17\3\2\2\2XY\5\22\n\2YZ\5\36\20"+
		"\2Z\21\3\2\2\2[\\\7\t\2\2\\]\7 \2\2]^\7\n\2\2^\23\3\2\2\2_`\5\20\t\2`"+
		"a\5\24\13\2ad\3\2\2\2bd\3\2\2\2c_\3\2\2\2cb\3\2\2\2d\25\3\2\2\2ef\7\13"+
		"\2\2fg\7\34\2\2gj\5\26\f\2hj\3\2\2\2ie\3\2\2\2ih\3\2\2\2j\27\3\2\2\2k"+
		"l\7\13\2\2lm\7\35\2\2mp\5\30\r\2np\3\2\2\2ok\3\2\2\2on\3\2\2\2p\31\3\2"+
		"\2\2qr\5 \21\2rs\7\f\2\2st\7\33\2\2t\u0080\3\2\2\2uv\7\35\2\2vw\7\f\2"+
		"\2w\u0080\7\33\2\2xy\7\37\2\2yz\7\r\2\2z{\5\"\22\2{|\7\16\2\2|}\7\f\2"+
		"\2}~\7\33\2\2~\u0080\3\2\2\2\177q\3\2\2\2\177u\3\2\2\2\177x\3\2\2\2\u0080"+
		"\33\3\2\2\2\u0081\u0082\7\13\2\2\u0082\u0083\5\32\16\2\u0083\u0084\5\34"+
		"\17\2\u0084\u0087\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0081\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\35\3\2\2\2\u0088\u008d\5$\23\2\u0089\u008d\5&\24"+
		"\2\u008a\u008d\5(\25\2\u008b\u008d\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u0089"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\37\3\2\2\2\u008e"+
		"\u008f\7\34\2\2\u008f\u0090\7\17\2\2\u0090\u0091\7\36\2\2\u0091\u0092"+
		"\7\20\2\2\u0092!\3\2\2\2\u0093\u0094\t\2\2\2\u0094#\3\2\2\2\u0095\u009b"+
		"\5,\27\2\u0096\u009b\5.\30\2\u0097\u009b\5\60\31\2\u0098\u009b\5\62\32"+
		"\2\u0099\u009b\5\64\33\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a"+
		"\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b%\3\2\2\2"+
		"\u009c\u00a1\7\33\2\2\u009d\u009e\7\34\2\2\u009e\u009f\7\23\2\2\u009f"+
		"\u00a1\7\33\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\'\3\2\2"+
		"\2\u00a2\u00a3\7\24\2\2\u00a3\u00a4\7\33\2\2\u00a4\u00a5\7\25\2\2\u00a5"+
		"\u00a6\5\22\n\2\u00a6\u00a7\5*\26\2\u00a7\u00a8\7\6\2\2\u00a8)\3\2\2\2"+
		"\u00a9\u00aa\7\13\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00ac\7\25\2\2\u00ac"+
		"\u00ad\5\22\n\2\u00ad\u00ae\5*\26\2\u00ae\u00b1\3\2\2\2\u00af\u00b1\3"+
		"\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1+\3\2\2\2\u00b2\u00b3"+
		"\7\r\2\2\u00b3\u00b4\7\26\2\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\7\16\2"+
		"\2\u00b6-\3\2\2\2\u00b7\u00b8\7\r\2\2\u00b8\u00b9\7\27\2\2\u00b9\u00ba"+
		"\5 \21\2\u00ba\u00bb\5\66\34\2\u00bb\u00bc\7\16\2\2\u00bc/\3\2\2\2\u00bd"+
		"\u00be\7\r\2\2\u00be\u00bf\7\30\2\2\u00bf\u00c0\7\34\2\2\u00c0\u00c1\5"+
		"8\35\2\u00c1\u00c2\7\16\2\2\u00c2\61\3\2\2\2\u00c3\u00c4\7\r\2\2\u00c4"+
		"\u00c5\7\21\2\2\u00c5\u00c6\7\37\2\2\u00c6\u00c7\7\16\2\2\u00c7\63\3\2"+
		"\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\7\31\2\2\u00ca\u00cb\7\37\2\2\u00cb"+
		"\u00cc\7\16\2\2\u00cc\65\3\2\2\2\u00cd\u00ce\7\32\2\2\u00ce\u00cf\5 \21"+
		"\2\u00cf\u00d0\5\66\34\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00cd\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\67\3\2\2\2\u00d4\u00d5\7\32\2"+
		"\2\u00d5\u00d6\7\34\2\2\u00d6\u00d9\58\35\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d4\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d99\3\2\2\2\rcio\177\u0086\u008c"+
		"\u009a\u00a0\u00b0\u00d2\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}