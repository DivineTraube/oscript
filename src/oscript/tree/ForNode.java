package oscript.tree;

import oscript.Scope;
import oscript.Value;

public class ForNode implements Node {
	private String var;
	private Node from;
	private Node to;
	private Node block;
	private Scope currentScope;
	
	public ForNode(String var, Node from, Node to, Node block,
			Scope currentScope) {
		this.var = var;
		this.from = from;
		this.to = to;
		this.block = block;
		this.currentScope = currentScope;
	}
	
	@Override
	public Value evaluate() {
		int start = from.evaluate().asDouble().intValue();
        int stop = to.evaluate().asDouble().intValue();

        for(int i = start; i <= stop; i++) {
            currentScope.assign(var, new Value(i));
            Value returnValue = block.evaluate();
            if(returnValue != Value.VOID) {
                return returnValue;
            }
        }

        return Value.VOID;
	}

}
