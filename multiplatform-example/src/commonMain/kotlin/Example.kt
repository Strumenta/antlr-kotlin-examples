import com.strumenta.antlrkotlin.parsers.generated.MiniCalcLexer
import com.strumenta.antlrkotlin.parsers.generated.MiniCalcParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

fun main(args: Array<String>) {
    val tokenStream = CommonTokenStream(MiniCalcLexer(CharStreams.fromString("1 + 2")))
    val parser = MiniCalcParser(tokenStream)
    val parseTree = parser.miniCalcFile()
}