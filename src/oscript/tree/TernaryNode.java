package oscript.tree;

import oscript.Value;

public class TernaryNode implements Node {

	private Node condition;
	private Node ifTrue;
	private Node ifFalse;

	public TernaryNode(Node c, Node t, Node f) {
		condition = c;
		ifTrue = t;
		ifFalse = f;
	}

	@Override
	public Value evaluate() {

		Value a = condition.evaluate();

		if (!a.isBoolean()) {
			throw new RuntimeException("not a boolean expression: " + condition
					+ ", in: " + this);
		}

		return a.asBoolean() ? ifTrue.evaluate() : ifFalse.evaluate();
	}

	@Override
	public String toString() {
		return String.format("(%s ? %s : %s)", condition, ifTrue, ifFalse);
	}
}
