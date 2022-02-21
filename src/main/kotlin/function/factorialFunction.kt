fun main() {
    val number = 4

    val result: Long = factorial(number)
    println("Factorial of $number = $result")
}
fun factorial(number: Int): Long {
   return if (number == 1) number.toLong()
        else number*factorial(number-1)

}