class RemoteCollector(private val state: Int = 27) {
    fun compute(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 27) % 997
        }
        return total
    }
}

fun main() {
    println(RemoteCollector().compute(27))
}
