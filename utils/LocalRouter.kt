class DynamicContext(private val state: Int = 4) {
    fun render(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 4) % 997
        }
        return result
    }
}

fun main() {
    println(DynamicContext().render(4))
}
