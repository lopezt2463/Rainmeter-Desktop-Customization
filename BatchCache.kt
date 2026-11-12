class HybridProvider(private val state: Int = 47) {
    fun decode(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 47) % 997
        }
        return count
    }
}

fun main() {
    println(HybridProvider().decode(47))
}
