package com.strumenta.antlrkotlin.examples

import com.strumenta.antlrkotlin.parsers.generated.MiniCalcLexer
import com.strumenta.antlrkotlin.parsers.generated.MiniCalcParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.antlr.v4.kotlinruntime.ast.Point
import org.antlr.v4.kotlinruntime.ast.pos
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TestingParser {

    @Test
    fun simplestFileUsingHomogeneousAPI() {
        val input = CharStreams.fromString("input Int width\n")
        val lexer = MiniCalcLexer(input)
        val parser = MiniCalcParser(CommonTokenStream(lexer))

        val root = parser.miniCalcFile()
        assertEquals(1, root.childCount)

        val line = root.children!![0]
        assertTrue(line is MiniCalcParser.LineContext)
        assertEquals(2, line.childCount)

        val statement = line.children!![0]
        assertTrue(statement is MiniCalcParser.StatementContext)
        assertEquals(1, statement.childCount)

        val inputDecl = statement.children!![0]
        assertTrue(inputDecl is MiniCalcParser.InputDeclarationContext)
        assertEquals(3, inputDecl.childCount)

        val inputKw = inputDecl.children!![0]
        assertTrue(inputKw is TerminalNode)
        assertEquals(0, inputKw.childCount)

        val type = inputDecl.children!![1]
        assertTrue(type is MiniCalcParser.TypeContext)
        assertEquals(1, type.childCount)

        val intKw = type.children!![0]
        assertTrue(intKw is TerminalNode)
        assertEquals(0, intKw.childCount)

        val id = inputDecl.children!![2]
        assertTrue(id is TerminalNode)
        assertEquals(0, id.childCount)

        val newline = line.children!![1]
        assertTrue(newline is TerminalNode)
        assertEquals("\n", newline.text)
    }

    @Test
    fun simplestFileUsingHetereogeneousAPI() {
        val input = CharStreams.fromString("input Int width\n")
        val lexer = MiniCalcLexer(input)
        val parser = MiniCalcParser(CommonTokenStream(lexer))

        val root = parser.miniCalcFile()

        val line = root.findLine()[0]

        val statement = line.findStatement()!!

        val inputDeclStmt = statement as MiniCalcParser.InputDeclarationStatementContext
        val inputDecl = inputDeclStmt.findInputDeclaration()!!

        val inputKw = inputDecl.INPUT()!!
        assertEquals("input", inputKw.text)

        val type = inputDecl.findType()!!

        val intKw = (type as MiniCalcParser.IntegerContext).INT()!!
        assertEquals("Int", intKw.text)

        val id = inputDecl.ID()!!
        assertEquals("width", id.text)

        val newline = line.NEWLINE()!!
        assertEquals("\n", newline.text)
    }

    @Test
    fun rootStartPoint() {
        val input = CharStreams.fromString("input Int width\n")
        val lexer = MiniCalcLexer(input)
        val parser = MiniCalcParser(CommonTokenStream(lexer))

        val root = parser.miniCalcFile()
        assertEquals(Point(1, 0), root.start?.startPoint())
    }

    @Test
    fun rootStopPoint() {
        val input = CharStreams.fromString("input Int width\n")
        val lexer = MiniCalcLexer(input)
        val parser = MiniCalcParser(CommonTokenStream(lexer))

        val root = parser.miniCalcFile()
        assertEquals(Point(2, 0), root.stop?.endPoint())
    }

    @Test
    fun rootPosition() {
        val input = CharStreams.fromString("input Int width\n")
        val lexer = MiniCalcLexer(input)
        val parser = MiniCalcParser(CommonTokenStream(lexer))

        val root = parser.miniCalcFile()
        assertEquals(pos(1, 0, 2, 0), root.position)
    }
}
