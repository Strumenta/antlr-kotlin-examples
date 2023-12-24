
@JsExport
interface IMiniCalcResult {
    fun getVarNames() : Array<String>
    fun getIntValue(varName: String): Int
    fun getPrints() : Array<String>
}

@JsExport
fun interpretSimple(code: String) : String {
    return MiniCalcInterpreter().interpret(code).toString()
}

@JsExport
fun interpretStructured(code: String) : IMiniCalcResult {
    val result = MiniCalcInterpreter().interpret(code)
    return object : IMiniCalcResult {
        override fun getVarNames(): Array<String> {
            return result.vars.keys.toTypedArray()
        }

        override fun getIntValue(varName: String): Int {
            return result.vars[varName] as Int
        }

        override fun getPrints(): Array<String> {
            return result.prints.toTypedArray()
        }

    }
}
