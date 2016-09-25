/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.visitor;

//import main.java.ast.AssignStmt;

import main.java.ast.AssignStatement;
import main.java.ast.BinOpExpr;
import main.java.ast.Block;
import main.java.ast.BoolLiteral;
import main.java.ast.BreakStatement;
import main.java.ast.ClassDecl;
import main.java.ast.ContinueStatement;
import main.java.ast.FieldDecl;
import main.java.ast.FieldDeclId;
import main.java.ast.FloatLiteral;
import main.java.ast.ForStatement;
import main.java.ast.IfStatement;
import main.java.ast.IntLiteral;
import main.java.ast.Location;
import main.java.ast.MethodCall;
import main.java.ast.MethodCallStatement;
import main.java.ast.MethodDecl;
import main.java.ast.Param;
import main.java.ast.Program;
import main.java.ast.ReturnStatement;
import main.java.ast.SemicolonStatement;
import main.java.ast.UnaryOpExpr;
import main.java.ast.WhileStatement;

/**
 *
 * @author Adrian Tissera
 */
public class PrettyPrintVisitor implements ASTVisitor<String> {

	@Override
	public String visit(Program p) {
		return p.toString();
	}

	@Override
	public String visit(ClassDecl aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(FieldDecl aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(FieldDeclId aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(MethodDecl aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(Param aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(IntLiteral aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(Block aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(AssignStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(Location aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(MethodCallStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(IfStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(MethodCall aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(ForStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(ReturnStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(SemicolonStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(ContinueStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(BoolLiteral aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(FloatLiteral aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(BreakStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(WhileStatement aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(BinOpExpr aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String visit(UnaryOpExpr aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
