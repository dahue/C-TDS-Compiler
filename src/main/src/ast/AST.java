package main.src.ast;

import main.src.visitor.ASTVisitor;

public abstract class AST {
	private int lineNumber;
	private int colNumber;
	
	public int getLineNumber() {
		return lineNumber;
	}
	
	public void setLineNumber(int ln) {
		lineNumber = ln;
	}
	
	public int getColumnNumber() {
		return colNumber;
	}
	
	public void setColumnNumber(int cn) {
		colNumber = cn;
	}
	
	public abstract <T> T accept(ASTVisitor<T> v);
}
