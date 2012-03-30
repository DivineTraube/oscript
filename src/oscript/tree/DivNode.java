package oscript.tree;

import oscript.Value;

public class DivNode implements Node {

    private Node lhs;
    private Node rhs;

    public DivNode(Node lhs, Node rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Value evaluate() {

        Value a = lhs.evaluate();
        Value b = rhs.evaluate();

        if(a.isNumber() && b.isNumber()) {
            return new Value(a.asDouble() / b.asDouble());
        }

        throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
        return String.format("(%s / %s)", lhs, rhs);
    }
}
