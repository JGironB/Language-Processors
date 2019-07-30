// Generated from C:/Users/juamp/IdeaProjects/TraductorSL/grammar\TraductorSL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TraductorSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, TK_ID=50, TK_CADENA=51, TK_NUMERO=52, 
		EXPONENT=53, TK_LOGICO=54, COMMULTI=55, COMM=56, ESP=57, SUM=58, RES=59;
	public static final int
		RULE_fuente = 0, RULE_titulo_programa = 1, RULE_ctv = 2, RULE_my_const = 3, 
		RULE_var = 4, RULE_tipos = 5, RULE_main = 6, RULE_declarar_const = 7, 
		RULE_separador = 8, RULE_expresion = 9, RULE_cuerpo_operadores = 10, RULE_operador = 11, 
		RULE_tk_general = 12, RULE_lvalue = 13, RULE_lvalue_prima = 14, RULE_arg_arreglo = 15, 
		RULE_arg_mult_arreglo = 16, RULE_arg = 17, RULE_arg_mult = 18, RULE_arg_input = 19, 
		RULE_arg_mult_input = 20, RULE_atributo = 21, RULE_declarar_tipos = 22, 
		RULE_lista_dec_tipo = 23, RULE_lista = 24, RULE_tipo_declaracion_tipo = 25, 
		RULE_exp_vector = 26, RULE_dim = 27, RULE_lista_dim = 28, RULE_exp_matriz = 29, 
		RULE_exp_registro = 30, RULE_tipo_dato = 31, RULE_declarar_var = 32, RULE_tipo_declaracion_var = 33, 
		RULE_exp_vector_var = 34, RULE_dim_var = 35, RULE_lista_dim_var = 36, 
		RULE_exp_matriz_var = 37, RULE_exp_registro_var = 38, RULE_declarar_var_no_rescurive_to_translation = 39, 
		RULE_lista_no_recursive_to_translation = 40, RULE_tipo_declaracion_var_no_rescurive_to_translation = 41, 
		RULE_exp_vector_no_recursive_to_translation = 42, RULE_exp_matriz_no_recursive_to_translation = 43, 
		RULE_exp_registro_no_recursive_to_translation = 44, RULE_cuerpo_main = 45, 
		RULE_sentencia = 46, RULE_lvalue_igual = 47, RULE_lvalue_igual_desde = 48, 
		RULE_bucles = 49, RULE_mientras = 50, RULE_expresion_mientras = 51, RULE_repetir = 52, 
		RULE_expresion_repetir = 53, RULE_desde = 54, RULE_expresion_desde = 55, 
		RULE_asignaciones_desde = 56, RULE_asignaciones = 57, RULE_paso = 58, 
		RULE_condicional = 59, RULE_cuerpo_condicional = 60, RULE_sino_si = 61, 
		RULE_cuerpo_sino_si = 62, RULE_sino = 63, RULE_eval = 64, RULE_caso = 65, 
		RULE_cuerpo_caso = 66, RULE_caso_prima = 67, RULE_caso_segundo = 68, RULE_cuerpo_caso_segundo = 69, 
		RULE_subrutinas = 70, RULE_lista_sub = 71, RULE_ref = 72, RULE_lista_sub_separador = 73, 
		RULE_retorno = 74, RULE_retorna2 = 75, RULE_fin_final = 76;
	private static String[] makeRuleNames() {
		return new String[] {
			"fuente", "titulo_programa", "ctv", "my_const", "var", "tipos", "main", 
			"declarar_const", "separador", "expresion", "cuerpo_operadores", "operador", 
			"tk_general", "lvalue", "lvalue_prima", "arg_arreglo", "arg_mult_arreglo", 
			"arg", "arg_mult", "arg_input", "arg_mult_input", "atributo", "declarar_tipos", 
			"lista_dec_tipo", "lista", "tipo_declaracion_tipo", "exp_vector", "dim", 
			"lista_dim", "exp_matriz", "exp_registro", "tipo_dato", "declarar_var", 
			"tipo_declaracion_var", "exp_vector_var", "dim_var", "lista_dim_var", 
			"exp_matriz_var", "exp_registro_var", "declarar_var_no_rescurive_to_translation", 
			"lista_no_recursive_to_translation", "tipo_declaracion_var_no_rescurive_to_translation", 
			"exp_vector_no_recursive_to_translation", "exp_matriz_no_recursive_to_translation", 
			"exp_registro_no_recursive_to_translation", "cuerpo_main", "sentencia", 
			"lvalue_igual", "lvalue_igual_desde", "bucles", "mientras", "expresion_mientras", 
			"repetir", "expresion_repetir", "desde", "expresion_desde", "asignaciones_desde", 
			"asignaciones", "paso", "condicional", "cuerpo_condicional", "sino_si", 
			"cuerpo_sino_si", "sino", "eval", "caso", "cuerpo_caso", "caso_prima", 
			"caso_segundo", "cuerpo_caso_segundo", "subrutinas", "lista_sub", "ref", 
			"lista_sub_separador", "retorno", "retorna2", "fin_final"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'const'", "'var'", "'tipos'", "'inicio'", "'fin'", 
			"'='", "';'", "'*'", "'/'", "'%'", "'^'", "'and'", "'or'", "'not'", "'<'", 
			"'>'", "'<='", "'>='", "'=='", "'<>'", "','", "'leer'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "'.'", "':'", "'vector'", "'matriz'", "'registro'", 
			"'cadena'", "'numerico'", "'logico'", "'mientras'", "'repetir'", "'hasta'", 
			"'desde'", "'paso'", "'si'", "'sino'", "'eval'", "'caso'", "'subrutina'", 
			"'ref'", "'retorna'", null, null, null, null, null, null, null, null, 
			"'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TK_ID", "TK_CADENA", "TK_NUMERO", "EXPONENT", "TK_LOGICO", 
			"COMMULTI", "COMM", "ESP", "SUM", "RES"
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
	public String getGrammarFileName() { return "TraductorSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TraductorSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FuenteContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public Titulo_programaContext titulo_programa() {
			return getRuleContext(Titulo_programaContext.class,0);
		}
		public List<CtvContext> ctv() {
			return getRuleContexts(CtvContext.class);
		}
		public CtvContext ctv(int i) {
			return getRuleContext(CtvContext.class,i);
		}
		public List<SubrutinasContext> subrutinas() {
			return getRuleContexts(SubrutinasContext.class);
		}
		public SubrutinasContext subrutinas(int i) {
			return getRuleContext(SubrutinasContext.class,i);
		}
		public FuenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fuente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterFuente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitFuente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitFuente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuenteContext fuente() throws RecognitionException {
		FuenteContext _localctx = new FuenteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fuente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(154);
				titulo_programa();
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				{
				setState(157);
				ctv();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			main();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__46) {
				{
				{
				setState(164);
				subrutinas();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			System.out.println("Análisis léxico y sintáctico terminado.");
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

	public static class Titulo_programaContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public Titulo_programaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterTitulo_programa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitTitulo_programa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitTitulo_programa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Titulo_programaContext titulo_programa() throws RecognitionException {
		Titulo_programaContext _localctx = new Titulo_programaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_titulo_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__0);
			setState(173);
			match(TK_ID);
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

	public static class CtvContext extends ParserRuleContext {
		public My_constContext my_const() {
			return getRuleContext(My_constContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public CtvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCtv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCtv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCtv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtvContext ctv() throws RecognitionException {
		CtvContext _localctx = new CtvContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ctv);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				my_const();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				var();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				tipos();
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

	public static class My_constContext extends ParserRuleContext {
		public List<Declarar_constContext> declarar_const() {
			return getRuleContexts(Declarar_constContext.class);
		}
		public Declarar_constContext declarar_const(int i) {
			return getRuleContext(Declarar_constContext.class,i);
		}
		public My_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_my_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterMy_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitMy_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitMy_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final My_constContext my_const() throws RecognitionException {
		My_constContext _localctx = new My_constContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_my_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__1);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_ID) {
				{
				{
				setState(181);
				declarar_const();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VarContext extends ParserRuleContext {
		public List<Declarar_varContext> declarar_var() {
			return getRuleContexts(Declarar_varContext.class);
		}
		public Declarar_varContext declarar_var(int i) {
			return getRuleContext(Declarar_varContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__2);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_ID) {
				{
				{
				setState(188);
				declarar_var();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TiposContext extends ParserRuleContext {
		public List<Declarar_tiposContext> declarar_tipos() {
			return getRuleContexts(Declarar_tiposContext.class);
		}
		public Declarar_tiposContext declarar_tipos(int i) {
			return getRuleContext(Declarar_tiposContext.class,i);
		}
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__3);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_ID) {
				{
				{
				setState(195);
				declarar_tipos();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MainContext extends ParserRuleContext {
		public List<Cuerpo_mainContext> cuerpo_main() {
			return getRuleContexts(Cuerpo_mainContext.class);
		}
		public Cuerpo_mainContext cuerpo_main(int i) {
			return getRuleContext(Cuerpo_mainContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__4);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
				{
				{
				setState(202);
				cuerpo_main();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(T__5);
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

	public static class Declarar_constContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public SeparadorContext separador() {
			return getRuleContext(SeparadorContext.class,0);
		}
		public Declarar_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterDeclarar_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitDeclarar_const(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitDeclarar_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_constContext declarar_const() throws RecognitionException {
		Declarar_constContext _localctx = new Declarar_constContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declarar_const);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(TK_ID);
			setState(211);
			match(T__6);
			setState(212);
			expresion();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(213);
				separador();
				}
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

	public static class SeparadorContext extends ParserRuleContext {
		public SeparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterSeparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitSeparador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitSeparador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparadorContext separador() throws RecognitionException {
		SeparadorContext _localctx = new SeparadorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_separador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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

	public static class ExpresionContext extends ParserRuleContext {
		public Tk_generalContext tk_general() {
			return getRuleContext(Tk_generalContext.class,0);
		}
		public Cuerpo_operadoresContext cuerpo_operadores() {
			return getRuleContext(Cuerpo_operadoresContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			tk_general();
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(219);
				cuerpo_operadores();
				}
				break;
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

	public static class Cuerpo_operadoresContext extends ParserRuleContext {
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Cuerpo_operadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_operadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCuerpo_operadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCuerpo_operadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCuerpo_operadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cuerpo_operadoresContext cuerpo_operadores() throws RecognitionException {
		Cuerpo_operadoresContext _localctx = new Cuerpo_operadoresContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cuerpo_operadores);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			operador();
			setState(223);
			expresion();
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(TraductorSLParser.SUM, 0); }
		public TerminalNode RES() { return getToken(TraductorSLParser.RES, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << SUM) | (1L << RES))) != 0)) ) {
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

	public static class Tk_generalContext extends ParserRuleContext {
		public Tk_generalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_general; }
	 
		public Tk_generalContext() { }
		public void copyFrom(Tk_generalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumeroContext extends Tk_generalContext {
		public Token op;
		public TerminalNode TK_NUMERO() { return getToken(TraductorSLParser.TK_NUMERO, 0); }
		public TerminalNode SUM() { return getToken(TraductorSLParser.SUM, 0); }
		public TerminalNode RES() { return getToken(TraductorSLParser.RES, 0); }
		public NumeroContext(Tk_generalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicoContext extends Tk_generalContext {
		public TerminalNode TK_LOGICO() { return getToken(TraductorSLParser.TK_LOGICO, 0); }
		public LogicoContext(Tk_generalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLogico(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CadenaContext extends Tk_generalContext {
		public TerminalNode TK_CADENA() { return getToken(TraductorSLParser.TK_CADENA, 0); }
		public CadenaContext(Tk_generalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCadena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCadena(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCadena(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Llamado_funcionContext extends Tk_generalContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public Llamado_funcionContext(Tk_generalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLlamado_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLlamado_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLlamado_funcion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expresion_con_parentesisContext extends Tk_generalContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Expresion_con_parentesisContext(Tk_generalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExpresion_con_parentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExpresion_con_parentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExpresion_con_parentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Escribe_notContext extends Tk_generalContext {
		public Tk_generalContext tk_general() {
			return getRuleContext(Tk_generalContext.class,0);
		}
		public Escribe_notContext(Tk_generalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterEscribe_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitEscribe_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitEscribe_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Llamado_funcion_inputContext extends Tk_generalContext {
		public Arg_inputContext arg_input() {
			return getRuleContext(Arg_inputContext.class,0);
		}
		public Llamado_funcion_inputContext(Tk_generalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLlamado_funcion_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLlamado_funcion_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLlamado_funcion_input(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mi_lvalueContext extends Tk_generalContext {
		public Token op;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode SUM() { return getToken(TraductorSLParser.SUM, 0); }
		public TerminalNode RES() { return getToken(TraductorSLParser.RES, 0); }
		public Mi_lvalueContext(Tk_generalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterMi_lvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitMi_lvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitMi_lvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegistroContext extends Tk_generalContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public RegistroContext(Tk_generalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_generalContext tk_general() throws RecognitionException {
		Tk_generalContext _localctx = new Tk_generalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tk_general);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new CadenaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(TK_CADENA);
				}
				break;
			case 2:
				_localctx = new NumeroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUM || _la==RES) {
					{
					setState(228);
					((NumeroContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==SUM || _la==RES) ) {
						((NumeroContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(231);
				match(TK_NUMERO);
				}
				break;
			case 3:
				_localctx = new Llamado_funcion_inputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(T__22);
				setState(233);
				match(T__23);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
					{
					setState(234);
					arg_input();
					}
				}

				setState(237);
				match(T__24);
				}
				break;
			case 4:
				_localctx = new Llamado_funcionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				match(TK_ID);
				setState(239);
				match(T__23);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
					{
					setState(240);
					arg();
					}
				}

				setState(243);
				match(T__24);
				}
				break;
			case 5:
				_localctx = new Mi_lvalueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUM || _la==RES) {
					{
					setState(244);
					((Mi_lvalueContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==SUM || _la==RES) ) {
						((Mi_lvalueContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(247);
				lvalue();
				}
				break;
			case 6:
				_localctx = new LogicoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(TK_LOGICO);
				}
				break;
			case 7:
				_localctx = new RegistroContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(249);
				match(T__25);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
					{
					setState(250);
					arg();
					}
				}

				setState(253);
				match(T__26);
				}
				break;
			case 8:
				_localctx = new Expresion_con_parentesisContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				match(T__23);
				setState(255);
				expresion();
				setState(256);
				match(T__24);
				}
				break;
			case 9:
				_localctx = new Escribe_notContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(258);
				match(T__14);
				setState(259);
				tk_general();
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public Lvalue_primaContext lvalue_prima() {
			return getRuleContext(Lvalue_primaContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(TK_ID);
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(263);
				lvalue_prima();
				}
				break;
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

	public static class Lvalue_primaContext extends ParserRuleContext {
		public Lvalue_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue_prima; }
	 
		public Lvalue_primaContext() { }
		public void copyFrom(Lvalue_primaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Para_atributoContext extends Lvalue_primaContext {
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public Para_atributoContext(Lvalue_primaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterPara_atributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitPara_atributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitPara_atributo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Para_arregloContext extends Lvalue_primaContext {
		public Arg_arregloContext arg_arreglo() {
			return getRuleContext(Arg_arregloContext.class,0);
		}
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public Para_arregloContext(Lvalue_primaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterPara_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitPara_arreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitPara_arreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lvalue_primaContext lvalue_prima() throws RecognitionException {
		Lvalue_primaContext _localctx = new Lvalue_primaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lvalue_prima);
		try {
			int _alt;
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				_localctx = new Para_arregloContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__27);
				setState(267);
				arg_arreglo();
				setState(268);
				match(T__28);
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(269);
						atributo();
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case EOF:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__28:
			case T__29:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__48:
			case TK_ID:
			case TK_CADENA:
			case TK_NUMERO:
			case TK_LOGICO:
			case SUM:
			case RES:
				_localctx = new Para_atributoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(275);
						atributo();
						}
						} 
					}
					setState(280);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
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

	public static class Arg_arregloContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<Arg_mult_arregloContext> arg_mult_arreglo() {
			return getRuleContexts(Arg_mult_arregloContext.class);
		}
		public Arg_mult_arregloContext arg_mult_arreglo(int i) {
			return getRuleContext(Arg_mult_arregloContext.class,i);
		}
		public Arg_arregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterArg_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitArg_arreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitArg_arreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_arregloContext arg_arreglo() throws RecognitionException {
		Arg_arregloContext _localctx = new Arg_arregloContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arg_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			expresion();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(284);
				arg_mult_arreglo();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Arg_mult_arregloContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Arg_mult_arregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_mult_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterArg_mult_arreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitArg_mult_arreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitArg_mult_arreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_mult_arregloContext arg_mult_arreglo() throws RecognitionException {
		Arg_mult_arregloContext _localctx = new Arg_mult_arregloContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arg_mult_arreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__21);
			setState(291);
			expresion();
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

	public static class ArgContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<Arg_multContext> arg_mult() {
			return getRuleContexts(Arg_multContext.class);
		}
		public Arg_multContext arg_mult(int i) {
			return getRuleContext(Arg_multContext.class,i);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			expresion();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(294);
				arg_mult();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Arg_multContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Arg_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterArg_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitArg_mult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitArg_mult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_multContext arg_mult() throws RecognitionException {
		Arg_multContext _localctx = new Arg_multContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__21);
			setState(301);
			expresion();
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

	public static class Arg_inputContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<Arg_mult_inputContext> arg_mult_input() {
			return getRuleContexts(Arg_mult_inputContext.class);
		}
		public Arg_mult_inputContext arg_mult_input(int i) {
			return getRuleContext(Arg_mult_inputContext.class,i);
		}
		public Arg_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterArg_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitArg_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitArg_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_inputContext arg_input() throws RecognitionException {
		Arg_inputContext _localctx = new Arg_inputContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arg_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			expresion();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(304);
				arg_mult_input();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Arg_mult_inputContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Arg_mult_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_mult_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterArg_mult_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitArg_mult_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitArg_mult_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_mult_inputContext arg_mult_input() throws RecognitionException {
		Arg_mult_inputContext _localctx = new Arg_mult_inputContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arg_mult_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__21);
			setState(311);
			expresion();
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

	public static class AtributoContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public Lvalue_primaContext lvalue_prima() {
			return getRuleContext(Lvalue_primaContext.class,0);
		}
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitAtributo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitAtributo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atributo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__29);
			setState(314);
			match(TK_ID);
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(315);
				lvalue_prima();
				}
				break;
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

	public static class Declarar_tiposContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public Tipo_declaracion_tipoContext tipo_declaracion_tipo() {
			return getRuleContext(Tipo_declaracion_tipoContext.class,0);
		}
		public List<Lista_dec_tipoContext> lista_dec_tipo() {
			return getRuleContexts(Lista_dec_tipoContext.class);
		}
		public Lista_dec_tipoContext lista_dec_tipo(int i) {
			return getRuleContext(Lista_dec_tipoContext.class,i);
		}
		public SeparadorContext separador() {
			return getRuleContext(SeparadorContext.class,0);
		}
		public Declarar_tiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterDeclarar_tipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitDeclarar_tipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitDeclarar_tipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_tiposContext declarar_tipos() throws RecognitionException {
		Declarar_tiposContext _localctx = new Declarar_tiposContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declarar_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(TK_ID);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(319);
				lista_dec_tipo();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(T__30);
			setState(326);
			tipo_declaracion_tipo();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(327);
				separador();
				}
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

	public static class Lista_dec_tipoContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public Lista_dec_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_dec_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLista_dec_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLista_dec_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLista_dec_tipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_dec_tipoContext lista_dec_tipo() throws RecognitionException {
		Lista_dec_tipoContext _localctx = new Lista_dec_tipoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lista_dec_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__21);
			setState(331);
			match(TK_ID);
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

	public static class ListaContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lista);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__21);
			setState(334);
			match(TK_ID);
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

	public static class Tipo_declaracion_tipoContext extends ParserRuleContext {
		public Tipo_declaracion_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_declaracion_tipo; }
	 
		public Tipo_declaracion_tipoContext() { }
		public void copyFrom(Tipo_declaracion_tipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Vector_tipoContext extends Tipo_declaracion_tipoContext {
		public Exp_vectorContext exp_vector() {
			return getRuleContext(Exp_vectorContext.class,0);
		}
		public Vector_tipoContext(Tipo_declaracion_tipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterVector_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitVector_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitVector_tipo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Matriz_tipoContext extends Tipo_declaracion_tipoContext {
		public Exp_matrizContext exp_matriz() {
			return getRuleContext(Exp_matrizContext.class,0);
		}
		public Matriz_tipoContext(Tipo_declaracion_tipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterMatriz_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitMatriz_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitMatriz_tipo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Registro_tipoContext extends Tipo_declaracion_tipoContext {
		public Exp_registroContext exp_registro() {
			return getRuleContext(Exp_registroContext.class,0);
		}
		public Registro_tipoContext(Tipo_declaracion_tipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterRegistro_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitRegistro_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitRegistro_tipo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tipo_dato_tipoContext extends Tipo_declaracion_tipoContext {
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Tipo_dato_tipoContext(Tipo_declaracion_tipoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterTipo_dato_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitTipo_dato_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitTipo_dato_tipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_declaracion_tipoContext tipo_declaracion_tipo() throws RecognitionException {
		Tipo_declaracion_tipoContext _localctx = new Tipo_declaracion_tipoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipo_declaracion_tipo);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				_localctx = new Vector_tipoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(T__31);
				setState(337);
				exp_vector();
				}
				break;
			case T__32:
				_localctx = new Matriz_tipoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(T__32);
				setState(339);
				exp_matriz();
				}
				break;
			case T__33:
				_localctx = new Registro_tipoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(T__33);
				setState(341);
				exp_registro();
				}
				break;
			case T__34:
			case T__35:
			case T__36:
			case TK_ID:
				_localctx = new Tipo_dato_tipoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				tipo_dato();
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

	public static class Exp_vectorContext extends ParserRuleContext {
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Exp_registroContext exp_registro() {
			return getRuleContext(Exp_registroContext.class,0);
		}
		public List<Lista_dimContext> lista_dim() {
			return getRuleContexts(Lista_dimContext.class);
		}
		public Lista_dimContext lista_dim(int i) {
			return getRuleContext(Lista_dimContext.class,i);
		}
		public Exp_vectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExp_vector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExp_vector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExp_vector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_vectorContext exp_vector() throws RecognitionException {
		Exp_vectorContext _localctx = new Exp_vectorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exp_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__27);
			setState(346);
			dim();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(347);
				lista_dim();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(353);
			match(T__28);
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case TK_ID:
				{
				setState(354);
				tipo_dato();
				}
				break;
			case T__33:
				{
				setState(355);
				match(T__33);
				setState(356);
				exp_registro();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DimContext extends ParserRuleContext {
		public TerminalNode TK_NUMERO() { return getToken(TraductorSLParser.TK_NUMERO, 0); }
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==TK_NUMERO) ) {
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

	public static class Lista_dimContext extends ParserRuleContext {
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public Lista_dimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLista_dim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLista_dim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLista_dim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_dimContext lista_dim() throws RecognitionException {
		Lista_dimContext _localctx = new Lista_dimContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lista_dim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__21);
			setState(362);
			dim();
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

	public static class Exp_matrizContext extends ParserRuleContext {
		public List<DimContext> dim() {
			return getRuleContexts(DimContext.class);
		}
		public DimContext dim(int i) {
			return getRuleContext(DimContext.class,i);
		}
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Exp_registroContext exp_registro() {
			return getRuleContext(Exp_registroContext.class,0);
		}
		public List<Lista_dimContext> lista_dim() {
			return getRuleContexts(Lista_dimContext.class);
		}
		public Lista_dimContext lista_dim(int i) {
			return getRuleContext(Lista_dimContext.class,i);
		}
		public Exp_matrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_matriz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExp_matriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExp_matriz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExp_matriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_matrizContext exp_matriz() throws RecognitionException {
		Exp_matrizContext _localctx = new Exp_matrizContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_exp_matriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__27);
			setState(365);
			dim();
			setState(366);
			match(T__21);
			setState(367);
			dim();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(368);
				lista_dim();
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			match(T__28);
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case TK_ID:
				{
				setState(375);
				tipo_dato();
				}
				break;
			case T__33:
				{
				setState(376);
				match(T__33);
				setState(377);
				exp_registro();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Exp_registroContext extends ParserRuleContext {
		public List<Declarar_var_no_rescurive_to_translationContext> declarar_var_no_rescurive_to_translation() {
			return getRuleContexts(Declarar_var_no_rescurive_to_translationContext.class);
		}
		public Declarar_var_no_rescurive_to_translationContext declarar_var_no_rescurive_to_translation(int i) {
			return getRuleContext(Declarar_var_no_rescurive_to_translationContext.class,i);
		}
		public Exp_registroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExp_registro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExp_registro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExp_registro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_registroContext exp_registro() throws RecognitionException {
		Exp_registroContext _localctx = new Exp_registroContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exp_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(T__25);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_ID) {
				{
				{
				setState(381);
				declarar_var_no_rescurive_to_translation();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			match(T__26);
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

	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterTipo_dato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitTipo_dato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitTipo_dato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tipo_dato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << TK_ID))) != 0)) ) {
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

	public static class Declarar_varContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public Tipo_declaracion_varContext tipo_declaracion_var() {
			return getRuleContext(Tipo_declaracion_varContext.class,0);
		}
		public List<ListaContext> lista() {
			return getRuleContexts(ListaContext.class);
		}
		public ListaContext lista(int i) {
			return getRuleContext(ListaContext.class,i);
		}
		public SeparadorContext separador() {
			return getRuleContext(SeparadorContext.class,0);
		}
		public Declarar_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterDeclarar_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitDeclarar_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitDeclarar_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_varContext declarar_var() throws RecognitionException {
		Declarar_varContext _localctx = new Declarar_varContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declarar_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(TK_ID);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(392);
				lista();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			match(T__30);
			setState(399);
			tipo_declaracion_var();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(400);
				separador();
				}
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

	public static class Tipo_declaracion_varContext extends ParserRuleContext {
		public Tipo_declaracion_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_declaracion_var; }
	 
		public Tipo_declaracion_varContext() { }
		public void copyFrom(Tipo_declaracion_varContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Registro_varContext extends Tipo_declaracion_varContext {
		public Exp_registro_varContext exp_registro_var() {
			return getRuleContext(Exp_registro_varContext.class,0);
		}
		public Registro_varContext(Tipo_declaracion_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterRegistro_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitRegistro_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitRegistro_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Vector_varContext extends Tipo_declaracion_varContext {
		public Exp_vector_varContext exp_vector_var() {
			return getRuleContext(Exp_vector_varContext.class,0);
		}
		public Vector_varContext(Tipo_declaracion_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterVector_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitVector_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitVector_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Matriz_varContext extends Tipo_declaracion_varContext {
		public Exp_matriz_varContext exp_matriz_var() {
			return getRuleContext(Exp_matriz_varContext.class,0);
		}
		public Matriz_varContext(Tipo_declaracion_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterMatriz_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitMatriz_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitMatriz_var(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tipo_dato_varContext extends Tipo_declaracion_varContext {
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Tipo_dato_varContext(Tipo_declaracion_varContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterTipo_dato_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitTipo_dato_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitTipo_dato_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_declaracion_varContext tipo_declaracion_var() throws RecognitionException {
		Tipo_declaracion_varContext _localctx = new Tipo_declaracion_varContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tipo_declaracion_var);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				_localctx = new Vector_varContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(T__31);
				setState(404);
				exp_vector_var();
				}
				break;
			case T__32:
				_localctx = new Matriz_varContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				match(T__32);
				setState(406);
				exp_matriz_var();
				}
				break;
			case T__33:
				_localctx = new Registro_varContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(T__33);
				setState(408);
				exp_registro_var();
				}
				break;
			case T__34:
			case T__35:
			case T__36:
			case TK_ID:
				_localctx = new Tipo_dato_varContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				tipo_dato();
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

	public static class Exp_vector_varContext extends ParserRuleContext {
		public Dim_varContext dim_var() {
			return getRuleContext(Dim_varContext.class,0);
		}
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Exp_registro_varContext exp_registro_var() {
			return getRuleContext(Exp_registro_varContext.class,0);
		}
		public List<Lista_dim_varContext> lista_dim_var() {
			return getRuleContexts(Lista_dim_varContext.class);
		}
		public Lista_dim_varContext lista_dim_var(int i) {
			return getRuleContext(Lista_dim_varContext.class,i);
		}
		public Exp_vector_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_vector_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExp_vector_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExp_vector_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExp_vector_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_vector_varContext exp_vector_var() throws RecognitionException {
		Exp_vector_varContext _localctx = new Exp_vector_varContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_exp_vector_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__27);
			setState(413);
			dim_var();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(414);
				lista_dim_var();
				}
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			match(T__28);
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case TK_ID:
				{
				setState(421);
				tipo_dato();
				}
				break;
			case T__33:
				{
				setState(422);
				match(T__33);
				setState(423);
				exp_registro_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Dim_varContext extends ParserRuleContext {
		public TerminalNode TK_NUMERO() { return getToken(TraductorSLParser.TK_NUMERO, 0); }
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public Dim_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterDim_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitDim_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitDim_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dim_varContext dim_var() throws RecognitionException {
		Dim_varContext _localctx = new Dim_varContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dim_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << TK_ID) | (1L << TK_NUMERO))) != 0)) ) {
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

	public static class Lista_dim_varContext extends ParserRuleContext {
		public Dim_varContext dim_var() {
			return getRuleContext(Dim_varContext.class,0);
		}
		public Lista_dim_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_dim_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLista_dim_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLista_dim_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLista_dim_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_dim_varContext lista_dim_var() throws RecognitionException {
		Lista_dim_varContext _localctx = new Lista_dim_varContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lista_dim_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(T__21);
			setState(429);
			dim_var();
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

	public static class Exp_matriz_varContext extends ParserRuleContext {
		public List<Dim_varContext> dim_var() {
			return getRuleContexts(Dim_varContext.class);
		}
		public Dim_varContext dim_var(int i) {
			return getRuleContext(Dim_varContext.class,i);
		}
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Exp_registro_varContext exp_registro_var() {
			return getRuleContext(Exp_registro_varContext.class,0);
		}
		public List<Lista_dim_varContext> lista_dim_var() {
			return getRuleContexts(Lista_dim_varContext.class);
		}
		public Lista_dim_varContext lista_dim_var(int i) {
			return getRuleContext(Lista_dim_varContext.class,i);
		}
		public Exp_matriz_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_matriz_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExp_matriz_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExp_matriz_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExp_matriz_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_matriz_varContext exp_matriz_var() throws RecognitionException {
		Exp_matriz_varContext _localctx = new Exp_matriz_varContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exp_matriz_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__27);
			setState(432);
			dim_var();
			setState(433);
			match(T__21);
			setState(434);
			dim_var();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(435);
				lista_dim_var();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(T__28);
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case TK_ID:
				{
				setState(442);
				tipo_dato();
				}
				break;
			case T__33:
				{
				setState(443);
				match(T__33);
				setState(444);
				exp_registro_var();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Exp_registro_varContext extends ParserRuleContext {
		public List<Declarar_var_no_rescurive_to_translationContext> declarar_var_no_rescurive_to_translation() {
			return getRuleContexts(Declarar_var_no_rescurive_to_translationContext.class);
		}
		public Declarar_var_no_rescurive_to_translationContext declarar_var_no_rescurive_to_translation(int i) {
			return getRuleContext(Declarar_var_no_rescurive_to_translationContext.class,i);
		}
		public Exp_registro_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_registro_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExp_registro_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExp_registro_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExp_registro_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_registro_varContext exp_registro_var() throws RecognitionException {
		Exp_registro_varContext _localctx = new Exp_registro_varContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_registro_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__25);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_ID) {
				{
				{
				setState(448);
				declarar_var_no_rescurive_to_translation();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(T__26);
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

	public static class Declarar_var_no_rescurive_to_translationContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public Tipo_declaracion_var_no_rescurive_to_translationContext tipo_declaracion_var_no_rescurive_to_translation() {
			return getRuleContext(Tipo_declaracion_var_no_rescurive_to_translationContext.class,0);
		}
		public List<Lista_no_recursive_to_translationContext> lista_no_recursive_to_translation() {
			return getRuleContexts(Lista_no_recursive_to_translationContext.class);
		}
		public Lista_no_recursive_to_translationContext lista_no_recursive_to_translation(int i) {
			return getRuleContext(Lista_no_recursive_to_translationContext.class,i);
		}
		public SeparadorContext separador() {
			return getRuleContext(SeparadorContext.class,0);
		}
		public Declarar_var_no_rescurive_to_translationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarar_var_no_rescurive_to_translation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterDeclarar_var_no_rescurive_to_translation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitDeclarar_var_no_rescurive_to_translation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitDeclarar_var_no_rescurive_to_translation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarar_var_no_rescurive_to_translationContext declarar_var_no_rescurive_to_translation() throws RecognitionException {
		Declarar_var_no_rescurive_to_translationContext _localctx = new Declarar_var_no_rescurive_to_translationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declarar_var_no_rescurive_to_translation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(TK_ID);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(457);
				lista_no_recursive_to_translation();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			match(T__30);
			setState(464);
			tipo_declaracion_var_no_rescurive_to_translation();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(465);
				separador();
				}
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

	public static class Lista_no_recursive_to_translationContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public Lista_no_recursive_to_translationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_no_recursive_to_translation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLista_no_recursive_to_translation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLista_no_recursive_to_translation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLista_no_recursive_to_translation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_no_recursive_to_translationContext lista_no_recursive_to_translation() throws RecognitionException {
		Lista_no_recursive_to_translationContext _localctx = new Lista_no_recursive_to_translationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lista_no_recursive_to_translation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__21);
			setState(469);
			match(TK_ID);
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

	public static class Tipo_declaracion_var_no_rescurive_to_translationContext extends ParserRuleContext {
		public Exp_vector_no_recursive_to_translationContext exp_vector_no_recursive_to_translation() {
			return getRuleContext(Exp_vector_no_recursive_to_translationContext.class,0);
		}
		public Exp_matriz_no_recursive_to_translationContext exp_matriz_no_recursive_to_translation() {
			return getRuleContext(Exp_matriz_no_recursive_to_translationContext.class,0);
		}
		public Exp_registro_no_recursive_to_translationContext exp_registro_no_recursive_to_translation() {
			return getRuleContext(Exp_registro_no_recursive_to_translationContext.class,0);
		}
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Tipo_declaracion_var_no_rescurive_to_translationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_declaracion_var_no_rescurive_to_translation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterTipo_declaracion_var_no_rescurive_to_translation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitTipo_declaracion_var_no_rescurive_to_translation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitTipo_declaracion_var_no_rescurive_to_translation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_declaracion_var_no_rescurive_to_translationContext tipo_declaracion_var_no_rescurive_to_translation() throws RecognitionException {
		Tipo_declaracion_var_no_rescurive_to_translationContext _localctx = new Tipo_declaracion_var_no_rescurive_to_translationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tipo_declaracion_var_no_rescurive_to_translation);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(T__31);
				setState(472);
				exp_vector_no_recursive_to_translation();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(T__32);
				setState(474);
				exp_matriz_no_recursive_to_translation();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				match(T__33);
				setState(476);
				exp_registro_no_recursive_to_translation();
				}
				break;
			case T__34:
			case T__35:
			case T__36:
			case TK_ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(477);
				tipo_dato();
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

	public static class Exp_vector_no_recursive_to_translationContext extends ParserRuleContext {
		public Dim_varContext dim_var() {
			return getRuleContext(Dim_varContext.class,0);
		}
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public List<Lista_dim_varContext> lista_dim_var() {
			return getRuleContexts(Lista_dim_varContext.class);
		}
		public Lista_dim_varContext lista_dim_var(int i) {
			return getRuleContext(Lista_dim_varContext.class,i);
		}
		public List<Declarar_var_no_rescurive_to_translationContext> declarar_var_no_rescurive_to_translation() {
			return getRuleContexts(Declarar_var_no_rescurive_to_translationContext.class);
		}
		public Declarar_var_no_rescurive_to_translationContext declarar_var_no_rescurive_to_translation(int i) {
			return getRuleContext(Declarar_var_no_rescurive_to_translationContext.class,i);
		}
		public Exp_vector_no_recursive_to_translationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_vector_no_recursive_to_translation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExp_vector_no_recursive_to_translation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExp_vector_no_recursive_to_translation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExp_vector_no_recursive_to_translation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_vector_no_recursive_to_translationContext exp_vector_no_recursive_to_translation() throws RecognitionException {
		Exp_vector_no_recursive_to_translationContext _localctx = new Exp_vector_no_recursive_to_translationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exp_vector_no_recursive_to_translation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__27);
			setState(481);
			dim_var();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(482);
				lista_dim_var();
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			match(T__28);
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case TK_ID:
				{
				setState(489);
				tipo_dato();
				}
				break;
			case T__33:
				{
				setState(490);
				match(T__33);
				setState(491);
				match(T__25);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_ID) {
					{
					{
					setState(492);
					declarar_var_no_rescurive_to_translation();
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(498);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Exp_matriz_no_recursive_to_translationContext extends ParserRuleContext {
		public List<Dim_varContext> dim_var() {
			return getRuleContexts(Dim_varContext.class);
		}
		public Dim_varContext dim_var(int i) {
			return getRuleContext(Dim_varContext.class,i);
		}
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public List<Lista_dim_varContext> lista_dim_var() {
			return getRuleContexts(Lista_dim_varContext.class);
		}
		public Lista_dim_varContext lista_dim_var(int i) {
			return getRuleContext(Lista_dim_varContext.class,i);
		}
		public List<Declarar_var_no_rescurive_to_translationContext> declarar_var_no_rescurive_to_translation() {
			return getRuleContexts(Declarar_var_no_rescurive_to_translationContext.class);
		}
		public Declarar_var_no_rescurive_to_translationContext declarar_var_no_rescurive_to_translation(int i) {
			return getRuleContext(Declarar_var_no_rescurive_to_translationContext.class,i);
		}
		public Exp_matriz_no_recursive_to_translationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_matriz_no_recursive_to_translation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExp_matriz_no_recursive_to_translation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExp_matriz_no_recursive_to_translation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExp_matriz_no_recursive_to_translation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_matriz_no_recursive_to_translationContext exp_matriz_no_recursive_to_translation() throws RecognitionException {
		Exp_matriz_no_recursive_to_translationContext _localctx = new Exp_matriz_no_recursive_to_translationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exp_matriz_no_recursive_to_translation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__27);
			setState(502);
			dim_var();
			setState(503);
			match(T__21);
			setState(504);
			dim_var();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(505);
				lista_dim_var();
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
			match(T__28);
			setState(522);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
			case TK_ID:
				{
				setState(512);
				tipo_dato();
				}
				break;
			case T__33:
				{
				setState(513);
				match(T__33);
				setState(514);
				match(T__25);
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_ID) {
					{
					{
					setState(515);
					declarar_var_no_rescurive_to_translation();
					}
					}
					setState(520);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(521);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Exp_registro_no_recursive_to_translationContext extends ParserRuleContext {
		public List<Declarar_var_no_rescurive_to_translationContext> declarar_var_no_rescurive_to_translation() {
			return getRuleContexts(Declarar_var_no_rescurive_to_translationContext.class);
		}
		public Declarar_var_no_rescurive_to_translationContext declarar_var_no_rescurive_to_translation(int i) {
			return getRuleContext(Declarar_var_no_rescurive_to_translationContext.class,i);
		}
		public Exp_registro_no_recursive_to_translationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_registro_no_recursive_to_translation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExp_registro_no_recursive_to_translation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExp_registro_no_recursive_to_translation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExp_registro_no_recursive_to_translation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_registro_no_recursive_to_translationContext exp_registro_no_recursive_to_translation() throws RecognitionException {
		Exp_registro_no_recursive_to_translationContext _localctx = new Exp_registro_no_recursive_to_translationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exp_registro_no_recursive_to_translation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(T__25);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_ID) {
				{
				{
				setState(525);
				declarar_var_no_rescurive_to_translation();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
			match(T__26);
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

	public static class Cuerpo_mainContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public SeparadorContext separador() {
			return getRuleContext(SeparadorContext.class,0);
		}
		public BuclesContext bucles() {
			return getRuleContext(BuclesContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public EvalContext eval() {
			return getRuleContext(EvalContext.class,0);
		}
		public Cuerpo_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCuerpo_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCuerpo_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCuerpo_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cuerpo_mainContext cuerpo_main() throws RecognitionException {
		Cuerpo_mainContext _localctx = new Cuerpo_mainContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_cuerpo_main);
		try {
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__14:
			case T__22:
			case T__23:
			case T__25:
			case TK_ID:
			case TK_CADENA:
			case TK_NUMERO:
			case TK_LOGICO:
			case SUM:
			case RES:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				sentencia();
				setState(535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(534);
					separador();
					}
					break;
				}
				}
				break;
			case T__37:
			case T__38:
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				bucles();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				condicional();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				eval();
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

	public static class SentenciaContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Lvalue_igualContext lvalue_igual() {
			return getRuleContext(Lvalue_igualContext.class,0);
		}
		public SeparadorContext separador() {
			return getRuleContext(SeparadorContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sentencia);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__22:
			case T__23:
			case T__25:
			case TK_ID:
			case TK_CADENA:
			case TK_NUMERO:
			case TK_LOGICO:
			case SUM:
			case RES:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(542);
					lvalue_igual();
					}
					break;
				}
				setState(545);
				expresion();
				setState(547);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(546);
					separador();
					}
					break;
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				match(T__7);
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

	public static class Lvalue_igualContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Lvalue_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLvalue_igual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLvalue_igual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLvalue_igual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lvalue_igualContext lvalue_igual() throws RecognitionException {
		Lvalue_igualContext _localctx = new Lvalue_igualContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_lvalue_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			lvalue();
			setState(553);
			match(T__6);
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

	public static class Lvalue_igual_desdeContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Lvalue_igual_desdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue_igual_desde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLvalue_igual_desde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLvalue_igual_desde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLvalue_igual_desde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lvalue_igual_desdeContext lvalue_igual_desde() throws RecognitionException {
		Lvalue_igual_desdeContext _localctx = new Lvalue_igual_desdeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lvalue_igual_desde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			lvalue();
			setState(556);
			match(T__6);
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

	public static class BuclesContext extends ParserRuleContext {
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public DesdeContext desde() {
			return getRuleContext(DesdeContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public BuclesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterBucles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitBucles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitBucles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuclesContext bucles() throws RecognitionException {
		BuclesContext _localctx = new BuclesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_bucles);
		try {
			setState(561);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				mientras();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				desde();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				repetir();
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

	public static class MientrasContext extends ParserRuleContext {
		public Expresion_mientrasContext expresion_mientras() {
			return getRuleContext(Expresion_mientrasContext.class,0);
		}
		public List<Cuerpo_mainContext> cuerpo_main() {
			return getRuleContexts(Cuerpo_mainContext.class);
		}
		public Cuerpo_mainContext cuerpo_main(int i) {
			return getRuleContext(Cuerpo_mainContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__37);
			setState(564);
			match(T__23);
			setState(565);
			expresion_mientras();
			setState(566);
			match(T__24);
			setState(567);
			match(T__25);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
				{
				{
				setState(568);
				cuerpo_main();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(T__26);
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

	public static class Expresion_mientrasContext extends ParserRuleContext {
		public Tk_generalContext tk_general() {
			return getRuleContext(Tk_generalContext.class,0);
		}
		public Cuerpo_operadoresContext cuerpo_operadores() {
			return getRuleContext(Cuerpo_operadoresContext.class,0);
		}
		public Expresion_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExpresion_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExpresion_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExpresion_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_mientrasContext expresion_mientras() throws RecognitionException {
		Expresion_mientrasContext _localctx = new Expresion_mientrasContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expresion_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			tk_general();
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << SUM) | (1L << RES))) != 0)) {
				{
				setState(577);
				cuerpo_operadores();
				}
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

	public static class RepetirContext extends ParserRuleContext {
		public Expresion_repetirContext expresion_repetir() {
			return getRuleContext(Expresion_repetirContext.class,0);
		}
		public List<Cuerpo_mainContext> cuerpo_main() {
			return getRuleContexts(Cuerpo_mainContext.class);
		}
		public Cuerpo_mainContext cuerpo_main(int i) {
			return getRuleContext(Cuerpo_mainContext.class,i);
		}
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitRepetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitRepetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(T__38);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
				{
				{
				setState(581);
				cuerpo_main();
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
			match(T__39);
			setState(588);
			match(T__23);
			setState(589);
			expresion_repetir();
			setState(590);
			match(T__24);
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

	public static class Expresion_repetirContext extends ParserRuleContext {
		public Tk_generalContext tk_general() {
			return getRuleContext(Tk_generalContext.class,0);
		}
		public Cuerpo_operadoresContext cuerpo_operadores() {
			return getRuleContext(Cuerpo_operadoresContext.class,0);
		}
		public Expresion_repetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_repetir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExpresion_repetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExpresion_repetir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExpresion_repetir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_repetirContext expresion_repetir() throws RecognitionException {
		Expresion_repetirContext _localctx = new Expresion_repetirContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expresion_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			tk_general();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << SUM) | (1L << RES))) != 0)) {
				{
				setState(593);
				cuerpo_operadores();
				}
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

	public static class DesdeContext extends ParserRuleContext {
		public Asignaciones_desdeContext asignaciones_desde() {
			return getRuleContext(Asignaciones_desdeContext.class,0);
		}
		public Expresion_desdeContext expresion_desde() {
			return getRuleContext(Expresion_desdeContext.class,0);
		}
		public List<Cuerpo_mainContext> cuerpo_main() {
			return getRuleContexts(Cuerpo_mainContext.class);
		}
		public Cuerpo_mainContext cuerpo_main(int i) {
			return getRuleContext(Cuerpo_mainContext.class,i);
		}
		public DesdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterDesde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitDesde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitDesde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesdeContext desde() throws RecognitionException {
		DesdeContext _localctx = new DesdeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_desde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(T__40);
			setState(597);
			asignaciones_desde();
			setState(598);
			match(T__39);
			setState(599);
			expresion_desde();
			setState(600);
			match(T__25);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
				{
				{
				setState(601);
				cuerpo_main();
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			match(T__26);
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

	public static class Expresion_desdeContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public PasoContext paso() {
			return getRuleContext(PasoContext.class,0);
		}
		public Expresion_desdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_desde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterExpresion_desde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitExpresion_desde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitExpresion_desde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_desdeContext expresion_desde() throws RecognitionException {
		Expresion_desdeContext _localctx = new Expresion_desdeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_expresion_desde);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			expresion();
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(610);
				paso();
				}
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

	public static class Asignaciones_desdeContext extends ParserRuleContext {
		public Lvalue_igual_desdeContext lvalue_igual_desde() {
			return getRuleContext(Lvalue_igual_desdeContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Asignaciones_desdeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignaciones_desde; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterAsignaciones_desde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitAsignaciones_desde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitAsignaciones_desde(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignaciones_desdeContext asignaciones_desde() throws RecognitionException {
		Asignaciones_desdeContext _localctx = new Asignaciones_desdeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_asignaciones_desde);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			lvalue_igual_desde();
			setState(614);
			expresion();
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

	public static class AsignacionesContext extends ParserRuleContext {
		public Lvalue_igualContext lvalue_igual() {
			return getRuleContext(Lvalue_igualContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterAsignaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitAsignaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitAsignaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionesContext asignaciones() throws RecognitionException {
		AsignacionesContext _localctx = new AsignacionesContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_asignaciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			lvalue_igual();
			setState(617);
			expresion();
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

	public static class PasoContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterPaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitPaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitPaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_paso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(T__41);
			setState(620);
			expresion();
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

	public static class CondicionalContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Cuerpo_condicionalContext cuerpo_condicional() {
			return getRuleContext(Cuerpo_condicionalContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(T__42);
			setState(623);
			match(T__23);
			setState(624);
			expresion();
			setState(625);
			match(T__24);
			setState(626);
			cuerpo_condicional();
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

	public static class Cuerpo_condicionalContext extends ParserRuleContext {
		public List<Cuerpo_mainContext> cuerpo_main() {
			return getRuleContexts(Cuerpo_mainContext.class);
		}
		public Cuerpo_mainContext cuerpo_main(int i) {
			return getRuleContext(Cuerpo_mainContext.class,i);
		}
		public List<Sino_siContext> sino_si() {
			return getRuleContexts(Sino_siContext.class);
		}
		public Sino_siContext sino_si(int i) {
			return getRuleContext(Sino_siContext.class,i);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public Cuerpo_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCuerpo_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCuerpo_condicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCuerpo_condicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cuerpo_condicionalContext cuerpo_condicional() throws RecognitionException {
		Cuerpo_condicionalContext _localctx = new Cuerpo_condicionalContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_cuerpo_condicional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(T__25);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
				{
				{
				setState(629);
				cuerpo_main();
				}
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(635);
					sino_si();
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(641);
				sino();
				}
			}

			setState(644);
			match(T__26);
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

	public static class Sino_siContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Cuerpo_sino_siContext cuerpo_sino_si() {
			return getRuleContext(Cuerpo_sino_siContext.class,0);
		}
		public Sino_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterSino_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitSino_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitSino_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sino_siContext sino_si() throws RecognitionException {
		Sino_siContext _localctx = new Sino_siContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sino_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(T__43);
			setState(647);
			match(T__42);
			setState(648);
			match(T__23);
			setState(649);
			expresion();
			setState(650);
			match(T__24);
			setState(651);
			cuerpo_sino_si();
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

	public static class Cuerpo_sino_siContext extends ParserRuleContext {
		public List<Cuerpo_mainContext> cuerpo_main() {
			return getRuleContexts(Cuerpo_mainContext.class);
		}
		public Cuerpo_mainContext cuerpo_main(int i) {
			return getRuleContext(Cuerpo_mainContext.class,i);
		}
		public Cuerpo_sino_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_sino_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCuerpo_sino_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCuerpo_sino_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCuerpo_sino_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cuerpo_sino_siContext cuerpo_sino_si() throws RecognitionException {
		Cuerpo_sino_siContext _localctx = new Cuerpo_sino_siContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cuerpo_sino_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
				{
				{
				setState(653);
				cuerpo_main();
				}
				}
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SinoContext extends ParserRuleContext {
		public List<Cuerpo_mainContext> cuerpo_main() {
			return getRuleContexts(Cuerpo_mainContext.class);
		}
		public Cuerpo_mainContext cuerpo_main(int i) {
			return getRuleContext(Cuerpo_mainContext.class,i);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitSino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitSino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sino);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(T__43);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
				{
				{
				setState(660);
				cuerpo_main();
				}
				}
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EvalContext extends ParserRuleContext {
		public CasoContext caso() {
			return getRuleContext(CasoContext.class,0);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_eval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(T__44);
			setState(667);
			match(T__25);
			setState(668);
			caso();
			setState(669);
			match(T__26);
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

	public static class CasoContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Cuerpo_casoContext cuerpo_caso() {
			return getRuleContext(Cuerpo_casoContext.class,0);
		}
		public CasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoContext caso() throws RecognitionException {
		CasoContext _localctx = new CasoContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_caso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(T__45);
			setState(672);
			match(T__23);
			setState(673);
			expresion();
			setState(674);
			match(T__24);
			setState(675);
			cuerpo_caso();
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

	public static class Cuerpo_casoContext extends ParserRuleContext {
		public List<Cuerpo_mainContext> cuerpo_main() {
			return getRuleContexts(Cuerpo_mainContext.class);
		}
		public Cuerpo_mainContext cuerpo_main(int i) {
			return getRuleContext(Cuerpo_mainContext.class,i);
		}
		public Caso_primaContext caso_prima() {
			return getRuleContext(Caso_primaContext.class,0);
		}
		public Cuerpo_casoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCuerpo_caso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCuerpo_caso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCuerpo_caso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cuerpo_casoContext cuerpo_caso() throws RecognitionException {
		Cuerpo_casoContext _localctx = new Cuerpo_casoContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cuerpo_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
				{
				{
				setState(677);
				cuerpo_main();
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43 || _la==T__45) {
				{
				setState(683);
				caso_prima();
				}
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

	public static class Caso_primaContext extends ParserRuleContext {
		public Caso_segundoContext caso_segundo() {
			return getRuleContext(Caso_segundoContext.class,0);
		}
		public SinoContext sino() {
			return getRuleContext(SinoContext.class,0);
		}
		public Caso_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso_prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCaso_prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCaso_prima(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCaso_prima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Caso_primaContext caso_prima() throws RecognitionException {
		Caso_primaContext _localctx = new Caso_primaContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_caso_prima);
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				caso_segundo();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
				sino();
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

	public static class Caso_segundoContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Cuerpo_caso_segundoContext cuerpo_caso_segundo() {
			return getRuleContext(Cuerpo_caso_segundoContext.class,0);
		}
		public Caso_segundoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso_segundo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCaso_segundo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCaso_segundo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCaso_segundo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Caso_segundoContext caso_segundo() throws RecognitionException {
		Caso_segundoContext _localctx = new Caso_segundoContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_caso_segundo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(T__45);
			setState(691);
			match(T__23);
			setState(692);
			expresion();
			setState(693);
			match(T__24);
			setState(694);
			cuerpo_caso_segundo();
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

	public static class Cuerpo_caso_segundoContext extends ParserRuleContext {
		public List<Cuerpo_mainContext> cuerpo_main() {
			return getRuleContexts(Cuerpo_mainContext.class);
		}
		public Cuerpo_mainContext cuerpo_main(int i) {
			return getRuleContext(Cuerpo_mainContext.class,i);
		}
		public Caso_primaContext caso_prima() {
			return getRuleContext(Caso_primaContext.class,0);
		}
		public Cuerpo_caso_segundoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo_caso_segundo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterCuerpo_caso_segundo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitCuerpo_caso_segundo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitCuerpo_caso_segundo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cuerpo_caso_segundoContext cuerpo_caso_segundo() throws RecognitionException {
		Cuerpo_caso_segundoContext _localctx = new Cuerpo_caso_segundoContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cuerpo_caso_segundo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
				{
				{
				setState(696);
				cuerpo_main();
				}
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43 || _la==T__45) {
				{
				setState(702);
				caso_prima();
				}
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

	public static class SubrutinasContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public Lista_subContext lista_sub() {
			return getRuleContext(Lista_subContext.class,0);
		}
		public SubrutinasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrutinas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterSubrutinas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitSubrutinas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitSubrutinas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrutinasContext subrutinas() throws RecognitionException {
		SubrutinasContext _localctx = new SubrutinasContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_subrutinas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(T__46);
			setState(706);
			match(TK_ID);
			setState(707);
			match(T__23);
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47 || _la==TK_ID) {
				{
				setState(708);
				lista_sub();
				}
			}

			setState(711);
			match(T__24);
			setState(712);
			retorno();
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

	public static class Lista_subContext extends ParserRuleContext {
		public TerminalNode TK_ID() { return getToken(TraductorSLParser.TK_ID, 0); }
		public Tipo_declaracion_varContext tipo_declaracion_var() {
			return getRuleContext(Tipo_declaracion_varContext.class,0);
		}
		public RefContext ref() {
			return getRuleContext(RefContext.class,0);
		}
		public List<ListaContext> lista() {
			return getRuleContexts(ListaContext.class);
		}
		public ListaContext lista(int i) {
			return getRuleContext(ListaContext.class,i);
		}
		public Lista_sub_separadorContext lista_sub_separador() {
			return getRuleContext(Lista_sub_separadorContext.class,0);
		}
		public Lista_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLista_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLista_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLista_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_subContext lista_sub() throws RecognitionException {
		Lista_subContext _localctx = new Lista_subContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_lista_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(714);
				ref();
				}
			}

			setState(717);
			match(TK_ID);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(718);
				lista();
				}
				}
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(724);
			match(T__30);
			setState(725);
			tipo_declaracion_var();
			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__21) {
				{
				setState(726);
				lista_sub_separador();
				}
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

	public static class RefContext extends ParserRuleContext {
		public RefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefContext ref() throws RecognitionException {
		RefContext _localctx = new RefContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(T__47);
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

	public static class Lista_sub_separadorContext extends ParserRuleContext {
		public Lista_subContext lista_sub() {
			return getRuleContext(Lista_subContext.class,0);
		}
		public Lista_sub_separadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_sub_separador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterLista_sub_separador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitLista_sub_separador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitLista_sub_separador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_sub_separadorContext lista_sub_separador() throws RecognitionException {
		Lista_sub_separadorContext _localctx = new Lista_sub_separadorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_lista_sub_separador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(732);
			lista_sub();
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

	public static class RetornoContext extends ParserRuleContext {
		public Retorna2Context retorna2() {
			return getRuleContext(Retorna2Context.class,0);
		}
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public List<CtvContext> ctv() {
			return getRuleContexts(CtvContext.class);
		}
		public CtvContext ctv(int i) {
			return getRuleContext(CtvContext.class,i);
		}
		public List<Cuerpo_mainContext> cuerpo_main() {
			return getRuleContexts(Cuerpo_mainContext.class);
		}
		public Cuerpo_mainContext cuerpo_main(int i) {
			return getRuleContext(Cuerpo_mainContext.class,i);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_retorno);
		int _la;
		try {
			setState(758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(T__48);
				{
				setState(735);
				tipo_dato();
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
					{
					{
					setState(736);
					ctv();
					}
					}
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(742);
				match(T__4);
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__14) | (1L << T__22) | (1L << T__23) | (1L << T__25) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << TK_ID) | (1L << TK_CADENA) | (1L << TK_NUMERO) | (1L << TK_LOGICO) | (1L << SUM) | (1L << RES))) != 0)) {
					{
					{
					setState(743);
					cuerpo_main();
					}
					}
					setState(748);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(749);
				retorna2();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
					{
					{
					setState(751);
					ctv();
					}
					}
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(757);
				main();
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

	public static class Retorna2Context extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Fin_finalContext fin_final() {
			return getRuleContext(Fin_finalContext.class,0);
		}
		public Retorna2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorna2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterRetorna2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitRetorna2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitRetorna2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Retorna2Context retorna2() throws RecognitionException {
		Retorna2Context _localctx = new Retorna2Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_retorna2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(T__48);
			setState(761);
			expresion();
			setState(762);
			fin_final();
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

	public static class Fin_finalContext extends ParserRuleContext {
		public Fin_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fin_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).enterFin_final(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorSLListener ) ((TraductorSLListener)listener).exitFin_final(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorSLVisitor ) return ((TraductorSLVisitor<? extends T>)visitor).visitFin_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fin_finalContext fin_final() throws RecognitionException {
		Fin_finalContext _localctx = new Fin_finalContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_fin_final);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(T__5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0301\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\5\2\u009e\n\2\3\2\7\2\u00a1\n\2"+
		"\f\2\16\2\u00a4\13\2\3\2\3\2\7\2\u00a8\n\2\f\2\16\2\u00ab\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u00b5\n\4\3\5\3\5\7\5\u00b9\n\5\f\5\16\5"+
		"\u00bc\13\5\3\6\3\6\7\6\u00c0\n\6\f\6\16\6\u00c3\13\6\3\7\3\7\7\7\u00c7"+
		"\n\7\f\7\16\7\u00ca\13\7\3\b\3\b\7\b\u00ce\n\b\f\b\16\b\u00d1\13\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\5\t\u00d9\n\t\3\n\3\n\3\13\3\13\5\13\u00df\n\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u00e8\n\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00ee\n\16\3\16\3\16\3\16\3\16\5\16\u00f4\n\16\3\16\3\16\5\16\u00f8\n"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00fe\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0107\n\16\3\17\3\17\5\17\u010b\n\17\3\20\3\20\3\20\3\20\7"+
		"\20\u0111\n\20\f\20\16\20\u0114\13\20\3\20\7\20\u0117\n\20\f\20\16\20"+
		"\u011a\13\20\5\20\u011c\n\20\3\21\3\21\7\21\u0120\n\21\f\21\16\21\u0123"+
		"\13\21\3\22\3\22\3\22\3\23\3\23\7\23\u012a\n\23\f\23\16\23\u012d\13\23"+
		"\3\24\3\24\3\24\3\25\3\25\7\25\u0134\n\25\f\25\16\25\u0137\13\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\5\27\u013f\n\27\3\30\3\30\7\30\u0143\n\30\f"+
		"\30\16\30\u0146\13\30\3\30\3\30\3\30\5\30\u014b\n\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u015a\n\33\3\34"+
		"\3\34\3\34\7\34\u015f\n\34\f\34\16\34\u0162\13\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0168\n\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u0174\n\37\f\37\16\37\u0177\13\37\3\37\3\37\3\37\3\37\5\37\u017d\n\37"+
		"\3 \3 \7 \u0181\n \f \16 \u0184\13 \3 \3 \3!\3!\3\"\3\"\7\"\u018c\n\""+
		"\f\"\16\"\u018f\13\"\3\"\3\"\3\"\5\"\u0194\n\"\3#\3#\3#\3#\3#\3#\3#\5"+
		"#\u019d\n#\3$\3$\3$\7$\u01a2\n$\f$\16$\u01a5\13$\3$\3$\3$\3$\5$\u01ab"+
		"\n$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\7\'\u01b7\n\'\f\'\16\'\u01ba\13"+
		"\'\3\'\3\'\3\'\3\'\5\'\u01c0\n\'\3(\3(\7(\u01c4\n(\f(\16(\u01c7\13(\3"+
		"(\3(\3)\3)\7)\u01cd\n)\f)\16)\u01d0\13)\3)\3)\3)\5)\u01d5\n)\3*\3*\3*"+
		"\3+\3+\3+\3+\3+\3+\3+\5+\u01e1\n+\3,\3,\3,\7,\u01e6\n,\f,\16,\u01e9\13"+
		",\3,\3,\3,\3,\3,\7,\u01f0\n,\f,\16,\u01f3\13,\3,\5,\u01f6\n,\3-\3-\3-"+
		"\3-\3-\7-\u01fd\n-\f-\16-\u0200\13-\3-\3-\3-\3-\3-\7-\u0207\n-\f-\16-"+
		"\u020a\13-\3-\5-\u020d\n-\3.\3.\7.\u0211\n.\f.\16.\u0214\13.\3.\3.\3/"+
		"\3/\5/\u021a\n/\3/\3/\3/\5/\u021f\n/\3\60\5\60\u0222\n\60\3\60\3\60\5"+
		"\60\u0226\n\60\3\60\5\60\u0229\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\5\63\u0234\n\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u023c\n"+
		"\64\f\64\16\64\u023f\13\64\3\64\3\64\3\65\3\65\5\65\u0245\n\65\3\66\3"+
		"\66\7\66\u0249\n\66\f\66\16\66\u024c\13\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\5\67\u0255\n\67\38\38\38\38\38\38\78\u025d\n8\f8\168\u0260\13"+
		"8\38\38\39\39\59\u0266\n9\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3=\3=\3"+
		"=\3>\3>\7>\u0279\n>\f>\16>\u027c\13>\3>\7>\u027f\n>\f>\16>\u0282\13>\3"+
		">\5>\u0285\n>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\7@\u0291\n@\f@\16@\u0294\13"+
		"@\3A\3A\7A\u0298\nA\fA\16A\u029b\13A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C"+
		"\3D\7D\u02a9\nD\fD\16D\u02ac\13D\3D\5D\u02af\nD\3E\3E\5E\u02b3\nE\3F\3"+
		"F\3F\3F\3F\3F\3G\7G\u02bc\nG\fG\16G\u02bf\13G\3G\5G\u02c2\nG\3H\3H\3H"+
		"\3H\5H\u02c8\nH\3H\3H\3H\3I\5I\u02ce\nI\3I\3I\7I\u02d2\nI\fI\16I\u02d5"+
		"\13I\3I\3I\3I\5I\u02da\nI\3J\3J\3K\3K\3K\3L\3L\3L\7L\u02e4\nL\fL\16L\u02e7"+
		"\13L\3L\3L\7L\u02eb\nL\fL\16L\u02ee\13L\3L\3L\3L\7L\u02f3\nL\fL\16L\u02f6"+
		"\13L\3L\5L\u02f9\nL\3M\3M\3M\3M\3N\3N\3N\2\2O\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\2\b\4\2\13\30<=\3\2<=\4\2\13\13\66\66\4\2%\'\64\64"+
		"\5\2\13\13\64\64\66\66\4\2\n\n\30\30\2\u0314\2\u009d\3\2\2\2\4\u00ae\3"+
		"\2\2\2\6\u00b4\3\2\2\2\b\u00b6\3\2\2\2\n\u00bd\3\2\2\2\f\u00c4\3\2\2\2"+
		"\16\u00cb\3\2\2\2\20\u00d4\3\2\2\2\22\u00da\3\2\2\2\24\u00dc\3\2\2\2\26"+
		"\u00e0\3\2\2\2\30\u00e3\3\2\2\2\32\u0106\3\2\2\2\34\u0108\3\2\2\2\36\u011b"+
		"\3\2\2\2 \u011d\3\2\2\2\"\u0124\3\2\2\2$\u0127\3\2\2\2&\u012e\3\2\2\2"+
		"(\u0131\3\2\2\2*\u0138\3\2\2\2,\u013b\3\2\2\2.\u0140\3\2\2\2\60\u014c"+
		"\3\2\2\2\62\u014f\3\2\2\2\64\u0159\3\2\2\2\66\u015b\3\2\2\28\u0169\3\2"+
		"\2\2:\u016b\3\2\2\2<\u016e\3\2\2\2>\u017e\3\2\2\2@\u0187\3\2\2\2B\u0189"+
		"\3\2\2\2D\u019c\3\2\2\2F\u019e\3\2\2\2H\u01ac\3\2\2\2J\u01ae\3\2\2\2L"+
		"\u01b1\3\2\2\2N\u01c1\3\2\2\2P\u01ca\3\2\2\2R\u01d6\3\2\2\2T\u01e0\3\2"+
		"\2\2V\u01e2\3\2\2\2X\u01f7\3\2\2\2Z\u020e\3\2\2\2\\\u021e\3\2\2\2^\u0228"+
		"\3\2\2\2`\u022a\3\2\2\2b\u022d\3\2\2\2d\u0233\3\2\2\2f\u0235\3\2\2\2h"+
		"\u0242\3\2\2\2j\u0246\3\2\2\2l\u0252\3\2\2\2n\u0256\3\2\2\2p\u0263\3\2"+
		"\2\2r\u0267\3\2\2\2t\u026a\3\2\2\2v\u026d\3\2\2\2x\u0270\3\2\2\2z\u0276"+
		"\3\2\2\2|\u0288\3\2\2\2~\u0292\3\2\2\2\u0080\u0295\3\2\2\2\u0082\u029c"+
		"\3\2\2\2\u0084\u02a1\3\2\2\2\u0086\u02aa\3\2\2\2\u0088\u02b2\3\2\2\2\u008a"+
		"\u02b4\3\2\2\2\u008c\u02bd\3\2\2\2\u008e\u02c3\3\2\2\2\u0090\u02cd\3\2"+
		"\2\2\u0092\u02db\3\2\2\2\u0094\u02dd\3\2\2\2\u0096\u02f8\3\2\2\2\u0098"+
		"\u02fa\3\2\2\2\u009a\u02fe\3\2\2\2\u009c\u009e\5\4\3\2\u009d\u009c\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a2\3\2\2\2\u009f\u00a1\5\6\4\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a9\5\16\b\2\u00a6"+
		"\u00a8\5\u008eH\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\b\2\1\2\u00ad\3\3\2\2\2\u00ae\u00af\7\3\2\2\u00af\u00b0\7\64\2"+
		"\2\u00b0\5\3\2\2\2\u00b1\u00b5\5\b\5\2\u00b2\u00b5\5\n\6\2\u00b3\u00b5"+
		"\5\f\7\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\7\3\2\2\2\u00b6\u00ba\7\4\2\2\u00b7\u00b9\5\20\t\2\u00b8\u00b7\3\2\2"+
		"\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\t"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c1\7\5\2\2\u00be\u00c0\5B\"\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\13\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c8\7\6\2\2\u00c5\u00c7"+
		"\5.\30\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\r\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cf\7\7\2\2"+
		"\u00cc\u00ce\5\\/\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\7\b\2\2\u00d3\17\3\2\2\2\u00d4\u00d5\7\64\2\2\u00d5\u00d6\7\t\2"+
		"\2\u00d6\u00d8\5\24\13\2\u00d7\u00d9\5\22\n\2\u00d8\u00d7\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\21\3\2\2\2\u00da\u00db\7\n\2\2\u00db\23\3\2\2\2\u00dc"+
		"\u00de\5\32\16\2\u00dd\u00df\5\26\f\2\u00de\u00dd\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\25\3\2\2\2\u00e0\u00e1\5\30\r\2\u00e1\u00e2\5\24\13\2\u00e2"+
		"\27\3\2\2\2\u00e3\u00e4\t\2\2\2\u00e4\31\3\2\2\2\u00e5\u0107\7\65\2\2"+
		"\u00e6\u00e8\t\3\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u0107\7\66\2\2\u00ea\u00eb\7\31\2\2\u00eb\u00ed\7\32\2"+
		"\2\u00ec\u00ee\5(\25\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u0107\7\33\2\2\u00f0\u00f1\7\64\2\2\u00f1\u00f3\7\32\2"+
		"\2\u00f2\u00f4\5$\23\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u0107\7\33\2\2\u00f6\u00f8\t\3\2\2\u00f7\u00f6\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0107\5\34\17\2\u00fa\u0107"+
		"\78\2\2\u00fb\u00fd\7\34\2\2\u00fc\u00fe\5$\23\2\u00fd\u00fc\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0107\7\35\2\2\u0100\u0101\7"+
		"\32\2\2\u0101\u0102\5\24\13\2\u0102\u0103\7\33\2\2\u0103\u0107\3\2\2\2"+
		"\u0104\u0105\7\21\2\2\u0105\u0107\5\32\16\2\u0106\u00e5\3\2\2\2\u0106"+
		"\u00e7\3\2\2\2\u0106\u00ea\3\2\2\2\u0106\u00f0\3\2\2\2\u0106\u00f7\3\2"+
		"\2\2\u0106\u00fa\3\2\2\2\u0106\u00fb\3\2\2\2\u0106\u0100\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\33\3\2\2\2\u0108\u010a\7\64\2\2\u0109\u010b\5\36"+
		"\20\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\35\3\2\2\2\u010c\u010d"+
		"\7\36\2\2\u010d\u010e\5 \21\2\u010e\u0112\7\37\2\2\u010f\u0111\5,\27\2"+
		"\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u011c\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\5,\27\2\u0116"+
		"\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u010c\3\2\2\2\u011b"+
		"\u0118\3\2\2\2\u011c\37\3\2\2\2\u011d\u0121\5\24\13\2\u011e\u0120\5\""+
		"\22\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122!\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\30\2\2"+
		"\u0125\u0126\5\24\13\2\u0126#\3\2\2\2\u0127\u012b\5\24\13\2\u0128\u012a"+
		"\5&\24\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c%\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7\30\2\2"+
		"\u012f\u0130\5\24\13\2\u0130\'\3\2\2\2\u0131\u0135\5\24\13\2\u0132\u0134"+
		"\5*\26\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136)\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\30\2\2"+
		"\u0139\u013a\5\24\13\2\u013a+\3\2\2\2\u013b\u013c\7 \2\2\u013c\u013e\7"+
		"\64\2\2\u013d\u013f\5\36\20\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2"+
		"\u013f-\3\2\2\2\u0140\u0144\7\64\2\2\u0141\u0143\5\60\31\2\u0142\u0141"+
		"\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7!\2\2\u0148\u014a\5\64"+
		"\33\2\u0149\u014b\5\22\n\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"/\3\2\2\2\u014c\u014d\7\30\2\2\u014d\u014e\7\64\2\2\u014e\61\3\2\2\2\u014f"+
		"\u0150\7\30\2\2\u0150\u0151\7\64\2\2\u0151\63\3\2\2\2\u0152\u0153\7\""+
		"\2\2\u0153\u015a\5\66\34\2\u0154\u0155\7#\2\2\u0155\u015a\5<\37\2\u0156"+
		"\u0157\7$\2\2\u0157\u015a\5> \2\u0158\u015a\5@!\2\u0159\u0152\3\2\2\2"+
		"\u0159\u0154\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0158\3\2\2\2\u015a\65"+
		"\3\2\2\2\u015b\u015c\7\36\2\2\u015c\u0160\58\35\2\u015d\u015f\5:\36\2"+
		"\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0167\7\37\2\2"+
		"\u0164\u0168\5@!\2\u0165\u0166\7$\2\2\u0166\u0168\5> \2\u0167\u0164\3"+
		"\2\2\2\u0167\u0165\3\2\2\2\u0168\67\3\2\2\2\u0169\u016a\t\4\2\2\u016a"+
		"9\3\2\2\2\u016b\u016c\7\30\2\2\u016c\u016d\58\35\2\u016d;\3\2\2\2\u016e"+
		"\u016f\7\36\2\2\u016f\u0170\58\35\2\u0170\u0171\7\30\2\2\u0171\u0175\5"+
		"8\35\2\u0172\u0174\5:\36\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2"+
		"\2\2\u0178\u017c\7\37\2\2\u0179\u017d\5@!\2\u017a\u017b\7$\2\2\u017b\u017d"+
		"\5> \2\u017c\u0179\3\2\2\2\u017c\u017a\3\2\2\2\u017d=\3\2\2\2\u017e\u0182"+
		"\7\34\2\2\u017f\u0181\5P)\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0185\u0186\7\35\2\2\u0186?\3\2\2\2\u0187\u0188\t\5\2\2\u0188A\3"+
		"\2\2\2\u0189\u018d\7\64\2\2\u018a\u018c\5\62\32\2\u018b\u018a\3\2\2\2"+
		"\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7!\2\2\u0191\u0193\5D#\2\u0192"+
		"\u0194\5\22\n\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194C\3\2\2\2"+
		"\u0195\u0196\7\"\2\2\u0196\u019d\5F$\2\u0197\u0198\7#\2\2\u0198\u019d"+
		"\5L\'\2\u0199\u019a\7$\2\2\u019a\u019d\5N(\2\u019b\u019d\5@!\2\u019c\u0195"+
		"\3\2\2\2\u019c\u0197\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019b\3\2\2\2\u019d"+
		"E\3\2\2\2\u019e\u019f\7\36\2\2\u019f\u01a3\5H%\2\u01a0\u01a2\5J&\2\u01a1"+
		"\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2"+
		"\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01aa\7\37\2\2\u01a7"+
		"\u01ab\5@!\2\u01a8\u01a9\7$\2\2\u01a9\u01ab\5N(\2\u01aa\u01a7\3\2\2\2"+
		"\u01aa\u01a8\3\2\2\2\u01abG\3\2\2\2\u01ac\u01ad\t\6\2\2\u01adI\3\2\2\2"+
		"\u01ae\u01af\7\30\2\2\u01af\u01b0\5H%\2\u01b0K\3\2\2\2\u01b1\u01b2\7\36"+
		"\2\2\u01b2\u01b3\5H%\2\u01b3\u01b4\7\30\2\2\u01b4\u01b8\5H%\2\u01b5\u01b7"+
		"\5J&\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bf\7\37"+
		"\2\2\u01bc\u01c0\5@!\2\u01bd\u01be\7$\2\2\u01be\u01c0\5N(\2\u01bf\u01bc"+
		"\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0M\3\2\2\2\u01c1\u01c5\7\34\2\2\u01c2"+
		"\u01c4\5P)\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2"+
		"\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9"+
		"\7\35\2\2\u01c9O\3\2\2\2\u01ca\u01ce\7\64\2\2\u01cb\u01cd\5R*\2\u01cc"+
		"\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7!\2\2\u01d2"+
		"\u01d4\5T+\2\u01d3\u01d5\5\22\n\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5Q\3\2\2\2\u01d6\u01d7\7\30\2\2\u01d7\u01d8\7\64\2\2\u01d8S\3"+
		"\2\2\2\u01d9\u01da\7\"\2\2\u01da\u01e1\5V,\2\u01db\u01dc\7#\2\2\u01dc"+
		"\u01e1\5X-\2\u01dd\u01de\7$\2\2\u01de\u01e1\5Z.\2\u01df\u01e1\5@!\2\u01e0"+
		"\u01d9\3\2\2\2\u01e0\u01db\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01df\3\2"+
		"\2\2\u01e1U\3\2\2\2\u01e2\u01e3\7\36\2\2\u01e3\u01e7\5H%\2\u01e4\u01e6"+
		"\5J&\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01f5\7\37"+
		"\2\2\u01eb\u01f6\5@!\2\u01ec\u01ed\7$\2\2\u01ed\u01f1\7\34\2\2\u01ee\u01f0"+
		"\5P)\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f6\7\35"+
		"\2\2\u01f5\u01eb\3\2\2\2\u01f5\u01ec\3\2\2\2\u01f6W\3\2\2\2\u01f7\u01f8"+
		"\7\36\2\2\u01f8\u01f9\5H%\2\u01f9\u01fa\7\30\2\2\u01fa\u01fe\5H%\2\u01fb"+
		"\u01fd\5J&\2\u01fc\u01fb\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2"+
		"\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u020c"+
		"\7\37\2\2\u0202\u020d\5@!\2\u0203\u0204\7$\2\2\u0204\u0208\7\34\2\2\u0205"+
		"\u0207\5P)\2\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2"+
		"\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020d"+
		"\7\35\2\2\u020c\u0202\3\2\2\2\u020c\u0203\3\2\2\2\u020dY\3\2\2\2\u020e"+
		"\u0212\7\34\2\2\u020f\u0211\5P)\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2"+
		"\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0215\u0216\7\35\2\2\u0216[\3\2\2\2\u0217\u0219\5^\60\2"+
		"\u0218\u021a\5\22\n\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021f"+
		"\3\2\2\2\u021b\u021f\5d\63\2\u021c\u021f\5x=\2\u021d\u021f\5\u0082B\2"+
		"\u021e\u0217\3\2\2\2\u021e\u021b\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021d"+
		"\3\2\2\2\u021f]\3\2\2\2\u0220\u0222\5`\61\2\u0221\u0220\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\5\24\13\2\u0224\u0226\5"+
		"\22\n\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0229\3\2\2\2\u0227"+
		"\u0229\7\n\2\2\u0228\u0221\3\2\2\2\u0228\u0227\3\2\2\2\u0229_\3\2\2\2"+
		"\u022a\u022b\5\34\17\2\u022b\u022c\7\t\2\2\u022ca\3\2\2\2\u022d\u022e"+
		"\5\34\17\2\u022e\u022f\7\t\2\2\u022fc\3\2\2\2\u0230\u0234\5f\64\2\u0231"+
		"\u0234\5n8\2\u0232\u0234\5j\66\2\u0233\u0230\3\2\2\2\u0233\u0231\3\2\2"+
		"\2\u0233\u0232\3\2\2\2\u0234e\3\2\2\2\u0235\u0236\7(\2\2\u0236\u0237\7"+
		"\32\2\2\u0237\u0238\5h\65\2\u0238\u0239\7\33\2\2\u0239\u023d\7\34\2\2"+
		"\u023a\u023c\5\\/\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240"+
		"\u0241\7\35\2\2\u0241g\3\2\2\2\u0242\u0244\5\32\16\2\u0243\u0245\5\26"+
		"\f\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245i\3\2\2\2\u0246\u024a"+
		"\7)\2\2\u0247\u0249\5\\/\2\u0248\u0247\3\2\2\2\u0249\u024c\3\2\2\2\u024a"+
		"\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024a\3\2"+
		"\2\2\u024d\u024e\7*\2\2\u024e\u024f\7\32\2\2\u024f\u0250\5l\67\2\u0250"+
		"\u0251\7\33\2\2\u0251k\3\2\2\2\u0252\u0254\5\32\16\2\u0253\u0255\5\26"+
		"\f\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255m\3\2\2\2\u0256\u0257"+
		"\7+\2\2\u0257\u0258\5r:\2\u0258\u0259\7*\2\2\u0259\u025a\5p9\2\u025a\u025e"+
		"\7\34\2\2\u025b\u025d\5\\/\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e"+
		"\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u025e\3\2"+
		"\2\2\u0261\u0262\7\35\2\2\u0262o\3\2\2\2\u0263\u0265\5\24\13\2\u0264\u0266"+
		"\5v<\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266q\3\2\2\2\u0267\u0268"+
		"\5b\62\2\u0268\u0269\5\24\13\2\u0269s\3\2\2\2\u026a\u026b\5`\61\2\u026b"+
		"\u026c\5\24\13\2\u026cu\3\2\2\2\u026d\u026e\7,\2\2\u026e\u026f\5\24\13"+
		"\2\u026fw\3\2\2\2\u0270\u0271\7-\2\2\u0271\u0272\7\32\2\2\u0272\u0273"+
		"\5\24\13\2\u0273\u0274\7\33\2\2\u0274\u0275\5z>\2\u0275y\3\2\2\2\u0276"+
		"\u027a\7\34\2\2\u0277\u0279\5\\/\2\u0278\u0277\3\2\2\2\u0279\u027c\3\2"+
		"\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0280\3\2\2\2\u027c"+
		"\u027a\3\2\2\2\u027d\u027f\5|?\2\u027e\u027d\3\2\2\2\u027f\u0282\3\2\2"+
		"\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280"+
		"\3\2\2\2\u0283\u0285\5\u0080A\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2"+
		"\2\u0285\u0286\3\2\2\2\u0286\u0287\7\35\2\2\u0287{\3\2\2\2\u0288\u0289"+
		"\7.\2\2\u0289\u028a\7-\2\2\u028a\u028b\7\32\2\2\u028b\u028c\5\24\13\2"+
		"\u028c\u028d\7\33\2\2\u028d\u028e\5~@\2\u028e}\3\2\2\2\u028f\u0291\5\\"+
		"/\2\u0290\u028f\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292"+
		"\u0293\3\2\2\2\u0293\177\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0299\7.\2"+
		"\2\u0296\u0298\5\\/\2\u0297\u0296\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297"+
		"\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u0081\3\2\2\2\u029b\u0299\3\2\2\2\u029c"+
		"\u029d\7/\2\2\u029d\u029e\7\34\2\2\u029e\u029f\5\u0084C\2\u029f\u02a0"+
		"\7\35\2\2\u02a0\u0083\3\2\2\2\u02a1\u02a2\7\60\2\2\u02a2\u02a3\7\32\2"+
		"\2\u02a3\u02a4\5\24\13\2\u02a4\u02a5\7\33\2\2\u02a5\u02a6\5\u0086D\2\u02a6"+
		"\u0085\3\2\2\2\u02a7\u02a9\5\\/\2\u02a8\u02a7\3\2\2\2\u02a9\u02ac\3\2"+
		"\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac"+
		"\u02aa\3\2\2\2\u02ad\u02af\5\u0088E\2\u02ae\u02ad\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02af\u0087\3\2\2\2\u02b0\u02b3\5\u008aF\2\u02b1\u02b3\5\u0080"+
		"A\2\u02b2\u02b0\3\2\2\2\u02b2\u02b1\3\2\2\2\u02b3\u0089\3\2\2\2\u02b4"+
		"\u02b5\7\60\2\2\u02b5\u02b6\7\32\2\2\u02b6\u02b7\5\24\13\2\u02b7\u02b8"+
		"\7\33\2\2\u02b8\u02b9\5\u008cG\2\u02b9\u008b\3\2\2\2\u02ba\u02bc\5\\/"+
		"\2\u02bb\u02ba\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be"+
		"\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c2\5\u0088E"+
		"\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u008d\3\2\2\2\u02c3\u02c4"+
		"\7\61\2\2\u02c4\u02c5\7\64\2\2\u02c5\u02c7\7\32\2\2\u02c6\u02c8\5\u0090"+
		"I\2\u02c7\u02c6\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02ca\7\33\2\2\u02ca\u02cb\5\u0096L\2\u02cb\u008f\3\2\2\2\u02cc\u02ce"+
		"\5\u0092J\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\3\2\2"+
		"\2\u02cf\u02d3\7\64\2\2\u02d0\u02d2\5\62\32\2\u02d1\u02d0\3\2\2\2\u02d2"+
		"\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2"+
		"\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d7\7!\2\2\u02d7\u02d9\5D#\2\u02d8\u02da"+
		"\5\u0094K\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u0091\3\2\2"+
		"\2\u02db\u02dc\7\62\2\2\u02dc\u0093\3\2\2\2\u02dd\u02de\t\7\2\2\u02de"+
		"\u02df\5\u0090I\2\u02df\u0095\3\2\2\2\u02e0\u02e1\7\63\2\2\u02e1\u02e5"+
		"\5@!\2\u02e2\u02e4\5\6\4\2\u02e3\u02e2\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5"+
		"\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e5\3\2"+
		"\2\2\u02e8\u02ec\7\7\2\2\u02e9\u02eb\5\\/\2\u02ea\u02e9\3\2\2\2\u02eb"+
		"\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2"+
		"\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f0\5\u0098M\2\u02f0\u02f9\3\2\2\2\u02f1"+
		"\u02f3\5\6\4\2\u02f2\u02f1\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2"+
		"\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7"+
		"\u02f9\5\16\b\2\u02f8\u02e0\3\2\2\2\u02f8\u02f4\3\2\2\2\u02f9\u0097\3"+
		"\2\2\2\u02fa\u02fb\7\63\2\2\u02fb\u02fc\5\24\13\2\u02fc\u02fd\5\u009a"+
		"N\2\u02fd\u0099\3\2\2\2\u02fe\u02ff\7\b\2\2\u02ff\u009b\3\2\2\2R\u009d"+
		"\u00a2\u00a9\u00b4\u00ba\u00c1\u00c8\u00cf\u00d8\u00de\u00e7\u00ed\u00f3"+
		"\u00f7\u00fd\u0106\u010a\u0112\u0118\u011b\u0121\u012b\u0135\u013e\u0144"+
		"\u014a\u0159\u0160\u0167\u0175\u017c\u0182\u018d\u0193\u019c\u01a3\u01aa"+
		"\u01b8\u01bf\u01c5\u01ce\u01d4\u01e0\u01e7\u01f1\u01f5\u01fe\u0208\u020c"+
		"\u0212\u0219\u021e\u0221\u0225\u0228\u0233\u023d\u0244\u024a\u0254\u025e"+
		"\u0265\u027a\u0280\u0284\u0292\u0299\u02aa\u02ae\u02b2\u02bd\u02c1\u02c7"+
		"\u02cd\u02d3\u02d9\u02e5\u02ec\u02f4\u02f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}