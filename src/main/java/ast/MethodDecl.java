package main.java.ast;

import java.util.LinkedList;
import java.util.List;
import main.java.visitor.ASTVisitor;

/**
 *
 * @author Adrian Tissera
 */
public class MethodDecl extends AST{
	private Type type;
	private String id;
	private List<Param> paramList;
	private Block block;	
	private Boolean isExtern;
	
	public MethodDecl(Type t, String id, List<Param> paramList, Block block, int ln, int cl) {
		this.type = t;
		this.id = id;
		this.paramList = paramList;
		if(block==null)
			isExtern = true;
		else{
			isExtern = false;
			this.block = block;
		}
		this.setLineNumber(ln);
		this.setColumnNumber(cl);
	}
	
	@Override
	public String toString() {
		String result = this.type + " " + this.id + " (";
		if (this.paramList != null) {
			int n = this.paramList.size();
			for (Param p : this.paramList) {
				result += p.toString();
				if (n > 1) {
					result += ", ";
				}
				n--;
			}
		}
		result += ")\n{\n";
		if (block != null) {
			result += this.block.toString();
		}
		result += "}";
		return result;
	}
	
	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}

	public Type getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public List<Param> getParamList() {
		return paramList;
	}

	public Block getBlock() {
		return block;
	}

	public Boolean getIsExtern() {
		return isExtern;
	}
	
}
