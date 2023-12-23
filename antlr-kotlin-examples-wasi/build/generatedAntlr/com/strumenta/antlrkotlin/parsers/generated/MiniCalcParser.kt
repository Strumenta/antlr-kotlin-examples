// Generated from /Users/federico/repos/antlr-kotlin-examples/antlr-kotlin-examples-wasi/src/commonMain/antlr/MiniCalcParser.g4 by ANTLR 4.13.1
package com.strumenta.antlrkotlin.parsers.generated

import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.misc.*
import org.antlr.v4.kotlinruntime.tree.*

@Suppress("FunctionName", "LocalVariableName", "EnumEntryName", "ConvertSecondaryConstructorToPrimary", "ConstantConditionIf", "RemoveRedundantBackticks")
public open class MiniCalcParser(input: TokenStream) : Parser(input) {
    private companion object {
        init {
            RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.runtimeVersion)
        }

        private const val SERIALIZED_ATN: String =
            "\u0004\u0001\u001d\u0061\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\u0008\u0007\u0008\u0002\u0009\u0007\u0009\u0001\u0000\u0004\u0000\u0016\u0008\u0000\u000b\u0000\u000c\u0000\u0017\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0021\u0008\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u003d\u0008\u0007\u000a\u0007\u000c\u0007\u0040\u0009\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0045\u0008\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0050\u0008\u0007\u000a\u0007\u000c\u0007\u0053\u0009\u0007\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0008\u0001\u0008\u0003\u0008\u005a\u0008\u0008\u0001\u0009\u0001\u0009\u0001\u0009\u0003\u0009\u005f\u0008\u0009\u0001\u0009\u0000\u0001\u000e\u000a\u0000\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0000\u0003\u0001\u0001\u0001\u0001\u0001\u0000\u000f\u0010\u0001\u0000\u000d\u000e\u0066\u0000\u0015\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004\u0020\u0001\u0000\u0000\u0000\u0006\u0022\u0001\u0000\u0000\u0000\u0008\u0027\u0001\u0000\u0000\u0000\u000a\u002b\u0001\u0000\u0000\u0000\u000c\u002e\u0001\u0000\u0000\u0000\u000e\u0044\u0001\u0000\u0000\u0000\u0010\u0059\u0001\u0000\u0000\u0000\u0012\u005e\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001a\u0003\u0004\u0002\u0000\u001a\u001b\u0007\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c\u0021\u0003\u0008\u0004\u0000\u001d\u0021\u0003\u000a\u0005\u0000\u001e\u0021\u0003\u000c\u0006\u0000\u001f\u0021\u0003\u0006\u0003\u0000\u0020\u001c\u0001\u0000\u0000\u0000\u0020\u001d\u0001\u0000\u0000\u0000\u0020\u001e\u0001\u0000\u0000\u0000\u0020\u001f\u0001\u0000\u0000\u0000\u0021\u0005\u0001\u0000\u0000\u0000\u0022\u0023\u0005\u0005\u0000\u0000\u0023\u0024\u0005\u0012\u0000\u0000\u0024\u0025\u0003\u000e\u0007\u0000\u0025\u0026\u0005\u0013\u0000\u0000\u0026\u0007\u0001\u0000\u0000\u0000\u0027\u0028\u0005\u0003\u0000\u0000\u0028\u0029\u0003\u0012\u0009\u0000\u0029\u002a\u0005\u000a\u0000\u0000\u002a\u0009\u0001\u0000\u0000\u0000\u002b\u002c\u0005\u0004\u0000\u0000\u002c\u002d\u0003\u000c\u0006\u0000\u002d\u000b\u0001\u0000\u0000\u0000\u002e\u002f\u0005\u000a\u0000\u0000\u002f\u0030\u0005\u0011\u0000\u0000\u0030\u0031\u0003\u000e\u0007\u0000\u0031\u000d\u0001\u0000\u0000\u0000\u0032\u0033\u0006\u0007\uffff\uffff\u0000\u0033\u0034\u0005\u0012\u0000\u0000\u0034\u0035\u0003\u000e\u0007\u0000\u0035\u0036\u0005\u0013\u0000\u0000\u0036\u0045\u0001\u0000\u0000\u0000\u0037\u0045\u0005\u000a\u0000\u0000\u0038\u0039\u0005\u000e\u0000\u0000\u0039\u0045\u0003\u000e\u0007\u0004\u003a\u003e\u0005\u0014\u0000\u0000\u003b\u003d\u0003\u0010\u0008\u0000\u003c\u003b\u0001\u0000\u0000\u0000\u003d\u0040\u0001\u0000\u0000\u0000\u003e\u003c\u0001\u0000\u0000\u0000\u003e\u003f\u0001\u0000\u0000\u0000\u003f\u0041\u0001\u0000\u0000\u0000\u0040\u003e\u0001\u0000\u0000\u0000\u0041\u0045\u0005\u001a\u0000\u0000\u0042\u0045\u0005\u000b\u0000\u0000\u0043\u0045\u0005\u000c\u0000\u0000\u0044\u0032\u0001\u0000\u0000\u0000\u0044\u0037\u0001\u0000\u0000\u0000\u0044\u0038\u0001\u0000\u0000\u0000\u0044\u003a\u0001\u0000\u0000\u0000\u0044\u0042\u0001\u0000\u0000\u0000\u0044\u0043\u0001\u0000\u0000\u0000\u0045\u0051\u0001\u0000\u0000\u0000\u0046\u0047\u000a\u0009\u0000\u0000\u0047\u0048\u0007\u0001\u0000\u0000\u0048\u0050\u0003\u000e\u0007\u000a\u0049\u004a\u000a\u0008\u0000\u0000\u004a\u004b\u0007\u0002\u0000\u0000\u004b\u0050\u0003\u000e\u0007\u0009\u004c\u004d\u000a\u0007\u0000\u0000\u004d\u004e\u0005\u0006\u0000\u0000\u004e\u0050\u0003\u0012\u0009\u0000\u004f\u0046\u0001\u0000\u0000\u0000\u004f\u0049\u0001\u0000\u0000\u0000\u004f\u004c\u0001\u0000\u0000\u0000\u0050\u0053\u0001\u0000\u0000\u0000\u0051\u004f\u0001\u0000\u0000\u0000\u0051\u0052\u0001\u0000\u0000\u0000\u0052\u000f\u0001\u0000\u0000\u0000\u0053\u0051\u0001\u0000\u0000\u0000\u0054\u005a\u0005\u001c\u0000\u0000\u0055\u0056\u0005\u001b\u0000\u0000\u0056\u0057\u0003\u000e\u0007\u0000\u0057\u0058\u0005\u001d\u0000\u0000\u0058\u005a\u0001\u0000\u0000\u0000\u0059\u0054\u0001\u0000\u0000\u0000\u0059\u0055\u0001\u0000\u0000\u0000\u005a\u0011\u0001\u0000\u0000\u0000\u005b\u005f\u0005\u0007\u0000\u0000\u005c\u005f\u0005\u0008\u0000\u0000\u005d\u005f\u0005\u0009\u0000\u0000\u005e\u005b\u0001\u0000\u0000\u0000\u005e\u005c\u0001\u0000\u0000\u0000\u005e\u005d\u0001\u0000\u0000\u0000\u005f\u0013\u0001\u0000\u0000\u0000\u0008\u0017\u0020\u003e\u0044\u004f\u0051\u0059\u005e"

