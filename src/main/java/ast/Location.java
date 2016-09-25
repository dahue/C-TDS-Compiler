package main.java.ast;

import main.java.visitor.ASTVisitor;

public abstract class Location extends Expression {
	protected String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
