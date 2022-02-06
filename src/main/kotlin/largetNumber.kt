fun main() {
    var numberOne = 4;
    var numberTwo = 7;
    var numberThree = 8;
    var max = 0;

    var largest= if (numberOne >= numberTwo && numberOne >= numberThree) println("Largest number = $numberOne")
    else if (numberTwo >= numberThree && numberTwo >= numberOne) println("Largest number $numberTwo")
    else println("Largest number = $numberThree")

    print("$largest")
}