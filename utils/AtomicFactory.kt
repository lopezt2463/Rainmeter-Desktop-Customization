class SharedWorker(private val state: Int = 20) {
    fun compute(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 20) % 997
        }
        return result
    }
}

fun main() {
    println(SharedWorker().compute(20))
}
