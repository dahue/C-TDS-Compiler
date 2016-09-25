package main.java.ast;

import main.java.visitor.ASTVisitor;

public class BoolLiteral extends Literal{
	private String rawValue;
	private Boolean value;

	public BoolLiteral(Boolean val, int ln, int cn){
		this.rawValue = val.toString();
		this.value = val;
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}
	
	public BoolLiteral(String val, int ln, int cn){
		this.rawValue = val.toString();
		this.value = Boolean.parseBoolean(val);
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}
	
	@Override
	public Type getType() {
		return Type.BOOL;
	}

	/*
	* Get Boolean value
	*/

	public Boolean getValue() {
		return value;
	}

	/*
	* Set Boolean value
	*/

	public void setValue(Boolean value) {
		this.value = value;
	}
	
	/*
	* Get string value
	*/
	public String getRawValue() {
		return rawValue;
	}

	/*
	* Set string value
	*/
	public void setRawValue(String rawValue) {
		this.rawValue = rawValue;
	}

	@Override
	public String toString() {
		return rawValue;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}