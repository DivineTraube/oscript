package oscript.tree;

import java.util.ArrayList;
import java.util.List;

import oscript.Value;

public class ListNode implements Node {

	private List<Node> valueExpressions;

	public ListNode(List<Node> values) {
		this.valueExpressions = (values == null) ? new ArrayList<Node>() : values;
	}

	@Override
	public Value evaluate() {
		ArrayList<Value> values = new ArrayList<Value>(valueExpressions.size());
		
		for(Node valueExpression: valueExpressions){
			values.add(valueExpression.evaluate());
		}
		
		return new Value(values);
	}

	@Override
	public String toString() {
		return valueExpressions.toString();
	}
}
