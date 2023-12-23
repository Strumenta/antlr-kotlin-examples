import kotlin.test.Test
import kotlin.test.assertEquals

class Example1 {

    @Test
    fun decl() {
        val res = MiniCalcInterpreter().interpret("a = 1")
        assertEquals(emptyList(), res.prints)
    }

//    @Test
//    fun multiplication() {
//        TODO()
//    }
}