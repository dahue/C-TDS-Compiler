package main.src.visitor;

import java.util.*;
import main.src.ast.*;

// type checker, concrete visitor 
public class TypeCheckVisitor implements ASTVisitor<Type> {
	
	private List<Error> errors;
	private SymbolTable table;
	
	public TypeCheckVisitor () {
		this.errors = new LinkedList<>();
		this.table	= new SymbolTable();
	}
	
	private void addError(AST a, String desc) {
		errors.add(new Error(a.getLineNumber(), a.getColumnNumber(), desc));
	}

	public List<Error> getErrors() {
		return errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	/**
	 * Inherited methods
	 */
	@Override
	public Type visit(Program p) {
		for (ClassDecl cd : p.getClassList()) {
			cd.accept(this);
		}
		return null;
	}

	@Override
	public Type visit(ClassDecl cd) {
		this.table.put(cd.getId(), cd);
		for (FieldDecl fd : cd.getFieldDeclList()) {
			fd.accept(this);
		}
		
		for (MethodDecl md : cd.getMethodDeclList()) {
			md.accept(this);
		}
		return null;
	}

	@Override
	public Type visit(FieldDecl fd) {
		for (FieldDeclId fdid : fd.getFieldDeclIdList()) {
			fdid.accept(this);
		}
		return null;
	}

	@Override
	public Type visit(FieldDeclId fdid) {
		this.table.put(fdid.getId(), fdid);
		return null;
	}

	@Override
	public Type visit(MethodDecl md) {
		for (Param p : md.getParamList()) {
			p.accept(this);
		}
		md.getBlock().accept(this);
		return md.getType();
	}

	@Override
	public Type visit(Param p) {
		table.put(p.getId(), p);
		return p.getType();
	}

	@Override
	public Type visit(IntLiteral il) {
		return il.getType();
	}

	@Override
	public Type visit(Block b) {
		for (FieldDecl fd : b.getFieldDeclList()) {
			fd.accept(this);
		}
		List<Statement> statements = b.getStatementList();
		for (Statement s : statements) {
			s.accept(this);
		}
		return null;
	}

	@Override
	public Type visit(AssignStatement as) {
		as.getLocation().accept(this);
		as.getExpression().accept(this);
		return null;
	}

	@Override
	public Type visit(VarLocation vl){
		return vl.getType();
	}

	@Override
	public Type visit(MethodCallStatement mcs) {
		mcs.getMethodCall().accept(this);
		return null;
	}

	@Override
	public Type visit(IfStatement is) {
		is.getCondition().accept(this);
		if (!is.getCondition().getType().equals(Type.BOOL))
			errors.add(new Error(is.getCondition().getLineNumber(), is.getCondition().getColumnNumber(), ""));
		return null;
	}

	@Override
	public Type visit(MethodCall mc) {
		for (Expression e : mc.getArgList()) {
			e.accept(this);
		}
		return null;
	}

	@Override
	public Type visit(ForStatement fs) {
		fs.getAssignment().accept(this);
		
		if (!fs.getCondition().accept(this).equals(Type.BOOL)){
			errors.add(new Error(fs.getLineNumber(), fs.getColumnNumber(), "La condicion debe ser booleana"));
		}
		
		fs.getBlock().accept(this);
		
		return null;
	}

	@Override
	public Type visit(ReturnStatement rs) {
		if (rs.getExpression() != null) {
			return rs.getExpression().getType();
		}
		return null;
	}

	@Override
	public Type visit(SemicolonStatement scs) {
		return null;
	}

	@Override
	public Type visit(ContinueStatement cs) {
		return null;
	}

	@Override
	public Type visit(BoolLiteral bl) {
		return bl.getType();
	}

	@Override
	public Type visit(FloatLiteral fl) {
		return fl.getType();
	}

	@Override
	public Type visit(BreakStatement bs) {
		return null;
	}

	@Override
	public Type visit(WhileStatement ws) {
		ws.getCondition().accept(this);
		
		ws.getBlock().accept(this);
		
		return null;
	}

	@Override
	public Type visit(BinOpExpr binop) {
		if (binop.getLeftOperand().accept(this) != binop.getRightOperand().accept(this)) {
			errors.add(new Error(binop.getLineNumber(), binop.getLineNumber(), "Los tipos de los operandos deben ser iguales"));
		}
		return null;
	}

	@Override
	public Type visit(UnaryOpExpr unop) {
		if (unop.getOperator().equals(UnaryOpType.MINUS)) {
			boolean isAnumber = (unop.getExpression().accept(this).equals(Type.FLOAT) ||
								unop.getExpression().accept(this).equals(Type.INTEGER));
			if (!isAnumber) {
				errors.add(new Error(unop.getLineNumber(), unop.getColumnNumber(), "The expression must be an integer or a float"));
			}
		} else if (unop.getOperator().equals(UnaryOpType.NOT)) {
			boolean isAboolean = (unop.getExpression().accept(this).equals(Type.BOOL));
			
			if (!isAboolean) {
				errors.add(new Error(unop.getLineNumber(), unop.getColumnNumber(), "The expression must be boolean"));
			}
		}
		return null;
	}

	@Override
	public <T> T accept(ASTSymbol aThis) {
		return null;
	}

	@Override
	public <T> T visit(VarLocationList vll) {
		return null;
	}
	
	
	
}
