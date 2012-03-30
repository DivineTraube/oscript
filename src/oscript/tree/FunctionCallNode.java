package oscript.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import oscript.Function;
import oscript.Scope;
import oscript.Value;

public class FunctionCallNode implements Node {

	private String name;
	private List<Node> params;
	private Map<String, Function> functions;
	
	public FunctionCallNode(String name, List<Node> params,
			Map<String, Function> functions) {
		this.name = name;
		this.params = (params == null) ? new ArrayList<Node>() : params;
		this.functions = functions;
	}

	@Override
	public Value evaluate() {
		Function func = functions.get(name + params.size());
		if(func == null)
			throw new RuntimeException("no function of name " + name + " with " + params.size() +  " parmeter(s) delcared." );
		
		//Bei Aufruf einer Funktion immer einen neuen Funktions-Scope erzeugen
		Function f = new Function(func);
		
		return f.invoke(params, functions);
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s)", name, params.toString().substring(1,params.toString().length()-1));
	}

}
