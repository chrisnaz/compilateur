lexer grammar B314Words;


// Identifiers

//Word
BOOLEAN: 'boolean';
INTEGER: 'integer';
SQUARE: 'square';
CROU: '[';
CRFE: ']';
COMA: ',';
AS: 'as';
DECLARE: 'declare';
AND: 'and';
RETAIN : 'retain';
LPAR:'(' ;
RPAR: ')';
VOID: 'void';
LATITUDE: 'latitude';
LONGITUDE: 'longitude';
GRID: 'grid';
SIZE: 'size';
MAP: 'map';
RADIO: 'radio';
AMMO: 'ammo';
FRUITS: 'fruits';
SODA: 'soda';
COUNT: 'count';
LIFE: 'life';
PLUS: '+';
MOINS: '-';
MUL: '*';
DIV: '/';
MODULO: '%';
TRUE: 'true';
FALSE: 'false';
ENNEMI: 'ennemi';
IS: 'is';
NORTH: 'north';
SOUTH: 'south';
EAST: 'east';
WEST: 'west';
GRAAL: 'graal';
OR: 'or';
NOT: 'not';
INF: '<';
SUP: '>';
EGALE: '=';
DIRT: 'dirt';
ROCK: 'rock';
VINES: 'vines';
ZOMBIE: 'zombie';
PLAYER: 'player';
NEARBY: 'nearby';
SKIPINSTR: 'skip';
NEXT: 'next';
IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
DONE: 'done';
SET: 'set';
DO: 'do';
TO: 'to';
COMPUTE: 'compute';
MOVE: 'move';
SHOOT: 'shoot';
USE: 'use';
NOTHING: 'nothing';
FUNCTION: 'function';
LOCAL: 'local';
DUOPOINT: ':';
YOUR: 'your';
TURN: 'turn';
BY: 'by';
DEFAULT: 'default';
POINTVIRGULE: ';';
WHEN: 'when';




ID: LETTER (LETTER | DIGIT)* ;

NUMBER: (DIGIT)+;

fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;

// Comments -> ignored

COMMENT: '/*' .*? '*/' -> skip;

// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;