fun main() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 6, 8)
    println(findLargestElement(numbers))

}

fun findLargestElement(array: Array<Int>): Int {
    var largestElement = 0;
    for (element in array) {
        if (element > largestElement) largestElement = element;
    }
    return largestElement;
}