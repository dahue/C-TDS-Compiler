/*
 * Taller de Diseño de software 2016
 * 
 * Proyecto: C-TDS compiler
 * 
 * Autor: Adrian Tissera
 * 
 */
package main.src.ast;

import main.src.visitor.ASTVisitor;

/**
 *
 * @author Adrian Tissera
 */
public class ASTSymbol extends AST{

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.accept(this);
	}
	
}
