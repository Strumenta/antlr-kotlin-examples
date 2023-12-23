// Generated from /Users/federico/repos/antlr-kotlin-examples/antlr-kotlin-examples-wasi/src/commonMain/antlr/MiniCalcParser.g4 by ANTLR 4.13.1
package com.strumenta.antlrkotlin.parsers.generated

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by [MiniCalcParser].
 */
public interface MiniCalcParserListener : ParseTreeListener {
    /**
     * Enter a parse tree produced by [MiniCalcParser.miniCalcFile].
     *
     * @param ctx The parse tree
     */
    public fun enterMiniCalcFile(ctx: MiniCalcParser.MiniCalcFileContext)

    /**
     * Exit a parse tree produced by [MiniCalcParser.miniCalcFile].
     *
     * @param ctx The parse tree
     */
    public fun exitMiniCalcFile(ctx: MiniCalcParser.MiniCalcFileContext)
    /**
     * Enter a parse tree produced by [MiniCalcParser.line].
     *
     * @param ctx The parse tree
     */
    public fun enterLine(ctx: MiniCalcParser.LineContext)

    /**
     * Exit a parse tree produced by [MiniCalcParser.line].
     *
     * @param ctx The parse tree
     */
    public fun exitLine(ctx: MiniCalcParser.LineContext)
    /**
     * Enter a parse tree produced by the `inputDeclarationStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun enterInputDeclarationStatement(ctx: MiniCalcParser.InputDeclarationStatementContext)

    /**
     * Exit a parse tree produced by the `inputDeclarationStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun exitInputDeclarationStatement(ctx: MiniCalcParser.InputDeclarationStatementContext)
    /**
     * Enter a parse tree produced by the `varDeclarationStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun enterVarDeclarationStatement(ctx: MiniCalcParser.VarDeclarationStatementContext)

    /**
     * Exit a parse tree produced by the `varDeclarationStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun exitVarDeclarationStatement(ctx: MiniCalcParser.VarDeclarationStatementContext)
    /**
     * Enter a parse tree produced by the `assignmentStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun enterAssignmentStatement(ctx: MiniCalcParser.AssignmentStatementContext)

    /**
     * Exit a parse tree produced by the `assignmentStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun exitAssignmentStatement(ctx: MiniCalcParser.AssignmentStatementContext)
    /**
     * Enter a parse tree produced by the `printStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun enterPrintStatement(ctx: MiniCalcParser.PrintStatementContext)

    /**
     * Exit a parse tree produced by the `printStatement` labeled alternative in [MiniCalcParser.statement].
     *
     * @param ctx The parse tree
     */
    public fun exitPrintStatement(ctx: MiniCalcParser.PrintStatementContext)
    /**
     * Enter a parse tree produced by [MiniCalcParser.print].
     *
     * @param ctx The parse tree
     */
    public fun enterPrint(ctx: MiniCalcParser.PrintContext)

    /**
     * Exit a parse tree produced by [MiniCalcParser.print].
     *
     * @param ctx The parse tree
     */
    public fun exitPrint(ctx: MiniCalcParser.PrintContext)
    /**
     * Enter a parse tree produced by [MiniCalcParser.inputDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun enterInputDeclaration(ctx: MiniCalcParser.InputDeclarationContext)

    /**
     * Exit a parse tree produced by [MiniCalcParser.inputDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun exitInputDeclaration(ctx: MiniCalcParser.InputDeclarationContext)
    /**
     * Enter a parse tree produced by [MiniCalcParser.varDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun enterVarDeclaration(ctx: MiniCalcParser.VarDeclarationContext)

    /**
     * Exit a parse tree produced by [MiniCalcParser.varDeclaration].
     *
     * @param ctx The parse tree
     */
    public fun exitVarDeclaration(ctx: MiniCalcParser.VarDeclarationContext)
    /**
     * Enter a parse tree produced by [MiniCalcParser.assignment].
     *
     * @param ctx The parse tree
     */
    public fun enterAssignment(ctx: MiniCalcParser.AssignmentContext)

