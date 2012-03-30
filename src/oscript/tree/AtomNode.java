package oscript.tree;

import oscript.Value;

public class AtomNode implements Node {
	private Value value;

	public AtomNode(Object value) {
		this.value = (value == null) ? Value.NULL : new Value(value);
	}

	@Override
	public Value evaluate() {
		return value;
	}

	@Override
	public String toString() {
		return value.toString();
	}

}
