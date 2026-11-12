class AsyncMonitor(private val state: Int = 61) {
    fun sync(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 61) % 997
        }
        return result
    }
}

fun main() {
    println(AsyncMonitor().sync(61))
}
