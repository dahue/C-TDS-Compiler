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
public class FieldDecl extends ASTSymbol{
	private final Type type;
	private final FieldDeclId FieldDeclId;
	
	
	public FieldDecl(Type type, FieldDeclId FieldDeclId, int ln, int cn){
		this.type = type;
		this.FieldDeclId = FieldDeclId;
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}
	
//	@Override
//	public String toString(){
//		String result = new String();
//		if (FieldDeclId != null) {
//			int n = FieldDeclId.size();
//			result += type.toString() + " ";
//			for (FieldDeclId ifd : FieldDeclId) {
//				result += ifd.toString();
//				if (n > 1) {
//					result += ", ";
//				}
//				n--;
//			}
//		}
//		result += ";";
//		return result;
//	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

	public Type getType() {
		return type;
	}

	public FieldDeclId getFieldDeclId() {
		return FieldDeclId;
	}
	
}
