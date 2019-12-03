// Generated from be\u005Cunamur\info\b314\compiler\B314.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class B314Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, INTEGER=2, SQUARE=3, CROU=4, CRFE=5, COMA=6, AS=7, DECLARE=8, 
		AND=9, RETAIN=10, LPAR=11, RPAR=12, VOID=13, LATITUDE=14, LONGITUDE=15, 
		GRID=16, SIZE=17, MAP=18, RADIO=19, AMMO=20, FRUITS=21, SODA=22, COUNT=23, 
		LIFE=24, PLUS=25, MOINS=26, MUL=27, DIV=28, MODULO=29, TRUE=30, FALSE=31, 
		ENNEMI=32, IS=33, NORTH=34, SOUTH=35, EAST=36, WEST=37, GRAAL=38, OR=39, 
		NOT=40, INF=41, SUP=42, EGALE=43, DIRT=44, ROCK=45, VINES=46, ZOMBIE=47, 
		PLAYER=48, NEARBY=49, SKIPINSTR=50, NEXT=51, IF=52, THEN=53, ELSE=54, 
		WHILE=55, DONE=56, SET=57, DO=58, TO=59, COMPUTE=60, MOVE=61, SHOOT=62, 
		USE=63, NOTHING=64, FUNCTION=65, LOCAL=66, DUOPOINT=67, YOUR=68, TURN=69, 
		BY=70, DEFAULT=71, POINTVIRGULE=72, WHEN=73, ID=74, NUMBER=75, COMMENT=76, 
		NEWLINE=77, WS=78;
	public static final int
		RULE_root = 0, RULE_type = 1, RULE_scalar = 2, RULE_array = 3, RULE_vardecl = 4, 
		RULE_exprent = 5, RULE_exprbool = 6, RULE_exprcase = 7, RULE_exprd = 8, 
		RULE_exprg = 9, RULE_instruction = 10, RULE_action = 11, RULE_fctdecl = 12, 
		RULE_programme = 13, RULE_clausewhen = 14, RULE_clausedefault = 15;
	public static final String[] ruleNames = {
		"root", "type", "scalar", "array", "vardecl", "exprent", "exprbool", "exprcase", 
		"exprd", "exprg", "instruction", "action", "fctdecl", "programme", "clausewhen", 
		"clausedefault"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'integer'", "'square'", "'['", "']'", "','", "'as'", 
		"'declare'", "'and'", "'retain'", "'('", "')'", "'void'", "'latitude'", 
		"'longitude'", "'grid'", "'size'", "'map'", "'radio'", "'ammo'", "'fruits'", 
		"'soda'", "'count'", "'life'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", 
		"'false'", "'ennemi'", "'is'", "'north'", "'south'", "'east'", "'west'", 
		"'graal'", "'or'", "'not'", "'<'", "'>'", "'='", "'dirt'", "'rock'", "'vines'", 
		"'zombie'", "'player'", "'nearby'", "'skip'", "'next'", "'if'", "'then'", 
		"'else'", "'while'", "'done'", "'set'", "'do'", "'to'", "'compute'", "'move'", 
		"'shoot'", "'use'", "'nothing'", "'function'", "'local'", "':'", "'your'", 
		"'turn'", "'by'", "'default'", "';'", "'when'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "INTEGER", "SQUARE", "CROU", "CRFE", "COMA", "AS", "DECLARE", 
		"AND", "RETAIN", "LPAR", "RPAR", "VOID", "LATITUDE", "LONGITUDE", "GRID", 
		"SIZE", "MAP", "RADIO", "AMMO", "FRUITS", "SODA", "COUNT", "LIFE", "PLUS", 
		"MOINS", "MUL", "DIV", "MODULO", "TRUE", "FALSE", "ENNEMI", "IS", "NORTH", 
		"SOUTH", "EAST", "WEST", "GRAAL", "OR", "NOT", "INF", "SUP", "EGALE", 
		"DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", "NEARBY", "SKIPINSTR", "NEXT", 
		"IF", "THEN", "ELSE", "WHILE", "DONE", "SET", "DO", "TO", "COMPUTE", "MOVE", 
		"SHOOT", "USE", "NOTHING", "FUNCTION", "LOCAL", "DUOPOINT", "YOUR", "TURN", 
		"BY", "DEFAULT", "POINTVIRGULE", "WHEN", "ID", "NUMBER", "COMMENT", "NEWLINE", 
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
	public String getGrammarFileName() { return "B314.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public B314Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public ProgrammeContext programme() {
			return getRuleContext(ProgrammeContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			programme();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypescalarContext extends TypeContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TypescalarContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterTypescalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitTypescalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitTypescalar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypearrayContext extends TypeContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TypearrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterTypearray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitTypearray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitTypearray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new TypescalarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				scalar();
				}
				break;
			case 2:
				_localctx = new TypearrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				array();
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

	public static class ScalarContext extends ParserRuleContext {
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
	 
		public ScalarContext() { }
		public void copyFrom(ScalarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScalarboolContext extends ScalarContext {
		public TerminalNode BOOLEAN() { return getToken(B314Parser.BOOLEAN, 0); }
		public ScalarboolContext(ScalarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterScalarbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitScalarbool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitScalarbool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarintegerContext extends ScalarContext {
		public TerminalNode INTEGER() { return getToken(B314Parser.INTEGER, 0); }
		public ScalarintegerContext(ScalarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterScalarinteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitScalarinteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitScalarinteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarsquareContext extends ScalarContext {
		public TerminalNode SQUARE() { return getToken(B314Parser.SQUARE, 0); }
		public ScalarsquareContext(ScalarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterScalarsquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitScalarsquare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitScalarsquare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scalar);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new ScalarboolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(BOOLEAN);
				}
				break;
			case INTEGER:
				_localctx = new ScalarintegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(INTEGER);
				}
				break;
			case SQUARE:
				_localctx = new ScalarsquareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(SQUARE);
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

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArraydeclContext extends ArrayContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode CROU() { return getToken(B314Parser.CROU, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(B314Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(B314Parser.NUMBER, i);
		}
		public TerminalNode CRFE() { return getToken(B314Parser.CRFE, 0); }
		public TerminalNode COMA() { return getToken(B314Parser.COMA, 0); }
		public ArraydeclContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterArraydecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitArraydecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitArraydecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			_localctx = new ArraydeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			scalar();
			setState(44);
			match(CROU);
			setState(45);
			match(NUMBER);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(46);
				match(COMA);
				setState(47);
				match(NUMBER);
				}
			}

			setState(50);
			match(CRFE);
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

	public static class VardeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode AS() { return getToken(B314Parser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(AS);
			setState(54);
			type();
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

	public static class ExprentContext extends ParserRuleContext {
		public ExprentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprent; }
	 
		public ExprentContext() { }
		public void copyFrom(ExprentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Appeldefonction1Context extends ExprentContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public List<ExprdContext> exprd() {
			return getRuleContexts(ExprdContext.class);
		}
		public ExprdContext exprd(int i) {
			return getRuleContext(ExprdContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(B314Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(B314Parser.COMA, i);
		}
		public Appeldefonction1Context(ExprentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAppeldefonction1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAppeldefonction1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAppeldefonction1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusmoinsexprContext extends ExprentContext {
		public Token op;
		public List<ExprentContext> exprent() {
			return getRuleContexts(ExprentContext.class);
		}
		public ExprentContext exprent(int i) {
			return getRuleContext(ExprentContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(B314Parser.PLUS, 0); }
		public TerminalNode MOINS() { return getToken(B314Parser.MOINS, 0); }
		public PlusmoinsexprContext(ExprentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterPlusmoinsexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitPlusmoinsexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitPlusmoinsexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongexprContext extends ExprentContext {
		public TerminalNode LONGITUDE() { return getToken(B314Parser.LONGITUDE, 0); }
		public LongexprContext(ExprentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterLongexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitLongexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitLongexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LifexprContext extends ExprentContext {
		public TerminalNode LIFE() { return getToken(B314Parser.LIFE, 0); }
		public LifexprContext(ExprentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterLifexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitLifexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitLifexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableentierContext extends ExprentContext {
		public ExprgContext exprg() {
			return getRuleContext(ExprgContext.class,0);
		}
		public VariableentierContext(ExprentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVariableentier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVariableentier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVariableentier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpentierparContext extends ExprentContext {
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public ExprentContext exprent() {
			return getRuleContext(ExprentContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public ExpentierparContext(ExprentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExpentierpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExpentierpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExpentierpar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberexprContext extends ExprentContext {
		public TerminalNode NUMBER() { return getToken(B314Parser.NUMBER, 0); }
		public TerminalNode MOINS() { return getToken(B314Parser.MOINS, 0); }
		public NumberexprContext(ExprentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterNumberexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitNumberexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitNumberexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprmuldivmodContext extends ExprentContext {
		public Token op;
		public List<ExprentContext> exprent() {
			return getRuleContexts(ExprentContext.class);
		}
		public ExprentContext exprent(int i) {
			return getRuleContext(ExprentContext.class,i);
		}
		public TerminalNode MUL() { return getToken(B314Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(B314Parser.DIV, 0); }
		public TerminalNode MODULO() { return getToken(B314Parser.MODULO, 0); }
		public ExprmuldivmodContext(ExprentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprmuldivmod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprmuldivmod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprmuldivmod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LatexprContext extends ExprentContext {
		public TerminalNode LATITUDE() { return getToken(B314Parser.LATITUDE, 0); }
		public LatexprContext(ExprentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterLatexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitLatexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitLatexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrandsizexprContext extends ExprentContext {
		public TerminalNode GRID() { return getToken(B314Parser.GRID, 0); }
		public TerminalNode SIZE() { return getToken(B314Parser.SIZE, 0); }
		public GrandsizexprContext(ExprentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterGrandsizexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitGrandsizexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitGrandsizexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ItemexprContext extends ExprentContext {
		public TerminalNode COUNT() { return getToken(B314Parser.COUNT, 0); }
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public TerminalNode AMMO() { return getToken(B314Parser.AMMO, 0); }
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public ItemexprContext(ExprentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterItemexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitItemexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitItemexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprentContext exprent() throws RecognitionException {
		return exprent(0);
	}

	private ExprentContext exprent(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprentContext _localctx = new ExprentContext(_ctx, _parentState);
		ExprentContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exprent, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NumberexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MOINS) {
					{
					setState(57);
					match(MOINS);
					}
				}

				setState(60);
				match(NUMBER);
				}
				break;
			case 2:
				{
				_localctx = new ExpentierparContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(LPAR);
				setState(62);
				exprent(0);
				setState(63);
				match(RPAR);
				}
				break;
			case 3:
				{
				_localctx = new LatexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(LATITUDE);
				}
				break;
			case 4:
				{
				_localctx = new LongexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(LONGITUDE);
				}
				break;
			case 5:
				{
				_localctx = new GrandsizexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(GRID);
				setState(68);
				match(SIZE);
				}
				break;
			case 6:
				{
				_localctx = new ItemexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(70);
				match(COUNT);
				}
				break;
			case 7:
				{
				_localctx = new LifexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(LIFE);
				}
				break;
			case 8:
				{
				_localctx = new Appeldefonction1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(ID);
				setState(73);
				match(LPAR);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << MOINS) | (1L << TRUE) | (1L << FALSE) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NOT) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << NEARBY))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(74);
					exprd();
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(75);
						match(COMA);
						setState(76);
						exprd();
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(84);
				match(RPAR);
				}
				break;
			case 9:
				{
				_localctx = new VariableentierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				exprg();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExprmuldivmodContext(new ExprentContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprent);
						setState(88);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(89);
						((ExprmuldivmodContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MODULO))) != 0)) ) {
							((ExprmuldivmodContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						exprent(5);
						}
						break;
					case 2:
						{
						_localctx = new PlusmoinsexprContext(new ExprentContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprent);
						setState(91);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(92);
						((PlusmoinsexprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MOINS) ) {
							((PlusmoinsexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						exprent(4);
						}
						break;
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ExprboolContext extends ParserRuleContext {
		public ExprboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprbool; }
	 
		public ExprboolContext() { }
		public void copyFrom(ExprboolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotexprContext extends ExprboolContext {
		public TerminalNode NOT() { return getToken(B314Parser.NOT, 0); }
		public ExprboolContext exprbool() {
			return getRuleContext(ExprboolContext.class,0);
		}
		public NotexprContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterNotexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitNotexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitNotexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Appeldefonction2Context extends ExprboolContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public List<ExprdContext> exprd() {
			return getRuleContexts(ExprdContext.class);
		}
		public ExprdContext exprd(int i) {
			return getRuleContext(ExprdContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(B314Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(B314Parser.COMA, i);
		}
		public Appeldefonction2Context(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAppeldefonction2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAppeldefonction2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAppeldefonction2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VaregalvarContext extends ExprboolContext {
		public List<ExprgContext> exprg() {
			return getRuleContexts(ExprgContext.class);
		}
		public ExprgContext exprg(int i) {
			return getRuleContext(ExprgContext.class,i);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public VaregalvarContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVaregalvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVaregalvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVaregalvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfsupegalexprContext extends ExprboolContext {
		public Token comparator;
		public List<ExprentContext> exprent() {
			return getRuleContexts(ExprentContext.class);
		}
		public ExprentContext exprent(int i) {
			return getRuleContext(ExprentContext.class,i);
		}
		public TerminalNode INF() { return getToken(B314Parser.INF, 0); }
		public TerminalNode SUP() { return getToken(B314Parser.SUP, 0); }
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public InfsupegalexprContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterInfsupegalexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitInfsupegalexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitInfsupegalexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FctegalvarContext extends ExprboolContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public ExprgContext exprg() {
			return getRuleContext(ExprgContext.class,0);
		}
		public List<ExprdContext> exprd() {
			return getRuleContexts(ExprdContext.class);
		}
		public ExprdContext exprd(int i) {
			return getRuleContext(ExprdContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(B314Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(B314Parser.COMA, i);
		}
		public FctegalvarContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterFctegalvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitFctegalvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitFctegalvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GraalpositionexprContext extends ExprboolContext {
		public TerminalNode GRAAL() { return getToken(B314Parser.GRAAL, 0); }
		public TerminalNode IS() { return getToken(B314Parser.IS, 0); }
		public TerminalNode NORTH() { return getToken(B314Parser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(B314Parser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(B314Parser.EAST, 0); }
		public TerminalNode WEST() { return getToken(B314Parser.WEST, 0); }
		public GraalpositionexprContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterGraalpositionexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitGraalpositionexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitGraalpositionexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalsexprContext extends ExprboolContext {
		public TerminalNode FALSE() { return getToken(B314Parser.FALSE, 0); }
		public FalsexprContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterFalsexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitFalsexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitFalsexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VaregalfctContext extends ExprboolContext {
		public ExprgContext exprg() {
			return getRuleContext(ExprgContext.class,0);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public List<ExprdContext> exprd() {
			return getRuleContexts(ExprdContext.class);
		}
		public ExprdContext exprd(int i) {
			return getRuleContext(ExprdContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(B314Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(B314Parser.COMA, i);
		}
		public VaregalfctContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVaregalfct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVaregalfct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVaregalfct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariablebooleanContext extends ExprboolContext {
		public ExprgContext exprg() {
			return getRuleContext(ExprgContext.class,0);
		}
		public VariablebooleanContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVariableboolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVariableboolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVariableboolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Egalite_booleanContext extends ExprboolContext {
		public List<ExprboolContext> exprbool() {
			return getRuleContexts(ExprboolContext.class);
		}
		public ExprboolContext exprbool(int i) {
			return getRuleContext(ExprboolContext.class,i);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public Egalite_booleanContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterEgalite_boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitEgalite_boolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitEgalite_boolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruexprContext extends ExprboolContext {
		public TerminalNode TRUE() { return getToken(B314Parser.TRUE, 0); }
		public TruexprContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterTruexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitTruexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitTruexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FctegalfctContext extends ExprboolContext {
		public List<TerminalNode> ID() { return getTokens(B314Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(B314Parser.ID, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(B314Parser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(B314Parser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(B314Parser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(B314Parser.RPAR, i);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public List<ExprdContext> exprd() {
			return getRuleContexts(ExprdContext.class);
		}
		public ExprdContext exprd(int i) {
			return getRuleContext(ExprdContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(B314Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(B314Parser.COMA, i);
		}
		public FctegalfctContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterFctegalfct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitFctegalfct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitFctegalfct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Egalite_squareContext extends ExprboolContext {
		public List<ExprcaseContext> exprcase() {
			return getRuleContexts(ExprcaseContext.class);
		}
		public ExprcaseContext exprcase(int i) {
			return getRuleContext(ExprcaseContext.class,i);
		}
		public TerminalNode EGALE() { return getToken(B314Parser.EGALE, 0); }
		public Egalite_squareContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterEgalite_square(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitEgalite_square(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitEgalite_square(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprboolparContext extends ExprboolContext {
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public ExprboolContext exprbool() {
			return getRuleContext(ExprboolContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public ExprboolparContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprboolpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprboolpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprboolpar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrandexprContext extends ExprboolContext {
		public List<ExprboolContext> exprbool() {
			return getRuleContexts(ExprboolContext.class);
		}
		public ExprboolContext exprbool(int i) {
			return getRuleContext(ExprboolContext.class,i);
		}
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode OR() { return getToken(B314Parser.OR, 0); }
		public OrandexprContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterOrandexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitOrandexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitOrandexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnnemipositionexprContext extends ExprboolContext {
		public TerminalNode ENNEMI() { return getToken(B314Parser.ENNEMI, 0); }
		public TerminalNode IS() { return getToken(B314Parser.IS, 0); }
		public TerminalNode NORTH() { return getToken(B314Parser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(B314Parser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(B314Parser.EAST, 0); }
		public TerminalNode WEST() { return getToken(B314Parser.WEST, 0); }
		public EnnemipositionexprContext(ExprboolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterEnnemipositionexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitEnnemipositionexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitEnnemipositionexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprboolContext exprbool() throws RecognitionException {
		return exprbool(0);
	}

	private ExprboolContext exprbool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprboolContext _localctx = new ExprboolContext(_ctx, _parentState);
		ExprboolContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exprbool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new ExprboolparContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(100);
				match(LPAR);
				setState(101);
				exprbool(0);
				setState(102);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new TruexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(TRUE);
				}
				break;
			case 3:
				{
				_localctx = new FalsexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(FALSE);
				}
				break;
			case 4:
				{
				_localctx = new EnnemipositionexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(ENNEMI);
				setState(107);
				match(IS);
				setState(108);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				{
				_localctx = new GraalpositionexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(GRAAL);
				setState(110);
				match(IS);
				setState(111);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				{
				_localctx = new VaregalvarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				exprg();
				setState(113);
				match(EGALE);
				setState(114);
				exprg();
				}
				break;
			case 7:
				{
				_localctx = new VaregalfctContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				exprg();
				setState(117);
				match(EGALE);
				setState(118);
				match(ID);
				setState(119);
				match(LPAR);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << MOINS) | (1L << TRUE) | (1L << FALSE) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NOT) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << NEARBY))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(120);
					exprd();
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(121);
						match(COMA);
						setState(122);
						exprd();
						}
						}
						setState(127);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(130);
				match(RPAR);
				}
				break;
			case 8:
				{
				_localctx = new FctegalvarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(ID);
				setState(133);
				match(LPAR);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << MOINS) | (1L << TRUE) | (1L << FALSE) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NOT) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << NEARBY))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(134);
					exprd();
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(135);
						match(COMA);
						setState(136);
						exprd();
						}
						}
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(144);
				match(RPAR);
				setState(145);
				match(EGALE);
				setState(146);
				exprg();
				}
				break;
			case 9:
				{
				_localctx = new FctegalfctContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(ID);
				setState(148);
				match(LPAR);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << MOINS) | (1L << TRUE) | (1L << FALSE) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NOT) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << NEARBY))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(149);
					exprd();
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(150);
						match(COMA);
						setState(151);
						exprd();
						}
						}
						setState(156);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(159);
				match(RPAR);
				setState(160);
				match(EGALE);
				setState(161);
				match(ID);
				setState(162);
				match(LPAR);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << MOINS) | (1L << TRUE) | (1L << FALSE) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NOT) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << NEARBY))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(163);
					exprd();
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(164);
						match(COMA);
						setState(165);
						exprd();
						}
						}
						setState(170);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(173);
				match(RPAR);
				}
				break;
			case 10:
				{
				_localctx = new InfsupegalexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				exprent(0);
				setState(175);
				((InfsupegalexprContext)_localctx).comparator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INF) | (1L << SUP) | (1L << EGALE))) != 0)) ) {
					((InfsupegalexprContext)_localctx).comparator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				exprent(0);
				}
				break;
			case 11:
				{
				_localctx = new Egalite_squareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				exprcase();
				setState(179);
				match(EGALE);
				setState(180);
				exprcase();
				}
				break;
			case 12:
				{
				_localctx = new NotexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(NOT);
				setState(183);
				exprbool(4);
				}
				break;
			case 13:
				{
				_localctx = new Appeldefonction2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(ID);
				setState(185);
				match(LPAR);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << MOINS) | (1L << TRUE) | (1L << FALSE) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NOT) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << NEARBY))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(186);
					exprd();
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(187);
						match(COMA);
						setState(188);
						exprd();
						}
						}
						setState(193);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(196);
				match(RPAR);
				}
				break;
			case 14:
				{
				_localctx = new VariablebooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197);
				exprg();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Egalite_booleanContext(new ExprboolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprbool);
						setState(200);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(201);
						match(EGALE);
						setState(202);
						exprbool(7);
						}
						break;
					case 2:
						{
						_localctx = new OrandexprContext(new ExprboolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exprbool);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(205);
						exprbool(4);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ExprcaseContext extends ParserRuleContext {
		public ExprcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprcase; }
	 
		public ExprcaseContext() { }
		public void copyFrom(ExprcaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariablecaseContext extends ExprcaseContext {
		public ExprgContext exprg() {
			return getRuleContext(ExprgContext.class,0);
		}
		public VariablecaseContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVariablecase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVariablecase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVariablecase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirtexprContext extends ExprcaseContext {
		public TerminalNode DIRT() { return getToken(B314Parser.DIRT, 0); }
		public DirtexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterDirtexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitDirtexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitDirtexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RadioexprContext extends ExprcaseContext {
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public RadioexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterRadioexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitRadioexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitRadioexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlayerexprContext extends ExprcaseContext {
		public TerminalNode PLAYER() { return getToken(B314Parser.PLAYER, 0); }
		public PlayerexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterPlayerexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitPlayerexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitPlayerexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RockexprContext extends ExprcaseContext {
		public TerminalNode ROCK() { return getToken(B314Parser.ROCK, 0); }
		public RockexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterRockexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitRockexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitRockexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AmmoexprContext extends ExprcaseContext {
		public TerminalNode AMMO() { return getToken(B314Parser.AMMO, 0); }
		public AmmoexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAmmoexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAmmoexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAmmoexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SodaexprContext extends ExprcaseContext {
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public SodaexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterSodaexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitSodaexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitSodaexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ZombiexprContext extends ExprcaseContext {
		public TerminalNode ZOMBIE() { return getToken(B314Parser.ZOMBIE, 0); }
		public ZombiexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterZombiexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitZombiexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitZombiexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprcaseparContext extends ExprcaseContext {
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public ExprcaseContext exprcase() {
			return getRuleContext(ExprcaseContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public ExprcaseparContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprcasepar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprcasepar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprcasepar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NearbyexprContext extends ExprcaseContext {
		public TerminalNode NEARBY() { return getToken(B314Parser.NEARBY, 0); }
		public TerminalNode CROU() { return getToken(B314Parser.CROU, 0); }
		public List<ExprentContext> exprent() {
			return getRuleContexts(ExprentContext.class);
		}
		public ExprentContext exprent(int i) {
			return getRuleContext(ExprentContext.class,i);
		}
		public TerminalNode COMA() { return getToken(B314Parser.COMA, 0); }
		public TerminalNode CRFE() { return getToken(B314Parser.CRFE, 0); }
		public NearbyexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterNearbyexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitNearbyexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitNearbyexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Appeldefonction3Context extends ExprcaseContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public List<ExprdContext> exprd() {
			return getRuleContexts(ExprdContext.class);
		}
		public ExprdContext exprd(int i) {
			return getRuleContext(ExprdContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(B314Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(B314Parser.COMA, i);
		}
		public Appeldefonction3Context(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAppeldefonction3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAppeldefonction3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAppeldefonction3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapexprContext extends ExprcaseContext {
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public MapexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterMapexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitMapexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitMapexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VinexprContext extends ExprcaseContext {
		public TerminalNode VINES() { return getToken(B314Parser.VINES, 0); }
		public VinexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterVinexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitVinexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitVinexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnnemiexprContext extends ExprcaseContext {
		public TerminalNode ENNEMI() { return getToken(B314Parser.ENNEMI, 0); }
		public EnnemiexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterEnnemiexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitEnnemiexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitEnnemiexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FruitsexprContext extends ExprcaseContext {
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public FruitsexprContext(ExprcaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterFruitsexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitFruitsexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitFruitsexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprcaseContext exprcase() throws RecognitionException {
		ExprcaseContext _localctx = new ExprcaseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprcase);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ExprcaseparContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(LPAR);
				setState(212);
				exprcase();
				setState(213);
				match(RPAR);
				}
				break;
			case 2:
				_localctx = new DirtexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(DIRT);
				}
				break;
			case 3:
				_localctx = new RockexprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(ROCK);
				}
				break;
			case 4:
				_localctx = new VinexprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(VINES);
				}
				break;
			case 5:
				_localctx = new ZombiexprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				match(ZOMBIE);
				}
				break;
			case 6:
				_localctx = new PlayerexprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				match(PLAYER);
				}
				break;
			case 7:
				_localctx = new EnnemiexprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				match(ENNEMI);
				}
				break;
			case 8:
				_localctx = new MapexprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				match(MAP);
				}
				break;
			case 9:
				_localctx = new RadioexprContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
				match(RADIO);
				}
				break;
			case 10:
				_localctx = new AmmoexprContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(223);
				match(AMMO);
				}
				break;
			case 11:
				_localctx = new FruitsexprContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(224);
				match(FRUITS);
				}
				break;
			case 12:
				_localctx = new SodaexprContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(225);
				match(SODA);
				}
				break;
			case 13:
				_localctx = new NearbyexprContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(226);
				match(NEARBY);
				setState(227);
				match(CROU);
				setState(228);
				exprent(0);
				setState(229);
				match(COMA);
				setState(230);
				exprent(0);
				setState(231);
				match(CRFE);
				}
				break;
			case 14:
				_localctx = new Appeldefonction3Context(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(233);
				match(ID);
				setState(234);
				match(LPAR);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << MOINS) | (1L << TRUE) | (1L << FALSE) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NOT) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << NEARBY))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(235);
					exprd();
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(236);
						match(COMA);
						setState(237);
						exprd();
						}
						}
						setState(242);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(245);
				match(RPAR);
				}
				break;
			case 15:
				_localctx = new VariablecaseContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(246);
				exprg();
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

	public static class ExprdContext extends ParserRuleContext {
		public ExprdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprd; }
	 
		public ExprdContext() { }
		public void copyFrom(ExprdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AppelvarContext extends ExprdContext {
		public ExprgContext exprg() {
			return getRuleContext(ExprgContext.class,0);
		}
		public AppelvarContext(ExprdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAppelvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAppelvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAppelvar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AppelfonctionContext extends ExprdContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public List<ExprdContext> exprd() {
			return getRuleContexts(ExprdContext.class);
		}
		public ExprdContext exprd(int i) {
			return getRuleContext(ExprdContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(B314Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(B314Parser.COMA, i);
		}
		public AppelfonctionContext(ExprdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterAppelfonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitAppelfonction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitAppelfonction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprcasedroitContext extends ExprdContext {
		public ExprcaseContext exprcase() {
			return getRuleContext(ExprcaseContext.class,0);
		}
		public ExprcasedroitContext(ExprdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprcasedroit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprcasedroit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprcasedroit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprbooldroitContext extends ExprdContext {
		public ExprboolContext exprbool() {
			return getRuleContext(ExprboolContext.class,0);
		}
		public ExprbooldroitContext(ExprdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprbooldroit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprbooldroit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprbooldroit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpentierdroitContext extends ExprdContext {
		public ExprentContext exprent() {
			return getRuleContext(ExprentContext.class,0);
		}
		public ExpentierdroitContext(ExprdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExpentierdroit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExpentierdroit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExpentierdroit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprdContext exprd() throws RecognitionException {
		ExprdContext _localctx = new ExprdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprd);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new AppelvarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				exprg();
				}
				break;
			case 2:
				_localctx = new AppelfonctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(ID);
				setState(251);
				match(LPAR);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << LATITUDE) | (1L << LONGITUDE) | (1L << GRID) | (1L << MAP) | (1L << RADIO) | (1L << AMMO) | (1L << FRUITS) | (1L << SODA) | (1L << LIFE) | (1L << MOINS) | (1L << TRUE) | (1L << FALSE) | (1L << ENNEMI) | (1L << GRAAL) | (1L << NOT) | (1L << DIRT) | (1L << ROCK) | (1L << VINES) | (1L << ZOMBIE) | (1L << PLAYER) | (1L << NEARBY))) != 0) || _la==ID || _la==NUMBER) {
					{
					setState(252);
					exprd();
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMA) {
						{
						{
						setState(253);
						match(COMA);
						setState(254);
						exprd();
						}
						}
						setState(259);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(262);
				match(RPAR);
				}
				break;
			case 3:
				_localctx = new ExpentierdroitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				exprent(0);
				}
				break;
			case 4:
				_localctx = new ExprbooldroitContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				exprbool(0);
				}
				break;
			case 5:
				_localctx = new ExprcasedroitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				exprcase();
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

	public static class ExprgContext extends ParserRuleContext {
		public ExprgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprg; }
	 
		public ExprgContext() { }
		public void copyFrom(ExprgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprgidContext extends ExprgContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public ExprgidContext(ExprgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprgid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprgid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprgid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprgtabContext extends ExprgContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode CROU() { return getToken(B314Parser.CROU, 0); }
		public List<ExprentContext> exprent() {
			return getRuleContexts(ExprentContext.class);
		}
		public ExprentContext exprent(int i) {
			return getRuleContext(ExprentContext.class,i);
		}
		public TerminalNode CRFE() { return getToken(B314Parser.CRFE, 0); }
		public TerminalNode COMA() { return getToken(B314Parser.COMA, 0); }
		public ExprgtabContext(ExprgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterExprgtab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitExprgtab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitExprgtab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprgContext exprg() throws RecognitionException {
		ExprgContext _localctx = new ExprgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprg);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ExprgidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ExprgtabContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(ID);
				setState(270);
				match(CROU);
				setState(271);
				exprent(0);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(272);
					match(COMA);
					setState(273);
					exprent(0);
					}
				}

				setState(276);
				match(CRFE);
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

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IftheninstrContext extends InstructionContext {
		public TerminalNode IF() { return getToken(B314Parser.IF, 0); }
		public ExprboolContext exprbool() {
			return getRuleContext(ExprboolContext.class,0);
		}
		public TerminalNode THEN() { return getToken(B314Parser.THEN, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IftheninstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterIftheninstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitIftheninstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitIftheninstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetinstrContext extends InstructionContext {
		public TerminalNode SET() { return getToken(B314Parser.SET, 0); }
		public ExprgContext exprg() {
			return getRuleContext(ExprgContext.class,0);
		}
		public TerminalNode TO() { return getToken(B314Parser.TO, 0); }
		public ExprdContext exprd() {
			return getRuleContext(ExprdContext.class,0);
		}
		public SetinstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterSetinstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitSetinstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitSetinstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComputeinstrContext extends InstructionContext {
		public TerminalNode COMPUTE() { return getToken(B314Parser.COMPUTE, 0); }
		public ExprdContext exprd() {
			return getRuleContext(ExprdContext.class,0);
		}
		public ComputeinstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterComputeinstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitComputeinstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitComputeinstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfthenelseinstrContext extends InstructionContext {
		public TerminalNode IF() { return getToken(B314Parser.IF, 0); }
		public ExprboolContext exprbool() {
			return getRuleContext(ExprboolContext.class,0);
		}
		public TerminalNode THEN() { return getToken(B314Parser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(B314Parser.ELSE, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfthenelseinstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterIfthenelseinstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitIfthenelseinstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitIfthenelseinstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileinstrContext extends InstructionContext {
		public TerminalNode WHILE() { return getToken(B314Parser.WHILE, 0); }
		public ExprboolContext exprbool() {
			return getRuleContext(ExprboolContext.class,0);
		}
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public WhileinstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterWhileinstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitWhileinstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitWhileinstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipinstructionContext extends InstructionContext {
		public TerminalNode SKIPINSTR() { return getToken(B314Parser.SKIPINSTR, 0); }
		public SkipinstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterSkipinstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitSkipinstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitSkipinstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NextinstrContext extends InstructionContext {
		public TerminalNode NEXT() { return getToken(B314Parser.NEXT, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public NextinstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterNextinstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitNextinstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitNextinstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instruction);
		int _la;
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new SkipinstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(SKIPINSTR);
				}
				break;
			case 2:
				_localctx = new IftheninstrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(IF);
				setState(282);
				exprbool(0);
				setState(283);
				match(THEN);
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(284);
					instruction();
					}
					}
					setState(287); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPINSTR) | (1L << NEXT) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE))) != 0) );
				setState(289);
				match(DONE);
				}
				break;
			case 3:
				_localctx = new IfthenelseinstrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				match(IF);
				setState(292);
				exprbool(0);
				setState(293);
				match(THEN);
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(294);
					instruction();
					}
					}
					setState(297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPINSTR) | (1L << NEXT) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE))) != 0) );
				setState(299);
				match(ELSE);
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					instruction();
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPINSTR) | (1L << NEXT) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE))) != 0) );
				setState(305);
				match(DONE);
				}
				break;
			case 4:
				_localctx = new WhileinstrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(WHILE);
				setState(308);
				exprbool(0);
				setState(309);
				match(DO);
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(310);
					instruction();
					}
					}
					setState(313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPINSTR) | (1L << NEXT) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE))) != 0) );
				setState(315);
				match(DONE);
				}
				break;
			case 5:
				_localctx = new SetinstrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
				match(SET);
				setState(318);
				exprg();
				setState(319);
				match(TO);
				setState(320);
				exprd();
				}
				break;
			case 6:
				_localctx = new ComputeinstrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				match(COMPUTE);
				setState(323);
				exprd();
				}
				break;
			case 7:
				_localctx = new NextinstrContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(324);
				match(NEXT);
				setState(325);
				action();
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

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	 
		public ActionContext() { }
		public void copyFrom(ActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShootactionContext extends ActionContext {
		public TerminalNode SHOOT() { return getToken(B314Parser.SHOOT, 0); }
		public TerminalNode NORTH() { return getToken(B314Parser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(B314Parser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(B314Parser.EAST, 0); }
		public TerminalNode WEST() { return getToken(B314Parser.WEST, 0); }
		public ShootactionContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterShootaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitShootaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitShootaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DonothingactionContext extends ActionContext {
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode NOTHING() { return getToken(B314Parser.NOTHING, 0); }
		public DonothingactionContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterDonothingaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitDonothingaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitDonothingaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoveactionContext extends ActionContext {
		public TerminalNode MOVE() { return getToken(B314Parser.MOVE, 0); }
		public TerminalNode NORTH() { return getToken(B314Parser.NORTH, 0); }
		public TerminalNode SOUTH() { return getToken(B314Parser.SOUTH, 0); }
		public TerminalNode EAST() { return getToken(B314Parser.EAST, 0); }
		public TerminalNode WEST() { return getToken(B314Parser.WEST, 0); }
		public MoveactionContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterMoveaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitMoveaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitMoveaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseactionContext extends ActionContext {
		public TerminalNode USE() { return getToken(B314Parser.USE, 0); }
		public TerminalNode MAP() { return getToken(B314Parser.MAP, 0); }
		public TerminalNode RADIO() { return getToken(B314Parser.RADIO, 0); }
		public TerminalNode FRUITS() { return getToken(B314Parser.FRUITS, 0); }
		public TerminalNode SODA() { return getToken(B314Parser.SODA, 0); }
		public UseactionContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterUseaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitUseaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitUseaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_action);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				_localctx = new MoveactionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(MOVE);
				setState(329);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SHOOT:
				_localctx = new ShootactionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(SHOOT);
				setState(331);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NORTH) | (1L << SOUTH) | (1L << EAST) | (1L << WEST))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case USE:
				_localctx = new UseactionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(USE);
				setState(333);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAP) | (1L << RADIO) | (1L << FRUITS) | (1L << SODA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DO:
				_localctx = new DonothingactionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(DO);
				setState(335);
				match(NOTHING);
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

	public static class FctdeclContext extends ParserRuleContext {
		public FctdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fctdecl; }
	 
		public FctdeclContext() { }
		public void copyFrom(FctdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaration_functionContext extends FctdeclContext {
		public TerminalNode ID() { return getToken(B314Parser.ID, 0); }
		public TerminalNode AS() { return getToken(B314Parser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(B314Parser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(B314Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(B314Parser.RPAR, 0); }
		public TerminalNode DUOPOINT() { return getToken(B314Parser.DUOPOINT, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode VOID() { return getToken(B314Parser.VOID, 0); }
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(B314Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(B314Parser.COMA, i);
		}
		public List<TerminalNode> POINTVIRGULE() { return getTokens(B314Parser.POINTVIRGULE); }
		public TerminalNode POINTVIRGULE(int i) {
			return getToken(B314Parser.POINTVIRGULE, i);
		}
		public Declaration_functionContext(FctdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterDeclaration_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitDeclaration_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitDeclaration_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FctdeclContext fctdecl() throws RecognitionException {
		FctdeclContext _localctx = new FctdeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fctdecl);
		int _la;
		try {
			_localctx = new Declaration_functionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(ID);
			setState(339);
			match(AS);
			setState(340);
			match(FUNCTION);
			setState(341);
			match(LPAR);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(342);
				vardecl();
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(343);
					match(COMA);
					setState(344);
					vardecl();
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(352);
			match(RPAR);
			setState(353);
			match(DUOPOINT);
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTEGER:
			case SQUARE:
				{
				setState(354);
				scalar();
				}
				break;
			case VOID:
				{
				setState(355);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(358);
				match(DECLARE);
				setState(359);
				match(LOCAL);
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(360);
					vardecl();
					setState(361);
					match(POINTVIRGULE);
					}
					}
					setState(365); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(369);
			match(DO);
			setState(371); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(370);
				instruction();
				}
				}
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPINSTR) | (1L << NEXT) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE))) != 0) );
			setState(375);
			match(DONE);
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

	public static class ProgrammeContext extends ParserRuleContext {
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
	 
		public ProgrammeContext() { }
		public void copyFrom(ProgrammeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramContext extends ProgrammeContext {
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode AND() { return getToken(B314Parser.AND, 0); }
		public TerminalNode RETAIN() { return getToken(B314Parser.RETAIN, 0); }
		public TerminalNode WHEN() { return getToken(B314Parser.WHEN, 0); }
		public TerminalNode YOUR() { return getToken(B314Parser.YOUR, 0); }
		public TerminalNode TURN() { return getToken(B314Parser.TURN, 0); }
		public ClausedefaultContext clausedefault() {
			return getRuleContext(ClausedefaultContext.class,0);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> POINTVIRGULE() { return getTokens(B314Parser.POINTVIRGULE); }
		public TerminalNode POINTVIRGULE(int i) {
			return getToken(B314Parser.POINTVIRGULE, i);
		}
		public List<FctdeclContext> fctdecl() {
			return getRuleContexts(FctdeclContext.class);
		}
		public FctdeclContext fctdecl(int i) {
			return getRuleContext(FctdeclContext.class,i);
		}
		public List<ClausewhenContext> clausewhen() {
			return getRuleContexts(ClausewhenContext.class);
		}
		public ClausewhenContext clausewhen(int i) {
			return getRuleContext(ClausewhenContext.class,i);
		}
		public ProgramContext(ProgrammeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_programme);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(DECLARE);
			setState(378);
			match(AND);
			setState(379);
			match(RETAIN);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(380);
					vardecl();
					setState(381);
					match(POINTVIRGULE);
					}
					break;
				case 2:
					{
					setState(383);
					fctdecl();
					}
					break;
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(WHEN);
			setState(390);
			match(YOUR);
			setState(391);
			match(TURN);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(392);
				clausewhen();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			clausedefault();
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

	public static class ClausewhenContext extends ParserRuleContext {
		public ClausewhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausewhen; }
	 
		public ClausewhenContext() { }
		public void copyFrom(ClausewhenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhenclauseContext extends ClausewhenContext {
		public TerminalNode WHEN() { return getToken(B314Parser.WHEN, 0); }
		public ExprboolContext exprbool() {
			return getRuleContext(ExprboolContext.class,0);
		}
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> POINTVIRGULE() { return getTokens(B314Parser.POINTVIRGULE); }
		public TerminalNode POINTVIRGULE(int i) {
			return getToken(B314Parser.POINTVIRGULE, i);
		}
		public WhenclauseContext(ClausewhenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterWhenclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitWhenclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitWhenclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausewhenContext clausewhen() throws RecognitionException {
		ClausewhenContext _localctx = new ClausewhenContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_clausewhen);
		int _la;
		try {
			_localctx = new WhenclauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(WHEN);
			setState(401);
			exprbool(0);
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(402);
				match(DECLARE);
				setState(403);
				match(LOCAL);
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(404);
					vardecl();
					setState(405);
					match(POINTVIRGULE);
					}
					}
					setState(409); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(413);
			match(DO);
			setState(415); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(414);
				instruction();
				}
				}
				setState(417); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPINSTR) | (1L << NEXT) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE))) != 0) );
			setState(419);
			match(DONE);
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

	public static class ClausedefaultContext extends ParserRuleContext {
		public ClausedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausedefault; }
	 
		public ClausedefaultContext() { }
		public void copyFrom(ClausedefaultContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefaultclauseContext extends ClausedefaultContext {
		public TerminalNode BY() { return getToken(B314Parser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(B314Parser.DEFAULT, 0); }
		public TerminalNode DO() { return getToken(B314Parser.DO, 0); }
		public TerminalNode DONE() { return getToken(B314Parser.DONE, 0); }
		public TerminalNode EOF() { return getToken(B314Parser.EOF, 0); }
		public TerminalNode DECLARE() { return getToken(B314Parser.DECLARE, 0); }
		public TerminalNode LOCAL() { return getToken(B314Parser.LOCAL, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<VardeclContext> vardecl() {
			return getRuleContexts(VardeclContext.class);
		}
		public VardeclContext vardecl(int i) {
			return getRuleContext(VardeclContext.class,i);
		}
		public List<TerminalNode> POINTVIRGULE() { return getTokens(B314Parser.POINTVIRGULE); }
		public TerminalNode POINTVIRGULE(int i) {
			return getToken(B314Parser.POINTVIRGULE, i);
		}
		public DefaultclauseContext(ClausedefaultContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).enterDefaultclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof B314Listener ) ((B314Listener)listener).exitDefaultclause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof B314Visitor ) return ((B314Visitor<? extends T>)visitor).visitDefaultclause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClausedefaultContext clausedefault() throws RecognitionException {
		ClausedefaultContext _localctx = new ClausedefaultContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_clausedefault);
		int _la;
		try {
			_localctx = new DefaultclauseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(BY);
			setState(422);
			match(DEFAULT);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(423);
				match(DECLARE);
				setState(424);
				match(LOCAL);
				setState(428); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(425);
					vardecl();
					setState(426);
					match(POINTVIRGULE);
					}
					}
					setState(430); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(434);
			match(DO);
			setState(436); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(435);
				instruction();
				}
				}
				setState(438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SKIPINSTR) | (1L << NEXT) | (1L << IF) | (1L << WHILE) | (1L << SET) | (1L << COMPUTE))) != 0) );
			setState(440);
			match(DONE);
			setState(441);
			match(EOF);
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
		case 5:
			return exprent_sempred((ExprentContext)_localctx, predIndex);
		case 6:
			return exprbool_sempred((ExprboolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprent_sempred(ExprentContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exprbool_sempred(ExprboolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u01be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\5\3\'\n\3\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\5\7=\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7\5\7U\n"+
		"\7\3\7\3\7\5\7Y\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7a\n\7\f\7\16\7d\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\5\b\u0083\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f\13\b\5\b\u0091"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13\b"+
		"\5\b\u00a0\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a9\n\b\f\b\16\b\u00ac"+
		"\13\b\5\b\u00ae\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u00c0\n\b\f\b\16\b\u00c3\13\b\5\b\u00c5\n\b\3\b\3\b"+
		"\5\b\u00c9\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00d1\n\b\f\b\16\b\u00d4\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00f1\n\t\f\t\16\t\u00f4"+
		"\13\t\5\t\u00f6\n\t\3\t\3\t\5\t\u00fa\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u0102\n\n\f\n\16\n\u0105\13\n\5\n\u0107\n\n\3\n\3\n\3\n\3\n\5\n\u010d"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0115\n\13\3\13\3\13\5\13\u0119"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\6\f\u0120\n\f\r\f\16\f\u0121\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\6\f\u012a\n\f\r\f\16\f\u012b\3\f\3\f\6\f\u0130\n\f\r\f\16\f\u0131"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u013a\n\f\r\f\16\f\u013b\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0149\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0153\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u015c\n\16"+
		"\f\16\16\16\u015f\13\16\5\16\u0161\n\16\3\16\3\16\3\16\3\16\5\16\u0167"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\6\16\u016e\n\16\r\16\16\16\u016f\5\16\u0172"+
		"\n\16\3\16\3\16\6\16\u0176\n\16\r\16\16\16\u0177\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u0183\n\17\f\17\16\17\u0186\13\17\3\17\3"+
		"\17\3\17\3\17\7\17\u018c\n\17\f\17\16\17\u018f\13\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\6\20\u019a\n\20\r\20\16\20\u019b\5\20\u019e"+
		"\n\20\3\20\3\20\6\20\u01a2\n\20\r\20\16\20\u01a3\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\6\21\u01af\n\21\r\21\16\21\u01b0\5\21\u01b3\n"+
		"\21\3\21\3\21\6\21\u01b7\n\21\r\21\16\21\u01b8\3\21\3\21\3\21\3\21\2\4"+
		"\f\16\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\t\3\2\24\30\3\2\35"+
		"\37\3\2\33\34\3\2$\'\3\2+-\4\2\13\13))\4\2\24\25\27\30\u020b\2\"\3\2\2"+
		"\2\4&\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n\66\3\2\2\2\fX\3\2\2\2\16\u00c8\3"+
		"\2\2\2\20\u00f9\3\2\2\2\22\u010c\3\2\2\2\24\u0118\3\2\2\2\26\u0148\3\2"+
		"\2\2\30\u0152\3\2\2\2\32\u0154\3\2\2\2\34\u017b\3\2\2\2\36\u0192\3\2\2"+
		"\2 \u01a7\3\2\2\2\"#\5\34\17\2#\3\3\2\2\2$\'\5\6\4\2%\'\5\b\5\2&$\3\2"+
		"\2\2&%\3\2\2\2\'\5\3\2\2\2(,\7\3\2\2),\7\4\2\2*,\7\5\2\2+(\3\2\2\2+)\3"+
		"\2\2\2+*\3\2\2\2,\7\3\2\2\2-.\5\6\4\2./\7\6\2\2/\62\7M\2\2\60\61\7\b\2"+
		"\2\61\63\7M\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\7\2"+
		"\2\65\t\3\2\2\2\66\67\7L\2\2\678\7\t\2\289\5\4\3\29\13\3\2\2\2:<\b\7\1"+
		"\2;=\7\34\2\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>Y\7M\2\2?@\7\r\2\2@A\5\f\7"+
		"\2AB\7\16\2\2BY\3\2\2\2CY\7\20\2\2DY\7\21\2\2EF\7\22\2\2FY\7\23\2\2GH"+
		"\t\2\2\2HY\7\31\2\2IY\7\32\2\2JK\7L\2\2KT\7\r\2\2LQ\5\22\n\2MN\7\b\2\2"+
		"NP\5\22\n\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2"+
		"\2TL\3\2\2\2TU\3\2\2\2UV\3\2\2\2VY\7\16\2\2WY\5\24\13\2X:\3\2\2\2X?\3"+
		"\2\2\2XC\3\2\2\2XD\3\2\2\2XE\3\2\2\2XG\3\2\2\2XI\3\2\2\2XJ\3\2\2\2XW\3"+
		"\2\2\2Yb\3\2\2\2Z[\f\6\2\2[\\\t\3\2\2\\a\5\f\7\7]^\f\5\2\2^_\t\4\2\2_"+
		"a\5\f\7\6`Z\3\2\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\r\3\2\2\2"+
		"db\3\2\2\2ef\b\b\1\2fg\7\r\2\2gh\5\16\b\2hi\7\16\2\2i\u00c9\3\2\2\2j\u00c9"+
		"\7 \2\2k\u00c9\7!\2\2lm\7\"\2\2mn\7#\2\2n\u00c9\t\5\2\2op\7(\2\2pq\7#"+
		"\2\2q\u00c9\t\5\2\2rs\5\24\13\2st\7-\2\2tu\5\24\13\2u\u00c9\3\2\2\2vw"+
		"\5\24\13\2wx\7-\2\2xy\7L\2\2y\u0082\7\r\2\2z\177\5\22\n\2{|\7\b\2\2|~"+
		"\5\22\n\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082z\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\7\16\2\2\u0085\u00c9\3\2\2\2\u0086\u0087\7"+
		"L\2\2\u0087\u0090\7\r\2\2\u0088\u008d\5\22\n\2\u0089\u008a\7\b\2\2\u008a"+
		"\u008c\5\22\n\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0088\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\16"+
		"\2\2\u0093\u0094\7-\2\2\u0094\u00c9\5\24\13\2\u0095\u0096\7L\2\2\u0096"+
		"\u009f\7\r\2\2\u0097\u009c\5\22\n\2\u0098\u0099\7\b\2\2\u0099\u009b\5"+
		"\22\n\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u0097\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\16\2\2\u00a2"+
		"\u00a3\7-\2\2\u00a3\u00a4\7L\2\2\u00a4\u00ad\7\r\2\2\u00a5\u00aa\5\22"+
		"\n\2\u00a6\u00a7\7\b\2\2\u00a7\u00a9\5\22\n\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ae\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00c9\7\16\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2\t"+
		"\6\2\2\u00b2\u00b3\5\f\7\2\u00b3\u00c9\3\2\2\2\u00b4\u00b5\5\20\t\2\u00b5"+
		"\u00b6\7-\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00c9\3\2\2\2\u00b8\u00b9\7*"+
		"\2\2\u00b9\u00c9\5\16\b\6\u00ba\u00bb\7L\2\2\u00bb\u00c4\7\r\2\2\u00bc"+
		"\u00c1\5\22\n\2\u00bd\u00be\7\b\2\2\u00be\u00c0\5\22\n\2\u00bf\u00bd\3"+
		"\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\7\16\2\2\u00c7\u00c9\5\24\13\2\u00c8"+
		"e\3\2\2\2\u00c8j\3\2\2\2\u00c8k\3\2\2\2\u00c8l\3\2\2\2\u00c8o\3\2\2\2"+
		"\u00c8r\3\2\2\2\u00c8v\3\2\2\2\u00c8\u0086\3\2\2\2\u00c8\u0095\3\2\2\2"+
		"\u00c8\u00b0\3\2\2\2\u00c8\u00b4\3\2\2\2\u00c8\u00b8\3\2\2\2\u00c8\u00ba"+
		"\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00d2\3\2\2\2\u00ca\u00cb\f\b\2\2\u00cb"+
		"\u00cc\7-\2\2\u00cc\u00d1\5\16\b\t\u00cd\u00ce\f\5\2\2\u00ce\u00cf\t\7"+
		"\2\2\u00cf\u00d1\5\16\b\6\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\17\3\2\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\r\2\2\u00d6\u00d7\5\20\t\2\u00d7"+
		"\u00d8\7\16\2\2\u00d8\u00fa\3\2\2\2\u00d9\u00fa\7.\2\2\u00da\u00fa\7/"+
		"\2\2\u00db\u00fa\7\60\2\2\u00dc\u00fa\7\61\2\2\u00dd\u00fa\7\62\2\2\u00de"+
		"\u00fa\7\"\2\2\u00df\u00fa\7\24\2\2\u00e0\u00fa\7\25\2\2\u00e1\u00fa\7"+
		"\26\2\2\u00e2\u00fa\7\27\2\2\u00e3\u00fa\7\30\2\2\u00e4\u00e5\7\63\2\2"+
		"\u00e5\u00e6\7\6\2\2\u00e6\u00e7\5\f\7\2\u00e7\u00e8\7\b\2\2\u00e8\u00e9"+
		"\5\f\7\2\u00e9\u00ea\7\7\2\2\u00ea\u00fa\3\2\2\2\u00eb\u00ec\7L\2\2\u00ec"+
		"\u00f5\7\r\2\2\u00ed\u00f2\5\22\n\2\u00ee\u00ef\7\b\2\2\u00ef\u00f1\5"+
		"\22\n\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00ed\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\7\16\2\2\u00f8"+
		"\u00fa\5\24\13\2\u00f9\u00d5\3\2\2\2\u00f9\u00d9\3\2\2\2\u00f9\u00da\3"+
		"\2\2\2\u00f9\u00db\3\2\2\2\u00f9\u00dc\3\2\2\2\u00f9\u00dd\3\2\2\2\u00f9"+
		"\u00de\3\2\2\2\u00f9\u00df\3\2\2\2\u00f9\u00e0\3\2\2\2\u00f9\u00e1\3\2"+
		"\2\2\u00f9\u00e2\3\2\2\2\u00f9\u00e3\3\2\2\2\u00f9\u00e4\3\2\2\2\u00f9"+
		"\u00eb\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\21\3\2\2\2\u00fb\u010d\5\24\13"+
		"\2\u00fc\u00fd\7L\2\2\u00fd\u0106\7\r\2\2\u00fe\u0103\5\22\n\2\u00ff\u0100"+
		"\7\b\2\2\u0100\u0102\5\22\n\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010d\7\16\2\2\u0109\u010d\5\f\7\2\u010a\u010d\5\16\b\2\u010b\u010d\5"+
		"\20\t\2\u010c\u00fb\3\2\2\2\u010c\u00fc\3\2\2\2\u010c\u0109\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\23\3\2\2\2\u010e\u0119\7L\2\2"+
		"\u010f\u0110\7L\2\2\u0110\u0111\7\6\2\2\u0111\u0114\5\f\7\2\u0112\u0113"+
		"\7\b\2\2\u0113\u0115\5\f\7\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\7\7\2\2\u0117\u0119\3\2\2\2\u0118\u010e\3\2"+
		"\2\2\u0118\u010f\3\2\2\2\u0119\25\3\2\2\2\u011a\u0149\7\64\2\2\u011b\u011c"+
		"\7\66\2\2\u011c\u011d\5\16\b\2\u011d\u011f\7\67\2\2\u011e\u0120\5\26\f"+
		"\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7:\2\2\u0124\u0149\3\2\2\2\u0125"+
		"\u0126\7\66\2\2\u0126\u0127\5\16\b\2\u0127\u0129\7\67\2\2\u0128\u012a"+
		"\5\26\f\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\78\2\2\u012e\u0130"+
		"\5\26\f\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7:\2\2\u0134\u0149"+
		"\3\2\2\2\u0135\u0136\79\2\2\u0136\u0137\5\16\b\2\u0137\u0139\7<\2\2\u0138"+
		"\u013a\5\26\f\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3"+
		"\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7:\2\2\u013e"+
		"\u0149\3\2\2\2\u013f\u0140\7;\2\2\u0140\u0141\5\24\13\2\u0141\u0142\7"+
		"=\2\2\u0142\u0143\5\22\n\2\u0143\u0149\3\2\2\2\u0144\u0145\7>\2\2\u0145"+
		"\u0149\5\22\n\2\u0146\u0147\7\65\2\2\u0147\u0149\5\30\r\2\u0148\u011a"+
		"\3\2\2\2\u0148\u011b\3\2\2\2\u0148\u0125\3\2\2\2\u0148\u0135\3\2\2\2\u0148"+
		"\u013f\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0146\3\2\2\2\u0149\27\3\2\2"+
		"\2\u014a\u014b\7?\2\2\u014b\u0153\t\5\2\2\u014c\u014d\7@\2\2\u014d\u0153"+
		"\t\5\2\2\u014e\u014f\7A\2\2\u014f\u0153\t\b\2\2\u0150\u0151\7<\2\2\u0151"+
		"\u0153\7B\2\2\u0152\u014a\3\2\2\2\u0152\u014c\3\2\2\2\u0152\u014e\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\31\3\2\2\2\u0154\u0155\7L\2\2\u0155\u0156"+
		"\7\t\2\2\u0156\u0157\7C\2\2\u0157\u0160\7\r\2\2\u0158\u015d\5\n\6\2\u0159"+
		"\u015a\7\b\2\2\u015a\u015c\5\n\6\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u015d\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0163\7\16\2\2\u0163\u0166\7E\2\2\u0164\u0167\5\6\4\2\u0165"+
		"\u0167\7\17\2\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u0171\3"+
		"\2\2\2\u0168\u0169\7\n\2\2\u0169\u016d\7D\2\2\u016a\u016b\5\n\6\2\u016b"+
		"\u016c\7J\2\2\u016c\u016e\3\2\2\2\u016d\u016a\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171"+
		"\u0168\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\7<"+
		"\2\2\u0174\u0176\5\26\f\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7:"+
		"\2\2\u017a\33\3\2\2\2\u017b\u017c\7\n\2\2\u017c\u017d\7\13\2\2\u017d\u0184"+
		"\7\f\2\2\u017e\u017f\5\n\6\2\u017f\u0180\7J\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u0183\5\32\16\2\u0182\u017e\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3"+
		"\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u0188\7K\2\2\u0188\u0189\7F\2\2\u0189\u018d\7G\2"+
		"\2\u018a\u018c\5\36\20\2\u018b\u018a\3\2\2\2\u018c\u018f\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2"+
		"\2\2\u0190\u0191\5 \21\2\u0191\35\3\2\2\2\u0192\u0193\7K\2\2\u0193\u019d"+
		"\5\16\b\2\u0194\u0195\7\n\2\2\u0195\u0199\7D\2\2\u0196\u0197\5\n\6\2\u0197"+
		"\u0198\7J\2\2\u0198\u019a\3\2\2\2\u0199\u0196\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d"+
		"\u0194\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\7<"+
		"\2\2\u01a0\u01a2\5\26\f\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7:"+
		"\2\2\u01a6\37\3\2\2\2\u01a7\u01a8\7H\2\2\u01a8\u01b2\7I\2\2\u01a9\u01aa"+
		"\7\n\2\2\u01aa\u01ae\7D\2\2\u01ab\u01ac\5\n\6\2\u01ac\u01ad\7J\2\2\u01ad"+
		"\u01af\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01a9\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\7<\2\2\u01b5\u01b7\5\26"+
		"\f\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\7:\2\2\u01bb\u01bc\7\2"+
		"\2\3\u01bc!\3\2\2\2\65&+\62<QTX`b\177\u0082\u008d\u0090\u009c\u009f\u00aa"+
		"\u00ad\u00c1\u00c4\u00c8\u00d0\u00d2\u00f2\u00f5\u00f9\u0103\u0106\u010c"+
		"\u0114\u0118\u0121\u012b\u0131\u013b\u0148\u0152\u015d\u0160\u0166\u016f"+
		"\u0171\u0177\u0182\u0184\u018d\u019b\u019d\u01a3\u01b0\u01b2\u01b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}