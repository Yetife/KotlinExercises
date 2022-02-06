fun main() {
    var numberOne = 0;
    var numberTwo = 0;
    var total = 0;

    print("Enter a first number: ")
    numberOne = readLine()!!.toInt()
    print("Enter a second number: ")
    numberTwo = readLine()!!.toInt()

    total = numberOne + numberTwo;
    print("Sum of the integers = $total")

}