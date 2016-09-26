package main.src.ast;

import main.src.visitor.ASTVisitor;

public class UnaryOpExpr extends Expression {
	
	private UnaryOpType operator; 	//expr = operator expr
	private Expression operand; 	//expression
	
	
	//Constructor
	
	public UnaryOpExpr(UnaryOpType op, Expression e, int ln, int cn){
		operator = op;
		operand = e;
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}
	
	public UnaryOpType getOperator() {
		return operator;
	}

	public void setOperator(UnaryOpType operator) {
		this.operator = operator;
	}

	public Expression getOperand() {
		return operand;
	}

	public void setOperand(Expression operand) {
		this.operand = operand;
	}


	@Override
	public String toString() {
		return operator.toString() + operand.toString();
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

}