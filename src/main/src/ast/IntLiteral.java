package main.src.ast;

import main.src.visitor.ASTVisitor;

public class IntLiteral extends Literal {
	private String rawValue;
	private Integer value;
	
	/*
	 * Constructor for int literal that takes a string as an input
	 * @param: String integer
	 */
	public IntLiteral(String val, int ln, int cn){
		this.rawValue = val; // Will convert to int value in semantic check
		this.value = Integer.parseInt(val);
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}

	public IntLiteral(Integer n, int ln, int cn){
		this.rawValue = n.toString();
		this.value = n;
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}

	@Override
	public Type getType() {
		return Type.INTEGER;
	}

	/*
	* Get Integer value
	*/

	public Integer getValue() {
		return value;
	}

	/*
	* Set Integer value
	*/

	public void setValue(Integer value) {
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
