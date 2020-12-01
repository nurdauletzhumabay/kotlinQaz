package lesson6

fun main() {

    println(timeStrToSeconds("11:34:45"))
}


fun timeStrToSeconds(str: String): Int {
    val strToList: List<String> = str.split(":")
    return strToList[0].toInt()*3600 + strToList[1].toInt()*60 + strToList[2].toInt()



}


