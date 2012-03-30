package oscript;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import oscript.grammar.oscriptLexer;
import oscript.grammar.oscriptParser;
import oscript.grammar.oscriptParser.parse_return;
import oscript.grammar.oscriptWalker;
import oscript.tree.Node;

public class Interpreter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String script = (args.length != 0) ? args[0] : "sample.script";
		oscriptLexer lexer = new oscriptLexer(new ANTLRFileStream(script));
		TokenStream tokenStream = new CommonTokenStream(lexer);
		oscriptParser parser = new oscriptParser(tokenStream );
		try {
			//Parsen
			parse_return parsedScript = parser.parse();
			System.out.println("AST: " + ((CommonTree) parsedScript.getTree()).toStringTree());
			
//			//Den AST als DOT ausgeben für http://graphviz-dev.appspot.com/
//			DOTTreeGenerator gen = new DOTTreeGenerator();
//			StringTemplate st = gen.toDOT(parsedScript.tree);
//			System.out.println(st);
			
			//Durch den Baum laufen
			CommonTreeNodeStream nodeStream = new CommonTreeNodeStream((CommonTree) parsedScript.getTree());
			//Die Funktionstabelle des Parsers übergeben
			oscriptWalker walker = new oscriptWalker(nodeStream, parser.functions);
			Node result = walker.walk();
			System.out.println(result == null ? "null" : result.evaluate());
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		System.out.println("done!");
	}

}
