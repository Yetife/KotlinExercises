import java.util.*

fun main() {
    var factorial = 1;
    var number = 0

    val input = Scanner(System.`in`);
    println("Enter a number: ")
    number = input.nextInt()

    for(i in 1..number){
        factorial *= i
    }
    println("Factorial of $number = $factorial")
}