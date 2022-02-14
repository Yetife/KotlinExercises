import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    println("Enter first word : ")
    val str1: String = input.nextLine()

    println("Enter second word : ")
    val str2: String = input.next()

    if (isAnagrams(str1, str2)) {
        println("Words are anagram")
    } else {
        println("Words are not Anagram")
    }
}
fun isAnagrams(str1: String, str2: String): Boolean {
    //Check if both strings are equal
    if (str1.length != str2.length) {
        return false
    }
    //Convert Strings to character Array
    val strArray1 = str1.toCharArray()
    val strArray2 = str2.toCharArray()

    //Sort the Arrays
    Arrays.sort(strArray1)
    Arrays.sort(strArray2)

    //Convert Arrays to String
    val sortedStr1 = String(strArray1)
    val sortedStr2 = String(strArray2)

    return sortedStr1 == sortedStr2
}

