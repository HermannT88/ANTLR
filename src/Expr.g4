grammar Expr;
prog: stat+ ;
stat: expr NEWLINE
 | ID '=' expr NEWLINE
 | NEWLINE
 ;
expr: expr (MUL | DIV) expr
 | expr (ADD | SUB) expr
 | INT
 | ID
 | '(' expr ')'
 ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip ;