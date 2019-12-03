package be.unamur.info.b314.compiler.main;

import be.unamur.info.b314.compiler.B314BaseVisitor;
import be.unamur.info.b314.compiler.B314Parser;

import java.util.List;

/**
 * The PCodeVisitor a method generates PCode for various contexts, depending on
 * which context is being visited by the visitor. The first context to be
 * visited by the program is the ProgramContext.
 * @author Valentin Eggermont - valentin.eggermont@student.unamur.be
 * @author William Turatsinze - william.turatsinze@student.unamur.be
 * @author Thomas Vanhaeren - thomas.vanhaeren@student.unamur.be
 */
public class PCodeVisitor extends B314BaseVisitor<Object> {

    private final SymTableFiller symTable;
    private final PCodePrinter printer;
    private Scope scopeTreated;
    private int context;
    private int nbrIf;
    private int nbrWhile;

    /**
     * Initialize PCodeVisitor.
     * @param symTable Symbol Table
     * @param printer PCode Printer
     */
    public PCodeVisitor(SymTableFiller symTable, PCodePrinter printer) {
        this.symTable = symTable;
        this.printer = printer;
        scopeTreated = symTable.global;
        this.context = 0;
        this.nbrIf = 0;
        this.nbrWhile = 0;
    }

    /**
     * Load Environment Variables and store them.
     */
    private void chargeVarEnvir()
    {
        for (int i=0;i<99;i++){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, i);
            printer.printRead();
            printer.printStore(PCodePrinter.PCodeTypes.Int);
        }

    }

    /**
     * Load environment variables, print Unconditional Jumps, Print Definition labels and visit program.
     * @param ctx Program Context
     * @return null.
     */
    @Override public Object visitProgram(B314Parser.ProgramContext ctx) {
        //Reserve variable space (+99 for environment variables)
        printer.printSetStackPointer(scopeTreated.getVarCount()+99);
        chargeVarEnvir();
        printer.printUnconditionalJump("begin");
        for(int i =0;i<ctx.fctdecl().size(); i++){
            visitDeclaration_function((B314Parser.Declaration_functionContext) ctx.fctdecl(i));
        }
        printer.printDefineLabel("begin");
        for(int i =0;i<ctx.vardecl().size(); i++){
            visitVardecl(ctx.vardecl(i));
        }
        this.context++;
        for(int i = 0; i<ctx.clausewhen().size();i++){
            visitWhenclause((B314Parser.WhenclauseContext) ctx.clausewhen(i));
        }
        visitDefaultclause((B314Parser.DefaultclauseContext) ctx.clausedefault());
        printer.printDefineLabel("end");
        printer.printPrin();
        printer.printStop2();
        return null;
    }

    /**
     * Load variable address in memory, initialize it to 0, store the value.
     * @param ctx Variable Declaration Context
     * @return null
     */
    @Override public Object visitVardecl(B314Parser.VardeclContext ctx){
        String varName = ctx.ID().getText();
        String type;
        VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(varName);
        if(sym.getType() instanceof ScalarType) {
            type = (sym.getType()).getName();
            switch (type) {
                case "boolean":
                    printer.printLoadAdress(PCodePrinter.PCodeTypes.Bool, context-sym.getContext(), sym.getAdresse());
                    printer.printLoadConstant(PCodePrinter.PCodeTypes.Bool, 0);
                    printer.printStore(PCodePrinter.PCodeTypes.Bool);
                    break;
                 case "integer":
                     printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, context-sym.getContext(), sym.getAdresse());
                     printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0);
                     printer.printStore(PCodePrinter.PCodeTypes.Int);
                     break;
                 case "square":
                     printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, context-sym.getContext(), sym.getAdresse());
                     printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0);
                     printer.printStore(PCodePrinter.PCodeTypes.Int);
                     break;

                }

        }else{
            ArrayType array_type = (ArrayType) sym.getType();
            type = array_type.getTypeBase().getName();
            int[] dimensions = array_type.getTailleTab();
            int total = 1;
            for(int i = 0; i<dimensions.length; i++){
                total = total * dimensions[i];
            }
            switch (type){
                case "boolean":
                    for(int i = 0; i < total; i++){
                        printer.printLoadAdress(PCodePrinter.PCodeTypes.Bool, context-sym.getContext(), sym.getAdresse()+i);
                        printer.printLoadConstant(PCodePrinter.PCodeTypes.Bool, 0);
                        printer.printStore(PCodePrinter.PCodeTypes.Bool);
                    }
                    break;

                case "integer":
                    for(int i = 0; i < total; i++){
                        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, context-sym.getContext(), sym.getAdresse()+i);
                        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0);
                        printer.printStore(PCodePrinter.PCodeTypes.Int);
                    }
                    break;

                case "square":
                    for(int i = 0; i < total; i++){
                        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, context-sym.getContext(), sym.getAdresse()+i);
                        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 0);
                        printer.printStore(PCodePrinter.PCodeTypes.Int);
                    }
                    break;
            }

        }
        return null;
    }

    /**
     * Generates PCode for a function declaration.
     * @param ctx Function Declaration Context
     * @return null
     */
    @Override public Object visitDeclaration_function(B314Parser.Declaration_functionContext ctx)
    {
        scopeTreated = ((GlobalScope)scopeTreated).getChildScope().get(ctx.ID().getText()+"Scope");
        context = context+2;
        printer.printDefineLabel(ctx.ID().getText());
        if(ctx.VOID()!=null) {
            printer.printSetStackPointer(ctx.vardecl().size()+5);
            super.visitDeclaration_function(ctx);
            printer.printReturnFromProcedure();
        }else{
            printer.printSetStackPointer(ctx.vardecl().size()+5);
            for(int i = 0; i< ctx.instruction().size();i++){
                    visitInstruction(ctx.instruction(i));
            }

            printer.printReturnFromFunction();

        }
        scopeTreated = scopeTreated.getEnclosingScope();
        context = context-2;
        return null;

    }

    /**
     * Call different methods for different types of Instrunction Instances.
     * @param ctx Instruction Context
     */
    private void visitInstruction(B314Parser.InstructionContext ctx) {
        if(ctx instanceof B314Parser.SkipinstructionContext){
            visitSkipinstruction((B314Parser.SkipinstructionContext) ctx);
        }
        if(ctx instanceof B314Parser.IftheninstrContext){
            visitIftheninstr((B314Parser.IftheninstrContext) ctx);
        }
        if(ctx instanceof B314Parser.IfthenelseinstrContext){
            visitIfthenelseinstr((B314Parser.IfthenelseinstrContext) ctx);
        }
        if(ctx instanceof B314Parser.WhileinstrContext){
            visitWhileinstr((B314Parser.WhileinstrContext) ctx);
        }
        if(ctx instanceof B314Parser.SetinstrContext){
            visitSetinstr((B314Parser.SetinstrContext) ctx);
        }
        if(ctx instanceof B314Parser.ComputeinstrContext){
            visitComputeinstr((B314Parser.ComputeinstrContext) ctx);
        }
        if(ctx instanceof B314Parser.NextinstrContext){
            visitNextinstr((B314Parser.NextinstrContext) ctx);
        }
    }

    /**
     * Generate PCode for While Instruction.
     * @param ctx While Instruction Context
     * @return null
     */
    @Override public Object visitWhileinstr(B314Parser.WhileinstrContext ctx)
    {
        this.nbrWhile++;
        int n = this.nbrWhile;
        printer.printDefineLabel("while_"+ctx.exprbool().getText()+String.valueOf(n));
        calculeExprBool(ctx.exprbool());
        printer.printFalseJump("endWhile_"+ctx.exprbool().getText()+String.valueOf(n));
        for(int i = 0; i < ctx.instruction().size(); i++){
            visitInstruction(ctx.instruction(i));
        }
        printer.printUnconditionalJump("while_"+ctx.exprbool().getText()+String.valueOf(n));
        printer.printDefineLabel("endWhile_"+ctx.exprbool().getText()+String.valueOf(n));
        return null;
    }

    /**
     * Generate PCode a When Clause.
     * @param ctx When Clause Context
     * @return null
     */
    @Override public Object visitWhenclause(B314Parser.WhenclauseContext ctx)
    {
        scopeTreated = ((GlobalScope)scopeTreated).getChildScope().get(ctx.exprbool().getText()+"_WhenScope");
        calculeExprBool(ctx.exprbool());
        printer.printFalseJump("end_"+ctx.exprbool().getText());
        printer.printDefineLabel(ctx.exprbool().getText());
        printer.printMarkStack(context-1);
        printer.printCallUserProcedure(0, ctx.exprbool().getText()+"Body");
        printer.printUnconditionalJump("end");
        printer.printDefineLabel(ctx.exprbool().getText()+"Body");
        printer.printSetStackPointer(5+ctx.vardecl().size());
        super.visitWhenclause(ctx);
        if(has_noReturn(ctx.instruction())){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,0,0);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
            printer.printStore(PCodePrinter.PCodeTypes.Int);
        }
        printer.printReturnFromFunction();
        printer.printDefineLabel("end_"+ctx.exprbool().getText());
        scopeTreated = scopeTreated.getEnclosingScope();
        return null;
    }

    /**
     * Generate PCode for the Default Clause.
     * @param ctx Default Clause Context
     * @return null
     */
    @Override public Object visitDefaultclause(B314Parser.DefaultclauseContext ctx)
    {
        scopeTreated = ((GlobalScope)scopeTreated).getChildScope().get("Defaultclause_Scope");
        printer.printDefineLabel("byDefault");
        printer.printMarkStack(context-1);
        printer.printCallUserProcedure(0, "byDefaultBody");
        printer.printUnconditionalJump("end");
        printer.printDefineLabel("byDefaultBody");
        printer.printSetStackPointer(5+ctx.vardecl().size());
        super.visitDefaultclause(ctx);
        if(has_noReturn(ctx.instruction())){
            printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,0,0);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
            printer.printStore(PCodePrinter.PCodeTypes.Int);
            printer.printReturnFromFunction();
        }
        scopeTreated = scopeTreated.getEnclosingScope();
        return null;
    }

    /**
     * Checks if an instruction from a list has next instructions.
     * @param list Instruction Context List
     * @return false if any instruction from the input list has a next instruction; true otherwise.
     */
    private boolean has_noReturn(List<B314Parser.InstructionContext> list)
    {
        for(int i = 0;i<list.size();i++){
            if(list.get(i) instanceof B314Parser.NextinstrContext){
                return false;
            }
        }
        return true;
    }

    /**
     * Visits the context of the Next Instruction and prints the return.
     * @param ctx Next Instruction Context
     * @return null
     */
    @Override public Object visitNextinstr(B314Parser.NextinstrContext ctx)
    {
        super.visitNextinstr(ctx);
        printer.printReturnFromFunction();
        return null;
    }

    /**
     * Loads address, Loads constant and stores it.
     * @param ctx Do Nothing Action Context
     * @return null
     */
    @Override public Object visitDonothingaction(B314Parser.DonothingactionContext ctx)
    {
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,0,0);
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
        printer.printStore(PCodePrinter.PCodeTypes.Int);
        super.visitDonothingaction(ctx);
        return null;
    }

    /**
     * Loads different constants depending on which the context is North (1), South (2), East (3), West (4) and stores into memory.
     * @param ctx Move Action Context
     * @return null
     */
    @Override public Object visitMoveaction(B314Parser.MoveactionContext ctx)
    {
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0,0);
        if(ctx.NORTH()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
        }
        if(ctx.EAST()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,2);
        }
        if(ctx.SOUTH()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,3);
        }
        if(ctx.WEST()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,4);
        }
        printer.printStore(PCodePrinter.PCodeTypes.Int);
        super.visitMoveaction(ctx);
        return null;
    }

    /**
     * Loads different constants depending on whether the Context is North (5), South (6), East (7), West (8) and stores into memory.
     * @param ctx Shoot Action Context
     * @return null
     */
    @Override public Object visitShootaction(B314Parser.ShootactionContext ctx)
    {
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,0,0);
        if(ctx.NORTH()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 5);
        }
        if(ctx.EAST()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,6);
        }
        if(ctx.SOUTH()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,7);
        }
        if(ctx.WEST()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,8);
        }
        printer.printStore(PCodePrinter.PCodeTypes.Int);
        super.visitShootaction(ctx);
        return null;
    }

    /**
     * Loads different constants depending on whether the Context is a Map (9), Radio (10), Fruits (11), Soda (12) and stores into memory.
     * @param ctx Use Action Context
     * @return null
     */
    @Override public Object visitUseaction(B314Parser.UseactionContext ctx)
    {
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int,0,0);
        if(ctx.MAP()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 9);
        }
        if(ctx.RADIO()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,10);
        }
        if(ctx.FRUITS()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,11);
        }
        if(ctx.SODA()!= null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,12);
        }
        printer.printStore(PCodePrinter.PCodeTypes.Int);
        super.visitUseaction(ctx);
        return null;
    }

    /**
     * Generates PCode for a Set Instruction.
     * @param ctx Set Instruction Context
     * @return null
     */
    @Override public Object visitSetinstr(B314Parser.SetinstrContext ctx)
    {
        Type type;
        if(ctx.exprg() instanceof B314Parser.ExprgidContext){
            try{
                VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(((B314Parser.ExprgidContext)ctx.exprg()).ID().getText());
                type = sym.getType();
                visitExprgid((B314Parser.ExprgidContext) ctx.exprg());
            }catch (Exception e){
                Symbol sym = scopeTreated.resolve(((B314Parser.ExprgidContext)ctx.exprg()).ID().getText());
                type = sym.getType();
                if(type.getName().equals("boolean")){
                    printer.printLoadAdress(PCodePrinter.PCodeTypes.Bool, 0, 0);
                }else {
                    printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, 0, 0);
                }
            }
        }else{
            VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(((B314Parser.ExprgtabContext)ctx.exprg()).ID().getText());
            ArrayType type2 = (ArrayType) sym.getType();
            type = type2.getTypeBase();
            visitExprgtab((B314Parser.ExprgtabContext) ctx.exprg());
        }
        if(ctx.exprd() instanceof B314Parser.AppelvarContext){
            visitAppelvar((B314Parser.AppelvarContext) ctx.exprd());
        }
        if(ctx.exprd() instanceof B314Parser.AppelfonctionContext){
            visitAppelfonction((B314Parser.AppelfonctionContext) ctx.exprd());
        }
        if(ctx.exprd() instanceof B314Parser.ExprbooldroitContext){
            calculeExprBool(((B314Parser.ExprbooldroitContext)ctx.exprd()).exprbool());
        }
        if(ctx.exprd() instanceof B314Parser.ExpentierdroitContext){
            calculeExprEnt(((B314Parser.ExpentierdroitContext)ctx.exprd()).exprent());
        }
        if(ctx.exprd() instanceof B314Parser.ExprcasedroitContext){
            calculeExprSquare(((B314Parser.ExprcasedroitContext)ctx.exprd()).exprcase());
        }
        PCodePrinter.PCodeTypes tPCode;
        switch(type.getName()){
            case "integer":
                tPCode = PCodePrinter.PCodeTypes.Int;
                break;

            case "square":
                tPCode = PCodePrinter.PCodeTypes.Int;
                break;

            case "boolean":
                tPCode = PCodePrinter.PCodeTypes.Bool;
                break;

            default:
                tPCode = PCodePrinter.PCodeTypes.Int;
                break;
        }
        printer.printStore(tPCode);
        return null;
    }

    /**
     * Visits what is placed after the Compute Instruction and prints a Pop.
     * @param ctx Compute Instruction Context
     * @return null
     */
    @Override public Object visitComputeinstr(B314Parser.ComputeinstrContext ctx)
    {
        super.visitComputeinstr(ctx);
        printer.printPop();
        return null;
    }

    /*@Override public Object visitExpentierdroit(B314Parser.ExpentierdroitContext ctx)
    {
        super.visitExpentierdroit(ctx);
        return null;
    }*/

    /**
     * Visits different boolean Expressions depending on the context.
     * @param ctx Boolean Expression Context.
     */
    private void calculeExprBool(B314Parser.ExprboolContext ctx) {
        if(ctx instanceof B314Parser.ExprboolparContext){
            visitExprboolpar((B314Parser.ExprboolparContext) ctx);
        }
        if(ctx instanceof B314Parser.TruexprContext){
            visitTruexpr((B314Parser.TruexprContext) ctx);
        }
        if(ctx instanceof B314Parser.FalsexprContext){
            visitFalsexpr((B314Parser.FalsexprContext) ctx);
        }
        if(ctx instanceof B314Parser.NotexprContext){
            visitNotexpr((B314Parser.NotexprContext) ctx);
        }
        if(ctx instanceof B314Parser.EnnemipositionexprContext){
            visitEnnemipositionexpr((B314Parser.EnnemipositionexprContext) ctx);
        }
        if(ctx instanceof B314Parser.GraalpositionexprContext){
            visitGraalpositionexpr((B314Parser.GraalpositionexprContext) ctx);
        }
        if(ctx instanceof B314Parser.VaregalvarContext){
            visitVaregalvar((B314Parser.VaregalvarContext) ctx);
        }
        if(ctx instanceof B314Parser.VaregalfctContext){
            visitVaregalfct((B314Parser.VaregalfctContext) ctx);
        }
        if(ctx instanceof B314Parser.FctegalvarContext){
            visitFctegalvar((B314Parser.FctegalvarContext) ctx);
        }
        if(ctx instanceof B314Parser.FctegalfctContext){
            visitFctegalfct((B314Parser.FctegalfctContext) ctx);
        }
        if(ctx instanceof B314Parser.InfsupegalexprContext){
            visitInfsupegalexpr((B314Parser.InfsupegalexprContext) ctx);
        }
        if(ctx instanceof B314Parser.Egalite_booleanContext){
            visitEgalite_boolean((B314Parser.Egalite_booleanContext) ctx);
        }
        if(ctx instanceof B314Parser.Egalite_squareContext){
            visitEgalite_square((B314Parser.Egalite_squareContext) ctx);
        }
        if(ctx instanceof B314Parser.OrandexprContext){
            visitOrandexpr((B314Parser.OrandexprContext) ctx);
        }
        if(ctx instanceof B314Parser.Appeldefonction2Context){
            visitAppeldefonction2((B314Parser.Appeldefonction2Context) ctx);
        }
        if(ctx instanceof B314Parser.VariablebooleanContext){
            visitVariableboolean((B314Parser.VariablebooleanContext) ctx);
        }
    }

    /**
     * Calls Boolean Expression Calculator Method. Calculates the boolean expression present between parenthesis.
     * @param ctx Boolean Expression par Context
     * @return null
     */
    @Override public Object visitExprboolpar(B314Parser.ExprboolparContext ctx)
    {
        calculeExprBool(ctx.exprbool());
        return null;
    }

    /**
     * Loads Constant for a True Boolean Expression.
     * @param ctx True Boolean Expression Context
     * @return null
     */
    @Override public Object visitTruexpr(B314Parser.TruexprContext ctx)
    {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Bool, 1);
        return null;
    }

    /**
     * Loads Constant for a False Boolean Expression.
     * @param ctx False Boolean Expression Context
     * @return null
     */
    @Override public Object visitFalsexpr(B314Parser.FalsexprContext ctx)
    {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Bool, 0);
        return null;
    }

    /**
     * Calculates the Boolean Expression for a Not Context and prints.
     * @param ctx Not Expression Context
     * @return null
     */
    @Override public Object visitNotexpr(B314Parser.NotexprContext ctx)
    {
        B314Parser.NotexprContext ctx_temp = ctx;
        calculeExprBool(ctx_temp.exprbool());
        printer.printNot();
        return null;
    }

    /**
     * Loads a different memory address depending on whether the enemy is facing N, S, E, W and loads constant.
     * @param ctx Enemy Position Context
     * @return null
     */
    @Override public Object visitEnnemipositionexpr(B314Parser.EnnemipositionexprContext ctx)
    {
        if(ctx.NORTH() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int, context, 9);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        }
        if(ctx.EAST() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int, context, 10);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        }
        if(ctx.SOUTH() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int, context, 11);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        }
        if(ctx.WEST() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int, context, 12);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        }
        return null;
    }

    /**
     * Loads a different memory address depending on whether the Grail is facing N, S, E, W and loads constant.
     * @param ctx Grail Position Context
     * @return null
     */
    @Override public Object visitGraalpositionexpr(B314Parser.GraalpositionexprContext ctx)
    {
        if(ctx.NORTH() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int, context, 13);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        }
        if(ctx.EAST() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int, context, 14);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        }
        if(ctx.SOUTH() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int, context, 15);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        }
        if(ctx.WEST() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int, context, 16);
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        }
        return null;
    }

    /**
     * Generates PCode for the case when a Variable equals Variable.
     * @param ctx Variable equals Variable Context
     * @return null
     */
    @Override public Object visitVaregalvar(B314Parser.VaregalvarContext ctx)
    {
        if(ctx.exprg(0) instanceof B314Parser.ExprgidContext) {
            B314Parser.ExprgidContext ctx_temp = (B314Parser.ExprgidContext) ctx.exprg(0);
            VariableSymbol sym1 = (VariableSymbol) scopeTreated.resolve(ctx_temp.ID().getText());
            PCodePrinter.PCodeTypes type;
            switch (sym1.getType().getName()) {
                case "boolean":
                    type = PCodePrinter.PCodeTypes.Bool;
                    break;

                case "integer":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "square":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                default:
                    type = PCodePrinter.PCodeTypes.Int;
                    break;
            }
            if (ctx.exprg(1) instanceof B314Parser.ExprgidContext) {
                B314Parser.ExprgidContext ctx_temp2 = (B314Parser.ExprgidContext) ctx.exprg(1);
                VariableSymbol sym2 = (VariableSymbol) scopeTreated.resolve(ctx_temp2.ID().getText());
                printer.printLoad(type, context - sym1.getContext(), sym1.getAdresse());
                printer.printLoad(type, context - sym2.getContext(), sym2.getAdresse());
            } else {
                printer.printLoad(type, context - sym1.getContext(), sym1.getAdresse());
                B314Parser.ExprgtabContext ctx_temp2 = (B314Parser.ExprgtabContext) ctx.exprg(1);
                VariableSymbol sym2 = (VariableSymbol) scopeTreated.resolve(ctx_temp2.ID().getText());
                printer.printLoadAdress(type, context - sym2.getContext(), sym2.getAdresse());
                ArrayType arrayT = (ArrayType) sym2.getType();
                if (arrayT.getTailleTab().length > 1) {
                    calculeExprEnt(ctx_temp2.exprent(0));
                    printer.printIndexedAdressComputation(arrayT.getTailleTab()[1]);
                    calculeExprEnt(ctx_temp2.exprent(1));
                    printer.printIndexedAdressComputation(1);
                } else {
                    calculeExprEnt(ctx_temp2.exprent(0));
                    printer.printIndexedAdressComputation(1);
                }
                printer.printIndexedFetch(type);
            }
            printer.printEqualsValues(type);
        }else{
            B314Parser.ExprgtabContext ctx_temp = (B314Parser.ExprgtabContext) ctx.exprg(0);
            VariableSymbol sym1 = (VariableSymbol) scopeTreated.resolve(ctx_temp.ID().getText());
            PCodePrinter.PCodeTypes type;
            ArrayType arrayT = (ArrayType) sym1.getType();
            switch (arrayT.getTypeBase().getName()) {
                case "boolean":
                    type = PCodePrinter.PCodeTypes.Bool;
                    break;

                case "integer":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "square":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                default:
                    type = PCodePrinter.PCodeTypes.Int;
                    break;
            }
            printer.printLoadAdress(type, context - sym1.getContext(), sym1.getAdresse());
            if (arrayT.getTailleTab().length > 1) {
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(arrayT.getTailleTab()[1]);
                calculeExprEnt(ctx_temp.exprent(1));
                printer.printIndexedAdressComputation(1);
            } else {
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(1);
            }
            printer.printIndexedFetch(type);
            if (ctx.exprg(1) instanceof B314Parser.ExprgidContext) {
                B314Parser.ExprgidContext ctx_temp2 = (B314Parser.ExprgidContext) ctx.exprg(1);
                VariableSymbol sym2 = (VariableSymbol) scopeTreated.resolve(ctx_temp2.ID().getText());
                printer.printLoad(type, context - sym2.getContext(), sym2.getAdresse());
            } else {
                B314Parser.ExprgtabContext ctx_temp2 = (B314Parser.ExprgtabContext) ctx.exprg(1);
                VariableSymbol sym2 = (VariableSymbol) scopeTreated.resolve(ctx_temp2.ID().getText());
                printer.printLoadAdress(type, context - sym2.getContext(), sym2.getAdresse());
                ArrayType arrayT2 = (ArrayType) sym2.getType();
                if (arrayT2.getTailleTab().length > 1) {
                    calculeExprEnt(ctx_temp2.exprent(0));
                    printer.printIndexedAdressComputation(arrayT.getTailleTab()[1]);
                    calculeExprEnt(ctx_temp2.exprent(1));
                    printer.printIndexedAdressComputation(1);
                } else {
                    calculeExprEnt(ctx_temp2.exprent(0));
                    printer.printIndexedAdressComputation(1);
                }
                printer.printIndexedFetch(type);
            }
            printer.printEqualsValues(type);

        }
        return null;
    }

    /**
     * Generate PCode for a case when a Variable equals a function.
     * @param ctx Variable equals Function Context
     * @return null
     */
    @Override public Object visitVaregalfct(B314Parser.VaregalfctContext ctx)
    {
        if(ctx.exprg() instanceof B314Parser.ExprgidContext) {
            B314Parser.ExprgidContext ctx_temp = (B314Parser.ExprgidContext) ctx.exprg();
            VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(ctx_temp.ID().getText());
            PCodePrinter.PCodeTypes type;
            switch (sym.getType().getName()) {
                case "boolean":
                    type = PCodePrinter.PCodeTypes.Bool;
                    break;

                case "integer":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "square":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                default:
                    type = PCodePrinter.PCodeTypes.Int;
                    break;
            }
            printer.printLoad(type, context - sym.getContext(), sym.getAdresse());
            printer.printMarkStack(context-1);
            for(int i = 0; i < ctx.exprd().size();i++){
                if(ctx.exprd(i) instanceof B314Parser.AppelvarContext){
                    visitAppelvar((B314Parser.AppelvarContext) ctx.exprd(i));
                }
                if(ctx.exprd(i) instanceof B314Parser.ExpentierdroitContext){
                    B314Parser.ExpentierdroitContext ctx_temp2 = (B314Parser.ExpentierdroitContext) ctx.exprd(i);
                    calculeExprEnt(ctx_temp2.exprent());
                }
                if(ctx.exprd(i) instanceof B314Parser.ExprbooldroitContext){
                    B314Parser.ExprbooldroitContext ctx_temp2 = (B314Parser.ExprbooldroitContext) ctx.exprd(i);
                    calculeExprBool(ctx_temp2.exprbool());
                }
                if(ctx.exprd(i) instanceof B314Parser.ExprcasedroitContext){
                    B314Parser.ExprcasedroitContext ctx_temp2 = (B314Parser.ExprcasedroitContext) ctx.exprd(i);
                    calculeExprSquare(ctx_temp2.exprcase());
                }
                if(ctx.exprd(i) instanceof B314Parser.AppelfonctionContext){
                    visitAppelfonction((B314Parser.AppelfonctionContext) ctx.exprd(i));
                }

            }
            printer.printCallUserProcedure(ctx.exprd().size(), ctx.ID().getText());
            printer.printEqualsValues(type);
        }else{
            B314Parser.ExprgtabContext ctx_temp = (B314Parser.ExprgtabContext) ctx.exprg();
            VariableSymbol sym1 = (VariableSymbol) scopeTreated.resolve(ctx_temp.ID().getText());
            PCodePrinter.PCodeTypes type;
            ArrayType arrayT = (ArrayType) sym1.getType();
            switch (arrayT.getTypeBase().getName()) {
                case "boolean":
                    type = PCodePrinter.PCodeTypes.Bool;
                    break;

                case "integer":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "square":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                default:
                    type = PCodePrinter.PCodeTypes.Int;
                    break;
            }
            printer.printLoadAdress(type, context - sym1.getContext(), sym1.getAdresse());
            if (arrayT.getTailleTab().length > 1) {
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(arrayT.getTailleTab()[1]);
                calculeExprEnt(ctx_temp.exprent(1));
                printer.printIndexedAdressComputation(1);
            } else {
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(1);
            }
            printer.printIndexedFetch(type);
            printer.printMarkStack(context-1);
            for(int i = 0; i < ctx.exprd().size();i++){
                if(ctx.exprd(i) instanceof B314Parser.AppelvarContext){
                    visitAppelvar((B314Parser.AppelvarContext) ctx.exprd(i));
                }
                if(ctx.exprd(i) instanceof B314Parser.ExpentierdroitContext){
                    B314Parser.ExpentierdroitContext ctx_temp2 = (B314Parser.ExpentierdroitContext) ctx.exprd(i);
                    calculeExprEnt(ctx_temp2.exprent());
                }
                if(ctx.exprd(i) instanceof B314Parser.ExprbooldroitContext){
                    B314Parser.ExprbooldroitContext ctx_temp2 = (B314Parser.ExprbooldroitContext) ctx.exprd(i);
                    calculeExprBool(ctx_temp2.exprbool());
                }
                if(ctx.exprd(i) instanceof B314Parser.ExprcasedroitContext){
                    B314Parser.ExprcasedroitContext ctx_temp2 = (B314Parser.ExprcasedroitContext) ctx.exprd(i);
                    calculeExprSquare(ctx_temp2.exprcase());
                }
                if(ctx.exprd(i) instanceof B314Parser.AppelfonctionContext){
                    visitAppelfonction((B314Parser.AppelfonctionContext) ctx.exprd(i));
                }

            }
            printer.printCallUserProcedure(ctx.exprd().size(), ctx.ID().getText());
            printer.printEqualsValues(type);
        }
        return null;
    }

    /**
     * Generates PCode for the case when a Function equals a Variable.
     * @param ctx Function equals Variable Context
     * @return null
     */
    @Override public Object visitFctegalvar(B314Parser.FctegalvarContext ctx)
    {
        if(ctx.exprg() instanceof B314Parser.ExprgidContext) {
            B314Parser.ExprgidContext ctx_temp = (B314Parser.ExprgidContext) ctx.exprg();
            VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(ctx_temp.ID().getText());
            PCodePrinter.PCodeTypes type;
            switch (sym.getType().getName()) {
                case "boolean":
                    type = PCodePrinter.PCodeTypes.Bool;
                    break;

                case "integer":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "square":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                default:
                    type = PCodePrinter.PCodeTypes.Int;
                    break;
            }
            printer.printLoad(type, context - sym.getContext(), sym.getAdresse());
            printer.printMarkStack(context-1);
            for(int i = 0; i < ctx.exprd().size();i++){
                if(ctx.exprd(i) instanceof B314Parser.AppelvarContext){
                    visitAppelvar((B314Parser.AppelvarContext) ctx.exprd(i));
                }
                if(ctx.exprd(i) instanceof B314Parser.ExpentierdroitContext){
                    B314Parser.ExpentierdroitContext ctx_temp2 = (B314Parser.ExpentierdroitContext) ctx.exprd(i);
                    calculeExprEnt(ctx_temp2.exprent());
                }
                if(ctx.exprd(i) instanceof B314Parser.ExprbooldroitContext){
                    B314Parser.ExprbooldroitContext ctx_temp2 = (B314Parser.ExprbooldroitContext) ctx.exprd(i);
                    calculeExprBool(ctx_temp2.exprbool());
                }
                if(ctx.exprd(i) instanceof B314Parser.ExprcasedroitContext){
                    B314Parser.ExprcasedroitContext ctx_temp2 = (B314Parser.ExprcasedroitContext) ctx.exprd(i);
                    calculeExprSquare(ctx_temp2.exprcase());
                }
                if(ctx.exprd(i) instanceof B314Parser.AppelfonctionContext){
                    visitAppelfonction((B314Parser.AppelfonctionContext) ctx.exprd(i));
                }

            }
            printer.printCallUserProcedure(ctx.exprd().size(), ctx.ID().getText());
            printer.printEqualsValues(type);
        }else{
            B314Parser.ExprgtabContext ctx_temp = (B314Parser.ExprgtabContext) ctx.exprg();
            VariableSymbol sym1 = (VariableSymbol) scopeTreated.resolve(ctx_temp.ID().getText());
            PCodePrinter.PCodeTypes type;
            ArrayType arrayT = (ArrayType) sym1.getType();
            switch (arrayT.getTypeBase().getName()) {
                case "boolean":
                    type = PCodePrinter.PCodeTypes.Bool;
                    break;

                case "integer":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "square":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                default:
                    type = PCodePrinter.PCodeTypes.Int;
                    break;
            }
            printer.printLoadAdress(type, context - sym1.getContext(), sym1.getAdresse());
            if (arrayT.getTailleTab().length > 1) {
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(arrayT.getTailleTab()[1]);
                calculeExprEnt(ctx_temp.exprent(1));
                printer.printIndexedAdressComputation(1);
            } else {
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(1);
            }
            printer.printIndexedFetch(type);
            printer.printMarkStack(context-1);
            for(int i = 0; i < ctx.exprd().size();i++){
                if(ctx.exprd(i) instanceof B314Parser.AppelvarContext){
                    visitAppelvar((B314Parser.AppelvarContext) ctx.exprd(i));
                }
                if(ctx.exprd(i) instanceof B314Parser.ExpentierdroitContext){
                    B314Parser.ExpentierdroitContext ctx_temp2 = (B314Parser.ExpentierdroitContext) ctx.exprd(i);
                    calculeExprEnt(ctx_temp2.exprent());
                }
                if(ctx.exprd(i) instanceof B314Parser.ExprbooldroitContext){
                    B314Parser.ExprbooldroitContext ctx_temp2 = (B314Parser.ExprbooldroitContext) ctx.exprd(i);
                    calculeExprBool(ctx_temp2.exprbool());
                }
                if(ctx.exprd(i) instanceof B314Parser.ExprcasedroitContext){
                    B314Parser.ExprcasedroitContext ctx_temp2 = (B314Parser.ExprcasedroitContext) ctx.exprd(i);
                    calculeExprSquare(ctx_temp2.exprcase());
                }
                if(ctx.exprd(i) instanceof B314Parser.AppelfonctionContext){
                    visitAppelfonction((B314Parser.AppelfonctionContext) ctx.exprd(i));
                }

            }
            printer.printCallUserProcedure(ctx.exprd().size(), ctx.ID().getText());
            printer.printEqualsValues(type);
        }
        return null;
    }

    /**
     * Generates PCode for when a Function equals Function.
     * @param ctx Function equals Function Context
     * @return null
     */
    @Override public Object visitFctegalfct(B314Parser.FctegalfctContext ctx)
    {
        Function fct = (Function) scopeTreated.resolve(ctx.ID(0).getText());
        Type type = fct.getType();
        PCodePrinter.PCodeTypes pType;
        switch(type.getName()){
            case "integer":
                pType = PCodePrinter.PCodeTypes.Int;
                break;

            case "square":
                pType = PCodePrinter.PCodeTypes.Int;
                break;

            case "boolean":
                pType = PCodePrinter.PCodeTypes.Bool;
                break;

            default:
                pType = PCodePrinter.PCodeTypes.Int;
                break;
        }
        int nbrParam = fct.getParameters().length;
        printer.printMarkStack(context-1);
        FctEgalFctWorkaround(ctx, 0, nbrParam);
        printer.printCallUserProcedure(ctx.exprd().size(), ctx.ID(0).getText());
        printer.printMarkStack(context-1);
        FctEgalFctWorkaround(ctx, nbrParam, ctx.exprd().size());
        printer.printCallUserProcedure(ctx.exprd().size(), ctx.ID(0).getText());
        printer.printEqualsValues(pType);
        return null;
    }

    /**
     * Method created to avoid code duplication.
     * @param ctx Function equals Function context
     * @param one Lower border
     * @param two Upper Border
     * @return null
     */
    private Object FctEgalFctWorkaround(B314Parser.FctegalfctContext ctx, int one, int two){
        for(int i=one; i<two;i++){
            if(ctx.exprd(i) instanceof B314Parser.AppelvarContext){
                visitAppelvar((B314Parser.AppelvarContext) ctx.exprd(i));
            }
            if(ctx.exprd(i) instanceof B314Parser.ExpentierdroitContext){
                B314Parser.ExpentierdroitContext ctx_temp2 = (B314Parser.ExpentierdroitContext) ctx.exprd(i);
                calculeExprEnt(ctx_temp2.exprent());
            }
            if(ctx.exprd(i) instanceof B314Parser.ExprbooldroitContext){
                B314Parser.ExprbooldroitContext ctx_temp2 = (B314Parser.ExprbooldroitContext) ctx.exprd(i);
                calculeExprBool(ctx_temp2.exprbool());
            }
            if(ctx.exprd(i) instanceof B314Parser.ExprcasedroitContext){
                B314Parser.ExprcasedroitContext ctx_temp2 = (B314Parser.ExprcasedroitContext) ctx.exprd(i);
                calculeExprSquare(ctx_temp2.exprcase());
            }
            if(ctx.exprd(i) instanceof B314Parser.AppelfonctionContext){
                visitAppelfonction((B314Parser.AppelfonctionContext) ctx.exprd(i));
            }
        }
        return null;
    }

    /**
     * Generates PCode for an integer inequality test.
     * @param ctx Inferior Superior Equals Context
     * @return null
     */
    @Override public Object visitInfsupegalexpr(B314Parser.InfsupegalexprContext ctx)
    {
        if(ctx.INF() != null){
            calculeExprEnt(ctx.exprent(0));
            calculeExprEnt(ctx.exprent(1));
            printer.printLess(PCodePrinter.PCodeTypes.Int);
        }
        if(ctx.SUP() != null){
            calculeExprEnt(ctx.exprent(0));
            calculeExprEnt(ctx.exprent(1));
            printer.printGreather(PCodePrinter.PCodeTypes.Int);
        }
        if(ctx.EGALE()!= null){
            calculeExprEnt(ctx.exprent(0));
            calculeExprEnt(ctx.exprent(1));
            printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        }
        return null;
    }

    /**
     * Generates PCode for a boolean inequality test.
     * @param ctx Boolean Equality Context
     * @return null
     */
    @Override public Object visitEgalite_boolean(B314Parser.Egalite_booleanContext ctx)
    {
        calculeExprBool(ctx.exprbool(0));
        calculeExprBool(ctx.exprbool(1));
        printer.printEqualsValues(PCodePrinter.PCodeTypes.Bool);
        return null;
    }

    /**
     * Generates PCode for a square inequality test.
     * @param ctx Square Equality Context
     * @return null
     */
    @Override public Object visitEgalite_square(B314Parser.Egalite_squareContext ctx)
    {
        calculeExprSquare(ctx.exprcase(0));
        calculeExprSquare(ctx.exprcase(1));
        printer.printEqualsValues(PCodePrinter.PCodeTypes.Int);
        return null;
    }

    /**
     * Generates PCode for a boolean expression of type OR or AND.
     * @param ctx Or And Expression Context
     * @return null
     */
    @Override public Object visitOrandexpr(B314Parser.OrandexprContext ctx)
    {
        calculeExprBool(ctx.exprbool(0));
        calculeExprBool(ctx.exprbool(1));
        if(ctx.AND()==null){
            printer.printOr();
        }else{
            printer.printAnd();
        }
        return null;
    }

    @Override
    public Object visitDirtexpr(B314Parser.DirtexprContext ctx) {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
        super.visitDirtexpr(ctx);
        return null;
    }

    @Override
    public Object visitRockexpr(B314Parser.RockexprContext ctx) {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 1);
        super.visitRockexpr(ctx);
        return null;
    }

    @Override
    public Object visitVinexpr(B314Parser.VinexprContext ctx) {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,2);
        super.visitVinexpr(ctx);
        return null;
    }

    @Override
    public Object visitZombiexpr(B314Parser.ZombiexprContext ctx) {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,3);
        super.visitZombiexpr(ctx);
        return null;
    }

    @Override
    public Object visitEnnemiexpr(B314Parser.EnnemiexprContext ctx) {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 4);
        super.visitEnnemiexpr(ctx);
        return null;
    }

    @Override
    public Object visitPlayerexpr(B314Parser.PlayerexprContext ctx) {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,5);
        super.visitPlayerexpr(ctx);
        return null;
    }

    @Override
    public Object visitMapexpr(B314Parser.MapexprContext ctx) {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,6);
        super.visitMapexpr(ctx);
        return null;
    }

    @Override
    public Object visitRadioexpr(B314Parser.RadioexprContext ctx) {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, 7);
        super.visitRadioexpr(ctx);
        return null;
    }

    @Override
    public Object visitAmmoexpr(B314Parser.AmmoexprContext ctx) {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,8);
        super.visitAmmoexpr(ctx);
        return null;
    }

    @Override
    public Object visitFruitsexpr(B314Parser.FruitsexprContext ctx) {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,9);
        super.visitFruitsexpr(ctx);
        return null;
    }

    @Override
    public Object visitSodaexpr(B314Parser.SodaexprContext ctx) {
        printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,10);
        super.visitSodaexpr(ctx);
        return null;
    }

    @Override
    public Object visitNearbyexpr(B314Parser.NearbyexprContext ctx) {
        printer.printLoadAdress(PCodePrinter.PCodeTypes.Int, context, 17);
        calculeExprEnt(ctx.exprent(0));
        printer.printIndexedAdressComputation(9);
        calculeExprEnt(ctx.exprent(1));
        printer.printIndexedAdressComputation(1);
        printer.printIndexedFetch(PCodePrinter.PCodeTypes.Int);
        return null;
    }

    @Override
    public Object visitVariablecase(B314Parser.VariablecaseContext ctx) {
        if(ctx.exprg() instanceof B314Parser.ExprgidContext){
            String id = ((B314Parser.ExprgidContext) ctx.exprg()).ID().getText();
            VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(id);
            switch(sym.getType().getName())
            {
                case "boolean":
                    printer.printLoad(PCodePrinter.PCodeTypes.Bool, context-sym.getContext(), sym.getAdresse());
                    break;

                case "integer":
                    printer.printLoad(PCodePrinter.PCodeTypes.Int, context-sym.getContext(), sym.getAdresse());
                    break;

                case "square":
                    printer.printLoad(PCodePrinter.PCodeTypes.Int, context-sym.getContext(), sym.getAdresse());
                    break;
            }
        }else{
            B314Parser.ExprgtabContext ctx_temp = (B314Parser.ExprgtabContext) ctx.exprg();
            VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(ctx_temp.ID().getText());
            ArrayType arrayT = (ArrayType) sym.getType();
            PCodePrinter.PCodeTypes type;
            switch(arrayT.getTypeBase().getName()){
                case "integer":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "square":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "boolean":
                    type = PCodePrinter.PCodeTypes.Bool;
                    break;

                default:
                    type = PCodePrinter.PCodeTypes.Int;
                    break;
            }
            printer.printLoadAdress(type, context-sym.getContext(), sym.getAdresse());
            if(arrayT.getTailleTab().length>1){
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(arrayT.getTailleTab()[1]);
                calculeExprEnt(ctx_temp.exprent(1));
                printer.printIndexedAdressComputation(1);
            }else{
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(1);
            }
            printer.printIndexedFetch(type);
        }
        return null;
    }

    /**
     * Calculates the value of a Square Expression and prints a constant depending on the Square.
     * @param ctx Square Expression Context
     */
    private void calculeExprSquare(B314Parser.ExprcaseContext ctx){
        if(ctx instanceof B314Parser.ExprcaseparContext){
            B314Parser.ExprcaseparContext ctx_temp = (B314Parser.ExprcaseparContext) ctx;
            calculeExprSquare(ctx_temp.exprcase());
        }
        if(ctx instanceof B314Parser.DirtexprContext){
            visitDirtexpr((B314Parser.DirtexprContext) ctx);
        }
        if(ctx instanceof B314Parser.RockexprContext){
            visitRockexpr((B314Parser.RockexprContext) ctx);
        }
        if(ctx instanceof B314Parser.VinexprContext){
            visitVinexpr((B314Parser.VinexprContext) ctx);
        }
        if(ctx instanceof B314Parser.ZombiexprContext){
            visitZombiexpr((B314Parser.ZombiexprContext) ctx);
        }
        if(ctx instanceof B314Parser.EnnemiexprContext){
            visitEnnemiexpr((B314Parser.EnnemiexprContext) ctx);
        }
        if(ctx instanceof B314Parser.PlayerexprContext){
            visitPlayerexpr((B314Parser.PlayerexprContext) ctx);
        }
        if(ctx instanceof B314Parser.MapexprContext){
            visitMapexpr((B314Parser.MapexprContext) ctx);
        }
        if(ctx instanceof B314Parser.RadioexprContext){
            visitRadioexpr((B314Parser.RadioexprContext) ctx);
        }
        if(ctx instanceof B314Parser.AmmoexprContext){
            visitAmmoexpr((B314Parser.AmmoexprContext) ctx);
        }
        if(ctx instanceof B314Parser.FruitsexprContext){
            visitFruitsexpr((B314Parser.FruitsexprContext) ctx);
        }
        if(ctx instanceof B314Parser.SodaexprContext){
            visitSodaexpr((B314Parser.SodaexprContext) ctx);
        }
        if(ctx instanceof B314Parser.NearbyexprContext){
            visitNearbyexpr((B314Parser.NearbyexprContext) ctx);
        }
        if(ctx instanceof B314Parser.Appeldefonction3Context){
            visitAppeldefonction3((B314Parser.Appeldefonction3Context) ctx);
        }
        if(ctx instanceof B314Parser.VariablecaseContext){
            visitVariablecase((B314Parser.VariablecaseContext) ctx);
        }
    }

    @Override public Object visitNumberexpr(B314Parser.NumberexprContext ctx)
    {
        int number = Integer.parseInt(ctx.NUMBER().getText());
        if(ctx.MOINS() != null){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, number*(-1));
        }else{
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int, number);
        }
        super.visitNumberexpr(ctx);
        return null;
    }

    @Override public Object visitExpentierpar(B314Parser.ExpentierparContext ctx)
    {
        super.visitExpentierpar(ctx);
        return null;
    }

    @Override public Object visitLatexpr(B314Parser.LatexprContext ctx)
    {
        printer.printLoad(PCodePrinter.PCodeTypes.Int, context, 0);
        super.visitLatexpr(ctx);
        return null;
    }

    @Override
    public Object visitLongexpr(B314Parser.LongexprContext ctx) {
        printer.printLoad(PCodePrinter.PCodeTypes.Int, context,1);
        super.visitLongexpr(ctx);
        return null;
    }

    @Override
    public Object visitGrandsizexpr(B314Parser.GrandsizexprContext ctx) {
        printer.printLoad(PCodePrinter.PCodeTypes.Int, context, 2);
        super.visitGrandsizexpr(ctx);
        return null;
    }

    @Override
    public Object visitItemexpr(B314Parser.ItemexprContext ctx)
    {
        if(ctx.MAP() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int,context,3);
        }
        if(ctx.RADIO() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int,context,4);
        }
        if(ctx.AMMO() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int,context,5);
        }
        if(ctx.FRUITS() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int,context,6);
        }
        if(ctx.SODA() != null){
            printer.printLoad(PCodePrinter.PCodeTypes.Int,context,7);
        }
        super.visitItemexpr(ctx);
        return null;
    }

    @Override public Object visitLifexpr(B314Parser.LifexprContext ctx)
    {
        printer.printLoad(PCodePrinter.PCodeTypes.Int,context,8);
        super.visitLifexpr(ctx);
        return null;
    }

    @Override public Object visitExprmuldivmod(B314Parser.ExprmuldivmodContext ctx) {
        super.visitExprmuldivmod(ctx);
        if (ctx.MUL() != null) {
            printer.printMul(PCodePrinter.PCodeTypes.Int);
        }
        if (ctx.DIV() != null) {

            printer.printDiv(PCodePrinter.PCodeTypes.Int);
        }
        if (ctx.MODULO() != null) {
            printer.printMod(PCodePrinter.PCodeTypes.Int);
        }
        return null;

    }

    @Override public Object visitPlusmoinsexpr(B314Parser.PlusmoinsexprContext ctx)
    {
        super.visitPlusmoinsexpr(ctx);
        if(ctx.PLUS() != null){
            printer.printAdd(PCodePrinter.PCodeTypes.Int);
        }
        if(ctx.MOINS() != null){
            printer.printSub(PCodePrinter.PCodeTypes.Int);
        }
        return null;
    }

    @Override public Object visitVariableentier(B314Parser.VariableentierContext ctx)
    {
        if(ctx.exprg() instanceof B314Parser.ExprgidContext){
            String id = ((B314Parser.ExprgidContext) ctx.exprg()).ID().getText();
            VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(id);
            switch(sym.getType().getName())
            {
                case "boolean":
                    printer.printLoad(PCodePrinter.PCodeTypes.Bool, context-sym.getContext(), sym.getAdresse());
                    break;

                case "integer":
                    printer.printLoad(PCodePrinter.PCodeTypes.Int, context-sym.getContext(), sym.getAdresse());
                    break;

                case "square":
                    printer.printLoad(PCodePrinter.PCodeTypes.Int, context-sym.getContext(), sym.getAdresse());
                    break;
            }
        }else{
            B314Parser.ExprgtabContext ctx_temp = (B314Parser.ExprgtabContext) ctx.exprg();
            VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(ctx_temp.ID().getText());
            ArrayType arrayT = (ArrayType) sym.getType();
            PCodePrinter.PCodeTypes type;
            switch(arrayT.getTypeBase().getName()){
                case "integer":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "square":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "boolean":
                    type = PCodePrinter.PCodeTypes.Bool;
                    break;

                default:
                    type = PCodePrinter.PCodeTypes.Int;
                    break;
            }
            printer.printLoadAdress(type, context-sym.getContext(), sym.getAdresse());
            if(arrayT.getTailleTab().length>1){
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(arrayT.getTailleTab()[1]);
                calculeExprEnt(ctx_temp.exprent(1));
                printer.printIndexedAdressComputation(1);
            }else{
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(1);
            }
            printer.printIndexedFetch(type);
        }
        return null;
    }

    /**
     * Calculates the value of an Integer Expression and prints a constant depending on the Square.
     * @param ctx Integer Expression Context
     */
    private void calculeExprEnt(B314Parser.ExprentContext ctx) {
        if(ctx instanceof B314Parser.NumberexprContext){
            visitNumberexpr((B314Parser.NumberexprContext) ctx);
        }
        if(ctx instanceof B314Parser.ExpentierparContext){
            visitExpentierpar((B314Parser.ExpentierparContext) ctx);
        }
        if(ctx instanceof B314Parser.LatexprContext){
            visitLatexpr((B314Parser.LatexprContext) ctx);
        }
        if(ctx instanceof B314Parser.LongexprContext){
            visitLongexpr((B314Parser.LongexprContext) ctx);
        }
        if(ctx instanceof B314Parser.GrandsizexprContext){
            visitGrandsizexpr((B314Parser.GrandsizexprContext) ctx);
        }
        if(ctx instanceof B314Parser.ItemexprContext){
            visitItemexpr((B314Parser.ItemexprContext) ctx);
        }
        if(ctx instanceof B314Parser.LifexprContext){
            visitLifexpr((B314Parser.LifexprContext) ctx);
        }
        if(ctx instanceof B314Parser.ExprmuldivmodContext){
            visitExprmuldivmod((B314Parser.ExprmuldivmodContext) ctx);
        }
        if(ctx instanceof B314Parser.PlusmoinsexprContext){
            visitPlusmoinsexpr((B314Parser.PlusmoinsexprContext) ctx);
        }
        if(ctx instanceof B314Parser.Appeldefonction1Context){
            visitAppeldefonction1((B314Parser.Appeldefonction1Context) ctx);
        }
        if(ctx instanceof B314Parser.VariableentierContext){
            visitVariableentier((B314Parser.VariableentierContext) ctx);
        }
    }

    /**
     * Generates PCode for a If Then Instruction.
     * @param ctx If Then Instruction Context
     * @return null
     */
    @Override public Object visitIftheninstr(B314Parser.IftheninstrContext ctx)
    {
        this.nbrIf++;
        int n = this.nbrIf;
        calculeExprBool(ctx.exprbool());
        printer.printFalseJump("endIf"+ctx.exprbool().getText()+String.valueOf(n));
        super.visitIftheninstr(ctx);
        printer.printDefineLabel("endIf"+ctx.exprbool().getText()+String.valueOf(n));
        return null;
    }

    /**
     * Generates PCode for a If Then Else Instruction.
     * @param ctx If Then Else Instruction Context
     * @return null
     */
    @Override public Object visitIfthenelseinstr(B314Parser.IfthenelseinstrContext ctx)
    {
        this.nbrIf++;
        int n = this.nbrIf;
        calculeExprBool(ctx.exprbool());
        printer.printFalseJump("falseIf"+ctx.exprbool().getText()+String.valueOf(n));
        int nbrTrue = 0;
        int nbrFalse = 0;
        for(int i = 3; i<ctx.getChildCount()&&ctx.getChild(i)!=ctx.ELSE();i++){
            nbrTrue += 1;
        }
        for(int i = nbrTrue+4; i<ctx.getChildCount()&&ctx.getChild(i)!=ctx.DONE();i++){
            nbrFalse += 1;
        }
        for(int i = 0; i<nbrTrue;i++){
            visitInstruction(ctx.instruction(i));
        }
        printer.printUnconditionalJump("endIf"+ctx.exprbool().getText()+String.valueOf(n));
        printer.printDefineLabel("falseIf"+ctx.exprbool().getText()+String.valueOf(n));
        for(int i = nbrTrue; i<nbrTrue+nbrFalse; i++){
            visitInstruction(ctx.instruction(i));
        }
        printer.printDefineLabel("endIf"+ctx.exprbool().getText()+String.valueOf(n));
        return null;

    }

    /**
     * Generates PCode for a Variable call in the Right Expression.
     * @param ctx Variable Call Context
     * @return null
     */
    @Override public Object visitAppelvar(B314Parser.AppelvarContext ctx)
    {
        if(ctx.exprg() instanceof B314Parser.ExprgidContext){
            B314Parser.ExprgidContext ctx_temp = (B314Parser.ExprgidContext) ctx.exprg();
            VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(ctx_temp.ID().getText());
            PCodePrinter.PCodeTypes type;
            switch(sym.getType().getName()){
                case "integer":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "square":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "boolean":
                    type = PCodePrinter.PCodeTypes.Bool;
                    break;

                default:
                    type = PCodePrinter.PCodeTypes.Int;
            }
            printer.printLoad(type, context-sym.getContext(), sym.getAdresse());
        }else{
            B314Parser.ExprgtabContext ctx_temp = (B314Parser.ExprgtabContext) ctx.exprg();
            VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(ctx_temp.ID().getText());
            ArrayType arrayT = (ArrayType) sym.getType();
            PCodePrinter.PCodeTypes type;
            switch(arrayT.getTypeBase().getName()){
                case "integer":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "square":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "boolean":
                    type = PCodePrinter.PCodeTypes.Bool;
                    break;

                default:
                    type = PCodePrinter.PCodeTypes.Int;
                    break;
            }
            printer.printLoadAdress(type, context-sym.getContext(), sym.getAdresse());
            if(arrayT.getTailleTab().length>1){
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(arrayT.getTailleTab()[1]);
                calculeExprEnt(ctx_temp.exprent(1));
                printer.printIndexedAdressComputation(1);
            }else{
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(1);
            }
            printer.printIndexedFetch(type);

        }
        return null;
    }

    /**
     * Generates PCode for a variable that is found in the Left Expression.
     * @param ctx Left Expression ID Context
     * @return null
     */
    @Override public Object visitExprgid(B314Parser.ExprgidContext ctx)
    {
        VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(ctx.ID().getText());
        PCodePrinter.PCodeTypes type;
        switch(sym.getType().getName()){
            case "integer":
                type = PCodePrinter.PCodeTypes.Int;
                break;

            case "square":
                type = PCodePrinter.PCodeTypes.Int;
                break;

            case "boolean":
                type = PCodePrinter.PCodeTypes.Bool;
                break;

            default:
                type = PCodePrinter.PCodeTypes.Int;
        }
        printer.printLoadAdress(type, context-sym.getContext(), sym.getAdresse());
        return null;
    }

    /**
     * Generates PCode for an array found in the Left Expression.
     * @param ctx Left Expression Array Context
     * @return null
     */
    @Override public Object visitExprgtab(B314Parser.ExprgtabContext ctx)
    {
        VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(ctx.ID().getText());
        ArrayType arrayT = (ArrayType) sym.getType();
        PCodePrinter.PCodeTypes type;
        switch(arrayT.getTypeBase().getName()){
            case "integer":
                type = PCodePrinter.PCodeTypes.Int;
                break;

            case "square":
                type = PCodePrinter.PCodeTypes.Int;
                break;

            case "boolean":
                type = PCodePrinter.PCodeTypes.Bool;
                break;

            default:
                type = PCodePrinter.PCodeTypes.Int;
                break;
        }
        printer.printLoadAdress(type, context-sym.getContext(), sym.getAdresse());
        if(arrayT.getTailleTab().length>1){
            calculeExprEnt(ctx.exprent(0));
            printer.printIndexedAdressComputation(arrayT.getTailleTab()[1]);
            calculeExprEnt(ctx.exprent(1));
            printer.printIndexedAdressComputation(1);
        }else{
            calculeExprEnt(ctx.exprent(0));
            printer.printIndexedAdressComputation(1);
        }
        return null;
    }

    /**
     * Generates PCode for a Boolean expression that is a variable.
     * @param ctx Boolean Variable Context
     * @return null
     */
    @Override public Object visitVariableboolean(B314Parser.VariablebooleanContext ctx)
    {
        if(ctx.exprg() instanceof B314Parser.ExprgidContext){
            String id = ((B314Parser.ExprgidContext) ctx.exprg()).ID().getText();
            VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(id);
            switch(sym.getType().getName())
            {
                case "boolean":
                    printer.printLoad(PCodePrinter.PCodeTypes.Bool, context-sym.getContext(), sym.getAdresse());
                    break;

                case "integer":
                    printer.printLoad(PCodePrinter.PCodeTypes.Int, context-sym.getContext(), sym.getAdresse());
                    break;

                case "square":
                    printer.printLoad(PCodePrinter.PCodeTypes.Int, context-sym.getContext(), sym.getAdresse());
                    break;
            }
        }else{
            B314Parser.ExprgtabContext ctx_temp = (B314Parser.ExprgtabContext) ctx.exprg();
            VariableSymbol sym = (VariableSymbol) scopeTreated.resolve(ctx_temp.ID().getText());
            ArrayType arrayT = (ArrayType) sym.getType();
            PCodePrinter.PCodeTypes type;
            switch(arrayT.getTypeBase().getName()){
                case "integer":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "square":
                    type = PCodePrinter.PCodeTypes.Int;
                    break;

                case "boolean":
                    type = PCodePrinter.PCodeTypes.Bool;
                    break;

                default:
                    type = PCodePrinter.PCodeTypes.Int;
                    break;
            }
            printer.printLoadAdress(type, context-sym.getContext(), sym.getAdresse());
            if(arrayT.getTailleTab().length>1){
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(arrayT.getTailleTab()[1]);
                calculeExprEnt(ctx_temp.exprent(1));
                printer.printIndexedAdressComputation(1);
            }else{
                calculeExprEnt(ctx_temp.exprent(0));
                printer.printIndexedAdressComputation(1);
            }
            printer.printIndexedFetch(type);
        }
        return null;
    }

    /**
     * Generates PCode for a Function that is a Right Expression.
     * @param ctx Function Call Context
     * @return null
     */
    @Override public Object visitAppelfonction(B314Parser.AppelfonctionContext ctx)
    {
        printer.printMarkStack(context-1);
        /*for(int i = 0; i < ctx.exprd().size();i++){
            if(ctx.exprd(i) instanceof B314Parser.AppelvarContext){
                visitAppelvar((B314Parser.AppelvarContext) ctx.exprd(i));
            }
            if(ctx.exprd(i) instanceof B314Parser.ExpentierdroitContext){
                B314Parser.ExpentierdroitContext ctx_temp2 = (B314Parser.ExpentierdroitContext) ctx.exprd(i);
                calculeExprEnt(ctx_temp2.exprent());
            }
            if(ctx.exprd(i) instanceof B314Parser.ExprbooldroitContext){
                B314Parser.ExprbooldroitContext ctx_temp2 = (B314Parser.ExprbooldroitContext) ctx.exprd(i);
                calculeExprBool(ctx_temp2.exprbool());
            }
            if(ctx.exprd(i) instanceof B314Parser.ExprcasedroitContext){
                B314Parser.ExprcasedroitContext ctx_temp2 = (B314Parser.ExprcasedroitContext) ctx.exprd(i);
                calculeExprSquare(ctx_temp2.exprcase());
            }
            if(ctx.exprd(i) instanceof B314Parser.AppelfonctionContext){
                visitAppelfonction((B314Parser.AppelfonctionContext) ctx.exprd(i));
            }

        }*/
        super.visitAppelfonction(ctx);
        printer.printCallUserProcedure(ctx.exprd().size(), ctx.ID().getText());
        Symbol sym = scopeTreated.resolve(ctx.ID().getText());
        if(sym.getType().getName().equals("void")){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
        }
        return null;
    }

    /**
     * Generates PCode for a Function that is an integer expression.
     * @param ctx Function1 Call Context
     * @return null
     */
    @Override public Object visitAppeldefonction1(B314Parser.Appeldefonction1Context ctx){
        printer.printMarkStack(context-1);
        /*for(int i = 0; i < ctx.exprd().size();i++){
            if(ctx.exprd(i) instanceof B314Parser.AppelvarContext){
                visitAppelvar((B314Parser.AppelvarContext) ctx.exprd(i));
            }
            if(ctx.exprd(i) instanceof B314Parser.ExpentierdroitContext){
                B314Parser.ExpentierdroitContext ctx_temp2 = (B314Parser.ExpentierdroitContext) ctx.exprd(i);
                calculeExprEnt(ctx_temp2.exprent());
            }
            if(ctx.exprd(i) instanceof B314Parser.ExprbooldroitContext){
                B314Parser.ExprbooldroitContext ctx_temp2 = (B314Parser.ExprbooldroitContext) ctx.exprd(i);
                calculeExprBool(ctx_temp2.exprbool());
            }
            if(ctx.exprd(i) instanceof B314Parser.ExprcasedroitContext){
                B314Parser.ExprcasedroitContext ctx_temp2 = (B314Parser.ExprcasedroitContext) ctx.exprd(i);
                calculeExprSquare(ctx_temp2.exprcase());
            }
            if(ctx.exprd(i) instanceof B314Parser.AppelfonctionContext){
                visitAppelfonction((B314Parser.AppelfonctionContext) ctx.exprd(i));
            }

        }*/
        super.visitAppeldefonction1(ctx);
        printer.printCallUserProcedure(ctx.exprd().size(), ctx.ID().getText());
        Symbol sym = scopeTreated.resolve(ctx.ID().getText());
        if(sym.getType().getName().equals("void")){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
        }
        return null;
    }

    /**
     * Generates PCode for a Function that is a boolean expression.
     * @param ctx Function2 Call Context
     * @return null
     */
    @Override public Object visitAppeldefonction2(B314Parser.Appeldefonction2Context ctx)
    {
        printer.printMarkStack(context-1);
        /*for(int i = 0; i < ctx.exprd().size();i++){
            if(ctx.exprd(i) instanceof B314Parser.AppelvarContext){
                visitAppelvar((B314Parser.AppelvarContext) ctx.exprd(i));
            }
            if(ctx.exprd(i) instanceof B314Parser.ExpentierdroitContext){
                B314Parser.ExpentierdroitContext ctx_temp2 = (B314Parser.ExpentierdroitContext) ctx.exprd(i);
                calculeExprEnt(ctx_temp2.exprent());
            }
            if(ctx.exprd(i) instanceof B314Parser.ExprbooldroitContext){
                B314Parser.ExprbooldroitContext ctx_temp2 = (B314Parser.ExprbooldroitContext) ctx.exprd(i);
                calculeExprBool(ctx_temp2.exprbool());
            }
            if(ctx.exprd(i) instanceof B314Parser.ExprcasedroitContext){
                B314Parser.ExprcasedroitContext ctx_temp2 = (B314Parser.ExprcasedroitContext) ctx.exprd(i);
                calculeExprSquare(ctx_temp2.exprcase());
            }
            if(ctx.exprd(i) instanceof B314Parser.AppelfonctionContext){
                visitAppelfonction((B314Parser.AppelfonctionContext) ctx.exprd(i));
            }

        }*/
        super.visitAppeldefonction2(ctx);
        printer.printCallUserProcedure(ctx.exprd().size(), ctx.ID().getText());
        Symbol sym = scopeTreated.resolve(ctx.ID().getText());
        if(sym.getType().getName().equals("void")){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
        }
        return null;
    }

    /**
     * Generates PCode for a Function that is a square expression.
     * @param ctx Function3 Call Context
     * @return null
     */
    @Override public Object visitAppeldefonction3(B314Parser.Appeldefonction3Context ctx)
    {
        printer.printMarkStack(context-1);
        /*for(int i = 0; i < ctx.exprd().size();i++){
            if(ctx.exprd(i) instanceof B314Parser.AppelvarContext){
                visitAppelvar((B314Parser.AppelvarContext) ctx.exprd(i));
            }
            if(ctx.exprd(i) instanceof B314Parser.ExpentierdroitContext){
                B314Parser.ExpentierdroitContext ctx_temp2 = (B314Parser.ExpentierdroitContext) ctx.exprd(i);
                calculeExprEnt(ctx_temp2.exprent());
            }
            if(ctx.exprd(i) instanceof B314Parser.ExprbooldroitContext){
                B314Parser.ExprbooldroitContext ctx_temp2 = (B314Parser.ExprbooldroitContext) ctx.exprd(i);
                calculeExprBool(ctx_temp2.exprbool());
            }
            if(ctx.exprd(i) instanceof B314Parser.ExprcasedroitContext){
                B314Parser.ExprcasedroitContext ctx_temp2 = (B314Parser.ExprcasedroitContext) ctx.exprd(i);
                calculeExprSquare(ctx_temp2.exprcase());
            }
            if(ctx.exprd(i) instanceof B314Parser.AppelfonctionContext){
                visitAppelfonction((B314Parser.AppelfonctionContext) ctx.exprd(i));
            }

        }*/
        super.visitAppeldefonction3(ctx);
        printer.printCallUserProcedure(ctx.exprd().size(), ctx.ID().getText());
        Symbol sym = scopeTreated.resolve(ctx.ID().getText());
        if(sym.getType().getName().equals("void")){
            printer.printLoadConstant(PCodePrinter.PCodeTypes.Int,0);
        }
        return null;
    }

}
