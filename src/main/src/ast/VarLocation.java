package main.src.ast;

import main.src.visitor.ASTVisitor;
import java.util.List;
import java.util.LinkedList;

public class VarLocation extends Location {
	private int blockId;
	private List<String> invocationList;		

	public VarLocation(String id, int ln, int cn) { 		
		this.id = id;
		this.blockId = -1;
		this.invocationList = new LinkedList<String>();
		this.setLineNumber(ln);
		this.setColumnNumber(cn);
	}

	public VarLocation(String id, List<String> l, int ln, int cn) {
		this.id = id;
		this.blockId = -1;
		this.invocationList = l;
		this.setLineNumber(ln);
		this.setColumnNumber(cn);	
	}
		
	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}

	public List<String> getArrayId() {
		return invocationList;
	}

	public void setArrayId(List<String> l) {
		invocationList = l;
	}
	

	@Override
	public String toString() {
		String locString = id;
		for (String arr : invocationList) {
			locString += "." + arr;
		}
		return locString;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
