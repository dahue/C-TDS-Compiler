package main.src.ast;

public abstract class Expression extends AST {
	protected Expression expression;
	protected Type type;
	
	public Type getType() {
		return this.type;
	}
	
	public void setType(Type t) {
		this.type = t;
	}

	protected Expression getExpression() {
		return expression;
	}

	protected void setExpression(Expression expression) {
		this.expression = expression;
	}
	
}
