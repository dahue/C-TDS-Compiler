package main.src.visitor;

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

// Abstract visitor
public interface ASTVisitor<T> {

	public <T> T visit(Program aThis);
	// visit statements
//	public <T> T visit(Program aThis);
//
//	public <T> T visit(ClassDecl aThis);
//
//	public <T> T visit(BodyClass aThis);
//
//	public <T> T visit(FieldDecl aThis);
//
//	public <T> T visit(IdFieldDecl aThis);
//
//	public <T> T visit(Param aThis);
//
//	public <T> T visit(MethodDecl aThis);
//
//    public <T> T visit(ForStatement aThis);
//	
//    T visit(AssignStatement stmt);
//
//    T visit(ReturnStmt stmt);
//
//    T visit(IfStatement stmt);
//
//    T visit(ContinueStmt stmt);
//
//    T visit(WhileStatement stmt);
//
//    T visit(BreakStatement stmt);
//
//    T visit(SemicolonStatement stmt);
//
//	// visit expressions
//	T visit(BinOpExpr expr);;
//	T visit(UnaryOpExpr expr);
//	T visit(MethodCallStatement stmt);
//
//	// visit literals	
//    T visit(IntLiteral lit);
//    T visit(FloatLiteral lit);
//    T visit(BoolLiteral lit);
//    
//	// visit locations	
//    T visit(VarLocation loc);
//	T visit(VarListLocation loc);
//
//    T visit(Block aThis);
//
//    // visit method calls
//    T visit(MethodCall call);
//
//	public <T> T visit(Location aThis);

	public <T> T visit(ClassDecl aThis);

	public <T> T visit(FieldDecl aThis);

	public <T> T visit(FieldDeclId aThis);

	public <T> T visit(MethodDecl aThis);

	public <T> T visit(Param aThis);

	public <T> T visit(IntLiteral aThis);

	public <T> T visit(Block aThis);

	public <T> T visit(AssignStatement aThis);

	public <T> T visit(Location aThis);

	public <T> T visit(MethodCallStatement aThis);

	public <T> T visit(IfStatement aThis);

	public <T> T visit(MethodCall aThis);

	public <T> T visit(ForStatement aThis);

	public <T> T visit(ReturnStatement aThis);

	public <T> T visit(SemicolonStatement aThis);

	public <T> T visit(ContinueStatement aThis);

	public <T> T visit(BoolLiteral aThis);

	public <T> T visit(FloatLiteral aThis);

	public <T> T visit(BreakStatement aThis);

	public <T> T visit(WhileStatement aThis);

	public <T> T visit(BinOpExpr aThis);

	public <T> T visit(UnaryOpExpr aThis);

	public <T> T accept(ASTSymbol aThis);
}
