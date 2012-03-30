package oscript.tree.functions;

import oscript.Value;
import oscript.tree.Node;

public class SizeNode implements Node {

	private Node of;

	public SizeNode(Node of) {
		this.of = of;
	}

	@Override
	public Value evaluate() {
		Value value = of.evaluate();

		if (value.isString()) {
			return new Value(value.asString().length());
		}

		if (value.isList()) {
			return new Value(value.asList().size());
		}

		throw new RuntimeException("Illegal function call: " + this);
	}

	@Override
	public String toString() {
		return String.format("size(%s)", of);
	}

}
