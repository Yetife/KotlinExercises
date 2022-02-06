fun main(args: Array<String>) {
    val char = 'l'

    when(char) {
        'a', 'e', 'i', 'o', 'u' -> println("$char is vowel")
        else -> println("$char is consonant")
    }
}