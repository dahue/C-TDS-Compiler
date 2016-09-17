package main.java.ast;

import main.java.visitor.ASTVisitor;

/**
 *
 * @author Arangue-Cibils-Tissera Team
 */
public class ContinueStmt extends Statement{

	public ContinueStmt(){
		
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
