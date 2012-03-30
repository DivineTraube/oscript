package oscript;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import oscript.grammar.oscriptWalker;
import oscript.tree.Node;

public class Function {

	private String id;
	private List<String> formalParams;
	private CommonTree code;
	private Scope scope;

	public Function(String id, CommonTree formalParams, CommonTree code) {
		this.id = id;
		this.formalParams = toList(formalParams);
		this.code = code;
		this.scope = new Scope();
	}

	public Function(Function original) {
		this.id = original.id;
		this.formalParams = original.formalParams;
		this.code = original.code;
		this.scope = original.scope.copy();
	}

	public Value invoke(List<Node> params, Map<String, Function> functions) {
		if (params.size() != formalParams.size()) {
			throw new RuntimeException("illegal function call: "
					+ formalParams.size()
					+ " parameters expected for function `" + id + "`");
		}

		for (int i = 0; i < formalParams.size(); i++) {
			scope.assign(formalParams.get(i), params.get(i).evaluate());
		}

		try {
			//Der Funktionsrumpf wird wieder durch einen Walker ausgewertet
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(code);
			oscriptWalker walker = new oscriptWalker(nodes, scope, functions);
			return walker.walk().evaluate();
		} catch (RecognitionException e) {
			throw new RuntimeException("something went wrong, terminating", e);
		}
	}
	
	private List<String> toList(CommonTree tree) {  
	    List<String> ids = new ArrayList<String>();  
	      
	    for(int i = 0; i < tree.getChildCount(); i++) {  
	      CommonTree child = (CommonTree)tree.getChild(i);  
	      ids.add(child.getText());  
	    }  
	    return ids;  
	  }


}
