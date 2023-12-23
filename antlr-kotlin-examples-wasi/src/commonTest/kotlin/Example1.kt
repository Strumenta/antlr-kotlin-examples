import kotlin.test.Test
import kotlin.test.assertEquals

class Example1 {

    @Test
    fun decl() {
        val res = MiniCalcInterpreter().interpret("var a = 1")
        assertEquals(MiniCalcResult(
            mutableMapOf("a" to 1),
        ), res)
    }

//    @Test
//    fun multiplication() {
//        TODO()
//    }
}