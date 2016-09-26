package main.src.visitor;

import main.src.ast.ForStatement;
import main.src.ast.IfStatement;
import main.src.ast.UnaryOpExpr;
import main.src.ast.Program;
import main.src.ast.Location;
import main.src.ast.MethodCall;
import main.src.ast.MethodDecl;
import main.src.ast.ASTSymbol;
import main.src.ast.AST;
import main.src.ast.IntLiteral;
import main.src.ast.FieldDeclId;
import main.src.ast.AssignStatement;
import main.src.ast.Type;
import main.src.ast.Statement;
import main.src.ast.ClassDecl;
import main.src.ast.ContinueStatement;
import main.src.ast.BoolLiteral;
import main.src.ast.Param;
import main.src.ast.ReturnStatement;
import main.src.ast.WhileStatement;
import main.src.ast.FloatLiteral;
import main.src.ast.MethodCallStatement;
import main.src.ast.Block;
import main.src.ast.FieldDecl;
import main.src.ast.SemicolonStatement;
import main.src.ast.BreakStatement;
import main.src.ast.BinOpExpr;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
		md.getBlock().accept(this);
		return md.getType();
	}

	@Override
	public Type visit(Param aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(IntLiteral aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(Block b) {		
		List<Statement> statements = b.getStatementList();
		for (Statement s : statements) {
			s.accept(this);
		}
		return null;
	}

	@Override
	public Type visit(AssignStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(Location aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(MethodCallStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(IfStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(MethodCall aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(ForStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(ReturnStatement rs) {
		if (rs.getExpression() != null) {
			return rs.getExpression().getType();
		}
		return null;
	}

	@Override
	public Type visit(SemicolonStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(ContinueStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(BoolLiteral aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(FloatLiteral aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(BreakStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(WhileStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(BinOpExpr aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Type visit(UnaryOpExpr aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public <T> T accept(ASTSymbol aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	
	
}
