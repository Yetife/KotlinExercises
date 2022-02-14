import java.util.*

fun main() {
    var number = 0
    val input = Scanner(System.`in`);
    println("Enter a number: ")
    number = input.nextInt()
    val result: Long = calculateFactorial(number)
    println("Factorial of $number = $result")
}
fun calculateFactorial(number: Int): Long {
    return if (number == 1) number.toLong()
    else number*factorial(number-1)

}