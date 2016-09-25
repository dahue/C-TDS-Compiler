package main.java.ast;

import main.java.visitor.ASTVisitor;

public class AssignStatement extends Statement {
	private Location location;
	private Expression expression;
	private AssignOpType assignOpType;

	public AssignStatement(AssignOpType op, Location loc, Expression e, int ln, int cn) {
		this.location = loc;
		this.expression = e;
		this.assignOpType = op;
		setLineNumber(ln);
		setColumnNumber(cn);
	}

	public AssignStatement(AssignOpType op, Location loc, Expression e) {
		this.assignOpType = op;
		this.location = loc;
		this.expression = e;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public AssignOpType getAssignOpType() {
		return assignOpType;
	}

	public void setAssignOpType(AssignOpType assignOpType) {
		this.assignOpType = assignOpType;
	}
	
	@Override
	public String toString() {
		return location + " " + assignOpType + " " + expression;
		
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
