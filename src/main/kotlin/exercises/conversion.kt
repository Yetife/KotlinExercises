fun main(args: Array<String>) {
    val num: Long = 110110111
    val decimal = convertBinaryToDecimal(num)
    println("$num in binary = $decimal in decimal")

    val number = 19
    val binary = convertDecimalToBinary(number)
    println("$number in decimal = $binary in binary")
}

fun convertBinaryToDecimal(number: Long): Int {
    var number = number
    var decimalNumber = 0
    var i = 0
    var remainder: Long

    while (number.toInt() != 0) {
        remainder = number % 10
        number /= 10
        decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}

 fun convertDecimalToBinary(number: Int): Long {
    var num = number
    var binaryNumber: Long = 0
    var remainder: Int
    var i = 1

    while (num != 0) {
        remainder = num % 2
        num /= 2
        binaryNumber += (remainder * i).toLong()
        i *= 10
    }
    return binaryNumber
}