    /**
     * Exit a parse tree produced by [MiniCalcParser.assignment].
     *
     * @param ctx The parse tree
     */
    public fun exitAssignment(ctx: MiniCalcParser.AssignmentContext)
    /**
     * Enter a parse tree produced by the `decimalLiteral` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun enterDecimalLiteral(ctx: MiniCalcParser.DecimalLiteralContext)

    /**
     * Exit a parse tree produced by the `decimalLiteral` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun exitDecimalLiteral(ctx: MiniCalcParser.DecimalLiteralContext)
    /**
     * Enter a parse tree produced by the `minusExpression` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun enterMinusExpression(ctx: MiniCalcParser.MinusExpressionContext)

    /**
     * Exit a parse tree produced by the `minusExpression` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun exitMinusExpression(ctx: MiniCalcParser.MinusExpressionContext)
    /**
     * Enter a parse tree produced by the `valueReference` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun enterValueReference(ctx: MiniCalcParser.ValueReferenceContext)

    /**
     * Exit a parse tree produced by the `valueReference` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun exitValueReference(ctx: MiniCalcParser.ValueReferenceContext)
    /**
     * Enter a parse tree produced by the `stringLiteral` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun enterStringLiteral(ctx: MiniCalcParser.StringLiteralContext)

    /**
     * Exit a parse tree produced by the `stringLiteral` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun exitStringLiteral(ctx: MiniCalcParser.StringLiteralContext)
    /**
     * Enter a parse tree produced by the `intLiteral` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun enterIntLiteral(ctx: MiniCalcParser.IntLiteralContext)

    /**
     * Exit a parse tree produced by the `intLiteral` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun exitIntLiteral(ctx: MiniCalcParser.IntLiteralContext)
    /**
     * Enter a parse tree produced by the `parenExpression` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun enterParenExpression(ctx: MiniCalcParser.ParenExpressionContext)

    /**
     * Exit a parse tree produced by the `parenExpression` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun exitParenExpression(ctx: MiniCalcParser.ParenExpressionContext)
    /**
     * Enter a parse tree produced by the `binaryOperation` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun enterBinaryOperation(ctx: MiniCalcParser.BinaryOperationContext)

    /**
     * Exit a parse tree produced by the `binaryOperation` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun exitBinaryOperation(ctx: MiniCalcParser.BinaryOperationContext)
    /**
     * Enter a parse tree produced by the `typeConversion` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun enterTypeConversion(ctx: MiniCalcParser.TypeConversionContext)

    /**
     * Exit a parse tree produced by the `typeConversion` labeled alternative in [MiniCalcParser.expression].
     *
     * @param ctx The parse tree
     */
    public fun exitTypeConversion(ctx: MiniCalcParser.TypeConversionContext)
    /**
     * Enter a parse tree produced by the `constantString` labeled alternative in [MiniCalcParser.stringLiteralContent].
     *
     * @param ctx The parse tree
     */
    public fun enterConstantString(ctx: MiniCalcParser.ConstantStringContext)

    /**
     * Exit a parse tree produced by the `constantString` labeled alternative in [MiniCalcParser.stringLiteralContent].
     *
     * @param ctx The parse tree
     */
    public fun exitConstantString(ctx: MiniCalcParser.ConstantStringContext)
    /**
     * Enter a parse tree produced by the `interpolatedValue` labeled alternative in [MiniCalcParser.stringLiteralContent].
     *
     * @param ctx The parse tree
     */
    public fun enterInterpolatedValue(ctx: MiniCalcParser.InterpolatedValueContext)

    /**
     * Exit a parse tree produced by the `interpolatedValue` labeled alternative in [MiniCalcParser.stringLiteralContent].
     *
     * @param ctx The parse tree
     */
    public fun exitInterpolatedValue(ctx: MiniCalcParser.InterpolatedValueContext)
    /**
     * Enter a parse tree produced by the `integer` labeled alternative in [MiniCalcParser.type].
     *
     * @param ctx The parse tree
     */
    public fun enterInteger(ctx: MiniCalcParser.IntegerContext)

    /**
     * Exit a parse tree produced by the `integer` labeled alternative in [MiniCalcParser.type].
     *
     * @param ctx The parse tree
     */
    public fun exitInteger(ctx: MiniCalcParser.IntegerContext)
    /**
     * Enter a parse tree produced by the `decimal` labeled alternative in [MiniCalcParser.type].
     *
     * @param ctx The parse tree
     */
    public fun enterDecimal(ctx: MiniCalcParser.DecimalContext)

    /**
     * Exit a parse tree produced by the `decimal` labeled alternative in [MiniCalcParser.type].
     *
     * @param ctx The parse tree
     */
    public fun exitDecimal(ctx: MiniCalcParser.DecimalContext)
    /**
     * Enter a parse tree produced by the `string` labeled alternative in [MiniCalcParser.type].
     *
     * @param ctx The parse tree
     */
    public fun enterString(ctx: MiniCalcParser.StringContext)

    /**
     * Exit a parse tree produced by the `string` labeled alternative in [MiniCalcParser.type].
     *
     * @param ctx The parse tree
     */
    public fun exitString(ctx: MiniCalcParser.StringContext)
}