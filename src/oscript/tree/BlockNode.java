package oscript.tree;

import java.util.LinkedList;
import java.util.List;

import oscript.Value;

public class BlockNode implements Node {

	private List<Node> statements;
	private Node returnStatement;
	
	public BlockNode() {
		this.statements = new LinkedList<Node>();
		returnStatement = null;
	}

	public void addReturnStatement(Node statement) {
		this.returnStatement = statement;
	}

	public void addStatement(Node statement) {
		this.statements.add(statement);
	}

	@Override
	public Value evaluate() {
		for (Node statement : statements) {
			Value value = statement.evaluate();
			if (value != Value.VOID) {
				return value;
			}
		}

		// Entweder Returnstatement auswerten und zurückgeben oder VOID
		// zurückgeben
		return returnStatement == null ? Value.VOID : returnStatement
				.evaluate();

	}

}
