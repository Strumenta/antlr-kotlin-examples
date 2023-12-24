package com.strumenta.antlrkotlin.examples

import com.strumenta.antlrkotlin.parsers.generated.MiniCalcLexer
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.Token



fun main(args: Array<String>) {

    val input = CharStreams.fromString("1 + 2")
    val lexer = MiniCalcLexer(input)
    var token: Token?
    do {
        token = lexer.nextToken()
        println("TOKEN $token")
    } while (token?.type != -1)
}
