package main.src.ast;

import main.src.visitor.ASTVisitor;

public class UnaryOpExpr extends Expression {
	
	private UnaryOpType operator; 	//expr = operator expr
	
	
	//Constructor
	
	public UnaryOpExpr(UnaryOpType op, Expression e, int ln, int cn){
		this.operator = op;
		this.expression = e;
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}

	public UnaryOpType getOperator() {
		return operator;
	}

	public void setOperator(UnaryOpType operator) {
		this.operator = operator;
	}

	@Override
	public Expression getExpression() {
		return expression;
	}

	@Override
	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	@Override
	public Type getType() {
		return type;
	}

	@Override
	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return operator.toString() + expression.toString();
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

}