        private val ATN = ATNDeserializer().deserialize(SERIALIZED_ATN.toCharArray())

        private val DECISION_TO_DFA = Array(ATN.numberOfDecisions) {
            DFA(ATN.getDecisionState(it)!!, it)
        }

        private val SHARED_CONTEXT_CACHE = PredictionContextCache()
        private val RULE_NAMES: Array<String> =
            arrayOf("miniCalcFile", "line", "statement", "print", "inputDeclaration", 
                    "varDeclaration", "assignment", "expression", "stringLiteralContent", 
                    "type")

        private val LITERAL_NAMES: Array<String?> =
            arrayOf(null, null, null, "'input'", "'var'", "'print'", null, 
                    null, null, null, null, null, null, null, null, null, 
                    null, null, null, null, null, null, "'\\\"'", "'\\\\'", 
                    "'\\n'", "'\\#'", null, "'#{'", null, "'}'")

        private val SYMBOLIC_NAMES: Array<String?> =
            arrayOf(null, "NEWLINE", "WS", "INPUT", "VAR", "PRINT", "AS", 
                    "INT", "DECIMAL", "STRING", "ID", "INTLIT", "DECLIT", 
                    "PLUS", "MINUS", "ASTERISK", "DIVISION", "ASSIGN", "LPAREN", 
                    "RPAREN", "STRING_OPEN", "UNMATCHED", "ESCAPE_STRING_DELIMITER", 
                    "ESCAPE_SLASH", "ESCAPE_NEWLINE", "ESCAPE_SHARP", "STRING_CLOSE", 
                    "INTERPOLATION_OPEN", "STRING_CONTENT", "INTERPOLATION_CLOSE")

