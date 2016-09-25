/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.ast;

import main.java.visitor.ASTVisitor;

/**
 *
 * @author Arangue-Cibils-Tissera Team
 */
public class Param extends AST{

	private Type type;
	private String id;
			
	public Param(Type type, String id, int ln, int cn) {
		this.type = type;
		this.id = id;
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}
	
	@Override
	public String toString() {
		return this.type.toString() + " " +this.id;
	}
	
	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
