package oscript.tree;

import java.util.ArrayList;
import java.util.List;

import oscript.Value;

public class MulNode implements Node {

	private Node lhs;
	private Node rhs;

	public MulNode(Node lhs, Node rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {

		Value a = lhs.evaluate();
		Value b = rhs.evaluate();

		if (a.isNumber() && b.isNumber()) {
			return new Value(a.asDouble() * b.asDouble());
		}

		// Strings
		if (a.isString() && b.isNumber()) {
			StringBuilder str = new StringBuilder();
			int stop = b.asDouble().intValue();
			for (int i = 0; i < stop; i++) {
				str.append(a.asString());
			}
			return new Value(str.toString());
		}

		// Listen
		if (a.isList() && b.isNumber()) {
			List<Value> total = new ArrayList<Value>();
			int stop = b.asDouble().intValue();
			for (int i = 0; i < stop; i++) {
				total.addAll(a.asList());
			}
			return new Value(total);
		}

		throw new RuntimeException("illegal expression: " + this);
	}

	@Override
	public String toString() {
		return String.format("(%s * %s)", lhs, rhs);
	}
}
