import java.util.Scanner

fun main() {
    var numberOne = 0;
    var numberTwo = 0;
    var total = 0;

    val input = Scanner(System.`in`);
    print("Enter a first number: ")
    numberOne = input.nextInt()
    print("Enter a second number: ")
    numberTwo = input.nextInt()

    total = numberOne + numberTwo;
    print("Sum of the integers = $total")

}