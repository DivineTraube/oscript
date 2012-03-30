// $ANTLR 3.4 C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g 2012-03-30 15:46:52

  package oscript.grammar;
  import java.util.Map; 
  import java.util.HashMap; 
  import oscript.*;
  import oscript.tree.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class oscriptParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public oscriptParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public oscriptParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return oscriptParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g"; }


      public Map<String, Function> functions = new HashMap<String, Function>();
      private void defineFunction(String id, Object formalParamList, Object block) {
        CommonTree formalParamListTree = formalParamList == null ? new CommonTree() : (CommonTree)formalParamList; 
        CommonTree blockTree = (CommonTree)block; 
        String key = id + formalParamListTree.getChildCount(); 
        functions.put(key, new Function(id, formalParamListTree, blockTree)); 
      }


    public static class parse_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parse"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:51:1: parse : block EOF !;
    public final oscriptParser.parse_return parse() throws RecognitionException {
        oscriptParser.parse_return retval = new oscriptParser.parse_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        oscriptParser.block_return block1 =null;


        CommonTree EOF2_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:52:3: ( block EOF !)
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:52:5: block EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_block_in_parse158);
            block1=block();

            state._fsp--;

            adaptor.addChild(root_0, block1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_parse160); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parse"


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:55:1: block : ( functionDecl | statement )* ( 'return' expression ( ';' )? )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final oscriptParser.block_return block() throws RecognitionException {
        oscriptParser.block_return retval = new oscriptParser.block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal5=null;
        Token char_literal7=null;
        oscriptParser.functionDecl_return functionDecl3 =null;

        oscriptParser.statement_return statement4 =null;

        oscriptParser.expression_return expression6 =null;


        CommonTree string_literal5_tree=null;
        CommonTree char_literal7_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:56:3: ( ( functionDecl | statement )* ( 'return' expression ( ';' )? )? -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:56:4: ( functionDecl | statement )* ( 'return' expression ( ';' )? )?
            {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:56:4: ( functionDecl | statement )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==59) ) {
                    alt1=1;
                }
                else if ( (LA1_0==COMMAND||LA1_0==IDENT||(LA1_0 >= 57 && LA1_0 <= 58)||(LA1_0 >= 62 && LA1_0 <= 64)||(LA1_0 >= 67 && LA1_0 <= 68)||LA1_0==70||LA1_0==72) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:56:5: functionDecl
            	    {
            	    pushFollow(FOLLOW_functionDecl_in_block174);
            	    functionDecl3=functionDecl();

            	    state._fsp--;

            	    stream_functionDecl.add(functionDecl3.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:56:20: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block178);
            	    statement4=statement();

            	    state._fsp--;

            	    stream_statement.add(statement4.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:56:32: ( 'return' expression ( ';' )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==69) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:56:33: 'return' expression ( ';' )?
                    {
                    string_literal5=(Token)match(input,69,FOLLOW_69_in_block183);  
                    stream_69.add(string_literal5);


                    pushFollow(FOLLOW_expression_in_block185);
                    expression6=expression();

                    state._fsp--;

                    stream_expression.add(expression6.getTree());

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:56:53: ( ';' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==45) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:56:53: ';'
                            {
                            char_literal7=(Token)match(input,45,FOLLOW_45_in_block187);  
                            stream_45.add(char_literal7);


                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: expression, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 57:5: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:57:8: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:57:16: ^( STATEMENTS ( statement )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_2);

                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:57:29: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_2, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:57:41: ^( RETURN ( expression )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RETURN, "RETURN")
                , root_2);

                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:57:50: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_2, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class blockBracketed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockBracketed"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:60:1: blockBracketed : '{' ! block '}' !;
    public final oscriptParser.blockBracketed_return blockBracketed() throws RecognitionException {
        oscriptParser.blockBracketed_return retval = new oscriptParser.blockBracketed_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        oscriptParser.block_return block9 =null;


        CommonTree char_literal8_tree=null;
        CommonTree char_literal10_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:61:3: ( '{' ! block '}' !)
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:61:5: '{' ! block '}' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal8=(Token)match(input,73,FOLLOW_73_in_blockBracketed229); 

            pushFollow(FOLLOW_block_in_blockBracketed232);
            block9=block();

            state._fsp--;

            adaptor.addChild(root_0, block9.getTree());

            char_literal10=(Token)match(input,75,FOLLOW_75_in_blockBracketed234); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blockBracketed"


    public static class blockOneLine_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blockOneLine"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:64:1: blockOneLine : ( functionDecl | statement | ( 'return' expression ( ';' )? ) ) -> ^( BLOCK ^( STATEMENTS statement ) ^( RETURN expression ) ) ;
    public final oscriptParser.blockOneLine_return blockOneLine() throws RecognitionException {
        oscriptParser.blockOneLine_return retval = new oscriptParser.blockOneLine_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal13=null;
        Token char_literal15=null;
        oscriptParser.functionDecl_return functionDecl11 =null;

        oscriptParser.statement_return statement12 =null;

        oscriptParser.expression_return expression14 =null;


        CommonTree string_literal13_tree=null;
        CommonTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:65:3: ( ( functionDecl | statement | ( 'return' expression ( ';' )? ) ) -> ^( BLOCK ^( STATEMENTS statement ) ^( RETURN expression ) ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:65:4: ( functionDecl | statement | ( 'return' expression ( ';' )? ) )
            {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:65:4: ( functionDecl | statement | ( 'return' expression ( ';' )? ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt5=1;
                }
                break;
            case COMMAND:
            case IDENT:
            case 57:
            case 58:
            case 62:
            case 63:
            case 64:
            case 67:
            case 68:
            case 70:
            case 72:
                {
                alt5=2;
                }
                break;
            case 69:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:65:5: functionDecl
                    {
                    pushFollow(FOLLOW_functionDecl_in_blockOneLine250);
                    functionDecl11=functionDecl();

                    state._fsp--;

                    stream_functionDecl.add(functionDecl11.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:65:20: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockOneLine254);
                    statement12=statement();

                    state._fsp--;

                    stream_statement.add(statement12.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:65:32: ( 'return' expression ( ';' )? )
                    {
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:65:32: ( 'return' expression ( ';' )? )
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:65:33: 'return' expression ( ';' )?
                    {
                    string_literal13=(Token)match(input,69,FOLLOW_69_in_blockOneLine259);  
                    stream_69.add(string_literal13);


                    pushFollow(FOLLOW_expression_in_blockOneLine261);
                    expression14=expression();

                    state._fsp--;

                    stream_expression.add(expression14.getTree());

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:65:53: ( ';' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==45) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:65:53: ';'
                            {
                            char_literal15=(Token)match(input,45,FOLLOW_45_in_blockOneLine263);  
                            stream_45.add(char_literal15);


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: statement, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 66:5: -> ^( BLOCK ^( STATEMENTS statement ) ^( RETURN expression ) )
            {
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:66:8: ^( BLOCK ^( STATEMENTS statement ) ^( RETURN expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:66:16: ^( STATEMENTS statement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_2);

                adaptor.addChild(root_2, stream_statement.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:66:40: ^( RETURN expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RETURN, "RETURN")
                , root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blockOneLine"


    public static class functionDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionDecl"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:69:1: functionDecl : 'def' IDENT '(' ! ( idList )? ')' ! blockBracketed ;
    public final oscriptParser.functionDecl_return functionDecl() throws RecognitionException {
        oscriptParser.functionDecl_return retval = new oscriptParser.functionDecl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal16=null;
        Token IDENT17=null;
        Token char_literal18=null;
        Token char_literal20=null;
        oscriptParser.idList_return idList19 =null;

        oscriptParser.blockBracketed_return blockBracketed21 =null;


        CommonTree string_literal16_tree=null;
        CommonTree IDENT17_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal20_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:70:3: ( 'def' IDENT '(' ! ( idList )? ')' ! blockBracketed )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:70:5: 'def' IDENT '(' ! ( idList )? ')' ! blockBracketed
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal16=(Token)match(input,59,FOLLOW_59_in_functionDecl302); 
            string_literal16_tree = 
            (CommonTree)adaptor.create(string_literal16)
            ;
            adaptor.addChild(root_0, string_literal16_tree);


            IDENT17=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionDecl304); 
            IDENT17_tree = 
            (CommonTree)adaptor.create(IDENT17)
            ;
            adaptor.addChild(root_0, IDENT17_tree);


            char_literal18=(Token)match(input,37,FOLLOW_37_in_functionDecl306); 

            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:70:22: ( idList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:70:22: idList
                    {
                    pushFollow(FOLLOW_idList_in_functionDecl309);
                    idList19=idList();

                    state._fsp--;

                    adaptor.addChild(root_0, idList19.getTree());

                    }
                    break;

            }


            char_literal20=(Token)match(input,38,FOLLOW_38_in_functionDecl312); 

            pushFollow(FOLLOW_blockBracketed_in_functionDecl315);
            blockBracketed21=blockBracketed();

            state._fsp--;

            adaptor.addChild(root_0, blockBracketed21.getTree());

            defineFunction((IDENT17!=null?IDENT17.getText():null), (idList19!=null?((CommonTree)idList19.tree):null), (blockBracketed21!=null?((CommonTree)blockBracketed21.tree):null));

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionDecl"


    public static class idList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "idList"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:74:1: idList : IDENT ( ',' IDENT )* -> ^( ID_LIST ( IDENT )+ ) ;
    public final oscriptParser.idList_return idList() throws RecognitionException {
        oscriptParser.idList_return retval = new oscriptParser.idList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT22=null;
        Token char_literal23=null;
        Token IDENT24=null;

        CommonTree IDENT22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree IDENT24_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:75:3: ( IDENT ( ',' IDENT )* -> ^( ID_LIST ( IDENT )+ ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:75:5: IDENT ( ',' IDENT )*
            {
            IDENT22=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList337);  
            stream_IDENT.add(IDENT22);


            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:75:11: ( ',' IDENT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==41) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:75:12: ',' IDENT
            	    {
            	    char_literal23=(Token)match(input,41,FOLLOW_41_in_idList340);  
            	    stream_41.add(char_literal23);


            	    IDENT24=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList342);  
            	    stream_IDENT.add(IDENT24);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // AST REWRITE
            // elements: IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 75:24: -> ^( ID_LIST ( IDENT )+ )
            {
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:75:27: ^( ID_LIST ( IDENT )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ID_LIST, "ID_LIST")
                , root_1);

                if ( !(stream_IDENT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_IDENT.nextNode()
                    );

                }
                stream_IDENT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "idList"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:78:1: statement : ( assignment ( ';' )? -> assignment | functionCall ( ';' )? -> functionCall | ifStatement | forStatement | forEachStatement | whileStatement );
    public final oscriptParser.statement_return statement() throws RecognitionException {
        oscriptParser.statement_return retval = new oscriptParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal26=null;
        Token char_literal28=null;
        oscriptParser.assignment_return assignment25 =null;

        oscriptParser.functionCall_return functionCall27 =null;

        oscriptParser.ifStatement_return ifStatement29 =null;

        oscriptParser.forStatement_return forStatement30 =null;

        oscriptParser.forEachStatement_return forEachStatement31 =null;

        oscriptParser.whileStatement_return whileStatement32 =null;


        CommonTree char_literal26_tree=null;
        CommonTree char_literal28_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:79:3: ( assignment ( ';' )? -> assignment | functionCall ( ';' )? -> functionCall | ifStatement | forStatement | forEachStatement | whileStatement )
            int alt10=6;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==37) ) {
                    alt10=2;
                }
                else if ( (LA10_1==EOF||LA10_1==COMMAND||LA10_1==IDENT||LA10_1==45||LA10_1==49||LA10_1==54||(LA10_1 >= 57 && LA10_1 <= 59)||(LA10_1 >= 62 && LA10_1 <= 64)||(LA10_1 >= 67 && LA10_1 <= 70)||LA10_1==72||LA10_1==75) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
                }
                break;
            case COMMAND:
            case 57:
            case 58:
            case 67:
            case 68:
            case 70:
                {
                alt10=2;
                }
                break;
            case 64:
                {
                alt10=3;
                }
                break;
            case 62:
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4==37) ) {
                    alt10=4;
                }
                else if ( (LA10_4==60) ) {
                    alt10=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;

                }
                }
                break;
            case 63:
                {
                alt10=5;
                }
                break;
            case 72:
                {
                alt10=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:79:6: assignment ( ';' )?
                    {
                    pushFollow(FOLLOW_assignment_in_statement369);
                    assignment25=assignment();

                    state._fsp--;

                    stream_assignment.add(assignment25.getTree());

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:79:17: ( ';' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==45) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:79:17: ';'
                            {
                            char_literal26=(Token)match(input,45,FOLLOW_45_in_statement371);  
                            stream_45.add(char_literal26);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: assignment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 79:22: -> assignment
                    {
                        adaptor.addChild(root_0, stream_assignment.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:80:6: functionCall ( ';' )?
                    {
                    pushFollow(FOLLOW_functionCall_in_statement383);
                    functionCall27=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall27.getTree());

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:80:19: ( ';' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==45) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:80:19: ';'
                            {
                            char_literal28=(Token)match(input,45,FOLLOW_45_in_statement385);  
                            stream_45.add(char_literal28);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: functionCall
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 80:24: -> functionCall
                    {
                        adaptor.addChild(root_0, stream_functionCall.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:81:6: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_ifStatement_in_statement397);
                    ifStatement29=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement29.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:82:6: forStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_forStatement_in_statement406);
                    forStatement30=forStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, forStatement30.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:83:6: forEachStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_forEachStatement_in_statement415);
                    forEachStatement31=forEachStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, forEachStatement31.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:84:6: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_whileStatement_in_statement424);
                    whileStatement32=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement32.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:87:1: assignment : IDENT ( indexes )? ( '=' ^ expression )? ;
    public final oscriptParser.assignment_return assignment() throws RecognitionException {
        oscriptParser.assignment_return retval = new oscriptParser.assignment_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT33=null;
        Token char_literal35=null;
        oscriptParser.indexes_return indexes34 =null;

        oscriptParser.expression_return expression36 =null;


        CommonTree IDENT33_tree=null;
        CommonTree char_literal35_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:88:3: ( IDENT ( indexes )? ( '=' ^ expression )? )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:88:5: IDENT ( indexes )? ( '=' ^ expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            IDENT33=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment438); 
            IDENT33_tree = 
            (CommonTree)adaptor.create(IDENT33)
            ;
            adaptor.addChild(root_0, IDENT33_tree);


            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:88:11: ( indexes )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==54) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:88:11: indexes
                    {
                    pushFollow(FOLLOW_indexes_in_assignment440);
                    indexes34=indexes();

                    state._fsp--;

                    adaptor.addChild(root_0, indexes34.getTree());

                    }
                    break;

            }


            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:88:21: ( '=' ^ expression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==49) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:88:22: '=' ^ expression
                    {
                    char_literal35=(Token)match(input,49,FOLLOW_49_in_assignment445); 
                    char_literal35_tree = 
                    (CommonTree)adaptor.create(char_literal35)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal35_tree, root_0);


                    pushFollow(FOLLOW_expression_in_assignment448);
                    expression36=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression36.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class indexes_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "indexes"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:91:1: indexes : ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) ;
    public final oscriptParser.indexes_return indexes() throws RecognitionException {
        oscriptParser.indexes_return retval = new oscriptParser.indexes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal37=null;
        Token char_literal39=null;
        oscriptParser.expression_return expression38 =null;


        CommonTree char_literal37_tree=null;
        CommonTree char_literal39_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:92:3: ( ( '[' expression ']' )+ -> ^( INDEXES ( expression )+ ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:92:5: ( '[' expression ']' )+
            {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:92:5: ( '[' expression ']' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==54) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:92:6: '[' expression ']'
            	    {
            	    char_literal37=(Token)match(input,54,FOLLOW_54_in_indexes466);  
            	    stream_54.add(char_literal37);


            	    pushFollow(FOLLOW_expression_in_indexes468);
            	    expression38=expression();

            	    state._fsp--;

            	    stream_expression.add(expression38.getTree());

            	    char_literal39=(Token)match(input,55,FOLLOW_55_in_indexes470);  
            	    stream_55.add(char_literal39);


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 92:28: -> ^( INDEXES ( expression )+ )
            {
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:92:31: ^( INDEXES ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INDEXES, "INDEXES")
                , root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "indexes"


    public static class functionCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionCall"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:95:1: functionCall : ( IDENT '(' ( exprList )? ')' -> ^( FUNC_CALL IDENT ( exprList )? ) | 'print' expressionBracketed -> ^( FUNC_CALL 'print' expressionBracketed ) | 'println' expressionBracketed -> ^( FUNC_CALL 'println' expressionBracketed ) | 'size' expressionBracketed -> ^( FUNC_CALL 'size' expressionBracketed ) | 'assert' expressionBracketed -> ^( FUNC_CALL 'assert' expressionBracketed ) | 'alert' expressionBracketed -> ^( FUNC_CALL 'alert' expressionBracketed ) | COMMAND -> ^( FUNC_CALL OS COMMAND ) );
    public final oscriptParser.functionCall_return functionCall() throws RecognitionException {
        oscriptParser.functionCall_return retval = new oscriptParser.functionCall_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        Token string_literal44=null;
        Token string_literal46=null;
        Token string_literal48=null;
        Token string_literal50=null;
        Token string_literal52=null;
        Token COMMAND54=null;
        oscriptParser.exprList_return exprList42 =null;

        oscriptParser.expressionBracketed_return expressionBracketed45 =null;

        oscriptParser.expressionBracketed_return expressionBracketed47 =null;

        oscriptParser.expressionBracketed_return expressionBracketed49 =null;

        oscriptParser.expressionBracketed_return expressionBracketed51 =null;

        oscriptParser.expressionBracketed_return expressionBracketed53 =null;


        CommonTree IDENT40_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree string_literal48_tree=null;
        CommonTree string_literal50_tree=null;
        CommonTree string_literal52_tree=null;
        CommonTree COMMAND54_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_COMMAND=new RewriteRuleTokenStream(adaptor,"token COMMAND");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_expressionBracketed=new RewriteRuleSubtreeStream(adaptor,"rule expressionBracketed");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:96:3: ( IDENT '(' ( exprList )? ')' -> ^( FUNC_CALL IDENT ( exprList )? ) | 'print' expressionBracketed -> ^( FUNC_CALL 'print' expressionBracketed ) | 'println' expressionBracketed -> ^( FUNC_CALL 'println' expressionBracketed ) | 'size' expressionBracketed -> ^( FUNC_CALL 'size' expressionBracketed ) | 'assert' expressionBracketed -> ^( FUNC_CALL 'assert' expressionBracketed ) | 'alert' expressionBracketed -> ^( FUNC_CALL 'alert' expressionBracketed ) | COMMAND -> ^( FUNC_CALL OS COMMAND ) )
            int alt15=7;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt15=1;
                }
                break;
            case 67:
                {
                alt15=2;
                }
                break;
            case 68:
                {
                alt15=3;
                }
                break;
            case 70:
                {
                alt15=4;
                }
                break;
            case 58:
                {
                alt15=5;
                }
                break;
            case 57:
                {
                alt15=6;
                }
                break;
            case COMMAND:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:96:5: IDENT '(' ( exprList )? ')'
                    {
                    IDENT40=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionCall497);  
                    stream_IDENT.add(IDENT40);


                    char_literal41=(Token)match(input,37,FOLLOW_37_in_functionCall499);  
                    stream_37.add(char_literal41);


                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:96:15: ( exprList )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0 >= BOOLEAN && LA14_0 <= COMMAND)||LA14_0==IDENT||LA14_0==NUMBER||LA14_0==STRING_LITERAL||LA14_0==33||LA14_0==37||LA14_0==42||LA14_0==54||(LA14_0 >= 57 && LA14_0 <= 58)||(LA14_0 >= 66 && LA14_0 <= 68)||LA14_0==70) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:96:15: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_functionCall501);
                            exprList42=exprList();

                            state._fsp--;

                            stream_exprList.add(exprList42.getTree());

                            }
                            break;

                    }


                    char_literal43=(Token)match(input,38,FOLLOW_38_in_functionCall504);  
                    stream_38.add(char_literal43);


                    // AST REWRITE
                    // elements: IDENT, exprList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 96:29: -> ^( FUNC_CALL IDENT ( exprList )? )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:96:32: ^( FUNC_CALL IDENT ( exprList )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC_CALL, "FUNC_CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENT.nextNode()
                        );

                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:96:50: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:97:5: 'print' expressionBracketed
                    {
                    string_literal44=(Token)match(input,67,FOLLOW_67_in_functionCall521);  
                    stream_67.add(string_literal44);


                    pushFollow(FOLLOW_expressionBracketed_in_functionCall523);
                    expressionBracketed45=expressionBracketed();

                    state._fsp--;

                    stream_expressionBracketed.add(expressionBracketed45.getTree());

                    // AST REWRITE
                    // elements: expressionBracketed, 67
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 97:33: -> ^( FUNC_CALL 'print' expressionBracketed )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:97:36: ^( FUNC_CALL 'print' expressionBracketed )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC_CALL, "FUNC_CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_67.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expressionBracketed.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:98:5: 'println' expressionBracketed
                    {
                    string_literal46=(Token)match(input,68,FOLLOW_68_in_functionCall539);  
                    stream_68.add(string_literal46);


                    pushFollow(FOLLOW_expressionBracketed_in_functionCall541);
                    expressionBracketed47=expressionBracketed();

                    state._fsp--;

                    stream_expressionBracketed.add(expressionBracketed47.getTree());

                    // AST REWRITE
                    // elements: 68, expressionBracketed
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 98:35: -> ^( FUNC_CALL 'println' expressionBracketed )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:98:38: ^( FUNC_CALL 'println' expressionBracketed )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC_CALL, "FUNC_CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_68.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expressionBracketed.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:99:5: 'size' expressionBracketed
                    {
                    string_literal48=(Token)match(input,70,FOLLOW_70_in_functionCall557);  
                    stream_70.add(string_literal48);


                    pushFollow(FOLLOW_expressionBracketed_in_functionCall559);
                    expressionBracketed49=expressionBracketed();

                    state._fsp--;

                    stream_expressionBracketed.add(expressionBracketed49.getTree());

                    // AST REWRITE
                    // elements: expressionBracketed, 70
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 99:32: -> ^( FUNC_CALL 'size' expressionBracketed )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:99:35: ^( FUNC_CALL 'size' expressionBracketed )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC_CALL, "FUNC_CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_70.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expressionBracketed.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:100:5: 'assert' expressionBracketed
                    {
                    string_literal50=(Token)match(input,58,FOLLOW_58_in_functionCall575);  
                    stream_58.add(string_literal50);


                    pushFollow(FOLLOW_expressionBracketed_in_functionCall577);
                    expressionBracketed51=expressionBracketed();

                    state._fsp--;

                    stream_expressionBracketed.add(expressionBracketed51.getTree());

                    // AST REWRITE
                    // elements: expressionBracketed, 58
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 100:34: -> ^( FUNC_CALL 'assert' expressionBracketed )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:100:37: ^( FUNC_CALL 'assert' expressionBracketed )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC_CALL, "FUNC_CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_58.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expressionBracketed.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:101:5: 'alert' expressionBracketed
                    {
                    string_literal52=(Token)match(input,57,FOLLOW_57_in_functionCall593);  
                    stream_57.add(string_literal52);


                    pushFollow(FOLLOW_expressionBracketed_in_functionCall595);
                    expressionBracketed53=expressionBracketed();

                    state._fsp--;

                    stream_expressionBracketed.add(expressionBracketed53.getTree());

                    // AST REWRITE
                    // elements: 57, expressionBracketed
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 101:33: -> ^( FUNC_CALL 'alert' expressionBracketed )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:101:36: ^( FUNC_CALL 'alert' expressionBracketed )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC_CALL, "FUNC_CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_57.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expressionBracketed.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:102:6: COMMAND
                    {
                    COMMAND54=(Token)match(input,COMMAND,FOLLOW_COMMAND_in_functionCall612);  
                    stream_COMMAND.add(COMMAND54);


                    // AST REWRITE
                    // elements: COMMAND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 102:14: -> ^( FUNC_CALL OS COMMAND )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:102:17: ^( FUNC_CALL OS COMMAND )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(FUNC_CALL, "FUNC_CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (CommonTree)adaptor.create(OS, "OS")
                        );

                        adaptor.addChild(root_1, 
                        stream_COMMAND.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionCall"


    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStatement"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:108:1: ifStatement : ifBlock ( elseIfBlock )* ( elseBlock )? -> ^( IF ifBlock ( elseIfBlock )* ( elseBlock )? ) ;
    public final oscriptParser.ifStatement_return ifStatement() throws RecognitionException {
        oscriptParser.ifStatement_return retval = new oscriptParser.ifStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        oscriptParser.ifBlock_return ifBlock55 =null;

        oscriptParser.elseIfBlock_return elseIfBlock56 =null;

        oscriptParser.elseBlock_return elseBlock57 =null;


        RewriteRuleSubtreeStream stream_elseIfBlock=new RewriteRuleSubtreeStream(adaptor,"rule elseIfBlock");
        RewriteRuleSubtreeStream stream_ifBlock=new RewriteRuleSubtreeStream(adaptor,"rule ifBlock");
        RewriteRuleSubtreeStream stream_elseBlock=new RewriteRuleSubtreeStream(adaptor,"rule elseBlock");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:109:3: ( ifBlock ( elseIfBlock )* ( elseBlock )? -> ^( IF ifBlock ( elseIfBlock )* ( elseBlock )? ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:109:5: ifBlock ( elseIfBlock )* ( elseBlock )?
            {
            pushFollow(FOLLOW_ifBlock_in_ifStatement640);
            ifBlock55=ifBlock();

            state._fsp--;

            stream_ifBlock.add(ifBlock55.getTree());

            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:109:13: ( elseIfBlock )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==61) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==64) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:109:13: elseIfBlock
            	    {
            	    pushFollow(FOLLOW_elseIfBlock_in_ifStatement642);
            	    elseIfBlock56=elseIfBlock();

            	    state._fsp--;

            	    stream_elseIfBlock.add(elseIfBlock56.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:109:26: ( elseBlock )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==61) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:109:26: elseBlock
                    {
                    pushFollow(FOLLOW_elseBlock_in_ifStatement645);
                    elseBlock57=elseBlock();

                    state._fsp--;

                    stream_elseBlock.add(elseBlock57.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: elseBlock, elseIfBlock, ifBlock
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 109:37: -> ^( IF ifBlock ( elseIfBlock )* ( elseBlock )? )
            {
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:109:40: ^( IF ifBlock ( elseIfBlock )* ( elseBlock )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IF, "IF")
                , root_1);

                adaptor.addChild(root_1, stream_ifBlock.nextTree());

                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:109:53: ( elseIfBlock )*
                while ( stream_elseIfBlock.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseIfBlock.nextTree());

                }
                stream_elseIfBlock.reset();

                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:109:66: ( elseBlock )?
                if ( stream_elseBlock.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseBlock.nextTree());

                }
                stream_elseBlock.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifStatement"


    public static class ifBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifBlock"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:112:1: ifBlock : 'if' expressionBracketed blockBracketed -> ^( EXP expressionBracketed blockBracketed ) ;
    public final oscriptParser.ifBlock_return ifBlock() throws RecognitionException {
        oscriptParser.ifBlock_return retval = new oscriptParser.ifBlock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal58=null;
        oscriptParser.expressionBracketed_return expressionBracketed59 =null;

        oscriptParser.blockBracketed_return blockBracketed60 =null;


        CommonTree string_literal58_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_expressionBracketed=new RewriteRuleSubtreeStream(adaptor,"rule expressionBracketed");
        RewriteRuleSubtreeStream stream_blockBracketed=new RewriteRuleSubtreeStream(adaptor,"rule blockBracketed");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:113:3: ( 'if' expressionBracketed blockBracketed -> ^( EXP expressionBracketed blockBracketed ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:113:5: 'if' expressionBracketed blockBracketed
            {
            string_literal58=(Token)match(input,64,FOLLOW_64_in_ifBlock675);  
            stream_64.add(string_literal58);


            pushFollow(FOLLOW_expressionBracketed_in_ifBlock677);
            expressionBracketed59=expressionBracketed();

            state._fsp--;

            stream_expressionBracketed.add(expressionBracketed59.getTree());

            pushFollow(FOLLOW_blockBracketed_in_ifBlock679);
            blockBracketed60=blockBracketed();

            state._fsp--;

            stream_blockBracketed.add(blockBracketed60.getTree());

            // AST REWRITE
            // elements: expressionBracketed, blockBracketed
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 113:45: -> ^( EXP expressionBracketed blockBracketed )
            {
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:113:48: ^( EXP expressionBracketed blockBracketed )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXP, "EXP")
                , root_1);

                adaptor.addChild(root_1, stream_expressionBracketed.nextTree());

                adaptor.addChild(root_1, stream_blockBracketed.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifBlock"


    public static class elseIfBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseIfBlock"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:116:1: elseIfBlock : 'else' 'if' expressionBracketed blockBracketed -> ^( EXP expressionBracketed blockBracketed ) ;
    public final oscriptParser.elseIfBlock_return elseIfBlock() throws RecognitionException {
        oscriptParser.elseIfBlock_return retval = new oscriptParser.elseIfBlock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal61=null;
        Token string_literal62=null;
        oscriptParser.expressionBracketed_return expressionBracketed63 =null;

        oscriptParser.blockBracketed_return blockBracketed64 =null;


        CommonTree string_literal61_tree=null;
        CommonTree string_literal62_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_expressionBracketed=new RewriteRuleSubtreeStream(adaptor,"rule expressionBracketed");
        RewriteRuleSubtreeStream stream_blockBracketed=new RewriteRuleSubtreeStream(adaptor,"rule blockBracketed");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:117:3: ( 'else' 'if' expressionBracketed blockBracketed -> ^( EXP expressionBracketed blockBracketed ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:117:5: 'else' 'if' expressionBracketed blockBracketed
            {
            string_literal61=(Token)match(input,61,FOLLOW_61_in_elseIfBlock705);  
            stream_61.add(string_literal61);


            string_literal62=(Token)match(input,64,FOLLOW_64_in_elseIfBlock707);  
            stream_64.add(string_literal62);


            pushFollow(FOLLOW_expressionBracketed_in_elseIfBlock709);
            expressionBracketed63=expressionBracketed();

            state._fsp--;

            stream_expressionBracketed.add(expressionBracketed63.getTree());

            pushFollow(FOLLOW_blockBracketed_in_elseIfBlock712);
            blockBracketed64=blockBracketed();

            state._fsp--;

            stream_blockBracketed.add(blockBracketed64.getTree());

            // AST REWRITE
            // elements: blockBracketed, expressionBracketed
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 117:53: -> ^( EXP expressionBracketed blockBracketed )
            {
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:117:56: ^( EXP expressionBracketed blockBracketed )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXP, "EXP")
                , root_1);

                adaptor.addChild(root_1, stream_expressionBracketed.nextTree());

                adaptor.addChild(root_1, stream_blockBracketed.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elseIfBlock"


    public static class elseBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseBlock"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:120:1: elseBlock : 'else' blockBracketed -> ^( EXP blockBracketed ) ;
    public final oscriptParser.elseBlock_return elseBlock() throws RecognitionException {
        oscriptParser.elseBlock_return retval = new oscriptParser.elseBlock_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal65=null;
        oscriptParser.blockBracketed_return blockBracketed66 =null;


        CommonTree string_literal65_tree=null;
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_blockBracketed=new RewriteRuleSubtreeStream(adaptor,"rule blockBracketed");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:121:3: ( 'else' blockBracketed -> ^( EXP blockBracketed ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:121:5: 'else' blockBracketed
            {
            string_literal65=(Token)match(input,61,FOLLOW_61_in_elseBlock738);  
            stream_61.add(string_literal65);


            pushFollow(FOLLOW_blockBracketed_in_elseBlock740);
            blockBracketed66=blockBracketed();

            state._fsp--;

            stream_blockBracketed.add(blockBracketed66.getTree());

            // AST REWRITE
            // elements: blockBracketed
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 121:27: -> ^( EXP blockBracketed )
            {
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:121:30: ^( EXP blockBracketed )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXP, "EXP")
                , root_1);

                adaptor.addChild(root_1, stream_blockBracketed.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "elseBlock"


    public static class forStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forStatement"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:124:1: forStatement : 'for' ^ '(' ! IDENT '<-' ! expression 'to' ! expression ')' ! blockBracketed ;
    public final oscriptParser.forStatement_return forStatement() throws RecognitionException {
        oscriptParser.forStatement_return retval = new oscriptParser.forStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal67=null;
        Token char_literal68=null;
        Token IDENT69=null;
        Token string_literal70=null;
        Token string_literal72=null;
        Token char_literal74=null;
        oscriptParser.expression_return expression71 =null;

        oscriptParser.expression_return expression73 =null;

        oscriptParser.blockBracketed_return blockBracketed75 =null;


        CommonTree string_literal67_tree=null;
        CommonTree char_literal68_tree=null;
        CommonTree IDENT69_tree=null;
        CommonTree string_literal70_tree=null;
        CommonTree string_literal72_tree=null;
        CommonTree char_literal74_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:125:3: ( 'for' ^ '(' ! IDENT '<-' ! expression 'to' ! expression ')' ! blockBracketed )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:125:5: 'for' ^ '(' ! IDENT '<-' ! expression 'to' ! expression ')' ! blockBracketed
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal67=(Token)match(input,62,FOLLOW_62_in_forStatement763); 
            string_literal67_tree = 
            (CommonTree)adaptor.create(string_literal67)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal67_tree, root_0);


            char_literal68=(Token)match(input,37,FOLLOW_37_in_forStatement766); 

            IDENT69=(Token)match(input,IDENT,FOLLOW_IDENT_in_forStatement769); 
            IDENT69_tree = 
            (CommonTree)adaptor.create(IDENT69)
            ;
            adaptor.addChild(root_0, IDENT69_tree);


            string_literal70=(Token)match(input,47,FOLLOW_47_in_forStatement771); 

            pushFollow(FOLLOW_expression_in_forStatement774);
            expression71=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression71.getTree());

            string_literal72=(Token)match(input,71,FOLLOW_71_in_forStatement776); 

            pushFollow(FOLLOW_expression_in_forStatement779);
            expression73=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression73.getTree());

            char_literal74=(Token)match(input,38,FOLLOW_38_in_forStatement781); 

            pushFollow(FOLLOW_blockBracketed_in_forStatement784);
            blockBracketed75=blockBracketed();

            state._fsp--;

            adaptor.addChild(root_0, blockBracketed75.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forStatement"


    public static class forEachStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forEachStatement"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:128:1: forEachStatement : ( 'for' 'each' | 'foreach' ) '(' IDENT '<-' expression ')' blockBracketed -> ^( FOREACH IDENT expression blockBracketed ) ;
    public final oscriptParser.forEachStatement_return forEachStatement() throws RecognitionException {
        oscriptParser.forEachStatement_return retval = new oscriptParser.forEachStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal76=null;
        Token string_literal77=null;
        Token string_literal78=null;
        Token char_literal79=null;
        Token IDENT80=null;
        Token string_literal81=null;
        Token char_literal83=null;
        oscriptParser.expression_return expression82 =null;

        oscriptParser.blockBracketed_return blockBracketed84 =null;


        CommonTree string_literal76_tree=null;
        CommonTree string_literal77_tree=null;
        CommonTree string_literal78_tree=null;
        CommonTree char_literal79_tree=null;
        CommonTree IDENT80_tree=null;
        CommonTree string_literal81_tree=null;
        CommonTree char_literal83_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_blockBracketed=new RewriteRuleSubtreeStream(adaptor,"rule blockBracketed");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:129:3: ( ( 'for' 'each' | 'foreach' ) '(' IDENT '<-' expression ')' blockBracketed -> ^( FOREACH IDENT expression blockBracketed ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:129:5: ( 'for' 'each' | 'foreach' ) '(' IDENT '<-' expression ')' blockBracketed
            {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:129:5: ( 'for' 'each' | 'foreach' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==62) ) {
                alt18=1;
            }
            else if ( (LA18_0==63) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:129:6: 'for' 'each'
                    {
                    string_literal76=(Token)match(input,62,FOLLOW_62_in_forEachStatement800);  
                    stream_62.add(string_literal76);


                    string_literal77=(Token)match(input,60,FOLLOW_60_in_forEachStatement802);  
                    stream_60.add(string_literal77);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:129:21: 'foreach'
                    {
                    string_literal78=(Token)match(input,63,FOLLOW_63_in_forEachStatement806);  
                    stream_63.add(string_literal78);


                    }
                    break;

            }


            char_literal79=(Token)match(input,37,FOLLOW_37_in_forEachStatement809);  
            stream_37.add(char_literal79);


            IDENT80=(Token)match(input,IDENT,FOLLOW_IDENT_in_forEachStatement811);  
            stream_IDENT.add(IDENT80);


            string_literal81=(Token)match(input,47,FOLLOW_47_in_forEachStatement813);  
            stream_47.add(string_literal81);


            pushFollow(FOLLOW_expression_in_forEachStatement815);
            expression82=expression();

            state._fsp--;

            stream_expression.add(expression82.getTree());

            char_literal83=(Token)match(input,38,FOLLOW_38_in_forEachStatement817);  
            stream_38.add(char_literal83);


            pushFollow(FOLLOW_blockBracketed_in_forEachStatement819);
            blockBracketed84=blockBracketed();

            state._fsp--;

            stream_blockBracketed.add(blockBracketed84.getTree());

            // AST REWRITE
            // elements: blockBracketed, IDENT, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 130:5: -> ^( FOREACH IDENT expression blockBracketed )
            {
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:130:8: ^( FOREACH IDENT expression blockBracketed )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOREACH, "FOREACH")
                , root_1);

                adaptor.addChild(root_1, 
                stream_IDENT.nextNode()
                );

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, stream_blockBracketed.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forEachStatement"


    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStatement"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:133:1: whileStatement : 'while' ^ expressionBracketed blockBracketed ;
    public final oscriptParser.whileStatement_return whileStatement() throws RecognitionException {
        oscriptParser.whileStatement_return retval = new oscriptParser.whileStatement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal85=null;
        oscriptParser.expressionBracketed_return expressionBracketed86 =null;

        oscriptParser.blockBracketed_return blockBracketed87 =null;


        CommonTree string_literal85_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:134:3: ( 'while' ^ expressionBracketed blockBracketed )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:134:5: 'while' ^ expressionBracketed blockBracketed
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal85=(Token)match(input,72,FOLLOW_72_in_whileStatement851); 
            string_literal85_tree = 
            (CommonTree)adaptor.create(string_literal85)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal85_tree, root_0);


            pushFollow(FOLLOW_expressionBracketed_in_whileStatement854);
            expressionBracketed86=expressionBracketed();

            state._fsp--;

            adaptor.addChild(root_0, expressionBracketed86.getTree());

            pushFollow(FOLLOW_blockBracketed_in_whileStatement856);
            blockBracketed87=blockBracketed();

            state._fsp--;

            adaptor.addChild(root_0, blockBracketed87.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileStatement"


    public static class list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "list"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:137:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
    public final oscriptParser.list_return list() throws RecognitionException {
        oscriptParser.list_return retval = new oscriptParser.list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal88=null;
        Token char_literal90=null;
        oscriptParser.exprList_return exprList89 =null;


        CommonTree char_literal88_tree=null;
        CommonTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:138:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:138:5: '[' ( exprList )? ']'
            {
            char_literal88=(Token)match(input,54,FOLLOW_54_in_list870);  
            stream_54.add(char_literal88);


            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:138:9: ( exprList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0 >= BOOLEAN && LA19_0 <= COMMAND)||LA19_0==IDENT||LA19_0==NUMBER||LA19_0==STRING_LITERAL||LA19_0==33||LA19_0==37||LA19_0==42||LA19_0==54||(LA19_0 >= 57 && LA19_0 <= 58)||(LA19_0 >= 66 && LA19_0 <= 68)||LA19_0==70) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:138:9: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_list872);
                    exprList89=exprList();

                    state._fsp--;

                    stream_exprList.add(exprList89.getTree());

                    }
                    break;

            }


            char_literal90=(Token)match(input,55,FOLLOW_55_in_list875);  
            stream_55.add(char_literal90);


            // AST REWRITE
            // elements: exprList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 138:23: -> ^( LIST ( exprList )? )
            {
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:138:26: ^( LIST ( exprList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LIST, "LIST")
                , root_1);

                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:138:33: ( exprList )?
                if ( stream_exprList.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprList.nextTree());

                }
                stream_exprList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "list"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:144:1: atom : ( 'null' | NUMBER | BOOLEAN | lookup );
    public final oscriptParser.atom_return atom() throws RecognitionException {
        oscriptParser.atom_return retval = new oscriptParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal91=null;
        Token NUMBER92=null;
        Token BOOLEAN93=null;
        oscriptParser.lookup_return lookup94 =null;


        CommonTree string_literal91_tree=null;
        CommonTree NUMBER92_tree=null;
        CommonTree BOOLEAN93_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:145:3: ( 'null' | NUMBER | BOOLEAN | lookup )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt20=1;
                }
                break;
            case NUMBER:
                {
                alt20=2;
                }
                break;
            case BOOLEAN:
                {
                alt20=3;
                }
                break;
            case COMMAND:
            case IDENT:
            case STRING_LITERAL:
            case 37:
            case 54:
            case 57:
            case 58:
            case 67:
            case 68:
            case 70:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:145:5: 'null'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal91=(Token)match(input,66,FOLLOW_66_in_atom904); 
                    string_literal91_tree = 
                    (CommonTree)adaptor.create(string_literal91)
                    ;
                    adaptor.addChild(root_0, string_literal91_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:146:5: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER92=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom910); 
                    NUMBER92_tree = 
                    (CommonTree)adaptor.create(NUMBER92)
                    ;
                    adaptor.addChild(root_0, NUMBER92_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:147:5: BOOLEAN
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BOOLEAN93=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_atom916); 
                    BOOLEAN93_tree = 
                    (CommonTree)adaptor.create(BOOLEAN93)
                    ;
                    adaptor.addChild(root_0, BOOLEAN93_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:148:5: lookup
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_lookup_in_atom922);
                    lookup94=lookup();

                    state._fsp--;

                    adaptor.addChild(root_0, lookup94.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class lookup_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lookup"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:151:1: lookup : ( IDENT ( indexes )? -> ^( LOOKUP IDENT ( indexes )? ) | STRING_LITERAL ( indexes )? -> ^( LOOKUP STRING_LITERAL ( indexes )? ) | expressionBracketed ( indexes )? -> ^( LOOKUP expressionBracketed ( indexes )? ) | functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) );
    public final oscriptParser.lookup_return lookup() throws RecognitionException {
        oscriptParser.lookup_return retval = new oscriptParser.lookup_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENT95=null;
        Token STRING_LITERAL97=null;
        oscriptParser.indexes_return indexes96 =null;

        oscriptParser.indexes_return indexes98 =null;

        oscriptParser.expressionBracketed_return expressionBracketed99 =null;

        oscriptParser.indexes_return indexes100 =null;

        oscriptParser.functionCall_return functionCall101 =null;

        oscriptParser.indexes_return indexes102 =null;

        oscriptParser.list_return list103 =null;

        oscriptParser.indexes_return indexes104 =null;


        CommonTree IDENT95_tree=null;
        CommonTree STRING_LITERAL97_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
        RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");
        RewriteRuleSubtreeStream stream_expressionBracketed=new RewriteRuleSubtreeStream(adaptor,"rule expressionBracketed");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:152:3: ( IDENT ( indexes )? -> ^( LOOKUP IDENT ( indexes )? ) | STRING_LITERAL ( indexes )? -> ^( LOOKUP STRING_LITERAL ( indexes )? ) | expressionBracketed ( indexes )? -> ^( LOOKUP expressionBracketed ( indexes )? ) | functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==37) ) {
                    alt26=4;
                }
                else if ( (LA26_1==EOF||LA26_1==COMMAND||LA26_1==IDENT||(LA26_1 >= 34 && LA26_1 <= 36)||(LA26_1 >= 38 && LA26_1 <= 46)||LA26_1==48||(LA26_1 >= 50 && LA26_1 <= 59)||(LA26_1 >= 62 && LA26_1 <= 65)||(LA26_1 >= 67 && LA26_1 <= 72)||(LA26_1 >= 74 && LA26_1 <= 75)) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
                }
                break;
            case STRING_LITERAL:
                {
                alt26=2;
                }
                break;
            case 37:
                {
                alt26=3;
                }
                break;
            case COMMAND:
            case 57:
            case 58:
            case 67:
            case 68:
            case 70:
                {
                alt26=4;
                }
                break;
            case 54:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:152:5: IDENT ( indexes )?
                    {
                    IDENT95=(Token)match(input,IDENT,FOLLOW_IDENT_in_lookup937);  
                    stream_IDENT.add(IDENT95);


                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:152:11: ( indexes )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==54) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:152:11: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup939);
                            indexes96=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes96.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: indexes, IDENT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 152:20: -> ^( LOOKUP IDENT ( indexes )? )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:152:23: ^( LOOKUP IDENT ( indexes )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOOKUP, "LOOKUP")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENT.nextNode()
                        );

                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:152:38: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:153:5: STRING_LITERAL ( indexes )?
                    {
                    STRING_LITERAL97=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_lookup957);  
                    stream_STRING_LITERAL.add(STRING_LITERAL97);


                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:153:20: ( indexes )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==54) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:153:20: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup959);
                            indexes98=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes98.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: STRING_LITERAL, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 153:29: -> ^( LOOKUP STRING_LITERAL ( indexes )? )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:153:32: ^( LOOKUP STRING_LITERAL ( indexes )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOOKUP, "LOOKUP")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_STRING_LITERAL.nextNode()
                        );

                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:153:56: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:154:5: expressionBracketed ( indexes )?
                    {
                    pushFollow(FOLLOW_expressionBracketed_in_lookup977);
                    expressionBracketed99=expressionBracketed();

                    state._fsp--;

                    stream_expressionBracketed.add(expressionBracketed99.getTree());

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:154:25: ( indexes )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==54) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:154:25: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup979);
                            indexes100=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes100.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: indexes, expressionBracketed
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 154:34: -> ^( LOOKUP expressionBracketed ( indexes )? )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:154:37: ^( LOOKUP expressionBracketed ( indexes )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOOKUP, "LOOKUP")
                        , root_1);

                        adaptor.addChild(root_1, stream_expressionBracketed.nextTree());

                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:154:66: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:155:5: functionCall ( indexes )?
                    {
                    pushFollow(FOLLOW_functionCall_in_lookup997);
                    functionCall101=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall101.getTree());

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:155:18: ( indexes )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==54) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:155:18: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup999);
                            indexes102=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes102.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: functionCall, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 155:27: -> ^( LOOKUP functionCall ( indexes )? )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:155:30: ^( LOOKUP functionCall ( indexes )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOOKUP, "LOOKUP")
                        , root_1);

                        adaptor.addChild(root_1, stream_functionCall.nextTree());

                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:155:52: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:156:5: list ( indexes )?
                    {
                    pushFollow(FOLLOW_list_in_lookup1017);
                    list103=list();

                    state._fsp--;

                    stream_list.add(list103.getTree());

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:156:10: ( indexes )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==54) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:156:10: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1019);
                            indexes104=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes104.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: indexes, list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 156:19: -> ^( LOOKUP list ( indexes )? )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:156:22: ^( LOOKUP list ( indexes )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LOOKUP, "LOOKUP")
                        , root_1);

                        adaptor.addChild(root_1, stream_list.nextTree());

                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:156:36: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lookup"


    public static class unary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:159:1: unary : ( '!' atom -> ^( NEGATE atom ) | '-' atom -> ^( UNARY_MIN atom ) | atom );
    public final oscriptParser.unary_return unary() throws RecognitionException {
        oscriptParser.unary_return retval = new oscriptParser.unary_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal105=null;
        Token char_literal107=null;
        oscriptParser.atom_return atom106 =null;

        oscriptParser.atom_return atom108 =null;

        oscriptParser.atom_return atom109 =null;


        CommonTree char_literal105_tree=null;
        CommonTree char_literal107_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:160:3: ( '!' atom -> ^( NEGATE atom ) | '-' atom -> ^( UNARY_MIN atom ) | atom )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt27=1;
                }
                break;
            case 42:
                {
                alt27=2;
                }
                break;
            case BOOLEAN:
            case COMMAND:
            case IDENT:
            case NUMBER:
            case STRING_LITERAL:
            case 37:
            case 54:
            case 57:
            case 58:
            case 66:
            case 67:
            case 68:
            case 70:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:160:5: '!' atom
                    {
                    char_literal105=(Token)match(input,33,FOLLOW_33_in_unary1044);  
                    stream_33.add(char_literal105);


                    pushFollow(FOLLOW_atom_in_unary1046);
                    atom106=atom();

                    state._fsp--;

                    stream_atom.add(atom106.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 160:14: -> ^( NEGATE atom )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:160:17: ^( NEGATE atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NEGATE, "NEGATE")
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:161:5: '-' atom
                    {
                    char_literal107=(Token)match(input,42,FOLLOW_42_in_unary1060);  
                    stream_42.add(char_literal107);


                    pushFollow(FOLLOW_atom_in_unary1062);
                    atom108=atom();

                    state._fsp--;

                    stream_atom.add(atom108.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 161:14: -> ^( UNARY_MIN atom )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:161:17: ^( UNARY_MIN atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(UNARY_MIN, "UNARY_MIN")
                        , root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:162:5: atom
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_unary1076);
                    atom109=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom109.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary"


    public static class power_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "power"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:165:1: power : unary ( '^' ^ unary )* ;
    public final oscriptParser.power_return power() throws RecognitionException {
        oscriptParser.power_return retval = new oscriptParser.power_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal111=null;
        oscriptParser.unary_return unary110 =null;

        oscriptParser.unary_return unary112 =null;


        CommonTree char_literal111_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:166:3: ( unary ( '^' ^ unary )* )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:166:5: unary ( '^' ^ unary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unary_in_power1089);
            unary110=unary();

            state._fsp--;

            adaptor.addChild(root_0, unary110.getTree());

            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:166:11: ( '^' ^ unary )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==56) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:166:12: '^' ^ unary
            	    {
            	    char_literal111=(Token)match(input,56,FOLLOW_56_in_power1092); 
            	    char_literal111_tree = 
            	    (CommonTree)adaptor.create(char_literal111)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal111_tree, root_0);


            	    pushFollow(FOLLOW_unary_in_power1095);
            	    unary112=unary();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary112.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "power"


    public static class mult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:169:1: mult : power ( ( '*' | '/' | '%' ) ^ power )* ;
    public final oscriptParser.mult_return mult() throws RecognitionException {
        oscriptParser.mult_return retval = new oscriptParser.mult_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set114=null;
        oscriptParser.power_return power113 =null;

        oscriptParser.power_return power115 =null;


        CommonTree set114_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:170:3: ( power ( ( '*' | '/' | '%' ) ^ power )* )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:170:5: power ( ( '*' | '/' | '%' ) ^ power )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_power_in_mult1112);
            power113=power();

            state._fsp--;

            adaptor.addChild(root_0, power113.getTree());

            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:170:11: ( ( '*' | '/' | '%' ) ^ power )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==35||LA29_0==39||LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:170:12: ( '*' | '/' | '%' ) ^ power
            	    {
            	    set114=(Token)input.LT(1);

            	    set114=(Token)input.LT(1);

            	    if ( input.LA(1)==35||input.LA(1)==39||input.LA(1)==43 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set114)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_power_in_mult1128);
            	    power115=power();

            	    state._fsp--;

            	    adaptor.addChild(root_0, power115.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mult"


    public static class add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "add"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:173:1: add : mult ( ( '+' | '-' ) ^ mult )* ;
    public final oscriptParser.add_return add() throws RecognitionException {
        oscriptParser.add_return retval = new oscriptParser.add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set117=null;
        oscriptParser.mult_return mult116 =null;

        oscriptParser.mult_return mult118 =null;


        CommonTree set117_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:174:3: ( mult ( ( '+' | '-' ) ^ mult )* )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:174:5: mult ( ( '+' | '-' ) ^ mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_mult_in_add1145);
            mult116=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult116.getTree());

            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:174:10: ( ( '+' | '-' ) ^ mult )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==40||LA30_0==42) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:174:11: ( '+' | '-' ) ^ mult
            	    {
            	    set117=(Token)input.LT(1);

            	    set117=(Token)input.LT(1);

            	    if ( input.LA(1)==40||input.LA(1)==42 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set117)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_mult_in_add1157);
            	    mult118=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult118.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "add"


    public static class relation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relation"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:177:1: relation : add ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) ^ add )* ;
    public final oscriptParser.relation_return relation() throws RecognitionException {
        oscriptParser.relation_return retval = new oscriptParser.relation_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set120=null;
        oscriptParser.add_return add119 =null;

        oscriptParser.add_return add121 =null;


        CommonTree set120_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:178:3: ( add ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) ^ add )* )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:178:5: add ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) ^ add )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_add_in_relation1174);
            add119=add();

            state._fsp--;

            adaptor.addChild(root_0, add119.getTree());

            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:178:9: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) ^ add )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==34||LA31_0==46||LA31_0==48||(LA31_0 >= 50 && LA31_0 <= 52)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:178:10: ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) ^ add
            	    {
            	    set120=(Token)input.LT(1);

            	    set120=(Token)input.LT(1);

            	    if ( input.LA(1)==34||input.LA(1)==46||input.LA(1)==48||(input.LA(1) >= 50 && input.LA(1) <= 52) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set120)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_add_in_relation1202);
            	    add121=add();

            	    state._fsp--;

            	    adaptor.addChild(root_0, add121.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relation"


    public static class bool_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:181:1: bool : relation ( ( '&&' | '||' ) ^ relation )* ;
    public final oscriptParser.bool_return bool() throws RecognitionException {
        oscriptParser.bool_return retval = new oscriptParser.bool_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set123=null;
        oscriptParser.relation_return relation122 =null;

        oscriptParser.relation_return relation124 =null;


        CommonTree set123_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:182:3: ( relation ( ( '&&' | '||' ) ^ relation )* )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:182:5: relation ( ( '&&' | '||' ) ^ relation )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relation_in_bool1219);
            relation122=relation();

            state._fsp--;

            adaptor.addChild(root_0, relation122.getTree());

            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:182:14: ( ( '&&' | '||' ) ^ relation )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36||LA32_0==74) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:182:15: ( '&&' | '||' ) ^ relation
            	    {
            	    set123=(Token)input.LT(1);

            	    set123=(Token)input.LT(1);

            	    if ( input.LA(1)==36||input.LA(1)==74 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set123)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relation_in_bool1231);
            	    relation124=relation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relation124.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool"


    public static class conditional_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditional"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:185:1: conditional : ( bool -> bool ) ( '?' a= expression ':' b= expression -> ^( TERNARY bool $a $b) | 'in' expression -> ^( 'in' bool expression ) )? ;
    public final oscriptParser.conditional_return conditional() throws RecognitionException {
        oscriptParser.conditional_return retval = new oscriptParser.conditional_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal126=null;
        Token char_literal127=null;
        Token string_literal128=null;
        oscriptParser.expression_return a =null;

        oscriptParser.expression_return b =null;

        oscriptParser.bool_return bool125 =null;

        oscriptParser.expression_return expression129 =null;


        CommonTree char_literal126_tree=null;
        CommonTree char_literal127_tree=null;
        CommonTree string_literal128_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_bool=new RewriteRuleSubtreeStream(adaptor,"rule bool");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:186:3: ( ( bool -> bool ) ( '?' a= expression ':' b= expression -> ^( TERNARY bool $a $b) | 'in' expression -> ^( 'in' bool expression ) )? )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:186:5: ( bool -> bool ) ( '?' a= expression ':' b= expression -> ^( TERNARY bool $a $b) | 'in' expression -> ^( 'in' bool expression ) )?
            {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:186:5: ( bool -> bool )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:186:6: bool
            {
            pushFollow(FOLLOW_bool_in_conditional1249);
            bool125=bool();

            state._fsp--;

            stream_bool.add(bool125.getTree());

            // AST REWRITE
            // elements: bool
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 186:11: -> bool
            {
                adaptor.addChild(root_0, stream_bool.nextTree());

            }


            retval.tree = root_0;

            }


            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:187:5: ( '?' a= expression ':' b= expression -> ^( TERNARY bool $a $b) | 'in' expression -> ^( 'in' bool expression ) )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            else if ( (LA33_0==65) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:187:6: '?' a= expression ':' b= expression
                    {
                    char_literal126=(Token)match(input,53,FOLLOW_53_in_conditional1261);  
                    stream_53.add(char_literal126);


                    pushFollow(FOLLOW_expression_in_conditional1265);
                    a=expression();

                    state._fsp--;

                    stream_expression.add(a.getTree());

                    char_literal127=(Token)match(input,44,FOLLOW_44_in_conditional1267);  
                    stream_44.add(char_literal127);


                    pushFollow(FOLLOW_expression_in_conditional1271);
                    b=expression();

                    state._fsp--;

                    stream_expression.add(b.getTree());

                    // AST REWRITE
                    // elements: a, b, bool
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 187:41: -> ^( TERNARY bool $a $b)
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:187:44: ^( TERNARY bool $a $b)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TERNARY, "TERNARY")
                        , root_1);

                        adaptor.addChild(root_1, stream_bool.nextTree());

                        adaptor.addChild(root_1, stream_a.nextTree());

                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:188:9: 'in' expression
                    {
                    string_literal128=(Token)match(input,65,FOLLOW_65_in_conditional1296);  
                    stream_65.add(string_literal128);


                    pushFollow(FOLLOW_expression_in_conditional1298);
                    expression129=expression();

                    state._fsp--;

                    stream_expression.add(expression129.getTree());

                    // AST REWRITE
                    // elements: expression, bool, 65
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 188:41: -> ^( 'in' bool expression )
                    {
                        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:188:44: ^( 'in' bool expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_65.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_bool.nextTree());

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditional"


    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:192:1: expression : conditional ;
    public final oscriptParser.expression_return expression() throws RecognitionException {
        oscriptParser.expression_return retval = new oscriptParser.expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        oscriptParser.conditional_return conditional130 =null;



        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:193:3: ( conditional )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:193:5: conditional
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditional_in_expression1345);
            conditional130=conditional();

            state._fsp--;

            adaptor.addChild(root_0, conditional130.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class exprList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprList"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:196:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
    public final oscriptParser.exprList_return exprList() throws RecognitionException {
        oscriptParser.exprList_return retval = new oscriptParser.exprList_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal132=null;
        oscriptParser.expression_return expression131 =null;

        oscriptParser.expression_return expression133 =null;


        CommonTree char_literal132_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:197:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:197:5: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_exprList1358);
            expression131=expression();

            state._fsp--;

            stream_expression.add(expression131.getTree());

            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:197:16: ( ',' expression )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==41) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:197:17: ',' expression
            	    {
            	    char_literal132=(Token)match(input,41,FOLLOW_41_in_exprList1361);  
            	    stream_41.add(char_literal132);


            	    pushFollow(FOLLOW_expression_in_exprList1363);
            	    expression133=expression();

            	    state._fsp--;

            	    stream_expression.add(expression133.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 197:34: -> ^( EXP_LIST ( expression )+ )
            {
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:197:37: ^( EXP_LIST ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXP_LIST, "EXP_LIST")
                , root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exprList"


    public static class expressionBracketed_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionBracketed"
    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:200:1: expressionBracketed : '(' ! expression ')' !;
    public final oscriptParser.expressionBracketed_return expressionBracketed() throws RecognitionException {
        oscriptParser.expressionBracketed_return retval = new oscriptParser.expressionBracketed_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal134=null;
        Token char_literal136=null;
        oscriptParser.expression_return expression135 =null;


        CommonTree char_literal134_tree=null;
        CommonTree char_literal136_tree=null;

        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:201:3: ( '(' ! expression ')' !)
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:201:5: '(' ! expression ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal134=(Token)match(input,37,FOLLOW_37_in_expressionBracketed1387); 

            pushFollow(FOLLOW_expression_in_expressionBracketed1390);
            expression135=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression135.getTree());

            char_literal136=(Token)match(input,38,FOLLOW_38_in_expressionBracketed1392); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionBracketed"

    // Delegated rules


 

    public static final BitSet FOLLOW_block_in_parse158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDecl_in_block174 = new BitSet(new long[]{0xCE00000000008042L,0x0000000000000179L});
    public static final BitSet FOLLOW_statement_in_block178 = new BitSet(new long[]{0xCE00000000008042L,0x0000000000000179L});
    public static final BitSet FOLLOW_69_in_block183 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_block185 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_block187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_blockBracketed229 = new BitSet(new long[]{0xCE00000000008040L,0x0000000000000979L});
    public static final BitSet FOLLOW_block_in_blockBracketed232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_blockBracketed234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDecl_in_blockOneLine250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockOneLine254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_blockOneLine259 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_blockOneLine261 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_blockOneLine263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_functionDecl302 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_functionDecl304 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_functionDecl306 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_idList_in_functionDecl309 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_functionDecl312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_blockBracketed_in_functionDecl315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList337 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_idList340 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_idList342 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_assignment_in_statement369 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_statement371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement383 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_statement385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forEachStatement_in_statement415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment438 = new BitSet(new long[]{0x0042000000000002L});
    public static final BitSet FOLLOW_indexes_in_assignment440 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_assignment445 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_assignment448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_indexes466 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_indexes468 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_indexes470 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_IDENT_in_functionCall497 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_functionCall499 = new BitSet(new long[]{0x0640046222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprList_in_functionCall501 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_functionCall504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_functionCall521 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expressionBracketed_in_functionCall523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_functionCall539 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expressionBracketed_in_functionCall541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_functionCall557 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expressionBracketed_in_functionCall559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_functionCall575 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expressionBracketed_in_functionCall577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_functionCall593 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expressionBracketed_in_functionCall595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMAND_in_functionCall612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBlock_in_ifStatement640 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_elseIfBlock_in_ifStatement642 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_elseBlock_in_ifStatement645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ifBlock675 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expressionBracketed_in_ifBlock677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_blockBracketed_in_ifBlock679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_elseIfBlock705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_elseIfBlock707 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expressionBracketed_in_elseIfBlock709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_blockBracketed_in_elseIfBlock712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_elseBlock738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_blockBracketed_in_elseBlock740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_forStatement763 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_forStatement766 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_forStatement769 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_forStatement771 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_forStatement774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_forStatement776 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_forStatement779 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_forStatement781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_blockBracketed_in_forStatement784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_forEachStatement800 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_forEachStatement802 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_63_in_forEachStatement806 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_forEachStatement809 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IDENT_in_forEachStatement811 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_forEachStatement813 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_forEachStatement815 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_forEachStatement817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_blockBracketed_in_forEachStatement819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_whileStatement851 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_expressionBracketed_in_whileStatement854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_blockBracketed_in_whileStatement856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_list870 = new BitSet(new long[]{0x06C0042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_exprList_in_list872 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_list875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_atom904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_atom910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_atom916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_atom922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_lookup937 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_lookup957 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionBracketed_in_lookup977 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_lookup997 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_lookup1017 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_indexes_in_lookup1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_unary1044 = new BitSet(new long[]{0x0640002022008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_atom_in_unary1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_unary1060 = new BitSet(new long[]{0x0640002022008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_atom_in_unary1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unary1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_in_power1089 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_power1092 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_unary_in_power1095 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_power_in_mult1112 = new BitSet(new long[]{0x0000088800000002L});
    public static final BitSet FOLLOW_set_in_mult1115 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_power_in_mult1128 = new BitSet(new long[]{0x0000088800000002L});
    public static final BitSet FOLLOW_mult_in_add1145 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_set_in_add1148 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_mult_in_add1157 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_add_in_relation1174 = new BitSet(new long[]{0x001D400400000002L});
    public static final BitSet FOLLOW_set_in_relation1177 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_add_in_relation1202 = new BitSet(new long[]{0x001D400400000002L});
    public static final BitSet FOLLOW_relation_in_bool1219 = new BitSet(new long[]{0x0000001000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_bool1222 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_relation_in_bool1231 = new BitSet(new long[]{0x0000001000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_bool_in_conditional1249 = new BitSet(new long[]{0x0020000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_conditional1261 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_conditional1265 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_conditional1267 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_conditional1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_conditional1296 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_conditional1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_expression1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprList1358 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_exprList1361 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_exprList1363 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_37_in_expressionBracketed1387 = new BitSet(new long[]{0x0640042222008060L,0x000000000000005CL});
    public static final BitSet FOLLOW_expression_in_expressionBracketed1390 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_expressionBracketed1392 = new BitSet(new long[]{0x0000000000000002L});

}