package oscript.tree;

import oscript.Value;

public class EqualsNode implements Node {

    private Node lhs;
    private Node rhs;

    public EqualsNode(Node lhs, Node rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Value evaluate() {

        Value a = lhs.evaluate();
        Value b = rhs.evaluate();

        return new Value(a.equals(b));
    }

    @Override
    public String toString() {
        return String.format("(%s == %s)", lhs, rhs);
    }
}
