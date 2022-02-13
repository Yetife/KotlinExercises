fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 6, 8)
    println("Average of the array is : " + calculateAverage(numbers))

    val arrayOfNumbers: Array<Int> = arrayOf(10,15,29,45,24)
    println("Average of the array is : " + calculateAverage(arrayOfNumbers))
}

fun calculateAverage(array: Array<Int>): Int {
    var sum = 0
    var average = 0
    for(number in array){
        sum += number
        average = sum / array.size;
    }
    return average;
}