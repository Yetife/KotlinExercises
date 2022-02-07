fun main(args: Array<String>) {

    val character = 'a'

    if (character in 'a'..'z' || character in 'A'..'Z')
        println("$character is an alphabet.")
    else
        println("$character is not an alphabet.")
}