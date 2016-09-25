package main.java.ast;

import java.util.ArrayList;
import java.util.List;
import main.java.visitor.ASTVisitor;

public class Block extends Statement {
    private List<FieldDecl> fieldDeclList;
	private List<Statement> statementList;
	private int blockId;
	
	public Block() {
		this.statementList = new ArrayList<Statement>();
        this.fieldDeclList  = new ArrayList<FieldDecl>();
		this.blockId    = -1;
	}
	
	public Block(List<FieldDecl> f, List<Statement> s) {
		this.fieldDeclList = f;
		this.statementList = s;
		this.blockId = -1;
	}

	public List<FieldDecl> getFieldDeclList() {
		return fieldDeclList;
	}

	public void setFieldDeclList(List<FieldDecl> fieldDeclList) {
		this.fieldDeclList = fieldDeclList;
	}

	public List<Statement> getStatementList() {
		return statementList;
	}

	public void setStatementList(List<Statement> statementList) {
		this.statementList = statementList;
	}

	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}

	@Override
	public String toString() {
        String result = "{\n";

		for(FieldDecl f : fieldDeclList){
			result += " " + f.toString() + "\n";
		}
        
		for (Statement s: statementList) {
			result += " " + s.toString() + "\n";
		}	

		result += "}"; 
		return result; 
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
	
}
