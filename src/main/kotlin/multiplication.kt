import java.util.Scanner;
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    print("Enter a number: ")
    val number = input.nextInt()

    for (i in 1..12) {
        val multiplication = number * i
        println("$number * $i = $multiplication")
    }
}