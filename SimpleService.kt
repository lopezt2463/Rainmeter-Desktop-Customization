class SharedBuffer(private val state: Int = 24) {
    fun resolve(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 24) % 997
        }
        return result
    }
}

fun main() {
    println(SharedBuffer().resolve(24))
}
