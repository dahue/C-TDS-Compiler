package main.src.ast;

import main.src.visitor.ASTVisitor;

public class BreakStatement extends Statement{

	public BreakStatement(int line, int column){
        this.setLineNumber(line);
        this.setColumnNumber(column);
	}

	@Override
	public String toString(){
		return "break;";
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}