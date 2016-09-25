/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.ast;

import main.java.visitor.ASTVisitor;

/**
 *
 * @author Adrian Tissera
 */
public class FieldDeclId extends AST{
	private final String id;
	private final IntLiteral intLiteral;
	
	public FieldDeclId(String id){
		this.id = id;
		this.intLiteral = null;
	}
	
	public FieldDeclId(String id, IntLiteral il){
		this.id = id;
		this.intLiteral = il;
	}

	@Override
	public String toString() {
		String result = id;
		return result;
	}

	public String getId() {
		return id;
	}

	public IntLiteral getIntLiteral() {
		return intLiteral;
	}
	
	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
