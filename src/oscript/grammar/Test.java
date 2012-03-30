package oscript.grammar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import oscript.grammar.oscriptParser.parse_return;
import oscript.tree.Node;

public class Test {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String file = new Scanner(new File("C:\\Users\\Felix\\workspace\\Algorithmik\\oscript\\bin\\oscript\\grammar\\sample.script")).useDelimiter("\\Z").next();
		CharStream charStream = new ANTLRStringStream(file);
		oscriptLexer lexer = new oscriptLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		oscriptParser parser = new oscriptParser(tokenStream );
		try {
			//Parsen
			parse_return parsedScript = parser.parse();
			System.out.println("AST: " + parsedScript.tree.toStringTree());
			
//			//Den AST als DOT ausgeben für http://graphviz-dev.appspot.com/
//			DOTTreeGenerator gen = new DOTTreeGenerator();
//			StringTemplate st = gen.toDOT(parsedScript.tree);
//			System.out.println(st);
			
			//Durch den Baum laufen
			CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(parsedScript.tree);
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
