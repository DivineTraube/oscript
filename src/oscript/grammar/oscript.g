grammar oscript;

options {
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}

tokens {
  BLOCK;
  RETURN;
  STATEMENTS;
  FUNC_CALL;
  FOREACH;
  EXP;
  EXP_LIST;
  ID_LIST;
  IF;
  TERNARY;
  UNARY_MIN;
  NEGATE;
  FUNCTION;
  INDEXES;
  LIST;
  LOOKUP;
  OS;
}

@header {
  package oscript.grammar;
  import java.util.Map; 
  import java.util.HashMap; 
  import oscript.*;
  import oscript.tree.*;
}

@lexer::header {
  package oscript.grammar;
}

@parser::members {
  public Map<String, Function> functions = new HashMap<String, Function>();
  private void defineFunction(String id, Object formalParamList, Object block) {
    CommonTree formalParamListTree = formalParamList == null ? new CommonTree() : (CommonTree)formalParamList; 
    CommonTree blockTree = (CommonTree)block; 
    String key = id + formalParamListTree.getChildCount(); 
    functions.put(key, new Function(id, formalParamListTree, blockTree)); 
  }
}

parse
  : block EOF!
  ;

block
  :(functionDecl | statement)* ('return' expression ';'?)?
    -> ^(BLOCK ^(STATEMENTS statement*) ^(RETURN expression?))
  ;
  
blockBracketed
  : '{'! block '}'!
  ;
  
blockOneLine
  :(functionDecl | statement | ('return' expression ';'?) )
    -> ^(BLOCK ^(STATEMENTS statement) ^(RETURN expression))
  ;

functionDecl
  : 'def' IDENT '('! idList? ')'! blockBracketed 
    {defineFunction($IDENT.text, $idList.tree, $blockBracketed.tree);}
  ;
  
idList
  : IDENT (',' IDENT)* -> ^(ID_LIST IDENT+)
  ;
  
statement
  :  assignment ';'? -> assignment
  |  functionCall ';'? -> functionCall
  |  ifStatement  
  |  forStatement  
  |  forEachStatement  
  |  whileStatement 
  ;

assignment
  : IDENT indexes?  ('='^ expression)?
  ;
  
indexes
  : ('[' expression ']' )+ -> ^(INDEXES expression+)
  ;
  
functionCall
  : IDENT '(' exprList? ')' -> ^(FUNC_CALL IDENT exprList?)
  | 'print' expressionBracketed -> ^(FUNC_CALL 'print' expressionBracketed)
  | 'println' expressionBracketed -> ^(FUNC_CALL 'println' expressionBracketed)
  | 'size' expressionBracketed -> ^(FUNC_CALL 'size' expressionBracketed)
  | 'assert' expressionBracketed -> ^(FUNC_CALL 'assert' expressionBracketed)
  | 'alert' expressionBracketed -> ^(FUNC_CALL 'alert' expressionBracketed)
  |  COMMAND -> ^(FUNC_CALL OS COMMAND)
  ;


//Kontrollstrukturen: if, for, while  
  
ifStatement
  : ifBlock elseIfBlock* elseBlock? -> ^(IF ifBlock elseIfBlock* elseBlock?)
  ;
  
ifBlock
  : 'if' expressionBracketed blockBracketed -> ^(EXP expressionBracketed blockBracketed)
  ; 
  
elseIfBlock
  : 'else' 'if' expressionBracketed  blockBracketed -> ^(EXP expressionBracketed  blockBracketed)
  ;
  
elseBlock
  : 'else' blockBracketed -> ^(EXP blockBracketed)
  ;
  
forStatement
  : 'for'^ '('! IDENT '<-'! expression 'to'! expression ')'! blockBracketed
  ;
  
forEachStatement
  : ('for' 'each' | 'foreach') '(' IDENT '<-' expression ')' blockBracketed
    -> ^(FOREACH IDENT expression blockBracketed)
  ; 
  
whileStatement
  : 'while'^ expressionBracketed blockBracketed
  ;
 
list
  : '[' exprList? ']' -> ^(LIST exprList?)
  ;
  

//Expressions
  
atom
  : 'null'
  | NUMBER
  | BOOLEAN
  | lookup
  ;
  
lookup
  : IDENT indexes? -> ^(LOOKUP IDENT indexes?)
  | STRING_LITERAL indexes? -> ^(LOOKUP STRING_LITERAL indexes?)
  | expressionBracketed indexes? -> ^(LOOKUP expressionBracketed indexes?)
  | functionCall indexes? -> ^(LOOKUP functionCall indexes?)
  | list indexes? -> ^(LOOKUP list indexes?)
  ;

unary
  : '!' atom -> ^(NEGATE atom)
  | '-' atom -> ^(UNARY_MIN atom)
  | atom
  ;

power
  : unary ('^'^ unary)*
  ;
  
mult
  : power (('*' | '/' | '%')^ power)*
  ;
  
add
  : mult (('+' | '-')^ mult)*
  ;
  
relation
  : add (('==' | '!=' | '<' | '<=' | '>' | '>=')^ add)*
  ;
  
bool
  : relation (('&&' | '||')^ relation)*
  ;
  
conditional
  : (bool -> bool)
    ('?' a=expression ':' b=expression  -> ^(TERNARY bool $a $b)
      | 'in' expression                 -> ^('in' bool expression)
    )?
  ;
 
expression
  : conditional
  ;

exprList
  : expression (',' expression)* -> ^(EXP_LIST expression+)
  ;

expressionBracketed
  : '('! expression ')'!
  ;
  
  
fragment LETTER : ('a'..'z' | 'A'..'Z' | 'ä' | 'ö' | 'ü');
fragment DIGIT : '0'..'9'; 
fragment INTEGER: ('1'..'9' DIGIT* | '0');
BOOLEAN : ('true' | 'false');
STRING_LITERAL
	@after { 
	  setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1")); 
	}  
  :  '"'  (~('"' | '\\')  | '\\' ('\\' | '"'))* '"'   
  |  '\'' (~('\'' | '\\') | '\\' ('\\' | '\''))* '\''  
  ;  
COMMAND 
  :  { StringBuilder b = new StringBuilder(); } 
  'os' WS* '{'  
  (
  com=~('}') {b.appendCodePoint(com);}
  )*  
  '}'
  { setText(b.toString()); }
  ; 
NUMBER : INTEGER ('.' DIGIT*)?;
IDENT : LETTER (LETTER | DIGIT)*;
DOLLAR_IDENT : '$' IDENT;
WS : (' ' | '\t' | '\n' | '\r' | '\f' )+ {$channel = HIDDEN;} ;
COMMENT: ('//' | '#') .* ('\n' | '\r') {$channel = HIDDEN;} ;
MULTILINE_COMMENT: '/*' .* '*/' {$channel = HIDDEN;} ;