        private val VOCABULARY = VocabularyImpl(LITERAL_NAMES, SYMBOLIC_NAMES)

        private val TOKEN_NAMES: Array<String?> = Array(SYMBOLIC_NAMES.size) {
            VOCABULARY.getLiteralName(it)
                ?: VOCABULARY.getSymbolicName(it)
                ?: "<INVALID>"
        }
    }

    public enum class Tokens(public val id: kotlin.Int) {
        EOF(-1),
        `NEWLINE`(1),
        `WS`(2),
        `INPUT`(3),
        `VAR`(4),
        `PRINT`(5),
        `AS`(6),
        `INT`(7),
        `DECIMAL`(8),
        `STRING`(9),
        `ID`(10),
        `INTLIT`(11),
        `DECLIT`(12),
        `PLUS`(13),
        `MINUS`(14),
        `ASTERISK`(15),
        `DIVISION`(16),
        `ASSIGN`(17),
        `LPAREN`(18),
        `RPAREN`(19),
        `STRING_OPEN`(20),
        `UNMATCHED`(21),
        `ESCAPE_STRING_DELIMITER`(22),
        `ESCAPE_SLASH`(23),
        `ESCAPE_NEWLINE`(24),
        `ESCAPE_SHARP`(25),
        `STRING_CLOSE`(26),
        `INTERPOLATION_OPEN`(27),
        `STRING_CONTENT`(28),
        `INTERPOLATION_CLOSE`(29)
    }

    public enum class Rules(public val id: kotlin.Int) {
        `miniCalcFile`(0),
        `line`(1),
        `statement`(2),
        `print`(3),
        `inputDeclaration`(4),
        `varDeclaration`(5),
        `assignment`(6),
        `expression`(7),
        `stringLiteralContent`(8),
        `type`(9)
    }

    override var interpreter: ParserATNSimulator =
        @Suppress("LeakingThis")
        ParserATNSimulator(this, ATN, DECISION_TO_DFA, SHARED_CONTEXT_CACHE)

    override val grammarFileName: String =
        "MiniCalcParser.g4"

    @Deprecated("Use vocabulary instead", replaceWith = ReplaceWith("vocabulary"))
    override val tokenNames: Array<String?> =
        TOKEN_NAMES

    override val ruleNames: Array<String> =
        RULE_NAMES

    override val atn: ATN =
        ATN

    override val vocabulary: Vocabulary =
        VOCABULARY

    override val serializedATN: String =
        SERIALIZED_ATN

    private val NEWLINE = Tokens.NEWLINE.id
    private val WS = Tokens.WS.id
    private val INPUT = Tokens.INPUT.id
    private val VAR = Tokens.VAR.id
    private val PRINT = Tokens.PRINT.id
    private val AS = Tokens.AS.id
    private val INT = Tokens.INT.id
    private val DECIMAL = Tokens.DECIMAL.id
    private val STRING = Tokens.STRING.id
    private val ID = Tokens.ID.id
    private val INTLIT = Tokens.INTLIT.id
    private val DECLIT = Tokens.DECLIT.id
    private val PLUS = Tokens.PLUS.id
    private val MINUS = Tokens.MINUS.id
    private val ASTERISK = Tokens.ASTERISK.id
    private val DIVISION = Tokens.DIVISION.id
    private val ASSIGN = Tokens.ASSIGN.id
    private val LPAREN = Tokens.LPAREN.id
    private val RPAREN = Tokens.RPAREN.id
    private val STRING_OPEN = Tokens.STRING_OPEN.id
    private val UNMATCHED = Tokens.UNMATCHED.id
    private val ESCAPE_STRING_DELIMITER = Tokens.ESCAPE_STRING_DELIMITER.id
    private val ESCAPE_SLASH = Tokens.ESCAPE_SLASH.id
    private val ESCAPE_NEWLINE = Tokens.ESCAPE_NEWLINE.id
    private val ESCAPE_SHARP = Tokens.ESCAPE_SHARP.id
    private val STRING_CLOSE = Tokens.STRING_CLOSE.id
    private val INTERPOLATION_OPEN = Tokens.INTERPOLATION_OPEN.id
    private val STRING_CONTENT = Tokens.STRING_CONTENT.id
    private val INTERPOLATION_CLOSE = Tokens.INTERPOLATION_CLOSE.id

    /* Named actions */

    /* Funcs */
    @Suppress("FunctionName")
    public open class MiniCalcFileContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.miniCalcFile.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public var line: LineContext? = null
        public var lines: MutableList<LineContext> = ArrayList<LineContext>()
        public fun findLine(): List<LineContext> = getRuleContexts(LineContext::class)
        public fun findLine(i: Int): LineContext? = getRuleContext(LineContext::class, i)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterMiniCalcFile(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitMiniCalcFile(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitMiniCalcFile(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun miniCalcFile(): MiniCalcFileContext {
        var _localctx = MiniCalcFileContext(context, state)
        enterRule(_localctx, 0, Rules.miniCalcFile.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 21 
                errorHandler.sync(this)
                _la = _input.LA(1)

                do {
                    if (true) {
                        if (true) {
                            this.state = 20
                            (_localctx as MiniCalcFileContext).line = line()
                            (_localctx as MiniCalcFileContext).lines.add((_localctx as MiniCalcFileContext).line!!)
                        }
                    }
                    this.state = 23 
                    errorHandler.sync(this)
                    _la = _input.LA(1)
                } while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and 1080L) != 0L))
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class LineContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.line.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun findStatement(): StatementContext? = getRuleContext(StatementContext::class, 0)
        public fun NEWLINE(): TerminalNode? = getToken(Tokens.NEWLINE.id, 0)
        public fun EOF(): TerminalNode? = getToken(Tokens.EOF.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterLine(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitLine(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitLine(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun line(): LineContext {
        var _localctx = LineContext(context, state)
        enterRule(_localctx, 2, Rules.line.id)
        var _la: Int

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 25
                statement()
                this.state = 26
                _la = _input.LA(1)

                if (!(_la == EOF || _la == NEWLINE)) {
                    errorHandler.recoverInline(this)
                }
                else {
                    if (_input.LA(1) == Tokens.EOF.id) {
                        isMatchedEOF = true
                    }

                    errorHandler.reportMatch(this)
                    consume()
                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class StatementContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.statement.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()


        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

     
        public constructor() : super()

        public fun copyFrom(ctx: StatementContext) {
            super.copyFrom(ctx)
        }

    }

    public open class PrintStatementContext : StatementContext {
        public fun findPrint(): PrintContext? = getRuleContext(PrintContext::class, 0)

        public constructor(ctx: StatementContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterPrintStatement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitPrintStatement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitPrintStatement(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class AssignmentStatementContext : StatementContext {
        public fun findAssignment(): AssignmentContext? = getRuleContext(AssignmentContext::class, 0)

        public constructor(ctx: StatementContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterAssignmentStatement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitAssignmentStatement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitAssignmentStatement(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class InputDeclarationStatementContext : StatementContext {
        public fun findInputDeclaration(): InputDeclarationContext? = getRuleContext(InputDeclarationContext::class, 0)

        public constructor(ctx: StatementContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterInputDeclarationStatement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitInputDeclarationStatement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitInputDeclarationStatement(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class VarDeclarationStatementContext : StatementContext {
        public fun findVarDeclaration(): VarDeclarationContext? = getRuleContext(VarDeclarationContext::class, 0)

        public constructor(ctx: StatementContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterVarDeclarationStatement(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitVarDeclarationStatement(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitVarDeclarationStatement(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun statement(): StatementContext {
        var _localctx = StatementContext(context, state)
        enterRule(_localctx, 4, Rules.statement.id)

        try {
            this.state = 32
            errorHandler.sync(this)

            when (_input.LA(1)) {
                INPUT -> /*LL1AltBlock*/ {
                    _localctx = InputDeclarationStatementContext(_localctx)
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 28
                        inputDeclaration()
                    }
                }VAR -> /*LL1AltBlock*/ {
                    _localctx = VarDeclarationStatementContext(_localctx)
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 29
                        varDeclaration()
                    }
                }ID -> /*LL1AltBlock*/ {
                    _localctx = AssignmentStatementContext(_localctx)
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 30
                        assignment()
                    }
                }PRINT -> /*LL1AltBlock*/ {
                    _localctx = PrintStatementContext(_localctx)
                    enterOuterAlt(_localctx, 4)
                    if (true) {
                        this.state = 31
                        print()
                    }
                }
                else -> throw NoViableAltException(this)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class PrintContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.print.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun PRINT(): TerminalNode? = getToken(Tokens.PRINT.id, 0)
        public fun LPAREN(): TerminalNode? = getToken(Tokens.LPAREN.id, 0)
        public fun findExpression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)
        public fun RPAREN(): TerminalNode? = getToken(Tokens.RPAREN.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterPrint(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitPrint(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitPrint(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun print(): PrintContext {
        var _localctx = PrintContext(context, state)
        enterRule(_localctx, 6, Rules.print.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 34
                match(PRINT)
                this.state = 35
                match(LPAREN)
                this.state = 36
                expression(0)
                this.state = 37
                match(RPAREN)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class InputDeclarationContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.inputDeclaration.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public var name: Token? = null
        public fun INPUT(): TerminalNode? = getToken(Tokens.INPUT.id, 0)
        public fun findType(): TypeContext? = getRuleContext(TypeContext::class, 0)
        public fun ID(): TerminalNode? = getToken(Tokens.ID.id, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterInputDeclaration(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitInputDeclaration(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitInputDeclaration(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun inputDeclaration(): InputDeclarationContext {
        var _localctx = InputDeclarationContext(context, state)
        enterRule(_localctx, 8, Rules.inputDeclaration.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 39
                match(INPUT)
                this.state = 40
                type()
                this.state = 41
                (_localctx as InputDeclarationContext).name = match(ID)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class VarDeclarationContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.varDeclaration.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun VAR(): TerminalNode? = getToken(Tokens.VAR.id, 0)
        public fun findAssignment(): AssignmentContext? = getRuleContext(AssignmentContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterVarDeclaration(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitVarDeclaration(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitVarDeclaration(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun varDeclaration(): VarDeclarationContext {
        var _localctx = VarDeclarationContext(context, state)
        enterRule(_localctx, 10, Rules.varDeclaration.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 43
                match(VAR)
                this.state = 44
                assignment()
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class AssignmentContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.assignment.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()

        public fun ID(): TerminalNode? = getToken(Tokens.ID.id, 0)
        public fun ASSIGN(): TerminalNode? = getToken(Tokens.ASSIGN.id, 0)
        public fun findExpression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)

        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterAssignment(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitAssignment(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitAssignment(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun assignment(): AssignmentContext {
        var _localctx = AssignmentContext(context, state)
        enterRule(_localctx, 12, Rules.assignment.id)

        try {
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 46
                match(ID)
                this.state = 47
                match(ASSIGN)
                this.state = 48
                expression(0)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class ExpressionContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.expression.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()


        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

     
        public constructor() : super()

        public fun copyFrom(ctx: ExpressionContext) {
            super.copyFrom(ctx)
        }

    }

    public open class DecimalLiteralContext : ExpressionContext {
        public fun DECLIT(): TerminalNode? = getToken(Tokens.DECLIT.id, 0)

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterDecimalLiteral(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitDecimalLiteral(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitDecimalLiteral(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class MinusExpressionContext : ExpressionContext {
        public fun MINUS(): TerminalNode? = getToken(Tokens.MINUS.id, 0)
        public fun findExpression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterMinusExpression(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitMinusExpression(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitMinusExpression(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class ValueReferenceContext : ExpressionContext {
        public fun ID(): TerminalNode? = getToken(Tokens.ID.id, 0)

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterValueReference(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitValueReference(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitValueReference(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class StringLiteralContext : ExpressionContext {
        public var stringLiteralContent: StringLiteralContentContext? = null
        public var parts: MutableList<StringLiteralContentContext> = ArrayList<StringLiteralContentContext>()
        public fun STRING_OPEN(): TerminalNode? = getToken(Tokens.STRING_OPEN.id, 0)
        public fun STRING_CLOSE(): TerminalNode? = getToken(Tokens.STRING_CLOSE.id, 0)
        public fun findStringLiteralContent(): List<StringLiteralContentContext> = getRuleContexts(StringLiteralContentContext::class)
        public fun findStringLiteralContent(i: Int): StringLiteralContentContext? = getRuleContext(StringLiteralContentContext::class, i)

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterStringLiteral(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitStringLiteral(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitStringLiteral(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class IntLiteralContext : ExpressionContext {
        public fun INTLIT(): TerminalNode? = getToken(Tokens.INTLIT.id, 0)

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterIntLiteral(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitIntLiteral(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitIntLiteral(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class ParenExpressionContext : ExpressionContext {
        public fun LPAREN(): TerminalNode? = getToken(Tokens.LPAREN.id, 0)
        public fun findExpression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)
        public fun RPAREN(): TerminalNode? = getToken(Tokens.RPAREN.id, 0)

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterParenExpression(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitParenExpression(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitParenExpression(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class BinaryOperationContext : ExpressionContext {
        public var left: ExpressionContext? = null
        public var operator: Token? = null
        public var right: ExpressionContext? = null
        public fun findExpression(): List<ExpressionContext> = getRuleContexts(ExpressionContext::class)
        public fun findExpression(i: Int): ExpressionContext? = getRuleContext(ExpressionContext::class, i)
        public fun DIVISION(): TerminalNode? = getToken(Tokens.DIVISION.id, 0)
        public fun ASTERISK(): TerminalNode? = getToken(Tokens.ASTERISK.id, 0)
        public fun PLUS(): TerminalNode? = getToken(Tokens.PLUS.id, 0)
        public fun MINUS(): TerminalNode? = getToken(Tokens.MINUS.id, 0)

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterBinaryOperation(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitBinaryOperation(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitBinaryOperation(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class TypeConversionContext : ExpressionContext {
        public var value: ExpressionContext? = null
        public var targetType: TypeContext? = null
        public fun AS(): TerminalNode? = getToken(Tokens.AS.id, 0)
        public fun findExpression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)
        public fun findType(): TypeContext? = getRuleContext(TypeContext::class, 0)

        public constructor(ctx: ExpressionContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterTypeConversion(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitTypeConversion(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitTypeConversion(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun expression(): ExpressionContext {
        return expression(0)
    }

    private fun expression(_p: Int): ExpressionContext {
        var _parentctx = context
        var _parentState = state
        var _localctx = ExpressionContext(context, _parentState)
        var _prevctx = _localctx
        var _startState = 14
        enterRecursionRule(_localctx, 14, Rules.expression.id, _p)
        var _la: Int

        try {
            var _alt: Int
            enterOuterAlt(_localctx, 1)
            if (true) {
                this.state = 68
                errorHandler.sync(this)

                when (_input.LA(1)) {
                    LPAREN -> /*LL1AltBlock*/ {
                        if (true) {
                            _localctx = ParenExpressionContext(_localctx)
                            context = _localctx
                            _prevctx = _localctx

                            this.state = 51
                            match(LPAREN)
                            this.state = 52
                            expression(0)
                            this.state = 53
                            match(RPAREN)
                        }
                    }ID -> /*LL1AltBlock*/ {
                        if (true) {
                            _localctx = ValueReferenceContext(_localctx)
                            context = _localctx
                            _prevctx = _localctx
                            this.state = 55
                            match(ID)
                        }
                    }MINUS -> /*LL1AltBlock*/ {
                        if (true) {
                            _localctx = MinusExpressionContext(_localctx)
                            context = _localctx
                            _prevctx = _localctx
                            this.state = 56
                            match(MINUS)
                            this.state = 57
                            expression(4)
                        }
                    }STRING_OPEN -> /*LL1AltBlock*/ {
                        if (true) {
                            _localctx = StringLiteralContext(_localctx)
                            context = _localctx
                            _prevctx = _localctx
                            this.state = 58
                            match(STRING_OPEN)
                            this.state = 62
                            errorHandler.sync(this)
                            _la = _input.LA(1)

                            while (_la == INTERPOLATION_OPEN || _la == STRING_CONTENT) {
                                if (true) {
                                    if (true) {
                                        this.state = 59
                                        (_localctx as StringLiteralContext).stringLiteralContent = stringLiteralContent()
                                        (_localctx as StringLiteralContext).parts.add((_localctx as StringLiteralContext).stringLiteralContent!!)
                                    }
                                }
                                this.state = 64
                                errorHandler.sync(this)
                                _la = _input.LA(1)
                            }
                            this.state = 65
                            match(STRING_CLOSE)
                        }
                    }INTLIT -> /*LL1AltBlock*/ {
                        if (true) {
                            _localctx = IntLiteralContext(_localctx)
                            context = _localctx
                            _prevctx = _localctx
                            this.state = 66
                            match(INTLIT)
                        }
                    }DECLIT -> /*LL1AltBlock*/ {
                        if (true) {
                            _localctx = DecimalLiteralContext(_localctx)
                            context = _localctx
                            _prevctx = _localctx
                            this.state = 67
                            match(DECLIT)
                        }
                    }
                    else -> throw NoViableAltException(this)
                }
                this.context!!.stop = _input.LT(-1)
                this.state = 81
                errorHandler.sync(this)
                _alt = interpreter.adaptivePredict(_input, 5, context)

                while (_alt != 2 && _alt != INVALID_ALT_NUMBER) {
                    if (_alt == 1 ) {
                        if (_parseListeners.isNotEmpty()) {
                            triggerExitRuleEvent()
                        }

                        _prevctx = _localctx
                        if (true) {
                            this.state = 79
                            errorHandler.sync(this)

                            when (interpreter.adaptivePredict(_input, 4, context)) {
                                1 -> {
                                    if (true) {
                                        _localctx = BinaryOperationContext(ExpressionContext(_parentctx, _parentState))
                                        (_localctx as BinaryOperationContext).left = _prevctx
                                        pushNewRecursionContext(_localctx, _startState, Rules.expression.id)
                                        this.state = 70

                                        if (!(precpred(context!!, 9))) {
                                            throw FailedPredicateException(this, "precpred(context!!, 9)")
                                        }
                                        this.state = 71
                                        (_localctx as BinaryOperationContext).operator = _input.LT(1)
                                        _la = _input.LA(1)

                                        if (!(_la == ASTERISK || _la == DIVISION)) {
                                            (_localctx as BinaryOperationContext).operator = errorHandler.recoverInline(this) as Token
                                        }
                                        else {
                                            if (_input.LA(1) == Tokens.EOF.id) {
                                                isMatchedEOF = true
                                            }

                                            errorHandler.reportMatch(this)
                                            consume()
                                        }
                                        this.state = 72
                                        (_localctx as BinaryOperationContext).right = expression(10)
                                    }
                                }2 -> {
                                    if (true) {
                                        _localctx = BinaryOperationContext(ExpressionContext(_parentctx, _parentState))
                                        (_localctx as BinaryOperationContext).left = _prevctx
                                        pushNewRecursionContext(_localctx, _startState, Rules.expression.id)
                                        this.state = 73

                                        if (!(precpred(context!!, 8))) {
                                            throw FailedPredicateException(this, "precpred(context!!, 8)")
                                        }
                                        this.state = 74
                                        (_localctx as BinaryOperationContext).operator = _input.LT(1)
                                        _la = _input.LA(1)

                                        if (!(_la == PLUS || _la == MINUS)) {
                                            (_localctx as BinaryOperationContext).operator = errorHandler.recoverInline(this) as Token
                                        }
                                        else {
                                            if (_input.LA(1) == Tokens.EOF.id) {
                                                isMatchedEOF = true
                                            }

                                            errorHandler.reportMatch(this)
                                            consume()
                                        }
                                        this.state = 75
                                        (_localctx as BinaryOperationContext).right = expression(9)
                                    }
                                }3 -> {
                                    if (true) {
                                        _localctx = TypeConversionContext(ExpressionContext(_parentctx, _parentState))
                                        (_localctx as TypeConversionContext).value = _prevctx
                                        pushNewRecursionContext(_localctx, _startState, Rules.expression.id)
                                        this.state = 76

                                        if (!(precpred(context!!, 7))) {
                                            throw FailedPredicateException(this, "precpred(context!!, 7)")
                                        }
                                        this.state = 77
                                        match(AS)
                                        this.state = 78
                                        (_localctx as TypeConversionContext).targetType = type()
                                    }
                                }
                            }
                        } 
                    }

                    this.state = 83
                    errorHandler.sync(this)
                    _alt = interpreter.adaptivePredict(_input, 5, context)
                }
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            unrollRecursionContexts(_parentctx)
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class StringLiteralContentContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.stringLiteralContent.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()


        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

     
        public constructor() : super()

        public fun copyFrom(ctx: StringLiteralContentContext) {
            super.copyFrom(ctx)
        }

    }

    public open class InterpolatedValueContext : StringLiteralContentContext {
        public fun INTERPOLATION_OPEN(): TerminalNode? = getToken(Tokens.INTERPOLATION_OPEN.id, 0)
        public fun findExpression(): ExpressionContext? = getRuleContext(ExpressionContext::class, 0)
        public fun INTERPOLATION_CLOSE(): TerminalNode? = getToken(Tokens.INTERPOLATION_CLOSE.id, 0)

        public constructor(ctx: StringLiteralContentContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterInterpolatedValue(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitInterpolatedValue(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitInterpolatedValue(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class ConstantStringContext : StringLiteralContentContext {
        public fun STRING_CONTENT(): TerminalNode? = getToken(Tokens.STRING_CONTENT.id, 0)

        public constructor(ctx: StringLiteralContentContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterConstantString(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitConstantString(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitConstantString(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun stringLiteralContent(): StringLiteralContentContext {
        var _localctx = StringLiteralContentContext(context, state)
        enterRule(_localctx, 16, Rules.stringLiteralContent.id)

        try {
            this.state = 89
            errorHandler.sync(this)

            when (_input.LA(1)) {
                STRING_CONTENT -> /*LL1AltBlock*/ {
                    _localctx = ConstantStringContext(_localctx)
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 84
                        match(STRING_CONTENT)
                    }
                }INTERPOLATION_OPEN -> /*LL1AltBlock*/ {
                    _localctx = InterpolatedValueContext(_localctx)
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 85
                        match(INTERPOLATION_OPEN)
                        this.state = 86
                        expression(0)
                        this.state = 87
                        match(INTERPOLATION_CLOSE)
                    }
                }
                else -> throw NoViableAltException(this)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    @Suppress("FunctionName")
    public open class TypeContext : ParserRuleContext {
        override var ruleIndex: Int
            get() = Rules.type.id
            set(@Suppress("UNUSED_PARAMETER") value) = throw RuntimeException()


        public constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState) {
        }

     
        public constructor() : super()

        public fun copyFrom(ctx: TypeContext) {
            super.copyFrom(ctx)
        }

    }

    public open class StringContext : TypeContext {
        public fun STRING(): TerminalNode? = getToken(Tokens.STRING.id, 0)

        public constructor(ctx: TypeContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterString(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitString(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitString(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class IntegerContext : TypeContext {
        public fun INT(): TerminalNode? = getToken(Tokens.INT.id, 0)

        public constructor(ctx: TypeContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterInteger(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitInteger(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitInteger(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }

    public open class DecimalContext : TypeContext {
        public fun DECIMAL(): TerminalNode? = getToken(Tokens.DECIMAL.id, 0)

        public constructor(ctx: TypeContext) {
            copyFrom(ctx)
        }

        override fun enterRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.enterDecimal(this)
            }
        }

        override fun exitRule(listener: ParseTreeListener) {
            if (listener is MiniCalcParserListener) {
                listener.exitDecimal(this)
            }
        }

        override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
            if (visitor is MiniCalcParserVisitor) {
                return visitor.visitDecimal(this)
            } else {
                return visitor.visitChildren(this)!!
            }
        }
    }


    public fun type(): TypeContext {
        var _localctx = TypeContext(context, state)
        enterRule(_localctx, 18, Rules.type.id)

        try {
            this.state = 94
            errorHandler.sync(this)

            when (_input.LA(1)) {
                INT -> /*LL1AltBlock*/ {
                    _localctx = IntegerContext(_localctx)
                    enterOuterAlt(_localctx, 1)
                    if (true) {
                        this.state = 91
                        match(INT)
                    }
                }DECIMAL -> /*LL1AltBlock*/ {
                    _localctx = DecimalContext(_localctx)
                    enterOuterAlt(_localctx, 2)
                    if (true) {
                        this.state = 92
                        match(DECIMAL)
                    }
                }STRING -> /*LL1AltBlock*/ {
                    _localctx = StringContext(_localctx)
                    enterOuterAlt(_localctx, 3)
                    if (true) {
                        this.state = 93
                        match(STRING)
                    }
                }
                else -> throw NoViableAltException(this)
            }
        }
        catch (re: RecognitionException) {
            _localctx.exception = re
            errorHandler.reportError(this, re)
            errorHandler.recover(this, re)
        }
        finally {
            exitRule()
        }

        return _localctx
    }

    override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int): Boolean {
        when (ruleIndex) {
            7 -> return expression_sempred(_localctx as ExpressionContext?, predIndex)
        }

        return true
    }

    private fun expression_sempred(_localctx: ExpressionContext?, predIndex: Int): Boolean {
        when (predIndex) {
            0 -> return (precpred(context!!, 9))
            1 -> return (precpred(context!!, 8))
            2 -> return (precpred(context!!, 7))
        }

        return true
    }
}