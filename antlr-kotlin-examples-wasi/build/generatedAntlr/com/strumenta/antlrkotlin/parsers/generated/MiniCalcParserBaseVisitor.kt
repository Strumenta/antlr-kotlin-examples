// Generated from /Users/federico/repos/antlr-kotlin-examples/antlr-kotlin-examples-wasi/src/commonMain/antlr/MiniCalcParser.g4 by ANTLR 4.13.1
package com.strumenta.antlrkotlin.parsers.generated

import org.antlr.v4.kotlinruntime.tree.AbstractParseTreeVisitor

/**
 * This class provides an empty implementation of [MiniCalcParserVisitor],
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param T The return type of the visit operation. Use [Unit] for operations with no return type.
 */
public open class MiniCalcParserBaseVisitor<T> : AbstractParseTreeVisitor<T>(), MiniCalcParserVisitor<T> {
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitMiniCalcFile(ctx: MiniCalcParser.MiniCalcFileContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitLine(ctx: MiniCalcParser.LineContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitInputDeclarationStatement(ctx: MiniCalcParser.InputDeclarationStatementContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitVarDeclarationStatement(ctx: MiniCalcParser.VarDeclarationStatementContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitAssignmentStatement(ctx: MiniCalcParser.AssignmentStatementContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitPrintStatement(ctx: MiniCalcParser.PrintStatementContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitPrint(ctx: MiniCalcParser.PrintContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitInputDeclaration(ctx: MiniCalcParser.InputDeclarationContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitVarDeclaration(ctx: MiniCalcParser.VarDeclarationContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitAssignment(ctx: MiniCalcParser.AssignmentContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitDecimalLiteral(ctx: MiniCalcParser.DecimalLiteralContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitMinusExpression(ctx: MiniCalcParser.MinusExpressionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitValueReference(ctx: MiniCalcParser.ValueReferenceContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitStringLiteral(ctx: MiniCalcParser.StringLiteralContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitIntLiteral(ctx: MiniCalcParser.IntLiteralContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitParenExpression(ctx: MiniCalcParser.ParenExpressionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitBinaryOperation(ctx: MiniCalcParser.BinaryOperationContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitTypeConversion(ctx: MiniCalcParser.TypeConversionContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitConstantString(ctx: MiniCalcParser.ConstantStringContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitInterpolatedValue(ctx: MiniCalcParser.InterpolatedValueContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitInteger(ctx: MiniCalcParser.IntegerContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitDecimal(ctx: MiniCalcParser.DecimalContext): T {
        return this.visitChildren(ctx)!!
    }
    /**
     * The default implementation returns the result of calling [visitChildren] on [ctx].
     */
    override fun visitString(ctx: MiniCalcParser.StringContext): T {
        return this.visitChildren(ctx)!!
    }
}