// Generated from C:/Users/jetbrains/custom-projects/lisp-machine/src/main/antlr\Scheme.g4 by ANTLR 4.9.1
package ru.nsu.sdt.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SchemeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SchemeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SchemeParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SchemeParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#commandOrDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandOrDefinition(SchemeParser.CommandOrDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(SchemeParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#defFormals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFormals(SchemeParser.DefFormalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(SchemeParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SchemeParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#syntacticKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntacticKeyword(SchemeParser.SyntacticKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#expressionKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionKeyword(SchemeParser.ExpressionKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SchemeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SchemeParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SchemeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#quotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotation(SchemeParser.QuotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#selfEvaluating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfEvaluating(SchemeParser.SelfEvaluatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(SchemeParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#formals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormals(SchemeParser.FormalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(SchemeParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(SchemeParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#consequent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsequent(SchemeParser.ConsequentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#alternate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternate(SchemeParser.AlternateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SchemeParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#derivedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivedExpression(SchemeParser.DerivedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#condClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondClause(SchemeParser.CondClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#recipient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecipient(SchemeParser.RecipientContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(SchemeParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#bindingSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindingSpec(SchemeParser.BindingSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#iterationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationSpec(SchemeParser.IterationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(SchemeParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(SchemeParser.StepContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#doResult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoResult(SchemeParser.DoResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(SchemeParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SchemeParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(SchemeParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(SchemeParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(SchemeParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#datum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatum(SchemeParser.DatumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#simpleDatum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDatum(SchemeParser.SimpleDatumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#compoundDatum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundDatum(SchemeParser.CompoundDatumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(SchemeParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#abbreviation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbreviation(SchemeParser.AbbreviationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#abbrevPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbrevPrefix(SchemeParser.AbbrevPrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(SchemeParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SchemeParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(SchemeParser.BoolContext ctx);
}