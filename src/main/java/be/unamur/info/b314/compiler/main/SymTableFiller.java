package be.unamur.info.b314.compiler.main;

import be.unamur.info.b314.compiler.B314BaseListener;
import be.unamur.info.b314.compiler.B314Parser;
import be.unamur.info.b314.compiler.main.B314exceptions.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * This class mainly verifies the syntax of each context and fills the Symbol Table.
 * Tests include Type verification, Indexation and whether a function exists or not.
 * @author Valentin Eggermont - valentin.eggermont@student.unamur.be
 * @author Thomas Vanhaeren - thomas.vanhaeren@student.unamur.be
 */
public class SymTableFiller extends B314BaseListener {
    GlobalScope global;
    private Scope currentScope;
    private Map<String, Symbol> allDeclareFonction;

    /**
     * Initialize the Symbol Table.
     */
    protected SymTableFiller()
    {
        super();
        global = new GlobalScope();
        currentScope = global;
        allDeclareFonction = new LinkedHashMap<>();

    }

    /**
     * Checks if left expression is contained in the current scope. Also checks if type of left expression is coherent with
     * right expression. If not, throws a NonExistantVariableException.
     * @param ctx Set Instruction Context
     * @throws NonExistantVariableException Non Existant Variable Exception
     * @throws InvalidExpressionException Invalid Expression Exception
     * @throws InvalidIndexationException Invalid Indexation Expression
     */
    @Override public void enterSetinstr(B314Parser.SetinstrContext ctx) throws NonExistantVariableException, InvalidExpressionException, InvalidIndexationException {
        Type type=null;
        if (ctx.exprg() instanceof B314Parser.ExprgidContext)
        {
            B314Parser.ExprgidContext i = (B314Parser.ExprgidContext) ctx.exprg();
            String id = i.ID().getText();
            Symbol sym = currentScope.resolve(id);
            if(sym == null){
                throw new NonExistantVariableException();
            }
            type = sym.getType();

        }
        else {
            if (ctx.exprg() instanceof B314Parser.ExprgtabContext) {
                B314Parser.ExprgtabContext i = (B314Parser.ExprgtabContext) ctx.exprg();
                String id = i.ID().getText();
                Symbol sym = currentScope.resolve(id);
                if (sym == null) {
                    throw new NonExistantVariableException();
                }else {
                    if (sym.getType() instanceof ArrayType) {
                        ArrayType tabType = (ArrayType) sym.getType();
                        type = tabType.getTypeBase();
                        if(tabType.getTailleTab().length != i.exprent().size()){
                            throw new InvalidIndexationException();
                        }
                    }
                }
                if(i.CROU()==null || i.CRFE()==null){
                    throw new InvalidExpressionException();
                }

            } else {
                throw new InvalidExpressionException();
            }
        }

        switch(type.getName())
        {
            case "boolean":
                if(!(ctx.exprd() instanceof B314Parser.ExprbooldroitContext))
                {
                    if(ctx.exprd() instanceof B314Parser.AppelfonctionContext){
                        B314Parser.AppelfonctionContext ctx_temp = (B314Parser.AppelfonctionContext) ctx.exprd();
                        Symbol sym = currentScope.resolve(ctx_temp.ID().getText());
                        if(!sym.getType().getName().equals("boolean")){
                            throw new InvalidExpressionException();
                        }
                    }else{
                        if(ctx.exprd() instanceof B314Parser.AppelvarContext){
                            B314Parser.AppelvarContext ctx_temp = (B314Parser.AppelvarContext) ctx.exprd();
                            if(ctx_temp.exprg() instanceof B314Parser.ExprgidContext){
                                B314Parser.ExprgidContext ctx_temp2 = (B314Parser.ExprgidContext) ctx_temp.exprg();
                                Symbol sym = currentScope.resolve(ctx_temp2.ID().getText());
                                ScalarType type_sym = (ScalarType) sym.getType();
                                if(!type_sym.getName().equals("boolean")){
                                    throw new InvalidExpressionException();
                                }
                            }else{
                                B314Parser.ExprgtabContext ctx_temp2 = (B314Parser.ExprgtabContext) ctx_temp.exprg();
                                Symbol sym = currentScope.resolve(ctx_temp2.ID().getText());
                                ArrayType type_sym = (ArrayType) sym.getType();
                                if(!type_sym.getTypeBase().getName().equals("boolean")){
                                    throw new InvalidExpressionException();
                                }
                            }
                        }else{
                            throw new InvalidExpressionException();
                        }

                    }
                }
                break;

            case "integer":
                if(!(ctx.exprd() instanceof B314Parser.ExpentierdroitContext))
                {
                    if(ctx.exprd() instanceof B314Parser.AppelfonctionContext){
                        B314Parser.AppelfonctionContext ctx_temp = (B314Parser.AppelfonctionContext) ctx.exprd();
                        Symbol sym = currentScope.resolve(ctx_temp.ID().getText());
                        if(!sym.getType().getName().equals("integer")){
                            throw new InvalidExpressionException();
                        }
                    }else{
                        if(ctx.exprd() instanceof B314Parser.AppelvarContext){
                            B314Parser.AppelvarContext ctx_temp = (B314Parser.AppelvarContext) ctx.exprd();
                            if(ctx_temp.exprg() instanceof B314Parser.ExprgidContext){
                                B314Parser.ExprgidContext ctx_temp2 = (B314Parser.ExprgidContext) ctx_temp.exprg();
                                Symbol sym = currentScope.resolve(ctx_temp2.ID().getText());
                                ScalarType type_sym = (ScalarType) sym.getType();
                                if(!type_sym.getName().equals("integer")){
                                    throw new InvalidExpressionException();
                                }
                            }else{
                                B314Parser.ExprgtabContext ctx_temp2 = (B314Parser.ExprgtabContext) ctx_temp.exprg();
                                Symbol sym = currentScope.resolve(ctx_temp2.ID().getText());
                                ArrayType type_sym = (ArrayType) sym.getType();
                                if(!type_sym.getTypeBase().getName().equals("integer")){
                                    throw new InvalidExpressionException();
                                }
                            }
                        }else{
                            throw new InvalidExpressionException();
                        }

                    }
                }
                break;

            case "square":
                if(!(ctx.exprd() instanceof B314Parser.ExprcasedroitContext))
                {
                    if(ctx.exprd() instanceof B314Parser.AppelfonctionContext){
                        B314Parser.AppelfonctionContext ctx_temp = (B314Parser.AppelfonctionContext) ctx.exprd();
                        Symbol sym = currentScope.resolve(ctx_temp.ID().getText());
                        if(!sym.getType().getName().equals("square")){
                            throw new InvalidExpressionException();
                        }
                    }else{
                        if(ctx.exprd() instanceof B314Parser.AppelvarContext){
                            B314Parser.AppelvarContext ctx_temp = (B314Parser.AppelvarContext) ctx.exprd();
                            if(ctx_temp.exprg() instanceof B314Parser.ExprgidContext){
                                B314Parser.ExprgidContext ctx_temp2 = (B314Parser.ExprgidContext) ctx_temp.exprg();
                                Symbol sym = currentScope.resolve(ctx_temp2.ID().getText());
                                ScalarType type_sym = (ScalarType) sym.getType();
                                if(!type_sym.getName().equals("square")){
                                    throw new InvalidExpressionException();
                                }
                            }else{
                                B314Parser.ExprgtabContext ctx_temp2 = (B314Parser.ExprgtabContext) ctx_temp.exprg();
                                Symbol sym = currentScope.resolve(ctx_temp2.ID().getText());
                                ArrayType type_sym = (ArrayType) sym.getType();
                                if(!type_sym.getTypeBase().getName().equals("square")){
                                    throw new InvalidExpressionException();
                                }
                            }
                        }else{
                            throw new InvalidExpressionException();
                        }

                    }
                }
                break;
        }
    }

