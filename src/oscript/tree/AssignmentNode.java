package oscript.tree;

import java.util.LinkedList;
import java.util.List;

import oscript.Scope;
import oscript.Value;

public class AssignmentNode implements Node {
	protected String identifier;
	protected List<Node> indexNodes;
	protected Node rhs;
	protected Scope scope;

	public AssignmentNode(String identifier, List<Node> indexNodes, Node rhs,
			Scope scope) {
		this.identifier = identifier;
		this.indexNodes = (indexNodes == null) ? new LinkedList<Node>()
				: indexNodes;
		this.rhs = rhs;
		this.scope = scope;
	}

	@Override
	public Value evaluate() {
		Value value = rhs.evaluate();

		if (value == Value.VOID) {
			throw new RuntimeException("Can't assign VOID to " + identifier);
		}

		// Einfache Zuweisung ohne Index:
		if (indexNodes.isEmpty()) {
			scope.assign(identifier, value);
		}
		// Indexzugriff
		else {
			Value list = scope.resolve(identifier);

			// Von links nach rechts die Indexzugriffe ausführen
			for (int i = 0; i < indexNodes.size() - 1 && list != null; i++) {
				Value index = indexNodes.get(i).evaluate();

				if (!index.isNumber() || !list.isList()) {
					throw new RuntimeException("illegal statement: " + this);
				}

				int idx = index.asLong().intValue();
				list = list.asList().get(idx);
			}

			// Beim letzten Index passiert die Zuweisung
			Value lastIndex = indexNodes.get(indexNodes.size() - 1).evaluate();

			if (!lastIndex.isNumber() || !list.isList()) {
				throw new RuntimeException("illegal statement: " + this);
			}

			List<Value> existing = list.asList();
			existing.set(lastIndex.asLong().intValue(), value);
		}

		return Value.VOID;
	}

	@Override
	public String toString() {
		return String.format("(%s[%s] = %s)", identifier, indexNodes, rhs);
	}
}
