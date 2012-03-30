tree grammar oscriptWalker;

options {
  language = Java;
  tokenVocab = oscript;
  ASTLabelType = CommonTree;
}

@header {
  package oscript.grammar;
  import java.util.Map;
  import java.util.List;
  import java.util.HashMap;
  import java.util.LinkedList;
  import oscript.*;
  import oscript.tree.*;
  import oscript.tree.functions.*;
}

@members {
  public Map<String, Function> functions = null;
  Scope currentScope = null;
  
  public oscriptWalker(CommonTreeNodeStream nodes, Map<String, Function> functions) {
    this(nodes, null, functions);
  }

  public oscriptWalker(CommonTreeNodeStream nodes, Scope scope, Map<String, Function> functions) {
    super(nodes);
    this.currentScope = scope;
    this.functions = functions;
  }
}

walk returns [Node node]
  : block {node = $block.node;}
  ;

block returns [Node node]
	@init {
	  BlockNode bn = new BlockNode();
	  node = bn;
	  Scope scope = new Scope(currentScope);
	  currentScope = scope;  
	} 
	@after {
	  currentScope = currentScope.parent();
	}
  : ^(BLOCK 
      ^(STATEMENTS (statement {bn.addStatement($statement.node);})*)
      ^(RETURN (expression    {bn.addReturnStatement($expression.node);})?)
      )
  ;
  
  
idList returns [java.util.List<String> i]
  : ^(ID_LIST IDENT+)
  ;
  
statement returns [Node node]
  :  assignment     {node = $assignment.node;}
  |  functionCall   {node = $functionCall.node;}
  |  ifStatement    {node = $ifStatement.node;}
  |  forStatement   {node = $forStatement.node;}
  |  forEachStatement   {node = $forEachStatement.node;}
  |  whileStatement {node = $whileStatement.node;}
  ;
 
assignment returns [Node node]
  : ^('=' i=IDENT x=indexes? e=expression)
    {node = new AssignmentNode($i.text, $x.e, $e.node, currentScope);}
  ;
  
indexes returns [List<Node> e]
  @init {
    e = new LinkedList<Node>();
  }
  : ^(INDEXES (expression {e.add($expression.node);})+)
  ;
  
functionCall returns [Node node]
  : ^(FUNC_CALL IDENT exprList?)      {node = new FunctionCallNode($IDENT.text, $exprList.e, functions);}
  | ^(FUNC_CALL 'print' expression)   {node = new PrintNode($expression.node); }
  | ^(FUNC_CALL 'println' expression) {node = new PrintNode($expression.node, "\n"); }
  | ^(FUNC_CALL 'size' expression)    {node = new SizeNode($expression.node);}
  | ^(FUNC_CALL 'assert' expression)  {node = new AssertNode($expression.node);}
  | ^(FUNC_CALL OS COMMAND)           {node = new OSCallNode($COMMAND.text);}
  ;


ifStatement returns [Node node]
  @init  { 
	  IfNode ifNode = new IfNode(); 
	  node = ifNode; 
	}  
  : ^(IF
      (^(EXP expression b1=block) {ifNode.addChoice($expression.node,$b1.node); } )+
      (^(EXP b2=block) {ifNode.addChoice(new AtomNode(true),$b2.node); } )?
      )
  ;

  
forStatement returns [Node node]
  : ^('for' var=IDENT  from=expression  to=expression  b=block)
    { node = new ForNode($var.text, $from.node, $to.node, $b.node, currentScope); }
  ; 
forEachStatement returns [Node node]
  : ^(FOREACH var=IDENT  in=expression b=block)
    { node = new ForEachNode($var.text, $in.node, $b.node, currentScope); }
  ; 
  
whileStatement returns [Node node]
  : ^('while' expression block)
    { node = new WhileNode($expression.node, $block.node); }
  ;
 
list returns [Node node]
  : ^(LIST exprList?) {node = new ListNode($exprList.e); }
  ;
  
lookup returns [Node node]
  : ^(LOOKUP i=IDENT x=indexes?)
    {node = ($x.e != null) ? new LookupNode(new IdentifierNode($i.text, currentScope), $x.e)
                           : new IdentifierNode($i.text, currentScope);
    }
  | ^(LOOKUP STRING_LITERAL x=indexes?)
    {node = ($x.e != null) ? new LookupNode(new AtomNode($STRING_LITERAL.text), $x.e) 
                           : new AtomNode($STRING_LITERAL.text);}  
  | ^(LOOKUP expression x=indexes?)
    {node = ($x.e != null) ? new LookupNode($expression.node, $x.e) 
                           : $expression.node;}  
  | ^(LOOKUP functionCall x=indexes?)
    {node = ($x.e != null) ? new LookupNode($functionCall.node, $x.e) 
                           : $functionCall.node;}  
  | ^(LOOKUP list x=indexes?)
    {node = ($x.e != null) ? new LookupNode($list.node, $x.e) 
                           : $list.node;}  
  ;
 
expression returns [Node node]
  : ^(TERNARY a=expression b=expression c=expression)  {node = new TernaryNode($a.node, $b.node, $c.node);}
  | ^('in' a=expression b=expression)                  {node = new InNode($a.node, $b.node);}
  |  ^('||' a=expression b=expression)                 {node = new OrNode($a.node, $b.node);}
  |  ^('&&' a=expression b=expression)                 {node = new AndNode($a.node, $b.node);}
  |  ^('==' a=expression b=expression)                 {node = new EqualsNode($a.node, $b.node);}
  |  ^('!=' a=expression b=expression)                 {node = new NotEqualsNode($a.node, $b.node);}
  |  ^('>=' a=expression b=expression)                 {node = new GTEqualsNode($a.node, $b.node);}
  |  ^('<=' a=expression b=expression)                 {node = new LTEqualsNode($a.node, $b.node);}
  |  ^('>' a=expression b=expression)                  {node = new GTNode($a.node, $b.node);}
  |  ^('<' a=expression b=expression)                  {node = new LTNode($a.node, $b.node);}
  |  ^('+' a=expression b=expression)                  {node = new AddNode($a.node, $b.node);}
  |  ^('-' a=expression b=expression)                  {node = new SubNode($a.node, $b.node);}
  |  ^('*' a=expression b=expression)                  {node = new MulNode($a.node, $b.node);}
  |  ^('/' a=expression b=expression)                  {node = new DivNode($a.node, $b.node);}
  |  ^('%' a=expression b=expression)                  {node = new ModNode($a.node, $b.node);}
  |  ^('^' a=expression b=expression)                  {node = new PowNode($a.node, $b.node);}
  |  ^(UNARY_MIN a=expression)                         {node = new UnaryMinusNode($a.node);}
  |  ^(NEGATE a=expression)                            {node = new NegateNode($a.node);}
  | 'null'                                             {node = new AtomNode(null); }
  | NUMBER                                             {node = new AtomNode(Double.parseDouble($NUMBER.text)); }
  | BOOLEAN                                            {node = new AtomNode(Boolean.parseBoolean($BOOLEAN.text)); }
  | lookup                                             {node = $lookup.node; }
  ;

exprList returns [java.util.List<Node> e]
  @init {
    e = new LinkedList<Node>();
  }
  : ^(EXP_LIST (expression {e.add($expression.node); })+)
  ;