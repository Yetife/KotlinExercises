import java.util.*

fun main() {
    var words = ""

    val input = Scanner(System.`in`);
    println("Enter words: ")
    words = input.next()

    println("${pangram(words)}")
}
fun pangram(words: String): Boolean {
    val lowerString = words.map { it.lowercaseChar() }
    return ('a'..'z').all {lowerString.contains(it)}
}