class HybridCache(private val state: Int = 72) {
    fun render(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 72) % 997
        }
        return acc
    }
}

fun main() {
    println(HybridCache().render(72))
}
