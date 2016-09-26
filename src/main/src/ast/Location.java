package main.src.ast;

import main.src.visitor.ASTVisitor;

public abstract class Location extends Expression {
	protected String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
}
