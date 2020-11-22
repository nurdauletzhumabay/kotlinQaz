package lesson2.task1

import kotlin.math.sqrt

fun main() {
    println("A санын бер:")
    val a = readLine()
    println("B санын бер:")
    val b = readLine()
    println("C cанын бер:")
    val c = readLine()
    if (a?.toIntOrNull() == null
            || b?.toIntOrNull() == null
            || c?.toIntOrNull() == null) {
        println("Тек сен беріңіз!")
        return
    }
    println("Берілгені: ${a}x^2 + ${b}x + $c = 0")
    println("Дискриминант формуласы: D = b^2 - 4ac")
    val b2 = b.toInt() * b.toInt()
    val D = b2 - 4 * a.toInt() * c.toInt()
    println("Дискриминант тең: D = $b2 - 4 * $a * $c = $b2 - ${4 * a.toInt() * c.toInt()} = $D")
    println("x1/x2 формуласы: x1/x2 = (-b +- TBR(D)) / 2a")
    val x1 = (-1 * b.toInt() + (sqrt(D.toDouble()).toInt())) / (2 * a.toInt())
    val x2 = (-1 * b.toInt() - (sqrt(D.toDouble()).toInt())) / (2 * a.toInt())
    println("x1 = ${-1 * b.toInt()} + ${sqrt(D.toDouble()).toInt()} / ${(2 * a.toInt())} = $x1")
    println("x2 = ${-1 * b.toInt()} - ${sqrt(D.toDouble()).toInt()} / ${(2 * a.toInt())} = $x2")
    println("Жауабы: $x1, $x2")
}

/*fun main () {
    println("Қолыңызға тиетін ақшаны жазыңыз:")
    val net = readLine()
    if (net?.toIntOrNull() == null) {
                println("Тек сан беріңіз!")
                return
}
    println("Салыққа: ${((net?.toInt() - 42500) / 0.9 * 0.1).toInt()}")
    println("Зейнетақы қорына: ${((((net?.toInt() - 42500) / 0.9 + 42500) / 0.9 * 0.1)).toInt()}")
    println("Гросс айлығыңыз: ${((((net?.toInt() - 42500) / 0.9 + 42500) / 0.9)).toInt()}")
}*/

//fun main () {
//    println("Мильде енгізіңіз:")
//    val miles = readLine()
//    if (miles?.toIntOrNull() == null) {
//        println("Тек сан беріңіз!")
//        return
//    }
//    println("Километрмен: ${miles.toInt() * 1.60934}")
//}

//fun main () {
//    println("Километрде енгізіңіз:")
//    val km = readLine()
//    if (km?.toIntOrNull() == null) {
//        println("Тек сан беріңіз!")
//        return
//    }
//    println("Мильмен: ${km.toInt() * 0.621371}")
//}