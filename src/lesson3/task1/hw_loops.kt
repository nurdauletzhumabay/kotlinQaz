package lesson3.task1

import kotlin.math.min

fun main () {
    println("Fibonacci While = ${fibWhile(8)}" )

    println("Greatest Common Factor = ${greatComFac(25, 10)}")

    println("${factorsOfN_1(15)}")

    println("Factors of a number: ${factorsOfN_2(15)}")

}

fun fibWhile (n: Int): Int {
    var x1 = 0
    var x2 = 1
    var counter = 1

    while (counter < n) {
            val sum = x1 + x2
            x1 = x2
            x2 = sum
            counter++
    }
    return x1
}

fun greatComFac(x: Int, y: Int): Int {
    var min = min(x, y)
    for (i in min downTo 1) {
        if (x % i == 0 && y % i == 0)
            return i
    }
    return x * y
}

fun factorsOfN_1(n: Int): Int {
    for (i in 1..n) {
        if (n % i == 0 && i != n)
            print("$i, ")
    }
    return n
}

fun factorsOfN_2(n: Int) {
    var result = n
    for (i in 1..result) {
        if (result % i == 0 && i != result)
            print("$i, ")
        else if (i == result)
            print("$result")
    }
}