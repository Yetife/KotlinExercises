import kotlin.math.sqrt

fun main() {

    val numArray = doubleArrayOf(2.4, 8.3, 6.7, 2.0, 7.2, 4.5, 8.4, 10.3, 8.6, 1.5)

    System.out.format("Standard Deviation = %.3f", calulateStandartDeviation(numArray))
}

fun calulateStandartDeviation(array: DoubleArray): Double {
    var sum = 0.0
    var mean = 0.0
    var standardDeviation = 0.0

    //calculte mean of an array
    for(number in array){
        sum += number
    }
    mean = sum/ array.size

    //calculte standard deviaion of the array
    for(number in array) {
        standardDeviation += Math.pow(number - mean, 2.0)
    }
        return sqrt(standardDeviation / array.size)

}

//private operator fun <T> Double.plusAssign(number: T) {
//
//}
