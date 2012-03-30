package oscript.tree;

import java.util.List;

import oscript.Value;

public class SubNode implements Node {

    private Node lhs;
    private Node rhs;

    public SubNode(Node lhs, Node rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Value evaluate() {

        Value a = lhs.evaluate();
        Value b = rhs.evaluate();

        if(a.isNumber() && b.isNumber()) {
            return new Value(a.asDouble() - b.asDouble());
        }

        //Liste
        if(a.isList() && b.isList()) {
            List<Value> list = a.asList();
            list.removeAll(b.asList());
            return new Value(list);
        }

        throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
        return String.format("(%s - %s)", lhs, rhs);
    }
}
