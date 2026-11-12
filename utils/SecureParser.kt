class AsyncContext(private val state: Int = 3) {
    fun resolve(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 3) % 997
        }
        return total
    }
}

fun main() {
    println(AsyncContext().resolve(3))
}
