package main.java.ast;

import main.java.visitor.ASTVisitor;

public class FloatLiteral extends Literal {
	private String rawValue;
	private Float value;
	
	/*
	 * Constructor for float literal that takes a string as an input
	 */
	public FloatLiteral(String val, int ln, int cn){
		this.rawValue = val; // Will convert to int value in semantic check
		this.value = Float.parseFloat(val);
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}

	public FloatLiteral(Float n, int ln, int cn){
		rawValue = n.toString();
		value = n;
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}

	@Override
	public Type getType() {
		return Type.FLOAT;
	}

	/////////////////////////////////////////////
	public String getStringValue() {
		return rawValue;
	}

	public void setStringValue(String stringValue) {
		this.rawValue = stringValue;
	}

	////////////////////////////////////////////

	/*
	* Get Float value
	*/

	public Float getValue() {
		return value;
	}

	/*
	* Set Float value
	*/

	public void setValue(Float value) {
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
