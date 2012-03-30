package oscript.tree;

import oscript.Scope;
import oscript.Value;

public class ForEachNode implements Node {
	private String var;
	private Node in;
	private Node block;
	private Scope currentScope;
	
	public ForEachNode(String var, Node in, Node block,
			Scope currentScope) {
		this.var = var;
		this.in = in;
		this.block = block;
		this.currentScope = currentScope;
	}
	
	@Override
	public Value evaluate() {
		Value list = in.evaluate();
		
		if(!list.isList())
			throw new RuntimeException("Expected a list, got " + list);
				
        for(Value elem : list.asList()) {
            currentScope.assign(var, elem);
            Value returnValue = block.evaluate();
            if(returnValue != Value.VOID) {
                return returnValue;
            }
        }

        return Value.VOID;
	}

}
