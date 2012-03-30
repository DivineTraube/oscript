package oscript.tree;

import java.util.LinkedList;
import java.util.List;

import oscript.Value;

public class IfNode implements Node {

	private List<Choice> choices;
	
	public IfNode() {
		choices = new LinkedList<Choice>();
	}
	
	public void addChoice(Node ifCond, Node then) {
		choices.add(new Choice(ifCond, then));
	}
	
	@Override
	public Value evaluate() {
		 for(Choice choice : choices) {  
		      Value value = choice.ifCond.evaluate();  
		  
		      if(!value.isBoolean()) {  
		        throw new RuntimeException("illegal boolean expression " +   
		            "inside if-statement: " + choice.ifCond);  
		      }  
		  
		      if(value.asBoolean()) {  
		        return choice.then.evaluate();  
		      } 
		 }
		 return Value.VOID;  
	}
	
	static class Choice {
		Node ifCond;
		Node then;
		public Choice(Node expression, Node block) {
			this.ifCond = expression;
			this.then = block;
		}
		
	}

}
