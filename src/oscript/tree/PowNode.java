package oscript.tree;

import oscript.Value;

public class PowNode implements Node {

    private Node lhs;
    private Node rhs;

    public PowNode(Node lhs, Node rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Value evaluate() {

        Value a = lhs.evaluate();
        Value b = rhs.evaluate();

        // number ^ number
        if(a.isNumber() && b.isNumber()) {
            return new Value(Math.pow(a.asDouble(), b.asDouble()));
        }

        throw new RuntimeException("iIllegal expression: " + this);
    }

    @Override
    public String toString() {
        return String.format("(%s^%s)", lhs, rhs);
    }
}
