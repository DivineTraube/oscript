package oscript.tree;

import oscript.Value;

public class OrNode implements Node {

    private Node lhs;
    private Node rhs;

    public OrNode(Node lhs, Node rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Value evaluate() {

        Value a = lhs.evaluate();
        Value b = rhs.evaluate();

        if(!a.isBoolean() || !b.isBoolean()) {
            throw new RuntimeException("illegal expression: " + this);
        }

		return new Value(a.asBoolean() || b.asBoolean());
    }

    @Override
    public String toString() {
        return String.format("(%s || %s)", lhs, rhs);
    }
}
