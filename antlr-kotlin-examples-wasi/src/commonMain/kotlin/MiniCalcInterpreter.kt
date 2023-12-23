import com.strumenta.antlrkotlin.parsers.generated.MiniCalcLexer
import com.strumenta.antlrkotlin.parsers.generated.MiniCalcParser
import org.antlr.v4.kotlinruntime.BaseErrorListener
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.antlr.v4.kotlinruntime.RecognitionException
import org.antlr.v4.kotlinruntime.Recognizer

class MiniCalcInterpreter {

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
                else -> TODO("Unsupported statement: $stmt")
            }
        }
        return res
    }
}

data class MiniCalcResult(val prints: MutableList<String> = mutableListOf())