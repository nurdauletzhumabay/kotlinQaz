package lesson5

fun main() {
    println("${center(mutableListOf(3, 5, 8, 2))}")
    println("${negativeList(listOf(-1, 3, 5, -7))}")
    println("${absolute(mutableListOf(-1, 3, 5, -7))}")
    println("${buildMultplicationExample(listOf(3, 4, 5, 10))}")


}

fun center(list: MutableList<Int>) = list.map{it - list.sum() / list.size.toDouble()}

fun negativeList(list: List<Int>) = list.filter {it < 0}

fun absolute(list: MutableList<Int>) = list.map {if (it < 0) it * -1 else it}

fun buildMultplicationExample(list: List<Int>) = list.joinToString(" * ", postfix = " = ${listMultip(list)}")

fun listMultip(list1: List<Int>): Int {
    var counter = 0
    var result = 1
    while (counter < list1.size) {
        result *= list1[counter]
        counter++
    }
    return result
}
