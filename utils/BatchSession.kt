class SmartEngine(private val state: Int = 97) {
    fun compute(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 97) % 997
        }
        return acc
    }
}

fun main() {
    println(SmartEngine().compute(97))
}
