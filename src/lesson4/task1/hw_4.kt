package lesson4.task1

import java.lang.Math.pow
import kotlin.math.min

fun main() {
    println("${revert(123456789)}")
    println("${isPalindrome(12321)}")
    println("${isCoPrime(25, 49)}")
    println("${squares(listOf(1, 2, 3, 4))}")
    println("${buildSumExample(listOf(1, 2, 3, 4))}")
    println("${average(listOf(3, 4, 5, 10))}")
}


fun revert(n: Int): Int {
    var counter = 1
    var m = n
    while (m / 10 > 0) {
        counter++
        m /= 10
    }
    m = n
    var result = 0.0
    for (i in 1..counter) {
        result += m % 10 * pow(10.toDouble(), (counter - i).toDouble())
        m /= 10
    }
    return result.toInt()
}


fun isPalindrome(n: Int): Boolean {
    val m = revert(n)
    return if (m == n)
        true
    else false
}


fun isCoPrime(x: Int, y: Int): Boolean {
    fun greatComFac(x: Int, y: Int): Int {
        var min = min(x, y)
        for (i in min downTo 1) {
            if (x % i == 0 && y % i == 0)
                return i
        }
        return x * y
    }
    return if (greatComFac(x, y) == 1)
        true
    else false
}


fun squares(list: List<Int>): List<Int> {
    var result: List<Int> = listOf(0)
    for (i in 0 until list.size) {
        var sqr: Int = list[i] * list[i]
        result += sqr
    }
    return result
}


fun buildSumExample(list: List<Int>) = list.joinToString(" + ", " ", postfix = " = ${list.sum()}")


fun average(list: List<Int>): Double {
    return (list.sum().toDouble() / list.size)
}