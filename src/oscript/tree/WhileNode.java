package oscript.tree;

import oscript.Value;

public class WhileNode implements Node {

	private Node condition;
	private Node block;

	public WhileNode(Node condition, Node block) {
		this.condition = condition;
		this.block = block;
	}

	@Override
	public Value evaluate() {
		while (condition.evaluate().asBoolean()) {

			Value returnValue = block.evaluate();

			if (returnValue != Value.VOID) {
				return returnValue;
			}
		}

		return Value.VOID;
	}

}
