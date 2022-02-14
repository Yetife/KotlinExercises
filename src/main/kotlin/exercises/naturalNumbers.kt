import java.util.*

fun main(args: Array<String>) {
    var number = 0
    val input = Scanner(System.`in`);
    println("Enter a number: ")
    number = input.nextInt()
    val sum = addNumbers(number)
    println("Sum = $sum")
}

fun addNumbers(num: Int): Int {
    if (num != 0)
        return num + addNumbers(num - 1)
    else
        return num
}