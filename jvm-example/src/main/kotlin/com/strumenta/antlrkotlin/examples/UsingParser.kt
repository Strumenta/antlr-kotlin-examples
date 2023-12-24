package com.strumenta.antlrkotlin.examples

import com.strumenta.antlrkotlin.parsers.generated.MiniCalcLexer
import com.strumenta.antlrkotlin.parsers.generated.MiniCalcParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream

fun main(args: Array<String>) {

    val input = CharStreams.fromString("input Int width\n")
    val lexer = MiniCalcLexer(input)
    val parser = MiniCalcParser(CommonTokenStream(lexer))
    try {
        val root = parser.miniCalcFile()
        println("Parsed: ${root.javaClass}")
        println("Parsed: ${root.childCount}")
        println("Parsed: ${root.children!![0].javaClass}")
    } catch (e: Throwable) {
        println("Error: $e")
    }
}
