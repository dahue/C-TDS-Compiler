package main.java.ast;

import main.java.visitor.ASTVisitor;

public class IfStatement extends Statement {
	private Expression condition;
	private Block thenBlock;
	private Block elseBlock;
	
	public IfStatement(Expression c, Block b, int ln, int cn) {
		this.condition = c;
		this.thenBlock = b;
		this.elseBlock = null;
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}
	
	public IfStatement(Expression cond, Block thenBl, Block elseBl, int ln, int cn) {
		this.condition = cond;
		this.thenBlock = thenBl;
		this.elseBlock = elseBl;
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}

	public Expression getCondition() {
		return condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public Block getThenBlock() {
		return thenBlock;
	}

	public void setThenBlock(Block thenBlock) {
		this.thenBlock = thenBlock;
	}

	public Block getElseBlock() {
		return elseBlock;
	}

	public void setElseBlock(Block elseBlock) {
		this.elseBlock = elseBlock;
	}
	
	@Override
	public String toString() {
		String rtn = "if " + condition + '\n' + thenBlock.toString();
		
		if (elseBlock != null) {
			rtn += "else \n" + elseBlock;
		}
		
		return rtn;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
