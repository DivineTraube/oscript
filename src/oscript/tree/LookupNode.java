package oscript.tree;

import java.util.LinkedList;
import java.util.List;

import oscript.Value;

public class LookupNode implements Node {
	private Node expression;
	private List<Node> indexes;

	public LookupNode(Node expression, List<Node> indexes) {
		this.expression = expression;
		this.indexes = indexes;
	}

	@Override
	public Value evaluate() {
		Value value = expression.evaluate();

		for (Node indexNode : indexes) {
			Value index = indexNode.evaluate();

			if (!index.isNumber() || !(value.isList() || value.isString())) {
				throw new RuntimeException("illegal expression: " + expression
						+ "[" + index + "]");
			}

			int idx = index.asLong().intValue();

			if (value.isList()) {
				value = value.asList().get(idx);
			} else if (value.isString()) {
				value = new Value(
						String.valueOf(value.asString().charAt(idx)));
			}
		}

		return value;
	}

	@Override
	public String toString() {
		return String.format("(%s%s)", expression, indexes);
	}
}
