// $ANTLR 3.4 C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g 2012-03-30 14:55:14

  package oscript.grammar;
  import java.util.Map;
  import java.util.List;
  import java.util.HashMap;
  import java.util.LinkedList;
  import oscript.*;
  import oscript.tree.*;
  import oscript.tree.functions.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class oscriptWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "BOOLEAN", "COMMAND", "COMMENT", "DIGIT", "DOLLAR_IDENT", "EXP", "EXP_LIST", "FOREACH", "FUNCTION", "FUNC_CALL", "IDENT", "ID_LIST", "IF", "INDEXES", "INTEGER", "LETTER", "LIST", "LOOKUP", "MULTILINE_COMMENT", "NEGATE", "NUMBER", "OS", "RETURN", "STATEMENTS", "STRING_LITERAL", "TERNARY", "UNARY_MIN", "WS", "'!'", "'!='", "'%'", "'&&'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "':'", "';'", "'<'", "'<-'", "'<='", "'='", "'=='", "'>'", "'>='", "'?'", "'['", "']'", "'^'", "'alert'", "'assert'", "'def'", "'each'", "'else'", "'for'", "'foreach'", "'if'", "'in'", "'null'", "'print'", "'println'", "'return'", "'size'", "'to'", "'while'", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int BLOCK=4;
    public static final int BOOLEAN=5;
    public static final int COMMAND=6;
    public static final int COMMENT=7;
    public static final int DIGIT=8;
    public static final int DOLLAR_IDENT=9;
    public static final int EXP=10;
    public static final int EXP_LIST=11;
    public static final int FOREACH=12;
    public static final int FUNCTION=13;
    public static final int FUNC_CALL=14;
    public static final int IDENT=15;
    public static final int ID_LIST=16;
    public static final int IF=17;
    public static final int INDEXES=18;
    public static final int INTEGER=19;
    public static final int LETTER=20;
    public static final int LIST=21;
    public static final int LOOKUP=22;
    public static final int MULTILINE_COMMENT=23;
    public static final int NEGATE=24;
    public static final int NUMBER=25;
    public static final int OS=26;
    public static final int RETURN=27;
    public static final int STATEMENTS=28;
    public static final int STRING_LITERAL=29;
    public static final int TERNARY=30;
    public static final int UNARY_MIN=31;
    public static final int WS=32;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public oscriptWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public oscriptWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return oscriptWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g"; }


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



    // $ANTLR start "walk"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:35:1: walk returns [Node node] : block ;
    public final Node walk() throws RecognitionException {
        Node node = null;


        Node block1 =null;


        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:36:3: ( block )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:36:5: block
            {
            pushFollow(FOLLOW_block_in_walk62);
            block1=block();

            state._fsp--;


            node = block1;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "walk"



    // $ANTLR start "block"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:39:1: block returns [Node node] : ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final Node block() throws RecognitionException {
        Node node = null;


        Node statement2 =null;

        Node expression3 =null;



        	  BlockNode bn = new BlockNode();
        	  node = bn;
        	  Scope scope = new Scope(currentScope);
        	  currentScope = scope;  
        	
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:49:3: ( ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:49:5: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_block95); 

            match(input, Token.DOWN, null); 
            match(input,STATEMENTS,FOLLOW_STATEMENTS_in_block105); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:50:20: ( statement )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==FOREACH||LA1_0==FUNC_CALL||LA1_0==IF||LA1_0==49||LA1_0==62||LA1_0==72) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:50:21: statement
                	    {
                	    pushFollow(FOLLOW_statement_in_block108);
                	    statement2=statement();

                	    state._fsp--;


                	    bn.addStatement(statement2);

                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input,RETURN,FOLLOW_RETURN_in_block122); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:51:16: ( expression )?
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==BOOLEAN||LA2_0==LOOKUP||(LA2_0 >= NEGATE && LA2_0 <= NUMBER)||(LA2_0 >= TERNARY && LA2_0 <= UNARY_MIN)||(LA2_0 >= 34 && LA2_0 <= 36)||(LA2_0 >= 39 && LA2_0 <= 40)||(LA2_0 >= 42 && LA2_0 <= 43)||LA2_0==46||LA2_0==48||(LA2_0 >= 50 && LA2_0 <= 52)||LA2_0==56||(LA2_0 >= 65 && LA2_0 <= 66)||LA2_0==74) ) {
                    alt2=1;
                }
                switch (alt2) {
                    case 1 :
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:51:17: expression
                        {
                        pushFollow(FOLLOW_expression_in_block125);
                        expression3=expression();

                        state._fsp--;


                        bn.addReturnStatement(expression3);

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 


            }


            	  currentScope = currentScope.parent();
            	
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "block"



    // $ANTLR start "idList"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:56:1: idList returns [java.util.List<String> i] : ^( ID_LIST ( IDENT )+ ) ;
    public final java.util.List<String> idList() throws RecognitionException {
        java.util.List<String> i = null;


        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:57:3: ( ^( ID_LIST ( IDENT )+ ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:57:5: ^( ID_LIST ( IDENT )+ )
            {
            match(input,ID_LIST,FOLLOW_ID_LIST_in_idList164); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:57:15: ( IDENT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:57:15: IDENT
            	    {
            	    match(input,IDENT,FOLLOW_IDENT_in_idList166); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return i;
    }
    // $ANTLR end "idList"



    // $ANTLR start "statement"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:60:1: statement returns [Node node] : ( assignment | functionCall | ifStatement | forStatement | forEachStatement | whileStatement );
    public final Node statement() throws RecognitionException {
        Node node = null;


        Node assignment4 =null;

        Node functionCall5 =null;

        Node ifStatement6 =null;

        Node forStatement7 =null;

        Node forEachStatement8 =null;

        Node whileStatement9 =null;


        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:61:3: ( assignment | functionCall | ifStatement | forStatement | forEachStatement | whileStatement )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt4=1;
                }
                break;
            case FUNC_CALL:
                {
                alt4=2;
                }
                break;
            case IF:
                {
                alt4=3;
                }
                break;
            case 62:
                {
                alt4=4;
                }
                break;
            case FOREACH:
                {
                alt4=5;
                }
                break;
            case 72:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:61:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement188);
                    assignment4=assignment();

                    state._fsp--;


                    node = assignment4;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:62:6: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_statement201);
                    functionCall5=functionCall();

                    state._fsp--;


                    node = functionCall5;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:63:6: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement212);
                    ifStatement6=ifStatement();

                    state._fsp--;


                    node = ifStatement6;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:64:6: forStatement
                    {
                    pushFollow(FOLLOW_forStatement_in_statement224);
                    forStatement7=forStatement();

                    state._fsp--;


                    node = forStatement7;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:65:6: forEachStatement
                    {
                    pushFollow(FOLLOW_forEachStatement_in_statement235);
                    forEachStatement8=forEachStatement();

                    state._fsp--;


                    node = forEachStatement8;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:66:6: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement246);
                    whileStatement9=whileStatement();

                    state._fsp--;


                    node = whileStatement9;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "statement"



    // $ANTLR start "assignment"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:69:1: assignment returns [Node node] : ^( '=' i= IDENT (x= indexes )? e= expression ) ;
    public final Node assignment() throws RecognitionException {
        Node node = null;


        CommonTree i=null;
        List<Node> x =null;

        Node e =null;


        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:70:3: ( ^( '=' i= IDENT (x= indexes )? e= expression ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:70:5: ^( '=' i= IDENT (x= indexes )? e= expression )
            {
            match(input,49,FOLLOW_49_in_assignment267); 

            match(input, Token.DOWN, null); 
            i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_assignment271); 

            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:70:20: (x= indexes )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INDEXES) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:70:20: x= indexes
                    {
                    pushFollow(FOLLOW_indexes_in_assignment275);
                    x=indexes();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_assignment280);
            e=expression();

            state._fsp--;


            match(input, Token.UP, null); 


            node = new AssignmentNode((i!=null?i.getText():null), x, e, currentScope);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "assignment"



    // $ANTLR start "indexes"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:74:1: indexes returns [List<Node> e] : ^( INDEXES ( expression )+ ) ;
    public final List<Node> indexes() throws RecognitionException {
        List<Node> e = null;


        Node expression10 =null;



            e = new LinkedList<Node>();
          
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:78:3: ( ^( INDEXES ( expression )+ ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:78:5: ^( INDEXES ( expression )+ )
            {
            match(input,INDEXES,FOLLOW_INDEXES_in_indexes314); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:78:15: ( expression )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOLEAN||LA6_0==LOOKUP||(LA6_0 >= NEGATE && LA6_0 <= NUMBER)||(LA6_0 >= TERNARY && LA6_0 <= UNARY_MIN)||(LA6_0 >= 34 && LA6_0 <= 36)||(LA6_0 >= 39 && LA6_0 <= 40)||(LA6_0 >= 42 && LA6_0 <= 43)||LA6_0==46||LA6_0==48||(LA6_0 >= 50 && LA6_0 <= 52)||LA6_0==56||(LA6_0 >= 65 && LA6_0 <= 66)||LA6_0==74) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:78:16: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_indexes317);
            	    expression10=expression();

            	    state._fsp--;


            	    e.add(expression10);

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "indexes"



    // $ANTLR start "functionCall"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:81:1: functionCall returns [Node node] : ( ^( FUNC_CALL IDENT ( exprList )? ) | ^( FUNC_CALL 'print' expression ) | ^( FUNC_CALL 'println' expression ) | ^( FUNC_CALL 'size' expression ) | ^( FUNC_CALL 'assert' expression ) | ^( FUNC_CALL OS COMMAND ) );
    public final Node functionCall() throws RecognitionException {
        Node node = null;


        CommonTree IDENT11=null;
        CommonTree COMMAND17=null;
        java.util.List<Node> exprList12 =null;

        Node expression13 =null;

        Node expression14 =null;

        Node expression15 =null;

        Node expression16 =null;


        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:82:3: ( ^( FUNC_CALL IDENT ( exprList )? ) | ^( FUNC_CALL 'print' expression ) | ^( FUNC_CALL 'println' expression ) | ^( FUNC_CALL 'size' expression ) | ^( FUNC_CALL 'assert' expression ) | ^( FUNC_CALL OS COMMAND ) )
            int alt8=6;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==FUNC_CALL) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case IDENT:
                        {
                        alt8=1;
                        }
                        break;
                    case 67:
                        {
                        alt8=2;
                        }
                        break;
                    case 68:
                        {
                        alt8=3;
                        }
                        break;
                    case 70:
                        {
                        alt8=4;
                        }
                        break;
                    case 58:
                        {
                        alt8=5;
                        }
                        break;
                    case OS:
                        {
                        alt8=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:82:5: ^( FUNC_CALL IDENT ( exprList )? )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall342); 

                    match(input, Token.DOWN, null); 
                    IDENT11=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_functionCall344); 

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:82:23: ( exprList )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EXP_LIST) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:82:23: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_functionCall346);
                            exprList12=exprList();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    node = new FunctionCallNode((IDENT11!=null?IDENT11.getText():null), exprList12, functions);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:83:5: ^( FUNC_CALL 'print' expression )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall362); 

                    match(input, Token.DOWN, null); 
                    match(input,67,FOLLOW_67_in_functionCall364); 

                    pushFollow(FOLLOW_expression_in_functionCall366);
                    expression13=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new PrintNode(expression13); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:84:5: ^( FUNC_CALL 'println' expression )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall378); 

                    match(input, Token.DOWN, null); 
                    match(input,68,FOLLOW_68_in_functionCall380); 

                    pushFollow(FOLLOW_expression_in_functionCall382);
                    expression14=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new PrintNode(expression14, "\n"); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:85:5: ^( FUNC_CALL 'size' expression )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall392); 

                    match(input, Token.DOWN, null); 
                    match(input,70,FOLLOW_70_in_functionCall394); 

                    pushFollow(FOLLOW_expression_in_functionCall396);
                    expression15=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new SizeNode(expression15);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:86:5: ^( FUNC_CALL 'assert' expression )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall409); 

                    match(input, Token.DOWN, null); 
                    match(input,58,FOLLOW_58_in_functionCall411); 

                    pushFollow(FOLLOW_expression_in_functionCall413);
                    expression16=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new AssertNode(expression16);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:87:5: ^( FUNC_CALL OS COMMAND )
                    {
                    match(input,FUNC_CALL,FOLLOW_FUNC_CALL_in_functionCall424); 

                    match(input, Token.DOWN, null); 
                    match(input,OS,FOLLOW_OS_in_functionCall426); 

                    COMMAND17=(CommonTree)match(input,COMMAND,FOLLOW_COMMAND_in_functionCall428); 

                    match(input, Token.UP, null); 


                    node = new OSCallNode((COMMAND17!=null?COMMAND17.getText():null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "functionCall"



    // $ANTLR start "ifStatement"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:91:1: ifStatement returns [Node node] : ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) ;
    public final Node ifStatement() throws RecognitionException {
        Node node = null;


        Node b1 =null;

        Node b2 =null;

        Node expression18 =null;


         
        	  IfNode ifNode = new IfNode(); 
        	  node = ifNode; 
        	
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:96:3: ( ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:96:5: ^( IF ( ^( EXP expression b1= block ) )+ ( ^( EXP b2= block ) )? )
            {
            match(input,IF,FOLLOW_IF_in_ifStatement470); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:97:7: ( ^( EXP expression b1= block ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==EXP) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==DOWN) ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==BOOLEAN||LA9_3==LOOKUP||(LA9_3 >= NEGATE && LA9_3 <= NUMBER)||(LA9_3 >= TERNARY && LA9_3 <= UNARY_MIN)||(LA9_3 >= 34 && LA9_3 <= 36)||(LA9_3 >= 39 && LA9_3 <= 40)||(LA9_3 >= 42 && LA9_3 <= 43)||LA9_3==46||LA9_3==48||(LA9_3 >= 50 && LA9_3 <= 52)||LA9_3==56||(LA9_3 >= 65 && LA9_3 <= 66)||LA9_3==74) ) {
                            alt9=1;
                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:97:8: ^( EXP expression b1= block )
            	    {
            	    match(input,EXP,FOLLOW_EXP_in_ifStatement480); 

            	    match(input, Token.DOWN, null); 
            	    pushFollow(FOLLOW_expression_in_ifStatement482);
            	    expression18=expression();

            	    state._fsp--;


            	    pushFollow(FOLLOW_block_in_ifStatement486);
            	    b1=block();

            	    state._fsp--;


            	    match(input, Token.UP, null); 


            	    ifNode.addChoice(expression18,b1); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:98:7: ( ^( EXP b2= block ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==EXP) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:98:8: ^( EXP b2= block )
                    {
                    match(input,EXP,FOLLOW_EXP_in_ifStatement502); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_block_in_ifStatement506);
                    b2=block();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    ifNode.addChoice(new AtomNode(true),b2); 

                    }
                    break;

            }


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "ifStatement"



    // $ANTLR start "forStatement"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:103:1: forStatement returns [Node node] : ^( 'for' var= IDENT from= expression to= expression b= block ) ;
    public final Node forStatement() throws RecognitionException {
        Node node = null;


        CommonTree var=null;
        Node from =null;

        Node to =null;

        Node b =null;


        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:104:3: ( ^( 'for' var= IDENT from= expression to= expression b= block ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:104:5: ^( 'for' var= IDENT from= expression to= expression b= block )
            {
            match(input,62,FOLLOW_62_in_forStatement541); 

            match(input, Token.DOWN, null); 
            var=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_forStatement545); 

            pushFollow(FOLLOW_expression_in_forStatement550);
            from=expression();

            state._fsp--;


            pushFollow(FOLLOW_expression_in_forStatement555);
            to=expression();

            state._fsp--;


            pushFollow(FOLLOW_block_in_forStatement560);
            b=block();

            state._fsp--;


            match(input, Token.UP, null); 


             node = new ForNode((var!=null?var.getText():null), from, to, b, currentScope); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "forStatement"



    // $ANTLR start "forEachStatement"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:107:1: forEachStatement returns [Node node] : ^( FOREACH var= IDENT in= expression b= block ) ;
    public final Node forEachStatement() throws RecognitionException {
        Node node = null;


        CommonTree var=null;
        Node in =null;

        Node b =null;


        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:108:3: ( ^( FOREACH var= IDENT in= expression b= block ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:108:5: ^( FOREACH var= IDENT in= expression b= block )
            {
            match(input,FOREACH,FOLLOW_FOREACH_in_forEachStatement585); 

            match(input, Token.DOWN, null); 
            var=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_forEachStatement589); 

            pushFollow(FOLLOW_expression_in_forEachStatement594);
            in=expression();

            state._fsp--;


            pushFollow(FOLLOW_block_in_forEachStatement598);
            b=block();

            state._fsp--;


            match(input, Token.UP, null); 


             node = new ForEachNode((var!=null?var.getText():null), in, b, currentScope); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "forEachStatement"



    // $ANTLR start "whileStatement"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:112:1: whileStatement returns [Node node] : ^( 'while' expression block ) ;
    public final Node whileStatement() throws RecognitionException {
        Node node = null;


        Node expression19 =null;

        Node block20 =null;


        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:113:3: ( ^( 'while' expression block ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:113:5: ^( 'while' expression block )
            {
            match(input,72,FOLLOW_72_in_whileStatement626); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_whileStatement628);
            expression19=expression();

            state._fsp--;


            pushFollow(FOLLOW_block_in_whileStatement630);
            block20=block();

            state._fsp--;


            match(input, Token.UP, null); 


             node = new WhileNode(expression19, block20); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "whileStatement"



    // $ANTLR start "list"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:117:1: list returns [Node node] : ^( LIST ( exprList )? ) ;
    public final Node list() throws RecognitionException {
        Node node = null;


        java.util.List<Node> exprList21 =null;


        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:118:3: ( ^( LIST ( exprList )? ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:118:5: ^( LIST ( exprList )? )
            {
            match(input,LIST,FOLLOW_LIST_in_list656); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:118:12: ( exprList )?
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==EXP_LIST) ) {
                    alt11=1;
                }
                switch (alt11) {
                    case 1 :
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:118:12: exprList
                        {
                        pushFollow(FOLLOW_exprList_in_list658);
                        exprList21=exprList();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }


            node = new ListNode(exprList21); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "list"



    // $ANTLR start "lookup"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:121:1: lookup returns [Node node] : ( ^( LOOKUP i= IDENT (x= indexes )? ) | ^( LOOKUP STRING_LITERAL (x= indexes )? ) | ^( LOOKUP expression (x= indexes )? ) | ^( LOOKUP functionCall (x= indexes )? ) | ^( LOOKUP list (x= indexes )? ) );
    public final Node lookup() throws RecognitionException {
        Node node = null;


        CommonTree i=null;
        CommonTree STRING_LITERAL22=null;
        List<Node> x =null;

        Node expression23 =null;

        Node functionCall24 =null;

        Node list25 =null;


        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:122:3: ( ^( LOOKUP i= IDENT (x= indexes )? ) | ^( LOOKUP STRING_LITERAL (x= indexes )? ) | ^( LOOKUP expression (x= indexes )? ) | ^( LOOKUP functionCall (x= indexes )? ) | ^( LOOKUP list (x= indexes )? ) )
            int alt17=5;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LOOKUP) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case IDENT:
                        {
                        alt17=1;
                        }
                        break;
                    case STRING_LITERAL:
                        {
                        alt17=2;
                        }
                        break;
                    case BOOLEAN:
                    case LOOKUP:
                    case NEGATE:
                    case NUMBER:
                    case TERNARY:
                    case UNARY_MIN:
                    case 34:
                    case 35:
                    case 36:
                    case 39:
                    case 40:
                    case 42:
                    case 43:
                    case 46:
                    case 48:
                    case 50:
                    case 51:
                    case 52:
                    case 56:
                    case 65:
                    case 66:
                    case 74:
                        {
                        alt17=3;
                        }
                        break;
                    case FUNC_CALL:
                        {
                        alt17=4;
                        }
                        break;
                    case LIST:
                        {
                        alt17=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:122:5: ^( LOOKUP i= IDENT (x= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup682); 

                    match(input, Token.DOWN, null); 
                    i=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_lookup686); 

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:122:23: (x= indexes )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==INDEXES) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:122:23: x= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup690);
                            x=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    node = (x != null) ? new LookupNode(new IdentifierNode((i!=null?i.getText():null), currentScope), x)
                                               : new IdentifierNode((i!=null?i.getText():null), currentScope);
                        

                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:126:5: ^( LOOKUP STRING_LITERAL (x= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup705); 

                    match(input, Token.DOWN, null); 
                    STRING_LITERAL22=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_lookup707); 

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:126:30: (x= indexes )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==INDEXES) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:126:30: x= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup711);
                            x=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    node = (x != null) ? new LookupNode(new AtomNode((STRING_LITERAL22!=null?STRING_LITERAL22.getText():null)), x) 
                                               : new AtomNode((STRING_LITERAL22!=null?STRING_LITERAL22.getText():null));

                    }
                    break;
                case 3 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:129:5: ^( LOOKUP expression (x= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup728); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_lookup730);
                    expression23=expression();

                    state._fsp--;


                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:129:26: (x= indexes )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==INDEXES) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:129:26: x= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup734);
                            x=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    node = (x != null) ? new LookupNode(expression23, x) 
                                               : expression23;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:132:5: ^( LOOKUP functionCall (x= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup751); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_functionCall_in_lookup753);
                    functionCall24=functionCall();

                    state._fsp--;


                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:132:28: (x= indexes )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==INDEXES) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:132:28: x= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup757);
                            x=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    node = (x != null) ? new LookupNode(functionCall24, x) 
                                               : functionCall24;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:135:5: ^( LOOKUP list (x= indexes )? )
                    {
                    match(input,LOOKUP,FOLLOW_LOOKUP_in_lookup774); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_list_in_lookup776);
                    list25=list();

                    state._fsp--;


                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:135:20: (x= indexes )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==INDEXES) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:135:20: x= indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup780);
                            x=indexes();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    node = (x != null) ? new LookupNode(list25, x) 
                                               : list25;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "lookup"



    // $ANTLR start "expression"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:140:1: expression returns [Node node] : ( ^( TERNARY a= expression b= expression c= expression ) | ^( 'in' a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | 'null' | NUMBER | BOOLEAN | lookup );
    public final Node expression() throws RecognitionException {
        Node node = null;


        CommonTree NUMBER26=null;
        CommonTree BOOLEAN27=null;
        Node a =null;

        Node b =null;

        Node c =null;

        Node lookup28 =null;


        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:141:3: ( ^( TERNARY a= expression b= expression c= expression ) | ^( 'in' a= expression b= expression ) | ^( '||' a= expression b= expression ) | ^( '&&' a= expression b= expression ) | ^( '==' a= expression b= expression ) | ^( '!=' a= expression b= expression ) | ^( '>=' a= expression b= expression ) | ^( '<=' a= expression b= expression ) | ^( '>' a= expression b= expression ) | ^( '<' a= expression b= expression ) | ^( '+' a= expression b= expression ) | ^( '-' a= expression b= expression ) | ^( '*' a= expression b= expression ) | ^( '/' a= expression b= expression ) | ^( '%' a= expression b= expression ) | ^( '^' a= expression b= expression ) | ^( UNARY_MIN a= expression ) | ^( NEGATE a= expression ) | 'null' | NUMBER | BOOLEAN | lookup )
            int alt18=22;
            switch ( input.LA(1) ) {
            case TERNARY:
                {
                alt18=1;
                }
                break;
            case 65:
                {
                alt18=2;
                }
                break;
            case 74:
                {
                alt18=3;
                }
                break;
            case 36:
                {
                alt18=4;
                }
                break;
            case 50:
                {
                alt18=5;
                }
                break;
            case 34:
                {
                alt18=6;
                }
                break;
            case 52:
                {
                alt18=7;
                }
                break;
            case 48:
                {
                alt18=8;
                }
                break;
            case 51:
                {
                alt18=9;
                }
                break;
            case 46:
                {
                alt18=10;
                }
                break;
            case 40:
                {
                alt18=11;
                }
                break;
            case 42:
                {
                alt18=12;
                }
                break;
            case 39:
                {
                alt18=13;
                }
                break;
            case 43:
                {
                alt18=14;
                }
                break;
            case 35:
                {
                alt18=15;
                }
                break;
            case 56:
                {
                alt18=16;
                }
                break;
            case UNARY_MIN:
                {
                alt18=17;
                }
                break;
            case NEGATE:
                {
                alt18=18;
                }
                break;
            case 66:
                {
                alt18=19;
                }
                break;
            case NUMBER:
                {
                alt18=20;
                }
                break;
            case BOOLEAN:
                {
                alt18=21;
                }
                break;
            case LOOKUP:
                {
                alt18=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:141:5: ^( TERNARY a= expression b= expression c= expression )
                    {
                    match(input,TERNARY,FOLLOW_TERNARY_in_expression809); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression813);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression817);
                    b=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression821);
                    c=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new TernaryNode(a, b, c);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:142:5: ^( 'in' a= expression b= expression )
                    {
                    match(input,65,FOLLOW_65_in_expression832); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression836);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression840);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new InNode(a, b);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:143:6: ^( '||' a= expression b= expression )
                    {
                    match(input,74,FOLLOW_74_in_expression868); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression872);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression876);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new OrNode(a, b);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:144:6: ^( '&&' a= expression b= expression )
                    {
                    match(input,36,FOLLOW_36_in_expression903); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression907);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression911);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new AndNode(a, b);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:145:6: ^( '==' a= expression b= expression )
                    {
                    match(input,50,FOLLOW_50_in_expression938); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression942);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression946);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new EqualsNode(a, b);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:146:6: ^( '!=' a= expression b= expression )
                    {
                    match(input,34,FOLLOW_34_in_expression973); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression977);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression981);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new NotEqualsNode(a, b);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:147:6: ^( '>=' a= expression b= expression )
                    {
                    match(input,52,FOLLOW_52_in_expression1008); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1012);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1016);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new GTEqualsNode(a, b);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:148:6: ^( '<=' a= expression b= expression )
                    {
                    match(input,48,FOLLOW_48_in_expression1043); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1047);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1051);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new LTEqualsNode(a, b);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:149:6: ^( '>' a= expression b= expression )
                    {
                    match(input,51,FOLLOW_51_in_expression1078); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1082);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1086);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new GTNode(a, b);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:150:6: ^( '<' a= expression b= expression )
                    {
                    match(input,46,FOLLOW_46_in_expression1114); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1118);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1122);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new LTNode(a, b);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:151:6: ^( '+' a= expression b= expression )
                    {
                    match(input,40,FOLLOW_40_in_expression1150); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1154);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1158);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new AddNode(a, b);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:152:6: ^( '-' a= expression b= expression )
                    {
                    match(input,42,FOLLOW_42_in_expression1186); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1190);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1194);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new SubNode(a, b);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:153:6: ^( '*' a= expression b= expression )
                    {
                    match(input,39,FOLLOW_39_in_expression1222); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1226);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1230);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new MulNode(a, b);

                    }
                    break;
                case 14 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:154:6: ^( '/' a= expression b= expression )
                    {
                    match(input,43,FOLLOW_43_in_expression1258); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1262);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1266);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new DivNode(a, b);

                    }
                    break;
                case 15 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:155:6: ^( '%' a= expression b= expression )
                    {
                    match(input,35,FOLLOW_35_in_expression1294); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1298);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1302);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new ModNode(a, b);

                    }
                    break;
                case 16 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:156:6: ^( '^' a= expression b= expression )
                    {
                    match(input,56,FOLLOW_56_in_expression1330); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1334);
                    a=expression();

                    state._fsp--;


                    pushFollow(FOLLOW_expression_in_expression1338);
                    b=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new PowNode(a, b);

                    }
                    break;
                case 17 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:157:6: ^( UNARY_MIN a= expression )
                    {
                    match(input,UNARY_MIN,FOLLOW_UNARY_MIN_in_expression1366); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1370);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new UnaryMinusNode(a);

                    }
                    break;
                case 18 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:158:6: ^( NEGATE a= expression )
                    {
                    match(input,NEGATE,FOLLOW_NEGATE_in_expression1405); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_expression1409);
                    a=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    node = new NegateNode(a);

                    }
                    break;
                case 19 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:159:5: 'null'
                    {
                    match(input,66,FOLLOW_66_in_expression1445); 

                    node = new AtomNode(null); 

                    }
                    break;
                case 20 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:160:5: NUMBER
                    {
                    NUMBER26=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_expression1497); 

                    node = new AtomNode(Double.parseDouble((NUMBER26!=null?NUMBER26.getText():null))); 

                    }
                    break;
                case 21 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:161:5: BOOLEAN
                    {
                    BOOLEAN27=(CommonTree)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_expression1549); 

                    node = new AtomNode(Boolean.parseBoolean((BOOLEAN27!=null?BOOLEAN27.getText():null))); 

                    }
                    break;
                case 22 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:162:5: lookup
                    {
                    pushFollow(FOLLOW_lookup_in_expression1600);
                    lookup28=lookup();

                    state._fsp--;


                    node = lookup28; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return node;
    }
    // $ANTLR end "expression"



    // $ANTLR start "exprList"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:165:1: exprList returns [java.util.List<Node> e] : ^( EXP_LIST ( expression )+ ) ;
    public final java.util.List<Node> exprList() throws RecognitionException {
        java.util.List<Node> e = null;


        Node expression29 =null;



            e = new LinkedList<Node>();
          
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:169:3: ( ^( EXP_LIST ( expression )+ ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:169:5: ^( EXP_LIST ( expression )+ )
            {
            match(input,EXP_LIST,FOLLOW_EXP_LIST_in_exprList1671); 

            match(input, Token.DOWN, null); 
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:169:16: ( expression )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==BOOLEAN||LA19_0==LOOKUP||(LA19_0 >= NEGATE && LA19_0 <= NUMBER)||(LA19_0 >= TERNARY && LA19_0 <= UNARY_MIN)||(LA19_0 >= 34 && LA19_0 <= 36)||(LA19_0 >= 39 && LA19_0 <= 40)||(LA19_0 >= 42 && LA19_0 <= 43)||LA19_0==46||LA19_0==48||(LA19_0 >= 50 && LA19_0 <= 52)||LA19_0==56||(LA19_0 >= 65 && LA19_0 <= 66)||LA19_0==74) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscriptWalker.g:169:17: expression
            	    {
            	    pushFollow(FOLLOW_expression_in_exprList1674);
            	    expression29=expression();

            	    state._fsp--;


            	    e.add(expression29); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            match(input, Token.UP, null); 


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "exprList"

    // Delegated rules


 

    public static final BitSet FOLLOW_block_in_walk62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_block95 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATEMENTS_in_block105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_block108 = new BitSet(new long[]{0x4002000000025008L,0x0000000000000100L});
    public static final BitSet FOLLOW_RETURN_in_block122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_block125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_LIST_in_idList164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_idList166 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_assignment_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_statement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_assignment267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_assignment271 = new BitSet(new long[]{0x011D4D9CC3440020L,0x0000000000000406L});
    public static final BitSet FOLLOW_indexes_in_assignment275 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_assignment280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEXES_in_indexes314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_indexes317 = new BitSet(new long[]{0x011D4D9CC3400028L,0x0000000000000406L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall342 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_functionCall344 = new BitSet(new long[]{0x0000000000000808L});
    public static final BitSet FOLLOW_exprList_in_functionCall346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_functionCall364 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_functionCall366 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_68_in_functionCall380 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_functionCall382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_70_in_functionCall394 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_functionCall396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_58_in_functionCall411 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_functionCall413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNC_CALL_in_functionCall424 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OS_in_functionCall426 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMAND_in_functionCall428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_ifStatement470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_EXP_in_ifStatement480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_ifStatement482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_ifStatement486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXP_in_ifStatement502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_ifStatement506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_62_in_forStatement541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_forStatement545 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_forStatement550 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_forStatement555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_forStatement560 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOREACH_in_forEachStatement585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_forEachStatement589 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_forEachStatement594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_forEachStatement598 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_72_in_whileStatement626 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_whileStatement628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_whileStatement630 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_in_list656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_exprList_in_list658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_lookup686 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_indexes_in_lookup690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_lookup707 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_indexes_in_lookup711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_lookup730 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_indexes_in_lookup734 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_functionCall_in_lookup753 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_indexes_in_lookup757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOOKUP_in_lookup774 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_in_lookup776 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_indexes_in_lookup780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERNARY_in_expression809 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression813 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression817 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_65_in_expression832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression836 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression840 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_74_in_expression868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression872 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_expression903 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression907 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression911 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_50_in_expression938 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression942 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression946 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_expression973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression977 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression981 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_52_in_expression1008 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1012 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression1016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_48_in_expression1043 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1047 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression1051 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_expression1078 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1082 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression1086 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_46_in_expression1114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1118 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression1122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_40_in_expression1150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1154 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression1158 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_42_in_expression1186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1190 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression1194 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_39_in_expression1222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1226 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression1230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_43_in_expression1258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1262 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression1266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_35_in_expression1294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1298 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression1302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_expression1330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1334 = new BitSet(new long[]{0x011D4D9CC3400020L,0x0000000000000406L});
    public static final BitSet FOLLOW_expression_in_expression1338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MIN_in_expression1366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEGATE_in_expression1405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1409 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_66_in_expression1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expression1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_expression1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_expression1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXP_LIST_in_exprList1671 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_exprList1674 = new BitSet(new long[]{0x011D4D9CC3400028L,0x0000000000000406L});

}