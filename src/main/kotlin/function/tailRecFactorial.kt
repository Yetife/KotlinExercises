fun main() {
    val number = 10000
    val result: Long = factorial(number)
    println("Factorail of $number = $result")
}
tailrec fun factorial(number: Int, run: Int = 1): Long {
    return if (number == 1){
        run.toLong()
    }else{
        factorial(number - 1, run*number)
    }
}