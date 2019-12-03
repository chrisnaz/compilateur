grammar B314;


import B314Words;

root:programme;
type: scalar # typescalar | array #typearray;
scalar: BOOLEAN # scalarbool |INTEGER #scalarinteger |SQUARE #scalarsquare;
array: scalar CROU NUMBER (COMA NUMBER)? CRFE #arraydecl;
vardecl: ID AS type ;
exprent:(MOINS)? NUMBER #numberexpr
        | LPAR exprent RPAR #expentierpar
        | LATITUDE # latexpr
        | LONGITUDE #longexpr
        | GRID SIZE #grandsizexpr
        | (MAP | RADIO | AMMO | FRUITS| SODA) COUNT #itemexpr
        | LIFE #lifexpr
        | exprent op=(MUL|DIV|MODULO) exprent #exprmuldivmod
        | exprent op=(PLUS|MOINS) exprent #plusmoinsexpr
        | ID LPAR (exprd ( COMA exprd)*)? RPAR #appeldefonction1
        | exprg #variableentier; // pour manipuler les tableau d'entier

exprbool: LPAR exprbool RPAR #exprboolpar
         | TRUE #truexpr
         | FALSE #falsexpr
         | ENNEMI IS ( NORTH|SOUTH|EAST|WEST) #ennemipositionexpr
         | GRAAL IS (NORTH | SOUTH |EAST| WEST) #graalpositionexpr
         | exprg EGALE exprg #varegalvar
         | exprg EGALE ID LPAR (exprd ( COMA exprd)*)? RPAR #varegalfct
         | ID LPAR (exprd ( COMA exprd)*)? RPAR EGALE exprg #fctegalvar
         | ID LPAR (exprd ( COMA exprd)*)? RPAR EGALE ID LPAR (exprd ( COMA exprd)*)? RPAR #fctegalfct
         | exprent comparator=(INF|SUP|EGALE) exprent #infsupegalexpr
         | exprbool EGALE exprbool #egalite_boolean
         | exprcase EGALE exprcase #egalite_square
         | NOT exprbool #notexpr
         | exprbool (AND|OR) exprbool #orandexpr
         | ID LPAR (exprd ( COMA exprd)*)? RPAR #appeldefonction2
         | exprg #variableboolean; // pour manipuler les tableau de boolean et variable

exprcase: LPAR exprcase RPAR #exprcasepar //??
         | DIRT #dirtexpr
         | ROCK  #rockexpr
         | VINES #vinexpr
         | ZOMBIE #zombiexpr
         | PLAYER #playerexpr
         | ENNEMI #ennemiexpr
         | MAP #mapexpr
         | RADIO #radioexpr
         | AMMO #ammoexpr
         | FRUITS #fruitsexpr
         | SODA #sodaexpr
         | NEARBY CROU exprent COMA exprent CRFE #nearbyexpr
         | ID LPAR (exprd ( COMA exprd)*)? RPAR #appeldefonction3 //appel à une fonction de type case
         | exprg #variablecase ;//manipuler tableau et variable

exprd:  exprg #appelvar
        | ID LPAR (exprd ( COMA exprd)*)? RPAR #appelfonction
        | exprent #expentierdroit
        | exprbool #exprbooldroit
        | exprcase #exprcasedroit;



exprg: ID #exprgid
       | ID CROU exprent(COMA exprent)? CRFE #exprgtab ;

instruction: SKIPINSTR #skipinstruction
             | IF exprbool THEN (instruction)+ DONE #iftheninstr
             | IF exprbool THEN (instruction)+ ELSE (instruction)+ DONE #ifthenelseinstr
             | WHILE exprbool DO (instruction)+ DONE #whileinstr
             | SET exprg TO exprd #setinstr
             | COMPUTE exprd #computeinstr
             | NEXT action #nextinstr;
action: MOVE ( NORTH | SOUTH | EAST | WEST) #moveaction
        | SHOOT ( NORTH | SOUTH | EAST | WEST) #shootaction
        | USE (MAP| RADIO | FRUITS|SODA) #useaction
        | DO NOTHING #donothingaction ; 

fctdecl: ID AS FUNCTION LPAR (vardecl(COMA vardecl)*)? RPAR DUOPOINT (scalar | VOID)
         (DECLARE LOCAL (vardecl POINTVIRGULE)+)?
          DO (instruction)+ DONE #declaration_function;

programme: DECLARE AND RETAIN
             (vardecl POINTVIRGULE | fctdecl)*
               WHEN YOUR TURN
                (clausewhen)*
                clausedefault #program ;
clausewhen: WHEN exprbool
             (DECLARE LOCAL(vardecl POINTVIRGULE)+)?
              DO (instruction)+ DONE #whenclause ;
clausedefault:  BY DEFAULT
                   (DECLARE LOCAL (vardecl POINTVIRGULE)+)?
                    DO (instruction)+ DONE EOF #defaultclause ;
