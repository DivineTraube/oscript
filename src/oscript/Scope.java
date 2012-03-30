package oscript;

import java.util.HashMap;
import java.util.Map;

public class Scope {
	private Scope parent;
	private Map<String, Value> variables;

	public Scope() {
		this(null);
	}

	public Scope(Scope parent) {
		this.parent = parent;
		this.variables = new HashMap<String, Value>();
	}

	public void assign(String var, Value value) {
		if (resolve(var) != null) {
			this.reAssign(var, value);
		} else {
			variables.put(var, value);
		}
	}

	public Scope copy() {
		Scope s = new Scope();
		// Shallow Copy, ohne Parent-Scopes
		s.variables = new HashMap<String, Value>(this.variables);
		return s;
	}

	public boolean isGlobalScope() {
		return parent == null;
	}

	public Scope parent() {
		return parent;
	}

	private void reAssign(String identifier, Value value) {
		if (variables.containsKey(identifier)) {
			variables.put(identifier, value);
		} else if (parent != null) {
			parent.reAssign(identifier, value);
		}
	}

	public Value resolve(String var) {
		//Wenn nicht hier
		Value value = variables.get(var);
		if (value != null) {
			return value;
		} else if (!isGlobalScope()) {
			//dann im Parent
			return parent.resolve(var);
		} else {
			return null;
		}
	}
	
	@Override
	public String toString() {
		if(!isGlobalScope()) {
			return variables.toString() + "--child-->" +  parent.toString();
		} else {
			return variables.toString();
		}
	}

}
