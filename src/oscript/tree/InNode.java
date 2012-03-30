package oscript.tree;

import oscript.Value;

public class InNode implements Node {

	private Node lhs;
	private Node rhs;

	public InNode(Node lhs, Node rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {

		Value a = lhs.evaluate();
		Value b = rhs.evaluate();

		if (b.isList()) {
			for(Value val : b.asList()) {
	            if(val.equals(a)) {
	                return new Value(true);
	            }
	        }
			return new Value(false);
		}

		throw new RuntimeException("illegal expression: " + this);
	}

	@Override
	public String toString() {
		return String.format("(%s in %s)", lhs, rhs);
	}
}
