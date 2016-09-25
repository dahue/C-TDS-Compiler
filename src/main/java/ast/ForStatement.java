package main.java.ast;

import main.java.visitor.ASTVisitor;

public class ForStatement extends Statement{
	private AssignStatement assign; // initialization
	private Expression condition;
	private Block block;
						/* i      =        1       ,  i   <     10    */
	public ForStatement(String id, Expression e1, Expression e2, Block b, int line, int column){
		assign = new AssignStatement(AssignOpType.ASSIGN, new VarLocation(id, line, column), e1); //i.e. "i = 1"
        condition = e2;
        block = b;
        this.setLineNumber(line);
        this.setColumnNumber(column);                        
	}

	@Override
	public String toString() {
		return "for " + assign.toString() + "," + condition.toString() + '\n' + "{" + block.toString() + " }";
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}