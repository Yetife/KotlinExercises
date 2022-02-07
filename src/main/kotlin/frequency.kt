import java.util.Scanner
fun main(args: Array<String>) {
    val sentence = "Kotlin is a great language";
    var frequency = 0;

    val input = Scanner(System.`in`)
    print("Enter a character - ")
    val char = input.next().single()

    for (element in sentence) {
        if (char == element) {
            ++frequency
        }
    }
    println("Frequency of $char = $frequency")
}