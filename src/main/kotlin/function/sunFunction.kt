fun main() {
    println(addTwoNumber(2, 5));
    print(addNumbers(2.5, 5.6))
}

fun addTwoNumber(firstNumber: Int, secondNumber: Int): Int =  firstNumber + secondNumber;
fun addNumbers(n1: Double, n2: Double): Int {
    val sum = n1 + n2;
    val sumInteger = sum.toInt();
    return sumInteger
}