    /**
     * Checks a function call; when right expression is of type 'Appelfonction' the methods checks if the function
     * name has been declared and if the variable is a function.
     * @param ctx Function Context
     */
    @Override public void enterAppelfonction(B314Parser.AppelfonctionContext ctx)
    {
        String id = ctx.ID().getText();
        Symbol sym = currentScope.resolve(id);
        if(!(sym instanceof Function)){
            throw new NonExistantFunctionException();
        }
    }

    /**
     * Intervenes in case where in file B314 we arrive on an integer expression represented by a function and its parameters.
     * @param ctx Function1 Context
     */
    @Override public void enterAppeldefonction1(B314Parser.Appeldefonction1Context ctx)
    {
        Symbol sym = currentScope.resolve(ctx.ID().getText());
        if(sym==null){
            sym = allDeclareFonction.get(ctx.ID().getText());
            if(sym==null) {
                throw new NonExistantFunctionException();
            }
        }
        Type type = sym.getType();
        if(!type.getName().equals("integer") && !type.getName().equals("void")){
            throw new InvalidExpressionException();
        }
    }

    /**
     * Intervenes in case where in file B314 we arrive on a boolean expression represented by a function and its parameters.
     * @param ctx Function2 Context
     */
    @Override public void enterAppeldefonction2(B314Parser.Appeldefonction2Context ctx)
    {
        Symbol sym = currentScope.resolve(ctx.ID().getText());
        if(sym==null){
            sym = allDeclareFonction.get(ctx.ID().getText());
            if(sym==null) {
                throw new NonExistantFunctionException();
            }
        }
        Type type = sym.getType();
        if(!type.getName().equals("boolean")){
            throw new InvalidExpressionException();
        }
    }

