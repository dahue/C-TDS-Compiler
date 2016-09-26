package main.src.visitor;

import main.src.ast.*;

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

	public <T> T visit(VarLocation aThis);

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

	public <T> T visit(VarLocationList aThis);

}
