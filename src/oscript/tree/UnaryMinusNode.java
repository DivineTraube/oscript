package oscript.tree;

import oscript.Value;

public class UnaryMinusNode implements Node {

	private Node exp;

	public UnaryMinusNode(Node e) {
		exp = e;
	}

	@Override
	public Value evaluate() {

		Value v = exp.evaluate();

		if (!v.isNumber()) {
			throw new RuntimeException("illegal expression: " + this);
		}

		return new Value(-v.asDouble());
	}

	@Override
	public String toString() {
		return String.format("(-%s)", exp);
	}
}
