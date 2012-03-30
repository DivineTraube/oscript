package oscript.tree;

import oscript.Value;

public class NegateNode implements Node {

	private Node exp;

	public NegateNode(Node e) {
		exp = e;
	}

	@Override
	public Value evaluate() {

		Value v = exp.evaluate();

		if (!v.isBoolean()) {
			throw new RuntimeException("illegal expression: " + this);
		}

		return new Value(!v.asBoolean());
	}

	@Override
	public String toString() {
		return String.format("(!%s)", exp);
	}
}
