/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.src.visitor;

//import main.java.ast.AssignStmt;

import main.src.ast.ForStatement;
import main.src.ast.IfStatement;
import main.src.ast.FieldDeclId;
import main.src.ast.AssignStatement;
import main.src.ast.UnaryOpExpr;
import main.src.ast.Program;
import main.src.ast.ClassDecl;
import main.src.ast.ContinueStatement;
import main.src.ast.BoolLiteral;
import main.src.ast.Location;
import main.src.ast.Param;
import main.src.ast.ReturnStatement;
import main.src.ast.WhileStatement;
import main.src.ast.FloatLiteral;
import main.src.ast.MethodCall;
import main.src.ast.MethodCallStatement;
import main.src.ast.Block;
import main.src.ast.MethodDecl;
import main.src.ast.FieldDecl;
import main.src.ast.ASTSymbol;
import main.src.ast.SemicolonStatement;
import main.src.ast.IntLiteral;
import main.src.ast.BreakStatement;
import main.src.ast.BinOpExpr;
import main.src.ast.VarLocation;
import main.src.ast.VarLocationList;

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

	@Override
	public <T> T accept(ASTSymbol aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public <T> T visit(VarLocation aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public <T> T visit(VarLocationList aThis) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}
