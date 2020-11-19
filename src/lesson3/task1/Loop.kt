package lesson3.task1

import kotlin.math.max

fun main() {
    println("Recursive = ${factorial(7)}")
    println("While = ${factorialWhile(7)}")
    println("For = ${factorialFor(7)}")

    println("Fibonacci = ${fib(11)}")
    println("FibonacciFor = ${fibFor(11)}")

    println("Lowest Common Multiple = ${findLowestCommonMultiple(3, 9)}")


}

fun factorial(n: Int): Int {
    if (n < 1)
        return 0
    if (n <= 1)
        return 1
    else
        return n * factorial(n - 1)
}

fun factorialWhile(n: Int): Int {
    var result = 1
    var counter = 1
    while (counter <= n) {
        result *= counter
        counter++
    }
    return result
}

fun factorialFor(n: Int): Int {
    var result = 1
    for (i in 1..n)
        result *= i
    return result
}

fun fib(n: Int): Long {
    if (n == 1)
        return 0
    if (n <= 3 && n != 1)
        return 1
    else
        return fib(n - 1) + fib(n - 2)
}

fun fibFor(n: Int): Int {
    var x1 = 1
    var x2 = 1
    var result = 0
    for (i in 4..n) {
        result = x1 + x2
        x1 = x2
        x2 = result
    }
    return result
}

fun findLowestCommonMultiple(x: Int, y: Int): Int {
    var max = max(x, y)
    for (i in max..x * y) {
        if (i % x == 0 && i % y == 0) {
            return i
        }
    }
    return x * y
}