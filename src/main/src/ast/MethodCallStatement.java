/*
 *
 */
package main.src.ast;

import main.src.visitor.ASTVisitor;

/**
 *
 * @author Adrian Tissera
 */
public class MethodCallStatement extends Statement{
    
    private MethodCall methodCall;
    
    public MethodCallStatement(MethodCall mc, int line, int column){
        this.methodCall = mc;
        this.setLineNumber(line);
        this.setColumnNumber(column);
    }

	public MethodCall getMethodCall() {
		return methodCall;
	}

	public void setMethodCall(MethodCall methodCall) {
		this.methodCall = methodCall;
	}
    
    @Override
    public String toString(){
        return methodCall.toString() + ";";
    }
    @Override
    public <T> T accept(ASTVisitor<T> v) {
    	return v.visit(this);
    }
    
}
