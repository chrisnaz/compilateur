// Generated from be\u005Cunamur\info\b314\compiler\B314.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link B314Parser}.
 */
public interface B314Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link B314Parser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(B314Parser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(B314Parser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typescalar}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypescalar(B314Parser.TypescalarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typescalar}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypescalar(B314Parser.TypescalarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typearray}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypearray(B314Parser.TypearrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typearray}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypearray(B314Parser.TypearrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarbool}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalarbool(B314Parser.ScalarboolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarbool}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalarbool(B314Parser.ScalarboolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarinteger}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalarinteger(B314Parser.ScalarintegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarinteger}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalarinteger(B314Parser.ScalarintegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarsquare}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void enterScalarsquare(B314Parser.ScalarsquareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarsquare}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 */
	void exitScalarsquare(B314Parser.ScalarsquareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraydecl}
	 * labeled alternative in {@link B314Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArraydecl(B314Parser.ArraydeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arraydecl}
	 * labeled alternative in {@link B314Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArraydecl(B314Parser.ArraydeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link B314Parser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(B314Parser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link B314Parser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(B314Parser.VardeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appeldefonction1}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterAppeldefonction1(B314Parser.Appeldefonction1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code appeldefonction1}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitAppeldefonction1(B314Parser.Appeldefonction1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code plusmoinsexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterPlusmoinsexpr(B314Parser.PlusmoinsexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusmoinsexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitPlusmoinsexpr(B314Parser.PlusmoinsexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code longexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterLongexpr(B314Parser.LongexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code longexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitLongexpr(B314Parser.LongexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lifexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterLifexpr(B314Parser.LifexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lifexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitLifexpr(B314Parser.LifexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableentier}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterVariableentier(B314Parser.VariableentierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableentier}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitVariableentier(B314Parser.VariableentierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expentierpar}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterExpentierpar(B314Parser.ExpentierparContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expentierpar}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitExpentierpar(B314Parser.ExpentierparContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterNumberexpr(B314Parser.NumberexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitNumberexpr(B314Parser.NumberexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprmuldivmod}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterExprmuldivmod(B314Parser.ExprmuldivmodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprmuldivmod}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitExprmuldivmod(B314Parser.ExprmuldivmodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code latexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterLatexpr(B314Parser.LatexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code latexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitLatexpr(B314Parser.LatexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grandsizexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterGrandsizexpr(B314Parser.GrandsizexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grandsizexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitGrandsizexpr(B314Parser.GrandsizexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code itemexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void enterItemexpr(B314Parser.ItemexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code itemexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 */
	void exitItemexpr(B314Parser.ItemexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterNotexpr(B314Parser.NotexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitNotexpr(B314Parser.NotexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appeldefonction2}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterAppeldefonction2(B314Parser.Appeldefonction2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code appeldefonction2}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitAppeldefonction2(B314Parser.Appeldefonction2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code varegalvar}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterVaregalvar(B314Parser.VaregalvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varegalvar}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitVaregalvar(B314Parser.VaregalvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infsupegalexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterInfsupegalexpr(B314Parser.InfsupegalexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infsupegalexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitInfsupegalexpr(B314Parser.InfsupegalexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fctegalvar}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterFctegalvar(B314Parser.FctegalvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fctegalvar}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitFctegalvar(B314Parser.FctegalvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code graalpositionexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterGraalpositionexpr(B314Parser.GraalpositionexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code graalpositionexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitGraalpositionexpr(B314Parser.GraalpositionexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falsexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterFalsexpr(B314Parser.FalsexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falsexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitFalsexpr(B314Parser.FalsexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varegalfct}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterVaregalfct(B314Parser.VaregalfctContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varegalfct}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitVaregalfct(B314Parser.VaregalfctContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableboolean}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterVariableboolean(B314Parser.VariablebooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableboolean}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitVariableboolean(B314Parser.VariablebooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code egalite_boolean}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterEgalite_boolean(B314Parser.Egalite_booleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code egalite_boolean}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitEgalite_boolean(B314Parser.Egalite_booleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterTruexpr(B314Parser.TruexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitTruexpr(B314Parser.TruexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fctegalfct}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterFctegalfct(B314Parser.FctegalfctContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fctegalfct}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitFctegalfct(B314Parser.FctegalfctContext ctx);
	/**
	 * Enter a parse tree produced by the {@code egalite_square}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterEgalite_square(B314Parser.Egalite_squareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code egalite_square}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitEgalite_square(B314Parser.Egalite_squareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprboolpar}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterExprboolpar(B314Parser.ExprboolparContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprboolpar}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitExprboolpar(B314Parser.ExprboolparContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orandexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterOrandexpr(B314Parser.OrandexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orandexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitOrandexpr(B314Parser.OrandexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ennemipositionexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterEnnemipositionexpr(B314Parser.EnnemipositionexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ennemipositionexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitEnnemipositionexpr(B314Parser.EnnemipositionexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprcasepar}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterExprcasepar(B314Parser.ExprcaseparContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprcasepar}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitExprcasepar(B314Parser.ExprcaseparContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dirtexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterDirtexpr(B314Parser.DirtexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dirtexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitDirtexpr(B314Parser.DirtexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rockexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterRockexpr(B314Parser.RockexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rockexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitRockexpr(B314Parser.RockexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vinexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterVinexpr(B314Parser.VinexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vinexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitVinexpr(B314Parser.VinexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zombiexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterZombiexpr(B314Parser.ZombiexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zombiexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitZombiexpr(B314Parser.ZombiexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code playerexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterPlayerexpr(B314Parser.PlayerexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code playerexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitPlayerexpr(B314Parser.PlayerexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ennemiexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterEnnemiexpr(B314Parser.EnnemiexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ennemiexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitEnnemiexpr(B314Parser.EnnemiexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterMapexpr(B314Parser.MapexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitMapexpr(B314Parser.MapexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code radioexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterRadioexpr(B314Parser.RadioexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code radioexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitRadioexpr(B314Parser.RadioexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ammoexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterAmmoexpr(B314Parser.AmmoexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ammoexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitAmmoexpr(B314Parser.AmmoexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fruitsexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterFruitsexpr(B314Parser.FruitsexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fruitsexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitFruitsexpr(B314Parser.FruitsexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sodaexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterSodaexpr(B314Parser.SodaexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sodaexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitSodaexpr(B314Parser.SodaexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nearbyexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterNearbyexpr(B314Parser.NearbyexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nearbyexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitNearbyexpr(B314Parser.NearbyexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appeldefonction3}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterAppeldefonction3(B314Parser.Appeldefonction3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code appeldefonction3}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitAppeldefonction3(B314Parser.Appeldefonction3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code variablecase}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void enterVariablecase(B314Parser.VariablecaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variablecase}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 */
	void exitVariablecase(B314Parser.VariablecaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appelvar}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 */
	void enterAppelvar(B314Parser.AppelvarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appelvar}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 */
	void exitAppelvar(B314Parser.AppelvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appelfonction}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 */
	void enterAppelfonction(B314Parser.AppelfonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appelfonction}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 */
	void exitAppelfonction(B314Parser.AppelfonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expentierdroit}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 */
	void enterExpentierdroit(B314Parser.ExpentierdroitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expentierdroit}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 */
	void exitExpentierdroit(B314Parser.ExpentierdroitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprbooldroit}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 */
	void enterExprbooldroit(B314Parser.ExprbooldroitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprbooldroit}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 */
	void exitExprbooldroit(B314Parser.ExprbooldroitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprcasedroit}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 */
	void enterExprcasedroit(B314Parser.ExprcasedroitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprcasedroit}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 */
	void exitExprcasedroit(B314Parser.ExprcasedroitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprgid}
	 * labeled alternative in {@link B314Parser#exprg}.
	 * @param ctx the parse tree
	 */
	void enterExprgid(B314Parser.ExprgidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprgid}
	 * labeled alternative in {@link B314Parser#exprg}.
	 * @param ctx the parse tree
	 */
	void exitExprgid(B314Parser.ExprgidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprgtab}
	 * labeled alternative in {@link B314Parser#exprg}.
	 * @param ctx the parse tree
	 */
	void enterExprgtab(B314Parser.ExprgtabContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprgtab}
	 * labeled alternative in {@link B314Parser#exprg}.
	 * @param ctx the parse tree
	 */
	void exitExprgtab(B314Parser.ExprgtabContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skipinstruction}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSkipinstruction(B314Parser.SkipinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skipinstruction}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSkipinstruction(B314Parser.SkipinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iftheninstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIftheninstr(B314Parser.IftheninstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iftheninstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIftheninstr(B314Parser.IftheninstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifthenelseinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIfthenelseinstr(B314Parser.IfthenelseinstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifthenelseinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIfthenelseinstr(B314Parser.IfthenelseinstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterWhileinstr(B314Parser.WhileinstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitWhileinstr(B314Parser.WhileinstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSetinstr(B314Parser.SetinstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSetinstr(B314Parser.SetinstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code computeinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterComputeinstr(B314Parser.ComputeinstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code computeinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitComputeinstr(B314Parser.ComputeinstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nextinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterNextinstr(B314Parser.NextinstrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitNextinstr(B314Parser.NextinstrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterMoveaction(B314Parser.MoveactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitMoveaction(B314Parser.MoveactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shootaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterShootaction(B314Parser.ShootactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shootaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitShootaction(B314Parser.ShootactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code useaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterUseaction(B314Parser.UseactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code useaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitUseaction(B314Parser.UseactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code donothingaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterDonothingaction(B314Parser.DonothingactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code donothingaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitDonothingaction(B314Parser.DonothingactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_function}
	 * labeled alternative in {@link B314Parser#fctdecl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_function(B314Parser.Declaration_functionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_function}
	 * labeled alternative in {@link B314Parser#fctdecl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_function(B314Parser.Declaration_functionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code program}
	 * labeled alternative in {@link B314Parser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgram(B314Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code program}
	 * labeled alternative in {@link B314Parser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgram(B314Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whenclause}
	 * labeled alternative in {@link B314Parser#clausewhen}.
	 * @param ctx the parse tree
	 */
	void enterWhenclause(B314Parser.WhenclauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whenclause}
	 * labeled alternative in {@link B314Parser#clausewhen}.
	 * @param ctx the parse tree
	 */
	void exitWhenclause(B314Parser.WhenclauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultclause}
	 * labeled alternative in {@link B314Parser#clausedefault}.
	 * @param ctx the parse tree
	 */
	void enterDefaultclause(B314Parser.DefaultclauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultclause}
	 * labeled alternative in {@link B314Parser#clausedefault}.
	 * @param ctx the parse tree
	 */
	void exitDefaultclause(B314Parser.DefaultclauseContext ctx);
}