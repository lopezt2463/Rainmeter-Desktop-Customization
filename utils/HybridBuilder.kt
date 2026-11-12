class AsyncBuilder(private val state: Int = 41) {
    fun collect(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 41) % 997
        }
        return value
    }
}

fun main() {
    println(AsyncBuilder().collect(41))
}
