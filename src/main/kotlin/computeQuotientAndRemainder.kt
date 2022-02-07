import java.util.*

fun main() {
    val quotient : Int
    val remainder: Int

    val input = Scanner(System.`in`);
    print("Enter a number: ")
    val number = input.nextInt()
    print("Enter a number: ")
    val divisor = input.nextInt()

    quotient = number / divisor;
    remainder = number % divisor;

    println("Quotient of $number and $divisor = $quotient")
    println("Remainder of $number and $divisor = $remainder")

}