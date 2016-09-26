package main.src.ast;

import main.src.visitor.ASTVisitor;

/**
 *
 * @author Adrian Tissera
 */
public class ContinueStatement extends Statement{

	public ContinueStatement(int line, int column){
        this.setLineNumber(line);
        this.setColumnNumber(column);
	}
    
    @Override
	public String toString(){
		return "continue";
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
