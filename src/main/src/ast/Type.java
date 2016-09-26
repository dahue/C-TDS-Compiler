package main.src.ast;

public enum Type {
	INTEGER,
	FLOAT,
	BOOL,
	VOID,
	UNDEFINED,
	INTARRAY,
	FLOATARRAY,
	BOOLEANARRAY;

	@Override
	public String toString() {
		switch(this) {
			case INTEGER:
				return "integer";
			case FLOAT:
				return "float";
			case BOOL:
				return "bool";
			case VOID:
				return "void";
			case UNDEFINED:
				return "undefined";
			case INTARRAY:
				return "integer[]";
			case FLOATARRAY:
				return "float[]";
			case BOOLEANARRAY:
				return "bool[]";
		}
		
		return null;
	}
	
	public boolean isArray() {
		if (this == Type.INTARRAY) {
			return true;
		}
		if (this == Type.FLOATARRAY) {
			return true;		
		}
		if (this == Type.BOOLEANARRAY) {
			return true;
		}
		
		return false;
	}
}

