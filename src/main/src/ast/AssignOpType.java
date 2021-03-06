package main.src.ast;

public enum AssignOpType {
	INC,
	DEC,
	ASSIGN;
	
	@Override
	public String toString() {
		switch(this) {
			case INC:
				return "+=";
			case DEC:
				return "-=";
			case ASSIGN:
				return "=";
		}	
		return null;		
	}
}
