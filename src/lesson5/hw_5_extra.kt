package lesson5

fun main() {

    val phoneBook: MutableMap<String, String> = mutableMapOf()
    phoneBook["Aziz"] = "+78903432141"
    phoneBook["Nurdaulet"] = "+77470366070"
    phoneBook["Bekzat"] = "87787344556"
    phoneBook["John"] = "+4434545434"
    phoneBook["Sergey"] = "+7343425454223"
    println("${filterByCountryCode(phoneBook)}")


    val text: MutableList<String> = mutableListOf(
            "Well,", "I", "guess", "$20", "is", "a", "good", "price", "for", "a", "pair", "of", "jeans.",
            "He", "has", "like", "ten", "dogs.", "Well...")
    val fillerWords: MutableList<String> = mutableListOf("Well,", "Well...", " well", " well,", "Hmm,", "like")
    println("${removeFillerWords(text, fillerWords)}")


    val text1: List<String> = listOf("wow", "wow", "Wow", "WOW", "WOOOW")
    println("${buildWordSet(text1)}")

    val grades: Map<String, Int> = mapOf("Almas" to 3, "Aziz" to 5, "Nurdaulet" to 5)
    println("${buildGrades(grades)}")


    val stuff: Map<String, Int> = mapOf("Нан" to 30, "Сүт" to 100, "Тауық" to 184, "Порошок" to 89)
    println("${findCheapestStuff(stuff)}")

    val chars: List<Char> = listOf('q', 'a', 'z')
    val word = "qazaq"
    println("${canBuildFrom(chars, word)}")


    val list: List<String> = listOf("a", "b", "a", "b", "b", "abc", "tg", "abc", "f")
    println("${extractRepeats(list)}")


    println("${hasAnagrams(listOf("тор", "рот", "свет"))}")

}



//-----------------------------------------------------------------------------------------------------------

fun filterByCountryCode(phoneBook: MutableMap<String, String>): MutableMap<String, String> {
// Finished

    val result: MutableMap<String, String> = mutableMapOf()
    for ((name, number) in phoneBook)
        when {
            number.startsWith("+77") && number.length == 12 -> result[name] = number
            number.startsWith("87") && number.length == 11 -> result[name] = number
        }
    return result
}


fun removeFillerWords(text: MutableList<String>, fillerWords: List<String>): List<String> {
// Finished

    for (i in fillerWords) {
        if (text.contains(i))
            text.remove(i)
    }
    return text
}


fun buildWordSet(text1: List<String>): MutableSet<String> = text1.toMutableSet()
// Finished


fun buildGrades(grades: Map<String, Int>): Map<Int, List<String>> = grades.toList().groupBy({ it.second }, {it.first})
// Finished


fun findCheapestStuff(stuff: Map<String, Int>): String? {
// Null safe қылу керек !

    var min: Int = Int.MAX_VALUE //сабақта шығарған mostExpensive -ке қарап жасадым, бірақ түсінбедім
    var result = ""
    for ((name, price) in stuff) {
        if (price < min) min = price
    }
    for ((name, price) in stuff) {
        if (min == price)
            result = name
    }
    return result
}


fun canBuildFrom(chars: List<Char>, word: String): Boolean {
// Finished

    val wordToSet = word.toLowerCase().toSet()
    val charsToSet = chars.map { it.toLowerCase() }.toSet()
    return wordToSet == charsToSet
}


fun extractRepeats(list: List<String>): Map<String, Int> = list.groupingBy { it }.eachCount().filter { it.value > 1 }
// Finished


fun hasAnagrams(words: List<String>): Boolean {
// Finished

    var listOfCharLists = mutableListOf<List<Char>>()
    for (i in words) {
        listOfCharLists.add(i.toList().sorted())
    }
    return if (listOfCharLists.toSet().size == listOfCharLists.size)
        false
    else true
}







