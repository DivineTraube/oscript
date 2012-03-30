package oscript.tree;

import java.util.List;

import oscript.Value;

public class LTNode implements Node {
	private Node lhs;
	private Node rhs;

	public LTNode(Node lhs, Node rhs) {
		super();
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {
		Value a = lhs.evaluate();
		Value b = rhs.evaluate();

		if (a.isNumber() && b.isNumber()) {
			return new Value(a.asDouble() < b.asDouble());
		}

		if (a.isString() && b.isString()) {
			return new Value(a.asString().compareTo(b.asString()) < 0);
		}

		throw new RuntimeException("illegal expression: " + this);
	}

	@Override
	public String toString() {
		return String.format("(%s < %s)", lhs, rhs);
	}

}
