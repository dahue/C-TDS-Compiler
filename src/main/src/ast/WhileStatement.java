package main.src.ast;

import main.src.visitor.ASTVisitor;

public class WhileStatement extends Statement{
	private Expression condition;
	private Block block;

	/*
	* 
	*/
	public WhileStatement(Expression e, Block b, int line, int column){
		this.condition = e;
		this.block = b;
        this.setLineNumber(line);
        this.setColumnNumber(column);
                
	}

	public Expression getCondition(){
		return condition;
	}

	public void setCondition(Expression e){
		this.condition = e;
	}

	public Block getBlock(){
		return block;
	}

	public void setBlock(Block b){
		this.block = b;
	}

	@Override
	public String toString(){
		return "while" + condition.toString() + block.toString();
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

}