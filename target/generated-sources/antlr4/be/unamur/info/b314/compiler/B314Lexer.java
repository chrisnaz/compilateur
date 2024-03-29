// Generated from be\u005Cunamur\info\b314\compiler\B314.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class B314Lexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN", "INTEGER", "SQUARE", "CROU", "CRFE", "COMA", "AS", "DECLARE", 
		"AND", "RETAIN", "LPAR", "RPAR", "VOID", "LATITUDE", "LONGITUDE", "GRID", 
		"SIZE", "MAP", "RADIO", "AMMO", "FRUITS", "SODA", "COUNT", "LIFE", "PLUS", 
		"MOINS", "MUL", "DIV", "MODULO", "TRUE", "FALSE", "ENNEMI", "IS", "NORTH", 
		"SOUTH", "EAST", "WEST", "GRAAL", "OR", "NOT", "INF", "SUP", "EGALE", 
		"DIRT", "ROCK", "VINES", "ZOMBIE", "PLAYER", "NEARBY", "SKIPINSTR", "NEXT", 
		"IF", "THEN", "ELSE", "WHILE", "DONE", "SET", "DO", "TO", "COMPUTE", "MOVE", 
		"SHOOT", "USE", "NOTHING", "FUNCTION", "LOCAL", "DUOPOINT", "YOUR", "TURN", 
		"BY", "DEFAULT", "POINTVIRGULE", "WHEN", "ID", "NUMBER", "LETTER", "DIGIT", 
		"COMMENT", "NEWLINE", "WS"
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


	public B314Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "B314.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2P\u0234\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-"+
		"\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39"+
		"\39\39\39\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>"+
		"\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B"+
		"\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F"+
		"\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K"+
		"\7K\u020b\nK\fK\16K\u020e\13K\3L\6L\u0211\nL\rL\16L\u0212\3M\3M\3N\3N"+
		"\3O\3O\3O\3O\7O\u021d\nO\fO\16O\u0220\13O\3O\3O\3O\3O\3O\3P\5P\u0228\n"+
		"P\3P\3P\3P\3P\3Q\6Q\u022f\nQ\rQ\16Q\u0230\3Q\3Q\3\u021e\2R\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099\2\u009b\2\u009dN\u009fO\u00a1P\3\2\4\4\2"+
		"C\\c|\4\2\13\13\"\"\u0237\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\3\u00a3\3\2\2\2\5\u00ab\3\2\2\2\7\u00b3\3\2\2\2\t\u00ba"+
		"\3\2\2\2\13\u00bc\3\2\2\2\r\u00be\3\2\2\2\17\u00c0\3\2\2\2\21\u00c3\3"+
		"\2\2\2\23\u00cb\3\2\2\2\25\u00cf\3\2\2\2\27\u00d6\3\2\2\2\31\u00d8\3\2"+
		"\2\2\33\u00da\3\2\2\2\35\u00df\3\2\2\2\37\u00e8\3\2\2\2!\u00f2\3\2\2\2"+
		"#\u00f7\3\2\2\2%\u00fc\3\2\2\2\'\u0100\3\2\2\2)\u0106\3\2\2\2+\u010b\3"+
		"\2\2\2-\u0112\3\2\2\2/\u0117\3\2\2\2\61\u011d\3\2\2\2\63\u0122\3\2\2\2"+
		"\65\u0124\3\2\2\2\67\u0126\3\2\2\29\u0128\3\2\2\2;\u012a\3\2\2\2=\u012c"+
		"\3\2\2\2?\u0131\3\2\2\2A\u0137\3\2\2\2C\u013e\3\2\2\2E\u0141\3\2\2\2G"+
		"\u0147\3\2\2\2I\u014d\3\2\2\2K\u0152\3\2\2\2M\u0157\3\2\2\2O\u015d\3\2"+
		"\2\2Q\u0160\3\2\2\2S\u0164\3\2\2\2U\u0166\3\2\2\2W\u0168\3\2\2\2Y\u016a"+
		"\3\2\2\2[\u016f\3\2\2\2]\u0174\3\2\2\2_\u017a\3\2\2\2a\u0181\3\2\2\2c"+
		"\u0188\3\2\2\2e\u018f\3\2\2\2g\u0194\3\2\2\2i\u0199\3\2\2\2k\u019c\3\2"+
		"\2\2m\u01a1\3\2\2\2o\u01a6\3\2\2\2q\u01ac\3\2\2\2s\u01b1\3\2\2\2u\u01b5"+
		"\3\2\2\2w\u01b8\3\2\2\2y\u01bb\3\2\2\2{\u01c3\3\2\2\2}\u01c8\3\2\2\2\177"+
		"\u01ce\3\2\2\2\u0081\u01d2\3\2\2\2\u0083\u01da\3\2\2\2\u0085\u01e3\3\2"+
		"\2\2\u0087\u01e9\3\2\2\2\u0089\u01eb\3\2\2\2\u008b\u01f0\3\2\2\2\u008d"+
		"\u01f5\3\2\2\2\u008f\u01f8\3\2\2\2\u0091\u0200\3\2\2\2\u0093\u0202\3\2"+
		"\2\2\u0095\u0207\3\2\2\2\u0097\u0210\3\2\2\2\u0099\u0214\3\2\2\2\u009b"+
		"\u0216\3\2\2\2\u009d\u0218\3\2\2\2\u009f\u0227\3\2\2\2\u00a1\u022e\3\2"+
		"\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7"+
		"\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7p\2\2\u00aa"+
		"\4\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7t\2\2"+
		"\u00b2\6\3\2\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7s\2\2\u00b5\u00b6\7w"+
		"\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\b"+
		"\3\2\2\2\u00ba\u00bb\7]\2\2\u00bb\n\3\2\2\2\u00bc\u00bd\7_\2\2\u00bd\f"+
		"\3\2\2\2\u00be\u00bf\7.\2\2\u00bf\16\3\2\2\2\u00c0\u00c1\7c\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2\20\3\2\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7g\2\2\u00c5"+
		"\u00c6\7e\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7t\2\2"+
		"\u00c9\u00ca\7g\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7"+
		"p\2\2\u00cd\u00ce\7f\2\2\u00ce\24\3\2\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7k\2\2\u00d4"+
		"\u00d5\7p\2\2\u00d5\26\3\2\2\2\u00d6\u00d7\7*\2\2\u00d7\30\3\2\2\2\u00d8"+
		"\u00d9\7+\2\2\u00d9\32\3\2\2\2\u00da\u00db\7x\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7k\2\2\u00dd\u00de\7f\2\2\u00de\34\3\2\2\2\u00df\u00e0\7n\2\2\u00e0"+
		"\u00e1\7c\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7v\2\2"+
		"\u00e4\u00e5\7w\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7g\2\2\u00e7\36\3\2"+
		"\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec"+
		"\7i\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7w\2\2\u00ef"+
		"\u00f0\7f\2\2\u00f0\u00f1\7g\2\2\u00f1 \3\2\2\2\u00f2\u00f3\7i\2\2\u00f3"+
		"\u00f4\7t\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7f\2\2\u00f6\"\3\2\2\2\u00f7"+
		"\u00f8\7u\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7|\2\2\u00fa\u00fb\7g\2\2"+
		"\u00fb$\3\2\2\2\u00fc\u00fd\7o\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7r\2"+
		"\2\u00ff&\3\2\2\2\u0100\u0101\7t\2\2\u0101\u0102\7c\2\2\u0102\u0103\7"+
		"f\2\2\u0103\u0104\7k\2\2\u0104\u0105\7q\2\2\u0105(\3\2\2\2\u0106\u0107"+
		"\7c\2\2\u0107\u0108\7o\2\2\u0108\u0109\7o\2\2\u0109\u010a\7q\2\2\u010a"+
		"*\3\2\2\2\u010b\u010c\7h\2\2\u010c\u010d\7t\2\2\u010d\u010e\7w\2\2\u010e"+
		"\u010f\7k\2\2\u010f\u0110\7v\2\2\u0110\u0111\7u\2\2\u0111,\3\2\2\2\u0112"+
		"\u0113\7u\2\2\u0113\u0114\7q\2\2\u0114\u0115\7f\2\2\u0115\u0116\7c\2\2"+
		"\u0116.\3\2\2\2\u0117\u0118\7e\2\2\u0118\u0119\7q\2\2\u0119\u011a\7w\2"+
		"\2\u011a\u011b\7p\2\2\u011b\u011c\7v\2\2\u011c\60\3\2\2\2\u011d\u011e"+
		"\7n\2\2\u011e\u011f\7k\2\2\u011f\u0120\7h\2\2\u0120\u0121\7g\2\2\u0121"+
		"\62\3\2\2\2\u0122\u0123\7-\2\2\u0123\64\3\2\2\2\u0124\u0125\7/\2\2\u0125"+
		"\66\3\2\2\2\u0126\u0127\7,\2\2\u01278\3\2\2\2\u0128\u0129\7\61\2\2\u0129"+
		":\3\2\2\2\u012a\u012b\7\'\2\2\u012b<\3\2\2\2\u012c\u012d\7v\2\2\u012d"+
		"\u012e\7t\2\2\u012e\u012f\7w\2\2\u012f\u0130\7g\2\2\u0130>\3\2\2\2\u0131"+
		"\u0132\7h\2\2\u0132\u0133\7c\2\2\u0133\u0134\7n\2\2\u0134\u0135\7u\2\2"+
		"\u0135\u0136\7g\2\2\u0136@\3\2\2\2\u0137\u0138\7g\2\2\u0138\u0139\7p\2"+
		"\2\u0139\u013a\7p\2\2\u013a\u013b\7g\2\2\u013b\u013c\7o\2\2\u013c\u013d"+
		"\7k\2\2\u013dB\3\2\2\2\u013e\u013f\7k\2\2\u013f\u0140\7u\2\2\u0140D\3"+
		"\2\2\2\u0141\u0142\7p\2\2\u0142\u0143\7q\2\2\u0143\u0144\7t\2\2\u0144"+
		"\u0145\7v\2\2\u0145\u0146\7j\2\2\u0146F\3\2\2\2\u0147\u0148\7u\2\2\u0148"+
		"\u0149\7q\2\2\u0149\u014a\7w\2\2\u014a\u014b\7v\2\2\u014b\u014c\7j\2\2"+
		"\u014cH\3\2\2\2\u014d\u014e\7g\2\2\u014e\u014f\7c\2\2\u014f\u0150\7u\2"+
		"\2\u0150\u0151\7v\2\2\u0151J\3\2\2\2\u0152\u0153\7y\2\2\u0153\u0154\7"+
		"g\2\2\u0154\u0155\7u\2\2\u0155\u0156\7v\2\2\u0156L\3\2\2\2\u0157\u0158"+
		"\7i\2\2\u0158\u0159\7t\2\2\u0159\u015a\7c\2\2\u015a\u015b\7c\2\2\u015b"+
		"\u015c\7n\2\2\u015cN\3\2\2\2\u015d\u015e\7q\2\2\u015e\u015f\7t\2\2\u015f"+
		"P\3\2\2\2\u0160\u0161\7p\2\2\u0161\u0162\7q\2\2\u0162\u0163\7v\2\2\u0163"+
		"R\3\2\2\2\u0164\u0165\7>\2\2\u0165T\3\2\2\2\u0166\u0167\7@\2\2\u0167V"+
		"\3\2\2\2\u0168\u0169\7?\2\2\u0169X\3\2\2\2\u016a\u016b\7f\2\2\u016b\u016c"+
		"\7k\2\2\u016c\u016d\7t\2\2\u016d\u016e\7v\2\2\u016eZ\3\2\2\2\u016f\u0170"+
		"\7t\2\2\u0170\u0171\7q\2\2\u0171\u0172\7e\2\2\u0172\u0173\7m\2\2\u0173"+
		"\\\3\2\2\2\u0174\u0175\7x\2\2\u0175\u0176\7k\2\2\u0176\u0177\7p\2\2\u0177"+
		"\u0178\7g\2\2\u0178\u0179\7u\2\2\u0179^\3\2\2\2\u017a\u017b\7|\2\2\u017b"+
		"\u017c\7q\2\2\u017c\u017d\7o\2\2\u017d\u017e\7d\2\2\u017e\u017f\7k\2\2"+
		"\u017f\u0180\7g\2\2\u0180`\3\2\2\2\u0181\u0182\7r\2\2\u0182\u0183\7n\2"+
		"\2\u0183\u0184\7c\2\2\u0184\u0185\7{\2\2\u0185\u0186\7g\2\2\u0186\u0187"+
		"\7t\2\2\u0187b\3\2\2\2\u0188\u0189\7p\2\2\u0189\u018a\7g\2\2\u018a\u018b"+
		"\7c\2\2\u018b\u018c\7t\2\2\u018c\u018d\7d\2\2\u018d\u018e\7{\2\2\u018e"+
		"d\3\2\2\2\u018f\u0190\7u\2\2\u0190\u0191\7m\2\2\u0191\u0192\7k\2\2\u0192"+
		"\u0193\7r\2\2\u0193f\3\2\2\2\u0194\u0195\7p\2\2\u0195\u0196\7g\2\2\u0196"+
		"\u0197\7z\2\2\u0197\u0198\7v\2\2\u0198h\3\2\2\2\u0199\u019a\7k\2\2\u019a"+
		"\u019b\7h\2\2\u019bj\3\2\2\2\u019c\u019d\7v\2\2\u019d\u019e\7j\2\2\u019e"+
		"\u019f\7g\2\2\u019f\u01a0\7p\2\2\u01a0l\3\2\2\2\u01a1\u01a2\7g\2\2\u01a2"+
		"\u01a3\7n\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7g\2\2\u01a5n\3\2\2\2\u01a6"+
		"\u01a7\7y\2\2\u01a7\u01a8\7j\2\2\u01a8\u01a9\7k\2\2\u01a9\u01aa\7n\2\2"+
		"\u01aa\u01ab\7g\2\2\u01abp\3\2\2\2\u01ac\u01ad\7f\2\2\u01ad\u01ae\7q\2"+
		"\2\u01ae\u01af\7p\2\2\u01af\u01b0\7g\2\2\u01b0r\3\2\2\2\u01b1\u01b2\7"+
		"u\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7v\2\2\u01b4t\3\2\2\2\u01b5\u01b6"+
		"\7f\2\2\u01b6\u01b7\7q\2\2\u01b7v\3\2\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba"+
		"\7q\2\2\u01bax\3\2\2\2\u01bb\u01bc\7e\2\2\u01bc\u01bd\7q\2\2\u01bd\u01be"+
		"\7o\2\2\u01be\u01bf\7r\2\2\u01bf\u01c0\7w\2\2\u01c0\u01c1\7v\2\2\u01c1"+
		"\u01c2\7g\2\2\u01c2z\3\2\2\2\u01c3\u01c4\7o\2\2\u01c4\u01c5\7q\2\2\u01c5"+
		"\u01c6\7x\2\2\u01c6\u01c7\7g\2\2\u01c7|\3\2\2\2\u01c8\u01c9\7u\2\2\u01c9"+
		"\u01ca\7j\2\2\u01ca\u01cb\7q\2\2\u01cb\u01cc\7q\2\2\u01cc\u01cd\7v\2\2"+
		"\u01cd~\3\2\2\2\u01ce\u01cf\7w\2\2\u01cf\u01d0\7u\2\2\u01d0\u01d1\7g\2"+
		"\2\u01d1\u0080\3\2\2\2\u01d2\u01d3\7p\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5"+
		"\7v\2\2\u01d5\u01d6\7j\2\2\u01d6\u01d7\7k\2\2\u01d7\u01d8\7p\2\2\u01d8"+
		"\u01d9\7i\2\2\u01d9\u0082\3\2\2\2\u01da\u01db\7h\2\2\u01db\u01dc\7w\2"+
		"\2\u01dc\u01dd\7p\2\2\u01dd\u01de\7e\2\2\u01de\u01df\7v\2\2\u01df\u01e0"+
		"\7k\2\2\u01e0\u01e1\7q\2\2\u01e1\u01e2\7p\2\2\u01e2\u0084\3\2\2\2\u01e3"+
		"\u01e4\7n\2\2\u01e4\u01e5\7q\2\2\u01e5\u01e6\7e\2\2\u01e6\u01e7\7c\2\2"+
		"\u01e7\u01e8\7n\2\2\u01e8\u0086\3\2\2\2\u01e9\u01ea\7<\2\2\u01ea\u0088"+
		"\3\2\2\2\u01eb\u01ec\7{\2\2\u01ec\u01ed\7q\2\2\u01ed\u01ee\7w\2\2\u01ee"+
		"\u01ef\7t\2\2\u01ef\u008a\3\2\2\2\u01f0\u01f1\7v\2\2\u01f1\u01f2\7w\2"+
		"\2\u01f2\u01f3\7t\2\2\u01f3\u01f4\7p\2\2\u01f4\u008c\3\2\2\2\u01f5\u01f6"+
		"\7d\2\2\u01f6\u01f7\7{\2\2\u01f7\u008e\3\2\2\2\u01f8\u01f9\7f\2\2\u01f9"+
		"\u01fa\7g\2\2\u01fa\u01fb\7h\2\2\u01fb\u01fc\7c\2\2\u01fc\u01fd\7w\2\2"+
		"\u01fd\u01fe\7n\2\2\u01fe\u01ff\7v\2\2\u01ff\u0090\3\2\2\2\u0200\u0201"+
		"\7=\2\2\u0201\u0092\3\2\2\2\u0202\u0203\7y\2\2\u0203\u0204\7j\2\2\u0204"+
		"\u0205\7g\2\2\u0205\u0206\7p\2\2\u0206\u0094\3\2\2\2\u0207\u020c\5\u0099"+
		"M\2\u0208\u020b\5\u0099M\2\u0209\u020b\5\u009bN\2\u020a\u0208\3\2\2\2"+
		"\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u0096\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\5\u009bN"+
		"\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0098\3\2\2\2\u0214\u0215\t\2\2\2\u0215\u009a\3\2\2\2\u0216"+
		"\u0217\4\62;\2\u0217\u009c\3\2\2\2\u0218\u0219\7\61\2\2\u0219\u021a\7"+
		",\2\2\u021a\u021e\3\2\2\2\u021b\u021d\13\2\2\2\u021c\u021b\3\2\2\2\u021d"+
		"\u0220\3\2\2\2\u021e\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0221\3\2"+
		"\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7,\2\2\u0222\u0223\7\61\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0225\bO\2\2\u0225\u009e\3\2\2\2\u0226\u0228\7\17"+
		"\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022a\7\f\2\2\u022a\u022b\3\2\2\2\u022b\u022c\bP\2\2\u022c\u00a0\3\2"+
		"\2\2\u022d\u022f\t\3\2\2\u022e\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\bQ"+
		"\2\2\u0233\u00a2\3\2\2\2\t\2\u020a\u020c\u0212\u021e\u0227\u0230\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}