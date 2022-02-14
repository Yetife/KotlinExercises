import java.util.*

fun main(args: Array<String>) {
    var sentence = " "
    val input = Scanner(System.`in`);
    println("Enter a sentence: ")
    sentence = input.nextLine()
    val reversed = reverseSentence(sentence)
    println("The reversed sentence is: $reversed")
}

fun reverseSentence(sentence: String): String {
    if (sentence.isEmpty())
        return sentence

    return reverseSentence(sentence.substring(1)) + sentence[0]
}