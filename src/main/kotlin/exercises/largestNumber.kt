fun main() {
    val max = findLargestElement(2,5,9)
    println("Largest number = $max")
}

fun findLargestElement(firstNumber: Int, secondNumber: Int, thirdNumber: Int) {
    when {
        firstNumber >= secondNumber && firstNumber >= thirdNumber -> println("Largest number = $firstNumber")
        secondNumber >= thirdNumber && secondNumber >= firstNumber -> println("Largest number $secondNumber")
        else -> println("Largest number = $thirdNumber")
    }
}