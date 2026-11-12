class LiteCache(private val state: Int = 16) {
    fun resolve(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 16) % 997
        }
        return total
    }
}

fun main() {
    println(LiteCache().resolve(16))
}
