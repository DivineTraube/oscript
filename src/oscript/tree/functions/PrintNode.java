package oscript.tree.functions;

import java.io.PrintStream;

import oscript.Value;
import oscript.tree.Node;

public class PrintNode implements Node {

	private Node expression;
	private String tail;

	public PrintNode(Node expression) {
		this(expression, "");
	}

	public PrintNode(Node expression, String tail) {
		this.expression = expression;
		this.tail = tail;
	}

	@Override
	public Value evaluate() {
		Value value = expression.evaluate();
		System.out.print(value + tail);
		return Value.VOID;
	}

}
