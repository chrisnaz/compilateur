// Generated from be\u005Cunamur\info\b314\compiler\B314.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link B314Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface B314Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link B314Parser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(B314Parser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typescalar}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypescalar(B314Parser.TypescalarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typearray}
	 * labeled alternative in {@link B314Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypearray(B314Parser.TypearrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarbool}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarbool(B314Parser.ScalarboolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarinteger}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarinteger(B314Parser.ScalarintegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarsquare}
	 * labeled alternative in {@link B314Parser#scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarsquare(B314Parser.ScalarsquareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraydecl}
	 * labeled alternative in {@link B314Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydecl(B314Parser.ArraydeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link B314Parser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(B314Parser.VardeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appeldefonction1}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppeldefonction1(B314Parser.Appeldefonction1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code plusmoinsexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusmoinsexpr(B314Parser.PlusmoinsexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code longexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongexpr(B314Parser.LongexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lifexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLifexpr(B314Parser.LifexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableentier}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableentier(B314Parser.VariableentierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expentierpar}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpentierpar(B314Parser.ExpentierparContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberexpr(B314Parser.NumberexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprmuldivmod}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprmuldivmod(B314Parser.ExprmuldivmodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code latexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatexpr(B314Parser.LatexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grandsizexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrandsizexpr(B314Parser.GrandsizexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code itemexpr}
	 * labeled alternative in {@link B314Parser#exprent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemexpr(B314Parser.ItemexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotexpr(B314Parser.NotexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appeldefonction2}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppeldefonction2(B314Parser.Appeldefonction2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code varegalvar}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaregalvar(B314Parser.VaregalvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infsupegalexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfsupegalexpr(B314Parser.InfsupegalexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fctegalvar}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctegalvar(B314Parser.FctegalvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code graalpositionexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraalpositionexpr(B314Parser.GraalpositionexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falsexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalsexpr(B314Parser.FalsexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varegalfct}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaregalfct(B314Parser.VaregalfctContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableboolean}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableboolean(B314Parser.VariablebooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code egalite_boolean}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEgalite_boolean(B314Parser.Egalite_booleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruexpr(B314Parser.TruexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fctegalfct}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFctegalfct(B314Parser.FctegalfctContext ctx);
	/**
	 * Visit a parse tree produced by the {@code egalite_square}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEgalite_square(B314Parser.Egalite_squareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprboolpar}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprboolpar(B314Parser.ExprboolparContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orandexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrandexpr(B314Parser.OrandexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ennemipositionexpr}
	 * labeled alternative in {@link B314Parser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnnemipositionexpr(B314Parser.EnnemipositionexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprcasepar}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprcasepar(B314Parser.ExprcaseparContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dirtexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirtexpr(B314Parser.DirtexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rockexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRockexpr(B314Parser.RockexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vinexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVinexpr(B314Parser.VinexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zombiexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZombiexpr(B314Parser.ZombiexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code playerexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayerexpr(B314Parser.PlayerexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ennemiexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnnemiexpr(B314Parser.EnnemiexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapexpr(B314Parser.MapexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code radioexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadioexpr(B314Parser.RadioexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ammoexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmmoexpr(B314Parser.AmmoexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fruitsexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFruitsexpr(B314Parser.FruitsexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sodaexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSodaexpr(B314Parser.SodaexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nearbyexpr}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNearbyexpr(B314Parser.NearbyexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appeldefonction3}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppeldefonction3(B314Parser.Appeldefonction3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code variablecase}
	 * labeled alternative in {@link B314Parser#exprcase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablecase(B314Parser.VariablecaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appelvar}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppelvar(B314Parser.AppelvarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appelfonction}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppelfonction(B314Parser.AppelfonctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expentierdroit}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpentierdroit(B314Parser.ExpentierdroitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprbooldroit}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprbooldroit(B314Parser.ExprbooldroitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprcasedroit}
	 * labeled alternative in {@link B314Parser#exprd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprcasedroit(B314Parser.ExprcasedroitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprgid}
	 * labeled alternative in {@link B314Parser#exprg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprgid(B314Parser.ExprgidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprgtab}
	 * labeled alternative in {@link B314Parser#exprg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprgtab(B314Parser.ExprgtabContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skipinstruction}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipinstruction(B314Parser.SkipinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iftheninstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIftheninstr(B314Parser.IftheninstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifthenelseinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthenelseinstr(B314Parser.IfthenelseinstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileinstr(B314Parser.WhileinstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetinstr(B314Parser.SetinstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code computeinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeinstr(B314Parser.ComputeinstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nextinstr}
	 * labeled alternative in {@link B314Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextinstr(B314Parser.NextinstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveaction(B314Parser.MoveactionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shootaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShootaction(B314Parser.ShootactionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code useaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseaction(B314Parser.UseactionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code donothingaction}
	 * labeled alternative in {@link B314Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDonothingaction(B314Parser.DonothingactionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaration_function}
	 * labeled alternative in {@link B314Parser#fctdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_function(B314Parser.Declaration_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code program}
	 * labeled alternative in {@link B314Parser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(B314Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whenclause}
	 * labeled alternative in {@link B314Parser#clausewhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenclause(B314Parser.WhenclauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultclause}
	 * labeled alternative in {@link B314Parser#clausedefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultclause(B314Parser.DefaultclauseContext ctx);
}