    /**
     * Intervenes in case where in file B314 we arrive on a square expression represented by a function and its parameters.
     * @param ctx Function3 Context
     */
    @Override public void enterAppeldefonction3(B314Parser.Appeldefonction3Context ctx)
    {
        Symbol sym = currentScope.resolve(ctx.ID().getText());
        if(sym==null){
            sym = allDeclareFonction.get(ctx.ID().getText());
            if(sym==null) {
                throw new NonExistantFunctionException();
            }
        }
        Type type = sym.getType();
        if(!type.getName().equals("square")){
            throw new InvalidExpressionException();
        }
    }

    /**
     * Triggers if we enter in an integer expression represented by a variable (left-expression).
     * @param ctx Integer Variable Context
     */
    @Override public void enterVariableentier(B314Parser.VariableentierContext ctx)
    {
        if(ctx.exprg() instanceof B314Parser.ExprgidContext){
            B314Parser.ExprgidContext ctx_temp = (B314Parser.ExprgidContext) ctx.exprg();
            Symbol sym = currentScope.resolve(ctx_temp.ID().getText());
            if(sym==null){
                throw new NonExistantVariableException();

            }
            if(!sym.getType().getName().equals("integer")){
                System.out.println(sym.getName());
                throw new InvalidExpressionException();
            }
        }else{
            B314Parser.ExprgtabContext ctx_temp = (B314Parser.ExprgtabContext) ctx.exprg();
            Symbol sym = currentScope.resolve(ctx_temp.ID().getText());
            if(sym==null){
                throw new NonExistantVariableException();
            }
            if(!((ArrayType)sym.getType()).getTypeBase().getName().equals("integer")){
                throw new InvalidExpressionException();
            }
        }
    }

    /**
     * Triggers if we enter in a boolean expression represented by a variable (left-expression).
     * @param ctx Boolean Variable Context
     */
    @Override public void enterVariableboolean(B314Parser.VariablebooleanContext ctx)
    {
        if(ctx.exprg() instanceof B314Parser.ExprgidContext){
            B314Parser.ExprgidContext ctx_temp = (B314Parser.ExprgidContext) ctx.exprg();
            Symbol sym = currentScope.resolve(ctx_temp.ID().getText());
            if(sym==null){
                throw new NonExistantVariableException();
            }
            if(!sym.getType().getName().equals("boolean")){
                throw new InvalidExpressionException();
            }
        }else{
            B314Parser.ExprgtabContext ctx_temp = (B314Parser.ExprgtabContext) ctx.exprg();
            Symbol sym = currentScope.resolve(ctx_temp.ID().getText());
            if(sym==null){
                throw new NonExistantVariableException();
            }
            if(!((ArrayType)sym.getType()).getTypeBase().getName().equals("boolean")){
                throw new InvalidExpressionException();
            }
        }
    }

    /**
     * Triggers if we enter in a square expression represented by a variable (left-expression).
     * @param ctx Square Context
     */
    @Override public void enterVariablecase(B314Parser.VariablecaseContext ctx)
    {
        if(ctx.exprg() instanceof B314Parser.ExprgidContext){
            B314Parser.ExprgidContext ctx_temp = (B314Parser.ExprgidContext) ctx.exprg();
            Symbol sym = currentScope.resolve(ctx_temp.ID().getText());
            if(sym==null){
                throw new NonExistantVariableException();
            }
            if(!sym.getType().getName().equals("square")){
                throw new InvalidExpressionException();
            }
        }else{
            B314Parser.ExprgtabContext ctx_temp = (B314Parser.ExprgtabContext) ctx.exprg();
            Symbol sym = currentScope.resolve(ctx_temp.ID().getText());
            if(sym==null){
                throw new NonExistantVariableException();
            }
            if(!((ArrayType)sym.getType()).getTypeBase().getName().equals("square")){
                throw new InvalidExpressionException();
            }
        }
    }

