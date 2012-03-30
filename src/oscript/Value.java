package oscript;

import java.util.List;

public class Value implements Comparable<Value> {
	public static final Value NULL = new Value();
	public static final Value VOID = new Value();

	private Object value;

	public Value(Object value) {
		if (value == null)
			throw new RuntimeException("value is null!");
		//Implizites Boxing aller primitiven Typen: double -> Double
		this.value = value;
		if (!(isBoolean() || isList() || isNumber() || isString()))
			throw new RuntimeException("type ist invalid, got value " + value
					+ " of type " + value.getClass() + "!");
	}

	private Value() {
		value = new Object();
	}

	public Boolean asBoolean() {
		return (Boolean) value;
	}

	public Double asDouble() {
		return ((Number) value).doubleValue();
	}

	public Long asLong() {
		return ((Number) value).longValue();
	}

	@SuppressWarnings("unchecked")
	public List<Value> asList() {
		return (List<Value>) value;
	}

	public String asString() {
		return (String) value;
	}

	@Override
	public int compareTo(Value that) {
		if (this.isNumber() && that.isNumber()) {
			if (this.equals(that)) {
				return 0;
			} else {
				return this.asDouble().compareTo(that.asDouble());
			}
		} else if (this.isString() && that.isString()) {
			return this.asString().compareTo(that.toString());
		} else {
			throw new RuntimeException("illegal expression: " + this
					+ " can't be compared to " + that + "!");
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == VOID || o == VOID) {
			throw new RuntimeException("can't use VOID: " + this + " ==/!= "
					+ o);
		}
		if (this == o) {
			return true;
		}
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		Value that = (Value) o;
		if (this.isNumber() && that.isNumber()) {
			double diff = Math.abs(this.asDouble() - that.asDouble());
			return diff < 0.00000000001;
		} else {
			return this.value.equals(that.value);
		}
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isBoolean() {
		return value instanceof Boolean;
	}

	public boolean isNumber() {
		return value instanceof Number;
	}

	public boolean isList() {
		return value instanceof List<?>;
	}

	public boolean isNull() {
		return this == NULL;
	}

	public boolean isVoid() {
		return this == VOID;
	}

	public boolean isString() {
		return value instanceof String;
	}

	@Override
	public String toString() {
		if (isNull())
			return "NULL";
		else if (isVoid())
			return "VOID";
		else
			return String.valueOf(value);
	}

}
