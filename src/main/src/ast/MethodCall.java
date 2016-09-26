package main.src.ast;

import java.util.LinkedList;
import java.util.List;
import main.src.visitor.ASTVisitor;

/**
 *
 * @author Adrian Tissera
 */
public class MethodCall extends Expression{
	private String id;
	private List<String> idList;
	private List<Expression> argList;


	public MethodCall(String id,int line,int column) {
		this.id = id;
		idList = new LinkedList<String>();
		argList = new LinkedList<Expression>();         
		this.setLineNumber(line);
		this.setColumnNumber(column);

	}


	public MethodCall(String id, List<String> li,int line,int column) {
		this.id = id;
		idList = li;
		argList = new LinkedList<Expression>();
		this.setLineNumber(line);
		this.setColumnNumber(column);
	}


	public MethodCall(String id, List<String> li, List<Expression> le,int line,int column) {
		this.id = id;
		idList = li;
		argList = le;
		this.setLineNumber(line);
		this.setColumnNumber(column);
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id = id;
	}

	public List<String> getIdList(){
		return idList;
	}

	public void setIdList(List<String> li){
		this.idList = li;
	}

	public List<Expression> getArgList(){
		return argList;
	}

	public void setArgList(List<Expression> al){
		this.argList = al;
	}
        
    @Override
    public String toString(){
       	String stringMethodCall = id;

    	for(String s : idList){
    		stringMethodCall += "." + s;
    	}

    	stringMethodCall += "(";

    	for(int i = 0; i < argList.size() ; i++){
    		stringMethodCall += argList.get(i).toString();
    		if(i < argList.size()-1){
    			stringMethodCall += ",";
    		}
    	}

		stringMethodCall += ")";   
		return stringMethodCall;    
    }


	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
}
