package com.strumenta.antlrkotlin.examples

import kotlin.test.Test
import kotlin.test.assertEquals

class MiscStringTest {


    @Test
    fun testToCharArrayEmptyLength() {
        assertEquals(0, "".toCharArray().size)
    }

    @Test
    fun testToCharArrayEmptyEl0() {
        assertEquals('a', "abc def".toCharArray()[0])
    }

}