    /**
     * This method is triggered when we enter a variable declaration.
     * @param ctx Variable Declaration Context
     */
    @Override public void enterVardecl(B314Parser.VardeclContext ctx)  {
        VariableSymbol symbol;
        Type type=null;
        if(currentScope == global){
            return;
        }
        int decalage;
        if(currentScope instanceof Function){
            decalage = 2;
        }else{
            decalage = 1;
        }
        if(ctx.type() instanceof B314Parser.TypescalarContext){
            type = new ScalarType(ctx.type().getText());
        }else{
            if(ctx.type() instanceof B314Parser.TypearrayContext){
                B314Parser.TypearrayContext ctx_tempType = (B314Parser.TypearrayContext) ctx.type();
                B314Parser.ArraydeclContext arraydecl = (B314Parser.ArraydeclContext) ctx_tempType.array();
                B314Parser.ScalarContext scalarContext = arraydecl.scalar();
                ScalarType scalar = new ScalarType(scalarContext.getText());
                List<TerminalNode> list_sizes = arraydecl.NUMBER();
                int[] taille = new int[list_sizes.size()];
                for(int i = 0; i<list_sizes.size(); i++){
                    String taille_string = list_sizes.get(i).getText();
                    taille[i] = Integer.parseInt(taille_string);
                }
                type = new ArrayType(ctx.ID().getText(),  scalar, taille);
            }

        }
        symbol= new VariableSymbol(ctx.ID().getText(), type, currentScope.getVarCount()+5, decalage);
        currentScope.define(symbol);

    }

    /**
     * Function triggered when we enter a left-expression that is a simple variable. Checks if id is an array or not.
     * Exception thrown if it's an array.
     * @param ctx Left-expression id Context
     */
    @Override public void enterExprgid(B314Parser.ExprgidContext ctx)
    {
        Symbol sym = currentScope.resolve(ctx.ID().getText());
        if(sym.getType() instanceof ArrayType){
            throw new InvalidExpressionException();
        }
    }

    /**
     * Function triggered when we enter a left-expression that is an array.
     * Checks if indexes are correct and if the variable is an array.
     * @param ctx Left-expression Array Context
     */
    @Override public void enterExprgtab(B314Parser.ExprgtabContext ctx)
    {
        Symbol sym = currentScope.resolve(ctx.ID().getText());
        if(!(sym.getType() instanceof ArrayType)){
            throw new InvalidExpressionException();
        }
        ArrayType type = (ArrayType) sym.getType();
        List<B314Parser.ExprentContext> index_list = ctx.exprent();
        if(index_list.size()!=type.getTailleTab().length){
             throw new InvalidIndexationException();
        }
    }

    /**
     * This method is triggers when the program enters a function declaration. Checks if a function is defined properly.
     * @param ctx Function Context
     */
    @Override public void enterDeclaration_function(B314Parser.Declaration_functionContext ctx)
    {
        Type type;
        if(ctx.scalar()==null)
        {
            type = new Type("void");

        }else{
            type = new ScalarType(ctx.scalar().getText());
            if(ctx.instruction().size()==0){
                throw new InvalidFunctionDefinitionException();
            }
        }
        int index_LPAR = 0;
        int index = 0;
        while(index_LPAR == 0){
            if(ctx.getChild(index).equals(ctx.LPAR())){
                index_LPAR = index;
            }
            index++;
        }
        int index_RPAR = 0;
        index = 0;
        while(index_RPAR == 0){
            if(ctx.getChild(index).equals(ctx.RPAR())){
                index_RPAR = index;
            }
            index++;
        }
        for(int i = 0; i<ctx.vardecl().size(); i++){
            B314Parser.VardeclContext ctx_temp = ctx.vardecl(i);
            if(ctx_temp.type() instanceof B314Parser.TypearrayContext){
                for(int j=0; j<ctx.getChildCount();j++){
                    if(ctx.getChild(j).equals(ctx_temp)&&j>index_LPAR&&j<index_RPAR){
                        throw new InvalidFunctionDefinitionException();
                    }
                }
            }

        }
        Symbol[] parameters = new Symbol[ctx.vardecl().size()];
        for(int i = 0; i<ctx.vardecl().size();i++){
            for(int j = 0; j<ctx.getChildCount(); j++){
                if(ctx.getChild(j).equals(ctx.vardecl(i))&&(j<index_RPAR&&j>index_LPAR)){
                    parameters[i] = new Symbol(ctx.vardecl(i).ID().getText(),new Type(ctx.vardecl(i).type().getText()));
                }
            }
        }
        Function symbolAndScope = new Function(ctx.ID().getText(), type, ctx.ID().getText()+"Scope", currentScope, parameters);
        ((GlobalScope)currentScope).addChildScope(symbolAndScope);
        currentScope = symbolAndScope;
    }

