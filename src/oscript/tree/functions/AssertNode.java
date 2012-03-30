package oscript.tree.functions;

import oscript.Value;
import oscript.tree.Node;

public class AssertNode implements Node {

	private Node expression;

	public AssertNode(Node expression) {
		this.expression = expression;
	}


	@Override
	public Value evaluate() {
		Value value = expression.evaluate();
		if(!value.asBoolean())
			System.err.println("Assertion failed: "+expression+ " is " + value);
		else
			System.out.println("Assertion passed: "+expression+ " is " + value);
		return Value.VOID;
	}

}
