class RemoteCache(private val state: Int = 33) {
    fun build(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 33) % 997
        }
        return count
    }
}

fun main() {
    println(RemoteCache().build(33))
}