    /**
     * Sets the current scope to the super-scope (Enclosing Scope).
     * @param ctx Function Declaration Context
     */
    @Override public void exitDeclaration_function(B314Parser.Declaration_functionContext ctx)
    {
        currentScope = currentScope.getEnclosingScope();
    }

    /**
     * Creates a new WhenScope as a Child Scope, and sets the Current Scope as the new When Scope.
     * @param ctx When Clause Context
     */
    @Override public void enterWhenclause(B314Parser.WhenclauseContext ctx)
    {
        WhenScope when = new WhenScope(ctx.exprbool().getText()+"_WhenScope",currentScope);
        ((GlobalScope)currentScope).addChildScope(when);
        currentScope = when;
    }

    /**
     * Sets the current scope as the Enclosing Scope.
     * @param ctx When Clause Context
     */
    @Override public void exitWhenclause(B314Parser.WhenclauseContext ctx)
    {
        currentScope = currentScope.getEnclosingScope();
    }

    /**
     * Creates a new When Scope as a Default Clause, adds it as a Child to the Current Scope and sets it as the Current Scope.
     * @param ctx Default Clause Context
     */
    @Override public void enterDefaultclause(B314Parser.DefaultclauseContext ctx) {
        WhenScope when = new WhenScope("Defaultclause_Scope", currentScope);
        ((GlobalScope)currentScope).addChildScope(when);
        currentScope = when;
    }

    /**
     * First method to be triggered when the program is entered. Created as a workaround for a problem we met during development.
     * Goes through all variable and function definitions of the program and adds the function declarations in a map.
     * @param ctx Program Context
     */
    @Override public void enterProgram(B314Parser.ProgramContext ctx)
    {
        for(int i = 0; i<ctx.vardecl().size();i++){
            Symbol symbol;
            Type type=null;
            if(ctx.vardecl(i).type() instanceof B314Parser.TypescalarContext){

                type = new ScalarType(ctx.vardecl(i).type().getText());
            }else{
                if(ctx.vardecl(i).type() instanceof B314Parser.TypearrayContext){
                    B314Parser.TypearrayContext ctx_tempType = (B314Parser.TypearrayContext) ctx.vardecl(i).type();
                    B314Parser.ArraydeclContext arraydecl = (B314Parser.ArraydeclContext) ctx_tempType.array();
                    B314Parser.ScalarContext scalarContext = arraydecl.scalar();
                    ScalarType scalar = new ScalarType(scalarContext.getText());
                    List<TerminalNode> list_sizes = arraydecl.NUMBER();
                    int[] taille = new int[list_sizes.size()];
                    for(int j = 0; j<list_sizes.size(); j++){
                        String taille_string = list_sizes.get(j).getText();
                        taille[j] = Integer.parseInt(taille_string);
                    }
                    type = new ArrayType(ctx.vardecl(i).ID().getText(),  scalar, taille);
                }

            }
            symbol= new VariableSymbol(ctx.vardecl(i).ID().getText(), type, global.getVarCount()+99, 0);
            global.define(symbol);
        }
        for(int i = 0; i<ctx.fctdecl().size(); i++){
            Type type;
            Symbol symbol;
            if(ctx.fctdecl(i) instanceof B314Parser.Declaration_functionContext){
                B314Parser.Declaration_functionContext ctx_temp = (B314Parser.Declaration_functionContext) ctx.fctdecl(i);
                if(ctx_temp.scalar()==null){
                    type = new Type("void");
                }else{
                    type = new ScalarType(ctx_temp.scalar().getText());
                }
                symbol = new Symbol(ctx_temp.ID().getText(), type);
                allDeclareFonction.put(symbol.getName(), symbol);
            }
        }

    }

    @Override
    public void exitProgram(B314Parser.ProgramContext ctx) {
        if(currentScope.getScopeName().equals("Symbols' table")) {
            currentScope = currentScope.getEnclosingScope();
        }
    }

    /**
     * Sets the Current Scope as the Enclosing Scope.
     * @param ctx Default Clause Context
     */
    @Override public void exitDefaultclause(B314Parser.DefaultclauseContext ctx)
    {
        currentScope = currentScope.getEnclosingScope();
    }

