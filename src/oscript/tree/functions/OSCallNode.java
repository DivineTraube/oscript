package oscript.tree.functions;

import oscript.Value;
import oscript.library.OSInterface;
import oscript.tree.Node;

public class OSCallNode implements Node {
	private String command;

	public OSCallNode(String command) {
		this.command = command;
	}

	@Override
	public Value evaluate() {
		String result = OSInterface.execute(command);
		return new Value(result);
	}

}
