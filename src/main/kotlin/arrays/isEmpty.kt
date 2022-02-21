fun main(args: Array<String>) {
    val products = arrayOf<String>()
    println("Array is empty: " + products.isEmpty())


    val cloudServices = arrayOf("Microsoft", "Amazon", "Google", "Heroku")
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(getSizeOfArray(cloudServices))
    println(getSizeOfArray(numbers))
}


fun <T> getSizeOfArray(array: Array<T>): Int {
    return array.size;
}