package main.java.ast;

import main.java.visitor.ASTVisitor;

/**
 *
 * @author Adrian Tissera
 */

public class SemicolonStatement extends Statement{
    
    public SemicolonStatement(int line, int column){
        this.setLineNumber(line);
        this.setColumnNumber(column);
    }
	@Override
	public String toString(){
		return ";\n";
	}

	@Override
	public <T> T accept(ASTVisitor<T> v){
		return v.visit(this);
	}
}