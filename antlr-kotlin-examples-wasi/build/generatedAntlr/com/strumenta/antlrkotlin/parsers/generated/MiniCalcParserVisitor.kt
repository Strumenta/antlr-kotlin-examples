// Generated from /Users/federico/repos/antlr-kotlin-examples/antlr-kotlin-examples-wasi/src/commonMain/antlr/MiniCalcParser.g4 by ANTLR 4.13.1
package com.strumenta.antlrkotlin.parsers.generated

import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor

/**
 * This interface defines a complete generic visitor for a parse tree produced by [MiniCalcParser].
 *
 * @param T The return type of the visit operation. Use [Unit] for operations with no return type.
 */
public interface MiniCalcParserVisitor<T> : ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by [MiniCalcParser.miniCalcFile].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitMiniCalcFile(ctx: MiniCalcParser.MiniCalcFileContext): T
    /**
     * Visit a parse tree produced by [MiniCalcParser.line].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitLine(ctx: MiniCalcParser.LineContext): T
    /**
     * Visit a parse tree produced by the `inputDeclarationStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitInputDeclarationStatement(ctx: MiniCalcParser.InputDeclarationStatementContext): T
    /**
     * Visit a parse tree produced by the `varDeclarationStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitVarDeclarationStatement(ctx: MiniCalcParser.VarDeclarationStatementContext): T
    /**
     * Visit a parse tree produced by the `assignmentStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitAssignmentStatement(ctx: MiniCalcParser.AssignmentStatementContext): T
    /**
     * Visit a parse tree produced by the `printStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitPrintStatement(ctx: MiniCalcParser.PrintStatementContext): T
    /**
     * Visit a parse tree produced by [MiniCalcParser.print].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitPrint(ctx: MiniCalcParser.PrintContext): T
    /**
     * Visit a parse tree produced by [MiniCalcParser.inputDeclaration].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitInputDeclaration(ctx: MiniCalcParser.InputDeclarationContext): T
    /**
     * Visit a parse tree produced by [MiniCalcParser.varDeclaration].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitVarDeclaration(ctx: MiniCalcParser.VarDeclarationContext): T
    /**
     * Visit a parse tree produced by [MiniCalcParser.assignment].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitAssignment(ctx: MiniCalcParser.AssignmentContext): T
    /**
     * Visit a parse tree produced by the `decimalLiteral` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitDecimalLiteral(ctx: MiniCalcParser.DecimalLiteralContext): T
    /**
     * Visit a parse tree produced by the `minusExpression` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitMinusExpression(ctx: MiniCalcParser.MinusExpressionContext): T
    /**
     * Visit a parse tree produced by the `valueReference` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitValueReference(ctx: MiniCalcParser.ValueReferenceContext): T
    /**
     * Visit a parse tree produced by the `stringLiteral` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitStringLiteral(ctx: MiniCalcParser.StringLiteralContext): T
    /**
     * Visit a parse tree produced by the `intLiteral` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitIntLiteral(ctx: MiniCalcParser.IntLiteralContext): T
    /**
     * Visit a parse tree produced by the `parenExpression` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitParenExpression(ctx: MiniCalcParser.ParenExpressionContext): T
    /**
     * Visit a parse tree produced by the `binaryOperation` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitBinaryOperation(ctx: MiniCalcParser.BinaryOperationContext): T
    /**
     * Visit a parse tree produced by the `typeConversion` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitTypeConversion(ctx: MiniCalcParser.TypeConversionContext): T
    /**
     * Visit a parse tree produced by the `constantString` labeled alternative in [MiniCalcParser.stringLiteralContent].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitConstantString(ctx: MiniCalcParser.ConstantStringContext): T
    /**
     * Visit a parse tree produced by the `interpolatedValue` labeled alternative in [MiniCalcParser.stringLiteralContent].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitInterpolatedValue(ctx: MiniCalcParser.InterpolatedValueContext): T
    /**
     * Visit a parse tree produced by the `integer` labeled alternative in [MiniCalcParser.type].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitInteger(ctx: MiniCalcParser.IntegerContext): T
    /**
     * Visit a parse tree produced by the `decimal` labeled alternative in [MiniCalcParser.type].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitDecimal(ctx: MiniCalcParser.DecimalContext): T
    /**
     * Visit a parse tree produced by the `string` labeled alternative in [MiniCalcParser.type].
     *
     * @param ctx The parse tree
     * @return The visitor result
     */
    public fun visitString(ctx: MiniCalcParser.StringContext): T
}