package com.strumenta.antlrkotlin.examples

import com.strumenta.antlrkotlin.parsers.generated.MiniCalcLexer
import com.strumenta.antlrkotlin.parsers.generated.MiniCalcParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import kotlin.js.JsExport
import kotlin.js.JsName

@JsName("parserMain")
@JsExport
fun main(args: Array<String>) {

    val input = CharStreams.fromString("input Int width\n")
    val lexer = MiniCalcLexer(input)
    val parser = MiniCalcParser(CommonTokenStream(lexer))
    try {
        val root = parser.miniCalcFile()
        println("Parsed: ${root.childCount}")
    } catch (e: Throwable) {
        println("Error: $e")
    }
}
