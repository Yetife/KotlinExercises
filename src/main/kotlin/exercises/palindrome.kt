import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    //Input word
    println("Enter String : ")
    val word = input.nextLine()

    if (isPalindromeString(word)) {
        println("$word is a Palindrome")
    } else {
        println("$word is not a Palindrome")
    }
}

fun isPalindromeString(inputStr: String): Boolean {
    val word = StringBuilder(inputStr)

    val reverseStr = word.reverse().toString()

    return inputStr.equals(reverseStr, ignoreCase = true)
}

