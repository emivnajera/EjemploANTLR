// Generated from /home/emivnajera/go/src/PersonalProjects/EjemploANTLR/analizador.g4 by ANTLR 4.8

import "github.com/emivnajera/Abstract"
import "github.com/emivnajera/Expresiones"
import "github.com/emivnajera/Instrucciones"
import "github.com/emivnajera/TS"
import "strings"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class analizadorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RPRINT=1, RVAR=2, PUNTOCOMA=3, PARA=4, PARC=5, ENTERO=6, FLOTANTE=7, RTRUE=8, 
		RFALSE=9, CHAR=10, STRING=11, MAS=12, MENOS=13, MUL=14, DIV=15, MOD=16, 
		MAYOR=17, MENOR=18, MAYORIGUAL=19, MENORIGUAL=20, IGUALIGUAL=21, DISTINTO=22, 
		OR=23, AND=24, NOT=25, ID=26, IGUAL=27, COMMENT=28, WS=29;
	public static final int
		RULE_start = 0, RULE_instruccion = 1, RULE_declaracion = 2, RULE_asignacion = 3, 
		RULE_expresion = 4, RULE_imprimir = 5, RULE_finins = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instruccion", "declaracion", "asignacion", "expresion", "imprimir", 
			"finins"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'var'", "';'", "'('", "')'", null, null, "'true'", 
			"'false'", null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='", "'||'", "'&&'", "'!'", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RPRINT", "RVAR", "PUNTOCOMA", "PARA", "PARC", "ENTERO", "FLOTANTE", 
			"RTRUE", "RFALSE", "CHAR", "STRING", "MAS", "MENOS", "MUL", "DIV", "MOD", 
			"MAYOR", "MENOR", "MAYORIGUAL", "MENORIGUAL", "IGUALIGUAL", "DISTINTO", 
			"OR", "AND", "NOT", "ID", "IGUAL", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "analizador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public analizadorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public InstruccionContext instruccion;
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			instrucciones := [] Abstract.Instruccion{};TSGlobal:=TS.TablaSimbolos{}
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RPRINT) | (1L << RVAR) | (1L << ID))) != 0)) {
				{
				{
				setState(15);
				((StartContext)_localctx).instruccion = instruccion();
				instrucciones = append(instrucciones,((StartContext)_localctx).instruccion.nodo)
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			for _, n := range instrucciones {
			        n.Interpretar(&TSGlobal)
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

	public static class InstruccionContext extends ParserRuleContext {
		public Abstract.Instruccion nodo;
		public ImprimirContext imprimir;
		public DeclaracionContext declaracion;
		public AsignacionContext asignacion;
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				((InstruccionContext)_localctx).imprimir = imprimir();
				_localctx.nodo = ((InstruccionContext)_localctx).imprimir.nodo
				}
				break;
			case RVAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				((InstruccionContext)_localctx).declaracion = declaracion();
				_localctx.nodo = ((InstruccionContext)_localctx).declaracion.nodo
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				((InstruccionContext)_localctx).asignacion = asignacion();
				_localctx.nodo = ((InstruccionContext)_localctx).asignacion.nodo
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

	public static class DeclaracionContext extends ParserRuleContext {
		public Abstract.Instruccion nodo;
		public Token RVAR;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode RVAR() { return getToken(analizadorParser.RVAR, 0); }
		public TerminalNode ID() { return getToken(analizadorParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(analizadorParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public FininsContext finins() {
			return getRuleContext(FininsContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((DeclaracionContext)_localctx).RVAR = match(RVAR);
			setState(37);
			((DeclaracionContext)_localctx).ID = match(ID);
			setState(38);
			match(IGUAL);
			setState(39);
			((DeclaracionContext)_localctx).expresion = expresion(0);
			setState(40);
			finins();
			_localctx.nodo = Instrucciones.NewDeclaracion((((DeclaracionContext)_localctx).ID!=null?((DeclaracionContext)_localctx).ID.getText():null), ((DeclaracionContext)_localctx).expresion.nodo, (((DeclaracionContext)_localctx).RVAR!=null?((DeclaracionContext)_localctx).RVAR.getLine():0), (((DeclaracionContext)_localctx).RVAR!=null?((DeclaracionContext)_localctx).RVAR.getCharPositionInLine():0))
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

	public static class AsignacionContext extends ParserRuleContext {
		public Abstract.Instruccion nodo;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(analizadorParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(analizadorParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public FininsContext finins() {
			return getRuleContext(FininsContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(44);
			match(IGUAL);
			setState(45);
			((AsignacionContext)_localctx).expresion = expresion(0);
			setState(46);
			finins();
			_localctx.nodo = Instrucciones.NewAsignacion((((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null), ((AsignacionContext)_localctx).expresion.nodo, (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getLine():0), (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getCharPositionInLine():0))
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
		public Abstract.Instruccion nodo;
		public ExpresionContext opi;
		public Token ENTERO;
		public Token FLOTANTE;
		public Token RTRUE;
		public Token RFALSE;
		public Token CHAR;
		public Token STRING;
		public Token MENOS;
		public ExpresionContext expresion;
		public Token NOT;
		public Token ID;
		public Token MUL;
		public ExpresionContext opd;
		public Token DIV;
		public Token MOD;
		public Token MAS;
		public Token DISTINTO;
		public Token MAYOR;
		public Token IGUALIGUAL;
		public Token MENOR;
		public Token MAYORIGUAL;
		public Token MENORIGUAL;
		public Token OR;
		public Token AND;
		public TerminalNode ENTERO() { return getToken(analizadorParser.ENTERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(analizadorParser.FLOTANTE, 0); }
		public TerminalNode RTRUE() { return getToken(analizadorParser.RTRUE, 0); }
		public TerminalNode RFALSE() { return getToken(analizadorParser.RFALSE, 0); }
		public TerminalNode CHAR() { return getToken(analizadorParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(analizadorParser.STRING, 0); }
		public TerminalNode MENOS() { return getToken(analizadorParser.MENOS, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(analizadorParser.NOT, 0); }
		public TerminalNode ID() { return getToken(analizadorParser.ID, 0); }
		public TerminalNode MUL() { return getToken(analizadorParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(analizadorParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(analizadorParser.MOD, 0); }
		public TerminalNode MAS() { return getToken(analizadorParser.MAS, 0); }
		public TerminalNode DISTINTO() { return getToken(analizadorParser.DISTINTO, 0); }
		public TerminalNode MAYOR() { return getToken(analizadorParser.MAYOR, 0); }
		public TerminalNode IGUALIGUAL() { return getToken(analizadorParser.IGUALIGUAL, 0); }
		public TerminalNode MENOR() { return getToken(analizadorParser.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(analizadorParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(analizadorParser.MENORIGUAL, 0); }
		public TerminalNode OR() { return getToken(analizadorParser.OR, 0); }
		public TerminalNode AND() { return getToken(analizadorParser.AND, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				{
				setState(50);
				((ExpresionContext)_localctx).ENTERO = match(ENTERO);
				_localctx.nodo = Expresiones.NewPrimitivo((((ExpresionContext)_localctx).ENTERO!=null?((ExpresionContext)_localctx).ENTERO.getText():null), TS.ENTERO, (((ExpresionContext)_localctx).ENTERO!=null?((ExpresionContext)_localctx).ENTERO.getLine():0), (((ExpresionContext)_localctx).ENTERO!=null?((ExpresionContext)_localctx).ENTERO.getCharPositionInLine():0))
				}
				break;
			case FLOTANTE:
				{
				setState(52);
				((ExpresionContext)_localctx).FLOTANTE = match(FLOTANTE);
				_localctx.nodo = Expresiones.NewPrimitivo((((ExpresionContext)_localctx).FLOTANTE!=null?((ExpresionContext)_localctx).FLOTANTE.getText():null),TS.FLOAT, (((ExpresionContext)_localctx).FLOTANTE!=null?((ExpresionContext)_localctx).FLOTANTE.getLine():0), (((ExpresionContext)_localctx).FLOTANTE!=null?((ExpresionContext)_localctx).FLOTANTE.getCharPositionInLine():0))
				}
				break;
			case RTRUE:
				{
				setState(54);
				((ExpresionContext)_localctx).RTRUE = match(RTRUE);
				_localctx.nodo = Expresiones.NewPrimitivo((((ExpresionContext)_localctx).RTRUE!=null?((ExpresionContext)_localctx).RTRUE.getText():null), TS.BOOLEAN,(((ExpresionContext)_localctx).RTRUE!=null?((ExpresionContext)_localctx).RTRUE.getLine():0), (((ExpresionContext)_localctx).RTRUE!=null?((ExpresionContext)_localctx).RTRUE.getCharPositionInLine():0))
				}
				break;
			case RFALSE:
				{
				setState(56);
				((ExpresionContext)_localctx).RFALSE = match(RFALSE);
				_localctx.nodo = Expresiones.NewPrimitivo((((ExpresionContext)_localctx).RFALSE!=null?((ExpresionContext)_localctx).RFALSE.getText():null), TS.BOOLEAN, (((ExpresionContext)_localctx).RFALSE!=null?((ExpresionContext)_localctx).RFALSE.getLine():0), (((ExpresionContext)_localctx).RFALSE!=null?((ExpresionContext)_localctx).RFALSE.getCharPositionInLine():0))
				}
				break;
			case CHAR:
				{
				setState(58);
				((ExpresionContext)_localctx).CHAR = match(CHAR);
				_localctx.nodo = Expresiones.NewPrimitivo(strings.Replace((((ExpresionContext)_localctx).CHAR!=null?((ExpresionContext)_localctx).CHAR.getText():null),"'","",2), TS.CARACTER, (((ExpresionContext)_localctx).CHAR!=null?((ExpresionContext)_localctx).CHAR.getLine():0), (((ExpresionContext)_localctx).CHAR!=null?((ExpresionContext)_localctx).CHAR.getCharPositionInLine():0))
				}
				break;
			case STRING:
				{
				setState(60);
				((ExpresionContext)_localctx).STRING = match(STRING);
				_localctx.nodo = Expresiones.NewPrimitivo(strings.Replace((((ExpresionContext)_localctx).STRING!=null?((ExpresionContext)_localctx).STRING.getText():null),"\"","",-1),TS.CADENA, (((ExpresionContext)_localctx).STRING!=null?((ExpresionContext)_localctx).STRING.getLine():0), (((ExpresionContext)_localctx).STRING!=null?((ExpresionContext)_localctx).STRING.getCharPositionInLine():0))
				}
				break;
			case MENOS:
				{
				setState(62);
				((ExpresionContext)_localctx).MENOS = match(MENOS);
				setState(63);
				((ExpresionContext)_localctx).expresion = expresion(16);
				_localctx.nodo = Expresiones.NewAritmetica(TS.MENOS, ((ExpresionContext)_localctx).expresion.nodo, nil, (((ExpresionContext)_localctx).MENOS!=null?((ExpresionContext)_localctx).MENOS.getLine():0), (((ExpresionContext)_localctx).MENOS!=null?((ExpresionContext)_localctx).MENOS.getCharPositionInLine():0))
				}
				break;
			case NOT:
				{
				setState(66);
				((ExpresionContext)_localctx).NOT = match(NOT);
				setState(67);
				((ExpresionContext)_localctx).expresion = expresion(4);
				_localctx.nodo = Expresiones.NewLogica(TS.NOT, ((ExpresionContext)_localctx).expresion.nodo, ((ExpresionContext)_localctx).expresion.nodo, (((ExpresionContext)_localctx).NOT!=null?((ExpresionContext)_localctx).NOT.getLine():0), (((ExpresionContext)_localctx).NOT!=null?((ExpresionContext)_localctx).NOT.getCharPositionInLine():0))
				}
				break;
			case ID:
				{
				setState(70);
				((ExpresionContext)_localctx).ID = match(ID);
				_localctx.nodo = Expresiones.NewIdentificador((((ExpresionContext)_localctx).ID!=null?((ExpresionContext)_localctx).ID.getText():null), (((ExpresionContext)_localctx).ID!=null?((ExpresionContext)_localctx).ID.getLine():0), (((ExpresionContext)_localctx).ID!=null?((ExpresionContext)_localctx).ID.getCharPositionInLine():0))
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(74);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(75);
						((ExpresionContext)_localctx).MUL = match(MUL);
						setState(76);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(16);
						_localctx.nodo = Expresiones.NewAritmetica(TS.POR, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).MUL!=null?((ExpresionContext)_localctx).MUL.getLine():0), (((ExpresionContext)_localctx).MUL!=null?((ExpresionContext)_localctx).MUL.getCharPositionInLine():0))
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(79);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(80);
						((ExpresionContext)_localctx).DIV = match(DIV);
						setState(81);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(15);
						_localctx.nodo = Expresiones.NewAritmetica(TS.DIV, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).DIV!=null?((ExpresionContext)_localctx).DIV.getLine():0), (((ExpresionContext)_localctx).DIV!=null?((ExpresionContext)_localctx).DIV.getCharPositionInLine():0))
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(84);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(85);
						((ExpresionContext)_localctx).MOD = match(MOD);
						setState(86);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(14);
						_localctx.nodo = Expresiones.NewAritmetica(TS.MOD, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).MOD!=null?((ExpresionContext)_localctx).MOD.getLine():0), (((ExpresionContext)_localctx).MOD!=null?((ExpresionContext)_localctx).MOD.getCharPositionInLine():0))
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(89);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(90);
						((ExpresionContext)_localctx).MAS = match(MAS);
						setState(91);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(13);
						_localctx.nodo = Expresiones.NewAritmetica(TS.MAS, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).MAS!=null?((ExpresionContext)_localctx).MAS.getLine():0), (((ExpresionContext)_localctx).MAS!=null?((ExpresionContext)_localctx).MAS.getCharPositionInLine():0))
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(94);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(95);
						((ExpresionContext)_localctx).MENOS = match(MENOS);
						setState(96);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(12);
						_localctx.nodo = Expresiones.NewAritmetica(TS.MENOS, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).MENOS!=null?((ExpresionContext)_localctx).MENOS.getLine():0), (((ExpresionContext)_localctx).MENOS!=null?((ExpresionContext)_localctx).MENOS.getCharPositionInLine():0))
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(99);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(100);
						((ExpresionContext)_localctx).DISTINTO = match(DISTINTO);
						setState(101);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(11);
						_localctx.nodo = Expresiones.NewRelacional(TS.DIFERENTE, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).DISTINTO!=null?((ExpresionContext)_localctx).DISTINTO.getLine():0), (((ExpresionContext)_localctx).DISTINTO!=null?((ExpresionContext)_localctx).DISTINTO.getCharPositionInLine():0))
						}
						break;
					case 7:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(104);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(105);
						((ExpresionContext)_localctx).MAYOR = match(MAYOR);
						setState(106);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(10);
						_localctx.nodo = Expresiones.NewRelacional(TS.MAYORQUE, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).MAYOR!=null?((ExpresionContext)_localctx).MAYOR.getLine():0), (((ExpresionContext)_localctx).MAYOR!=null?((ExpresionContext)_localctx).MAYOR.getCharPositionInLine():0))
						}
						break;
					case 8:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(109);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(110);
						((ExpresionContext)_localctx).IGUALIGUAL = match(IGUALIGUAL);
						setState(111);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(9);
						_localctx.nodo = Expresiones.NewRelacional(TS.IGUALIGUAL, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).IGUALIGUAL!=null?((ExpresionContext)_localctx).IGUALIGUAL.getLine():0), (((ExpresionContext)_localctx).IGUALIGUAL!=null?((ExpresionContext)_localctx).IGUALIGUAL.getCharPositionInLine():0))
						}
						break;
					case 9:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(114);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(115);
						((ExpresionContext)_localctx).MENOR = match(MENOR);
						setState(116);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(8);
						_localctx.nodo = Expresiones.NewRelacional(TS.MENORQUE, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).MENOR!=null?((ExpresionContext)_localctx).MENOR.getLine():0), (((ExpresionContext)_localctx).MENOR!=null?((ExpresionContext)_localctx).MENOR.getCharPositionInLine():0))
						}
						break;
					case 10:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(119);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(120);
						((ExpresionContext)_localctx).MAYORIGUAL = match(MAYORIGUAL);
						setState(121);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(7);
						_localctx.nodo = Expresiones.NewRelacional(TS.MAYORIGUAL, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).MAYORIGUAL!=null?((ExpresionContext)_localctx).MAYORIGUAL.getLine():0), (((ExpresionContext)_localctx).MAYORIGUAL!=null?((ExpresionContext)_localctx).MAYORIGUAL.getCharPositionInLine():0))
						}
						break;
					case 11:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(124);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(125);
						((ExpresionContext)_localctx).MENORIGUAL = match(MENORIGUAL);
						setState(126);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(6);
						_localctx.nodo = Expresiones.NewRelacional(TS.MENORIGUAL, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).MENORIGUAL!=null?((ExpresionContext)_localctx).MENORIGUAL.getLine():0), (((ExpresionContext)_localctx).MENORIGUAL!=null?((ExpresionContext)_localctx).MENORIGUAL.getCharPositionInLine():0))
						}
						break;
					case 12:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(129);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(130);
						((ExpresionContext)_localctx).OR = match(OR);
						setState(131);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(4);
						_localctx.nodo = Expresiones.NewLogica(TS.OR, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).OR!=null?((ExpresionContext)_localctx).OR.getLine():0), (((ExpresionContext)_localctx).OR!=null?((ExpresionContext)_localctx).OR.getCharPositionInLine():0))
						}
						break;
					case 13:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.opi = _prevctx;
						_localctx.opi = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(134);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(135);
						((ExpresionContext)_localctx).AND = match(AND);
						setState(136);
						((ExpresionContext)_localctx).opd = ((ExpresionContext)_localctx).expresion = expresion(3);
						_localctx.nodo = Expresiones.NewLogica(TS.AND, ((ExpresionContext)_localctx).opi.nodo, ((ExpresionContext)_localctx).opd.nodo, (((ExpresionContext)_localctx).AND!=null?((ExpresionContext)_localctx).AND.getLine():0), (((ExpresionContext)_localctx).AND!=null?((ExpresionContext)_localctx).AND.getCharPositionInLine():0))
						}
						break;
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ImprimirContext extends ParserRuleContext {
		public Abstract.Instruccion nodo;
		public Token RPRINT;
		public ExpresionContext expresion;
		public TerminalNode RPRINT() { return getToken(analizadorParser.RPRINT, 0); }
		public TerminalNode PARA() { return getToken(analizadorParser.PARA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARC() { return getToken(analizadorParser.PARC, 0); }
		public FininsContext finins() {
			return getRuleContext(FininsContext.class,0);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((ImprimirContext)_localctx).RPRINT = match(RPRINT);
			setState(145);
			match(PARA);
			setState(146);
			((ImprimirContext)_localctx).expresion = expresion(0);
			setState(147);
			match(PARC);
			setState(148);
			finins();
			_localctx.nodo = Instrucciones.NewImprimir(((ImprimirContext)_localctx).expresion.nodo,(((ImprimirContext)_localctx).RPRINT!=null?((ImprimirContext)_localctx).RPRINT.getLine():0),(((ImprimirContext)_localctx).RPRINT!=null?((ImprimirContext)_localctx).RPRINT.getCharPositionInLine():0))
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

	public static class FininsContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(analizadorParser.PUNTOCOMA, 0); }
		public FininsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finins; }
	}

	public final FininsContext finins() throws RecognitionException {
		FininsContext _localctx = new FininsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_finins);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(PUNTOCOMA);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u009c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"%\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6K\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u008e\n\6\f\6\16\6\u0091\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\2\3\n\t\2\4\6\b\n\f\16\2\2\2\u00ac\2\20\3\2\2\2\4$\3\2\2\2\6&\3\2"+
		"\2\2\b-\3\2\2\2\nJ\3\2\2\2\f\u0092\3\2\2\2\16\u0099\3\2\2\2\20\26\b\2"+
		"\1\2\21\22\5\4\3\2\22\23\b\2\1\2\23\25\3\2\2\2\24\21\3\2\2\2\25\30\3\2"+
		"\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\b\2"+
		"\1\2\32\3\3\2\2\2\33\34\5\f\7\2\34\35\b\3\1\2\35%\3\2\2\2\36\37\5\6\4"+
		"\2\37 \b\3\1\2 %\3\2\2\2!\"\5\b\5\2\"#\b\3\1\2#%\3\2\2\2$\33\3\2\2\2$"+
		"\36\3\2\2\2$!\3\2\2\2%\5\3\2\2\2&\'\7\4\2\2\'(\7\34\2\2()\7\35\2\2)*\5"+
		"\n\6\2*+\5\16\b\2+,\b\4\1\2,\7\3\2\2\2-.\7\34\2\2./\7\35\2\2/\60\5\n\6"+
		"\2\60\61\5\16\b\2\61\62\b\5\1\2\62\t\3\2\2\2\63\64\b\6\1\2\64\65\7\b\2"+
		"\2\65K\b\6\1\2\66\67\7\t\2\2\67K\b\6\1\289\7\n\2\29K\b\6\1\2:;\7\13\2"+
		"\2;K\b\6\1\2<=\7\f\2\2=K\b\6\1\2>?\7\r\2\2?K\b\6\1\2@A\7\17\2\2AB\5\n"+
		"\6\22BC\b\6\1\2CK\3\2\2\2DE\7\33\2\2EF\5\n\6\6FG\b\6\1\2GK\3\2\2\2HI\7"+
		"\34\2\2IK\b\6\1\2J\63\3\2\2\2J\66\3\2\2\2J8\3\2\2\2J:\3\2\2\2J<\3\2\2"+
		"\2J>\3\2\2\2J@\3\2\2\2JD\3\2\2\2JH\3\2\2\2K\u008f\3\2\2\2LM\f\21\2\2M"+
		"N\7\20\2\2NO\5\n\6\22OP\b\6\1\2P\u008e\3\2\2\2QR\f\20\2\2RS\7\21\2\2S"+
		"T\5\n\6\21TU\b\6\1\2U\u008e\3\2\2\2VW\f\17\2\2WX\7\22\2\2XY\5\n\6\20Y"+
		"Z\b\6\1\2Z\u008e\3\2\2\2[\\\f\16\2\2\\]\7\16\2\2]^\5\n\6\17^_\b\6\1\2"+
		"_\u008e\3\2\2\2`a\f\r\2\2ab\7\17\2\2bc\5\n\6\16cd\b\6\1\2d\u008e\3\2\2"+
		"\2ef\f\f\2\2fg\7\30\2\2gh\5\n\6\rhi\b\6\1\2i\u008e\3\2\2\2jk\f\13\2\2"+
		"kl\7\23\2\2lm\5\n\6\fmn\b\6\1\2n\u008e\3\2\2\2op\f\n\2\2pq\7\27\2\2qr"+
		"\5\n\6\13rs\b\6\1\2s\u008e\3\2\2\2tu\f\t\2\2uv\7\24\2\2vw\5\n\6\nwx\b"+
		"\6\1\2x\u008e\3\2\2\2yz\f\b\2\2z{\7\25\2\2{|\5\n\6\t|}\b\6\1\2}\u008e"+
		"\3\2\2\2~\177\f\7\2\2\177\u0080\7\26\2\2\u0080\u0081\5\n\6\b\u0081\u0082"+
		"\b\6\1\2\u0082\u008e\3\2\2\2\u0083\u0084\f\5\2\2\u0084\u0085\7\31\2\2"+
		"\u0085\u0086\5\n\6\6\u0086\u0087\b\6\1\2\u0087\u008e\3\2\2\2\u0088\u0089"+
		"\f\4\2\2\u0089\u008a\7\32\2\2\u008a\u008b\5\n\6\5\u008b\u008c\b\6\1\2"+
		"\u008c\u008e\3\2\2\2\u008dL\3\2\2\2\u008dQ\3\2\2\2\u008dV\3\2\2\2\u008d"+
		"[\3\2\2\2\u008d`\3\2\2\2\u008de\3\2\2\2\u008dj\3\2\2\2\u008do\3\2\2\2"+
		"\u008dt\3\2\2\2\u008dy\3\2\2\2\u008d~\3\2\2\2\u008d\u0083\3\2\2\2\u008d"+
		"\u0088\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\13\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\3\2\2\u0093\u0094"+
		"\7\6\2\2\u0094\u0095\5\n\6\2\u0095\u0096\7\7\2\2\u0096\u0097\5\16\b\2"+
		"\u0097\u0098\b\7\1\2\u0098\r\3\2\2\2\u0099\u009a\7\5\2\2\u009a\17\3\2"+
		"\2\2\7\26$J\u008d\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}