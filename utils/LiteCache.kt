class SmartGateway(private val state: Int = 77) {
    fun handle(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 77) % 997
        }
        return result
    }
}

fun main() {
    println(SmartGateway().handle(77))
}