    /**
     * Triggered when a variables equals another variable. Checks if the variables are coherent with one another (same type).
     * If that is not the case, an InvalidExpressionException is thrown.
     * @param ctx Variables equals Variable Context
     */
    @Override public void enterVaregalvar(B314Parser.VaregalvarContext ctx)
    {
        Type type1;
        Type type2;
        if(ctx.exprg(0) instanceof B314Parser.ExprgidContext){
            B314Parser.ExprgidContext scalarContext = (B314Parser.ExprgidContext) ctx.exprg(0);
            Symbol sym = currentScope.resolve(scalarContext.ID().getText());
            type1 = sym.getType();
        }else{
            B314Parser.ExprgtabContext arrayContext = (B314Parser.ExprgtabContext) ctx.exprg(0);
            Symbol sym = currentScope.resolve(arrayContext.ID().getText());
            type1 = ((ArrayType) sym.getType()).getTypeBase();
        }
        if(ctx.exprg(1) instanceof B314Parser.ExprgidContext){
            B314Parser.ExprgidContext scalarContext = (B314Parser.ExprgidContext) ctx.exprg(1);
            Symbol sym = currentScope.resolve(scalarContext.ID().getText());
            type2 = sym.getType();
        }else{
            B314Parser.ExprgtabContext arrayContext = (B314Parser.ExprgtabContext) ctx.exprg(1);
            Symbol sym = currentScope.resolve(arrayContext.ID().getText());
            type2 = ((ArrayType) sym.getType()).getTypeBase();
        }
        if(!type1.getName().equals(type2.getName())){
            throw new InvalidExpressionException();
        }
    }

    /**
     * Checks if the variable part is either a simple variable or an array and compares the type of
     * variable with the type of the function; if the types are not the same, throws an InvalidExpressionException.
     * @param ctx Variable equals Function Context
     */
    @Override public void enterVaregalfct(B314Parser.VaregalfctContext ctx)
    {
        Type type1;
        Type type2;
        if(ctx.exprg() instanceof B314Parser.ExprgidContext){
            B314Parser.ExprgidContext scalarContext = (B314Parser.ExprgidContext) ctx.exprg();
            Symbol sym = currentScope.resolve(scalarContext.ID().getText());
            type1 = sym.getType();
        }else{
            B314Parser.ExprgtabContext arrayContext = (B314Parser.ExprgtabContext) ctx.exprg();
            Symbol sym = currentScope.resolve(arrayContext.ID().getText());
            type1 = ((ArrayType) sym.getType()).getTypeBase();
        }
        Symbol function = allDeclareFonction.get(ctx.ID().getText());
        type2 = function.getType();
        if(!type1.getName().equals(type2.getName())){
            throw new InvalidExpressionException();
        }
    }

    /**
     * Checks if the variable part is either a simple variable or an array and compares the type of
     * variable with the type of the function; if the types are not the same, throws an InvalidExpressionException.
     * @param ctx Function equals Variable Context
     */
    @Override public void enterFctegalvar(B314Parser.FctegalvarContext ctx)
    {
        Type type1;
        Type type2;
        if(ctx.exprg() instanceof B314Parser.ExprgidContext){
            B314Parser.ExprgidContext scalarContext = (B314Parser.ExprgidContext) ctx.exprg();
            Symbol sym = currentScope.resolve(scalarContext.ID().getText());
            type1 = sym.getType();
        }else{
            B314Parser.ExprgtabContext arrayContext = (B314Parser.ExprgtabContext) ctx.exprg();
            Symbol sym = currentScope.resolve(arrayContext.ID().getText());
            type1 = ((ArrayType) sym.getType()).getTypeBase();
        }
        Symbol function = allDeclareFonction.get(ctx.ID().getText());
        type2 = function.getType();
        if(!type1.getName().equals(type2.getName())){
            throw new InvalidExpressionException();
        }
    }

    /**
     * Checks if the two symbols of the two functions are of the same type, and if that's not the case, throws
     * an InvalidExpressionException.
     * @param ctx Function equals Function Context
     */
    @Override public void enterFctegalfct(B314Parser.FctegalfctContext ctx)
    {
        Type type1;
        Type type2;
        Symbol function1 = allDeclareFonction.get(ctx.ID(0).getText());
        Symbol function2 = allDeclareFonction.get(ctx.ID(1).getText());
        type1=function1.getType();
        type2 = function2.getType();
        if(!type1.getName().equals(type2.getName())){
            throw new InvalidExpressionException();
        }

    }

}
