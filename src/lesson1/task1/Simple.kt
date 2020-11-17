@file:Suppress("UNUSED_PARAMETER")

package lesson1.task1

import kotlin.math.PI
import kotlin.math.sqrt


/**
Бүтін санның квадратын табу
 */
fun sqr(number: Int): Long {
    return number.toLong() * number
}

/**
Бүтін емес санның квадратын табу
 */
fun sqr(x: Double): Double = x * x

/**
Дискриминант шығару
 */
fun discriminant(a: Double, b: Double, c: Double): Double {
    return sqr(b) - 4 * a * c
}


/**
Квадраттық теңдеудің екі жауабының көбейтіндісін табу
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val discrim: Double = discriminant(a, b, c)
    val tubirAstyDiscrim: Double = sqrt(discrim)
    val x1: Double = (-1 * b + tubirAstyDiscrim) / 2 * a
    val x2: Double = (-1 * b - tubirAstyDiscrim) / 2 * a
    return x1 * x2
}

/**
Негізгі функция
 */

fun main() {
    val number = 123
    println("Result is ${numberRevert(number)}")
}


/**
 * Оңай
 *
 * Инпут сағат және минутпен беріледі, мысалы(8:20:35)
 * Қанша секунд екенін шығару(мына мысалда 30035).
 */
fun seconds(hours: Int, minutes: Int, seconds: Int): Int {
    return (hours * 3600) + (minutes * 60) + seconds
}


/**
 * Оңай
 *
 * Инпут бұрыштың градусы бүтін сандармен беріледі (мысалы, 36 градус 14 минут 35 секунд).
 * Радианмен шығарып беру (мысалы, 0.63256).
 */
fun angleInRadian(deg: Int, min: Int, sec: Int): Double {
    val gradus_additional: Double = (deg.toDouble() + (min.toDouble() / 60) + (sec.toDouble() / 3600))
    return gradus_additional * PI / 180
}

/**
 * Оңай
 *
 * Екі нүктенің координадатасы берілген, ара қашықтығын табыңыз (x1, y1) және (x2, y2).
 * Мысалы, (3, 0) және (0, 4) нүктесінің арасы 5-ке тең
 */
fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val x_substraction: Double = x2 - x1
    val y_substraction: Double = y2 - y1
    val x_sqr: Double = x_substraction * x_substraction
    val y_sqr: Double = y_substraction * y_substraction
    return sqrt(x_sqr + y_sqr)
}

/**
 * Орташа
 *
 * Инпут 100-ден үлкен кез-келген сан (мысалы, 3801).
 * Соңынан санағанда үшінші санды табу (мына мысалда 8).
 */
fun thirdDigit(number: Int): Int {
    val dividing_by_100 : Int = number / 100
    return dividing_by_100 % 10
}

/**
 * Орташа
 *
 * Поезд h1 сағат m1 минутта А қаласынан шықты (мысалы в 9:25) және
 * Б қаласына тура сол күннің h2 сағат m2 минутында келді (мысалы в 13:01).
 * Қанша уақыт жүргенін минуттап есептеңіз (мына мысалда 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int {
    val minutes1 : Int = (hoursDepart * 60) + minutesDepart
    val minutes2 : Int = (hoursArrive * 60) + minutesArrive
    return minutes2 - minutes1
}


/**
 * Орташа
 *
 * Инпут үш таңбалы бүтін сан (мысалы, 478).
 * Керісінше етіп қайтару керек (мысалы, 874).
 */
fun numberRevert(number: Int): Int {
    var number = number
    var revert = 0

    while (number > 0) {
        val r = number % 10
        revert = revert * 10 + r
        number /= 10
    }
    return revert
}
