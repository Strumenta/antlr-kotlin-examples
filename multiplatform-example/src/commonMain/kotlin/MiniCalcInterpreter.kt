import com.strumenta.antlrkotlin.parsers.generated.MiniCalcLexer
import com.strumenta.antlrkotlin.parsers.generated.MiniCalcParser
import org.antlr.v4.kotlinruntime.BaseErrorListener
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.antlr.v4.kotlinruntime.RecognitionException
import org.antlr.v4.kotlinruntime.Recognizer
import kotlin.js.JsExport


@JsExport
fun interpretSimple(code: String) : MiniCalcResult {
    return MiniCalcInterpreter().interpret(code)
}

class MiniCalcInterpreter {

    val vars = mutableMapOf<String, Any>()

    fun interpret(code: String) : MiniCalcResult {
        val lexer = MiniCalcLexer(CharStreams.fromString(code))
        lexer.removeErrorListeners()
        lexer.addErrorListener(object : BaseErrorListener() {
            override fun syntaxError(
                recognizer: Recognizer<*, *>,
                offendingSymbol: Any?,
                line: Int,
                charPositionInLine: Int,
                msg: String,
                e: RecognitionException?
            ) {
                throw RuntimeException("Errror found")
            }
        })
        val tokenStream = CommonTokenStream(lexer)
        val parser = MiniCalcParser(tokenStream)
        parser.removeErrorListeners()
        parser.addErrorListener(object : BaseErrorListener() {
            override fun syntaxError(
                recognizer: Recognizer<*, *>,
                offendingSymbol: Any?,
                line: Int,
                charPositionInLine: Int,
                msg: String,
                e: RecognitionException?
            ) {
                throw RuntimeException("Errror found")
            }
        })
        val parseTree = parser.miniCalcFile()
        val res = MiniCalcResult()
        parseTree.lines.forEach {
            when (val stmt = it.findStatement()) {
                is MiniCalcParser.VarDeclarationStatementContext -> {
                    val assignment = stmt.findVarDeclaration()!!.findAssignment()!!
                    vars[assignment.ID()!!.text] = evaluate(assignment.findExpression()!!)
                }
                else -> TODO("Unsupported statement: $stmt")
            }
        }
        res.vars = vars
        return res
    }

    private fun evaluate(expression: MiniCalcParser.ExpressionContext): Any {
        return when (expression) {
            is MiniCalcParser.IntLiteralContext -> expression.INTLIT()!!.text.toInt()
            else -> TODO("Unsupported expression: $expression")
        }
    }
}

data class MiniCalcResult(
    var vars: MutableMap<String, Any> = mutableMapOf(),
    val prints: MutableList<String> = mutableListOf())