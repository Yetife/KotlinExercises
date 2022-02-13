import java.util.*

fun main() {
    val char = charArrayOf('k', 'o', 't', 'l', 'i','n')
    val strings = convertCharToString(char)
    println("Char to string is = $strings")

    val string = "Kotlin"
    val chars = convertStringToChar(string)
    println("string to char is = $chars")

}
fun convertCharToString(char: CharArray): String {
    return String(char)
}
fun convertStringToChar(string: String): String {
    val char = string.toCharArray()
    return Arrays.toString(char)
}