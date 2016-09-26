package main.src.ast;

import main.src.visitor.ASTVisitor;

public class ForStatement extends Statement{
	private AssignStatement assignment; // initialization
	private Expression condition;
	private Block block;
						/* i      =        1       ,  i   <     10    */
	public ForStatement(String id, Expression e1, Expression e2, Block b, int line, int column){
		assignment = new AssignStatement(AssignOpType.ASSIGN, new VarLocation(id, line, column), e1); //i.e. "i = 1"
        condition = e2;
        block = b;
        this.setLineNumber(line);
        this.setColumnNumber(column);                        
	}

	public AssignStatement getAssignment() {
		return assignment;
	}

	public void setAssignment(AssignStatement assignment) {
		this.assignment = assignment;
	}

	public Expression getCondition() {
		return condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	@Override
	public String toString() {
		return "for " + assignment.toString() + "," + condition.toString() + '\n' + "{" + block.toString() + " }";
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}