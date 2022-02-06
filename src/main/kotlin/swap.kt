fun main() {
    var firstNumber = 34;
    var secondNumber = 45;
    var temp = 0

    temp = firstNumber;
    firstNumber = secondNumber;
    secondNumber = temp;

    print("a = $firstNumber");
    print("b = $secondNumber");
}