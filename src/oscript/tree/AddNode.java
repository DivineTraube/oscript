package oscript.tree;

import java.util.List;

import oscript.Value;

public class AddNode implements Node {
	private Node lhs;
	private Node rhs;

	public AddNode(Node lhs, Node rhs) {
		super();
		this.lhs = lhs;
		this.rhs = rhs;
	}

	@Override
	public Value evaluate() {
		Value a = lhs.evaluate();  
	    Value b = rhs.evaluate();  
	  
	    //Addition
	    if(a.isNumber() && b.isNumber()) {  
	      return new Value(a.asDouble() + b.asDouble());  
	    }  
	  
	    //Listen konkatenieren
	    if(a.isList() && b.isList()) {  
	      List<Value> list = a.asList();  
	      list.addAll(b.asList());  
	      return new Value(list);  
	    }  
	  
	    //String konkatenieren
	    if(a.isString()) {  
	      return new Value(a.asString() + "" + b.toString());  
	    }  
	  
	    if(b.isString()) {  
	      return new Value(a.toString() + "" + b.asString());  
	    }  
	  
	    throw new RuntimeException("illegal expression: " + this);  
	}
	
	@Override
	public String toString() {
		return String.format("(%s + %s)", lhs, rhs);
	}

}
