package main.src.ast;

import main.src.visitor.ASTVisitor;

public class ReturnStatement extends Statement {
	private Expression expression; // the return expression
	
	public ReturnStatement(Expression e, int ln, int cn) {
		this.expression = e;
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}
	
	public ReturnStatement(int line, int column) {
		this.expression = null;
		this.setLineNumber(line);
		this.setColumnNumber(column);
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		if (expression == null) {
			return "return";
		}
		else {
			return "return " + expression;
		}
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
