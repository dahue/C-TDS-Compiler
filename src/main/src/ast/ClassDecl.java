/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.src.ast;

import java.util.List;
import main.src.visitor.ASTVisitor;

/**
 *
 * @author Adrian Tissera
 */
public class ClassDecl extends AST {
	private final String id;
	private final List<FieldDecl> fieldDeclList;
	private final List<MethodDecl> methodDeclList;
	
	public ClassDecl(String id, List<FieldDecl> fd, List<MethodDecl> md, int lineNumber, int colNumber) {
		this.id = id;
		this.fieldDeclList = fd;
		this.methodDeclList = md;
		this.setLineNumber(lineNumber);
		this.setColumnNumber(colNumber);
	}

	@Override
	public String toString(){
		String result = "Class "+ id + " {\n";
		
		for (FieldDecl fd : fieldDeclList) {
			result += fd.toString() + "\n";
		}
		result += "\n";
		for (MethodDecl md: methodDeclList) {
			result += md.toString() + "\n";
		}
		
		result += "}\n";
		return result;
	}
	
	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

	public String getId() {
		return id;
	}

	public List<FieldDecl> getFieldDeclList() {
		return fieldDeclList;
	}

	public List<MethodDecl> getMethodDeclList() {
		return methodDeclList;
	}

}
