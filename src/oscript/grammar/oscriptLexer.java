// $ANTLR 3.4 C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g 2012-03-30 15:46:52

  package oscript.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class oscriptLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public oscriptLexer() {} 
    public oscriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public oscriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g"; }

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:11:7: ( '!' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:11:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:12:7: ( '!=' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:12:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:13:7: ( '%' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:13:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:14:7: ( '&&' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:14:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:15:7: ( '(' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:16:7: ( ')' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:17:7: ( '*' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:18:7: ( '+' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:18:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:19:7: ( ',' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:20:7: ( '-' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:20:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:21:7: ( '/' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:21:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:22:7: ( ':' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:22:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:23:7: ( ';' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:23:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:24:7: ( '<' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:24:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:25:7: ( '<-' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:25:9: '<-'
            {
            match("<-"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:26:7: ( '<=' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:26:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:27:7: ( '=' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:28:7: ( '==' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:28:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:29:7: ( '>' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:29:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:30:7: ( '>=' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:30:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:31:7: ( '?' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:31:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:32:7: ( '[' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:32:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:33:7: ( ']' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:33:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:34:7: ( '^' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:34:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:35:7: ( 'alert' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:35:9: 'alert'
            {
            match("alert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:36:7: ( 'assert' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:36:9: 'assert'
            {
            match("assert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:37:7: ( 'def' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:37:9: 'def'
            {
            match("def"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:38:7: ( 'each' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:38:9: 'each'
            {
            match("each"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:39:7: ( 'else' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:39:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:40:7: ( 'for' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:40:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:41:7: ( 'foreach' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:41:9: 'foreach'
            {
            match("foreach"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:42:7: ( 'if' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:42:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:43:7: ( 'in' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:43:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:44:7: ( 'null' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:44:9: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:45:7: ( 'print' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:45:9: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:46:7: ( 'println' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:46:9: 'println'
            {
            match("println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:47:7: ( 'return' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:47:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:48:7: ( 'size' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:48:9: 'size'
            {
            match("size"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:49:7: ( 'to' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:49:9: 'to'
            {
            match("to"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:50:7: ( 'while' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:50:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:51:7: ( '{' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:51:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:52:7: ( '||' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:52:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:53:7: ( '}' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:53:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:205:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | 'ä' | 'ö' | 'ü' ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:206:16: ( '0' .. '9' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:207:17: ( ( '1' .. '9' ( DIGIT )* | '0' ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:207:19: ( '1' .. '9' ( DIGIT )* | '0' )
            {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:207:19: ( '1' .. '9' ( DIGIT )* | '0' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
                alt2=1;
            }
            else if ( (LA2_0=='0') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:207:20: '1' .. '9' ( DIGIT )*
                    {
                    matchRange('1','9'); 

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:207:29: ( DIGIT )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:207:38: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:208:9: ( ( 'true' | 'false' ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:208:11: ( 'true' | 'false' )
            {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:208:11: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:208:12: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:208:21: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:213:3: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:213:6: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:213:11: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
                            alt4=1;
                        }
                        else if ( (LA4_0=='\\') ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:213:12: ~ ( '\"' | '\\\\' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:213:29: '\\\\' ( '\\\\' | '\"' )
                    	    {
                    	    match('\\'); 

                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\\' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:214:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:214:11: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '\u0000' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
                            alt5=1;
                        }
                        else if ( (LA5_0=='\\') ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:214:12: ~ ( '\\'' | '\\\\' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:214:29: '\\\\' ( '\\\\' | '\\'' )
                    	    {
                    	    match('\\'); 

                    	    if ( input.LA(1)=='\''||input.LA(1)=='\\' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
             
            	  setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1")); 
            	
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "COMMAND"
    public final void mCOMMAND() throws RecognitionException {
        try {
            int _type = COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int com;

            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:217:3: ( 'os' ( WS )* '{' (com=~ ( '}' ) )* '}' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:217:6: 'os' ( WS )* '{' (com=~ ( '}' ) )* '}'
            {
             StringBuilder b = new StringBuilder(); 

            match("os"); 



            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:218:8: ( WS )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||(LA7_0 >= '\f' && LA7_0 <= '\r')||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:218:8: WS
            	    {
            	    mWS(); 


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match('{'); 

            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:219:3: (com=~ ( '}' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '|')||(LA8_0 >= '~' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:220:3: com=~ ( '}' )
            	    {
            	    com= input.LA(1);

            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '|')||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    b.appendCodePoint(com);

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match('}'); 

             setText(b.toString()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMAND"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:225:8: ( INTEGER ( '.' ( DIGIT )* )? )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:225:10: INTEGER ( '.' ( DIGIT )* )?
            {
            mINTEGER(); 


            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:225:18: ( '.' ( DIGIT )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='.') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:225:19: '.' ( DIGIT )*
                    {
                    match('.'); 

                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:225:23: ( DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:226:7: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:226:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 


            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:226:16: ( LETTER | DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '9')||(LA11_0 >= 'A' && LA11_0 <= 'Z')||(LA11_0 >= 'a' && LA11_0 <= 'z')||LA11_0=='\u00E4'||LA11_0=='\u00F6'||LA11_0=='\u00FC') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "DOLLAR_IDENT"
    public final void mDOLLAR_IDENT() throws RecognitionException {
        try {
            int _type = DOLLAR_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:227:14: ( '$' IDENT )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:227:16: '$' IDENT
            {
            match('$'); 

            mIDENT(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLAR_IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:228:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:228:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:228:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||(LA12_0 >= '\f' && LA12_0 <= '\r')||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:229:8: ( ( '//' | '#' ) ( . )* ( '\\n' | '\\r' ) )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:229:10: ( '//' | '#' ) ( . )* ( '\\n' | '\\r' )
            {
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:229:10: ( '//' | '#' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='/') ) {
                alt13=1;
            }
            else if ( (LA13_0=='#') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:229:11: '//'
                    {
                    match("//"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:229:18: '#'
                    {
                    match('#'); 

                    }
                    break;

            }


            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:229:23: ( . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                    alt14=2;
                }
                else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:229:23: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:230:18: ( '/*' ( . )* '*/' )
            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:230:20: '/*' ( . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:230:25: ( . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1 >= '\u0000' && LA15_1 <= '.')||(LA15_1 >= '0' && LA15_1 <= '\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0 >= '\u0000' && LA15_0 <= ')')||(LA15_0 >= '+' && LA15_0 <= '\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:230:25: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            match("*/"); 



            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTILINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | BOOLEAN | STRING_LITERAL | COMMAND | NUMBER | IDENT | DOLLAR_IDENT | WS | COMMENT | MULTILINE_COMMENT )
        int alt16=52;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:10: T__33
                {
                mT__33(); 


                }
                break;
            case 2 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:16: T__34
                {
                mT__34(); 


                }
                break;
            case 3 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:22: T__35
                {
                mT__35(); 


                }
                break;
            case 4 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:28: T__36
                {
                mT__36(); 


                }
                break;
            case 5 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:34: T__37
                {
                mT__37(); 


                }
                break;
            case 6 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:40: T__38
                {
                mT__38(); 


                }
                break;
            case 7 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:46: T__39
                {
                mT__39(); 


                }
                break;
            case 8 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:52: T__40
                {
                mT__40(); 


                }
                break;
            case 9 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:58: T__41
                {
                mT__41(); 


                }
                break;
            case 10 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:64: T__42
                {
                mT__42(); 


                }
                break;
            case 11 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:70: T__43
                {
                mT__43(); 


                }
                break;
            case 12 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:76: T__44
                {
                mT__44(); 


                }
                break;
            case 13 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:82: T__45
                {
                mT__45(); 


                }
                break;
            case 14 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:88: T__46
                {
                mT__46(); 


                }
                break;
            case 15 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:94: T__47
                {
                mT__47(); 


                }
                break;
            case 16 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:100: T__48
                {
                mT__48(); 


                }
                break;
            case 17 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:106: T__49
                {
                mT__49(); 


                }
                break;
            case 18 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:112: T__50
                {
                mT__50(); 


                }
                break;
            case 19 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:118: T__51
                {
                mT__51(); 


                }
                break;
            case 20 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:124: T__52
                {
                mT__52(); 


                }
                break;
            case 21 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:130: T__53
                {
                mT__53(); 


                }
                break;
            case 22 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:136: T__54
                {
                mT__54(); 


                }
                break;
            case 23 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:142: T__55
                {
                mT__55(); 


                }
                break;
            case 24 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:148: T__56
                {
                mT__56(); 


                }
                break;
            case 25 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:154: T__57
                {
                mT__57(); 


                }
                break;
            case 26 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:160: T__58
                {
                mT__58(); 


                }
                break;
            case 27 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:166: T__59
                {
                mT__59(); 


                }
                break;
            case 28 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:172: T__60
                {
                mT__60(); 


                }
                break;
            case 29 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:178: T__61
                {
                mT__61(); 


                }
                break;
            case 30 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:184: T__62
                {
                mT__62(); 


                }
                break;
            case 31 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:190: T__63
                {
                mT__63(); 


                }
                break;
            case 32 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:196: T__64
                {
                mT__64(); 


                }
                break;
            case 33 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:202: T__65
                {
                mT__65(); 


                }
                break;
            case 34 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:208: T__66
                {
                mT__66(); 


                }
                break;
            case 35 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:214: T__67
                {
                mT__67(); 


                }
                break;
            case 36 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:220: T__68
                {
                mT__68(); 


                }
                break;
            case 37 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:226: T__69
                {
                mT__69(); 


                }
                break;
            case 38 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:232: T__70
                {
                mT__70(); 


                }
                break;
            case 39 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:238: T__71
                {
                mT__71(); 


                }
                break;
            case 40 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:244: T__72
                {
                mT__72(); 


                }
                break;
            case 41 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:250: T__73
                {
                mT__73(); 


                }
                break;
            case 42 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:256: T__74
                {
                mT__74(); 


                }
                break;
            case 43 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:262: T__75
                {
                mT__75(); 


                }
                break;
            case 44 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:268: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 45 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:276: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 46 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:291: COMMAND
                {
                mCOMMAND(); 


                }
                break;
            case 47 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:299: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 48 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:306: IDENT
                {
                mIDENT(); 


                }
                break;
            case 49 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:312: DOLLAR_IDENT
                {
                mDOLLAR_IDENT(); 


                }
                break;
            case 50 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:325: WS
                {
                mWS(); 


                }
                break;
            case 51 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:328: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 52 :
                // C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\src\\oscript\\grammar\\oscript.g:1:336: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\52\10\uffff\1\54\2\uffff\1\57\1\61\1\63\4\uffff\13\45"+
        "\4\uffff\1\45\20\uffff\7\45\1\114\1\115\4\45\1\122\5\45\1\130\2"+
        "\45\1\134\1\45\2\uffff\4\45\1\uffff\2\45\1\uffff\2\45\1\uffff\1"+
        "\146\1\147\1\45\1\uffff\1\45\1\152\2\45\1\155\1\156\1\45\1\160\1"+
        "\45\2\uffff\1\45\1\156\1\uffff\1\164\1\45\2\uffff\1\166\1\uffff"+
        "\1\167\2\45\1\uffff\1\172\2\uffff\1\173\1\174\3\uffff";
    static final String DFA16_eofS =
        "\175\uffff";
    static final String DFA16_minS =
        "\1\11\1\75\10\uffff\1\52\2\uffff\1\55\2\75\4\uffff\1\154\1\145\2"+
        "\141\1\146\1\165\1\162\1\145\1\151\1\157\1\150\4\uffff\1\163\20"+
        "\uffff\1\145\1\163\1\146\1\143\1\163\1\162\1\154\2\60\1\154\1\151"+
        "\1\164\1\172\1\60\1\165\1\151\1\11\1\162\1\145\1\60\1\150\1\145"+
        "\1\60\1\163\2\uffff\1\154\1\156\1\165\1\145\1\uffff\1\145\1\154"+
        "\1\uffff\1\164\1\162\1\uffff\2\60\1\141\1\uffff\1\145\1\60\1\164"+
        "\1\162\2\60\1\145\1\60\1\164\2\uffff\1\143\1\60\1\uffff\1\60\1\156"+
        "\2\uffff\1\60\1\uffff\1\60\1\150\1\156\1\uffff\1\60\2\uffff\2\60"+
        "\3\uffff";
    static final String DFA16_maxS =
        "\1\u00fc\1\75\10\uffff\1\57\2\uffff\3\75\4\uffff\1\163\1\145\1\154"+
        "\1\157\1\156\1\165\1\162\1\145\1\151\1\162\1\150\4\uffff\1\163\20"+
        "\uffff\1\145\1\163\1\146\1\143\1\163\1\162\1\154\2\u00fc\1\154\1"+
        "\151\1\164\1\172\1\u00fc\1\165\1\151\1\173\1\162\1\145\1\u00fc\1"+
        "\150\1\145\1\u00fc\1\163\2\uffff\1\154\1\156\1\165\1\145\1\uffff"+
        "\1\145\1\154\1\uffff\1\164\1\162\1\uffff\2\u00fc\1\141\1\uffff\1"+
        "\145\1\u00fc\1\164\1\162\2\u00fc\1\145\1\u00fc\1\164\2\uffff\1\143"+
        "\1\u00fc\1\uffff\1\u00fc\1\156\2\uffff\1\u00fc\1\uffff\1\u00fc\1"+
        "\150\1\156\1\uffff\1\u00fc\2\uffff\2\u00fc\3\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff\1\14\1\15\3"+
        "\uffff\1\25\1\26\1\27\1\30\13\uffff\1\51\1\52\1\53\1\55\1\uffff"+
        "\1\57\1\60\1\61\1\62\1\63\1\2\1\1\1\64\1\13\1\17\1\20\1\16\1\22"+
        "\1\21\1\24\1\23\30\uffff\1\40\1\41\4\uffff\1\47\2\uffff\1\56\2\uffff"+
        "\1\33\3\uffff\1\36\11\uffff\1\34\1\35\2\uffff\1\42\2\uffff\1\46"+
        "\1\54\1\uffff\1\31\3\uffff\1\43\1\uffff\1\50\1\32\2\uffff\1\45\1"+
        "\37\1\44";
    static final String DFA16_specialS =
        "\175\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\47\1\uffff\2\47\22\uffff\1\47\1\1\1\42\1\50\1\46\1\2\1\3"+
            "\1\42\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\12\44\1\13\1\14"+
            "\1\15\1\16\1\17\1\20\1\uffff\32\45\1\21\1\uffff\1\22\1\23\2"+
            "\uffff\1\24\2\45\1\25\1\26\1\27\2\45\1\30\4\45\1\31\1\43\1\32"+
            "\1\45\1\33\1\34\1\35\2\45\1\36\3\45\1\37\1\40\1\41\146\uffff"+
            "\1\45\21\uffff\1\45\5\uffff\1\45",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\4\uffff\1\50",
            "",
            "",
            "\1\55\17\uffff\1\56",
            "\1\60",
            "\1\62",
            "",
            "",
            "",
            "",
            "\1\64\6\uffff\1\65",
            "\1\66",
            "\1\67\12\uffff\1\70",
            "\1\72\15\uffff\1\71",
            "\1\73\7\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101\2\uffff\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\1\123",
            "\1\124",
            "\2\125\1\uffff\2\125\22\uffff\1\125\132\uffff\1\125",
            "\1\126",
            "\1\127",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\1\131",
            "\1\132",
            "\12\45\7\uffff\32\45\6\uffff\4\45\1\133\25\45\151\uffff\1\45"+
            "\21\uffff\1\45\5\uffff\1\45",
            "\1\135",
            "",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\1\150",
            "",
            "\1\151",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\1\153",
            "\1\154",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\1\157",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\1\161",
            "",
            "",
            "\1\162",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "",
            "\12\45\7\uffff\32\45\6\uffff\13\45\1\163\16\45\151\uffff\1"+
            "\45\21\uffff\1\45\5\uffff\1\45",
            "\1\165",
            "",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\1\170",
            "\1\171",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "",
            "",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "\12\45\7\uffff\32\45\6\uffff\32\45\151\uffff\1\45\21\uffff"+
            "\1\45\5\uffff\1\45",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | BOOLEAN | STRING_LITERAL | COMMAND | NUMBER | IDENT | DOLLAR_IDENT | WS | COMMENT | MULTILINE_COMMENT );";
        }
    }
 

}