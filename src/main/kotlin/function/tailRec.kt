fun main(args: Array<String>) {
    var number = 100000.toLong()
    var result = sumRecursives(number)
    println("sum of upto $number number = $result")
}

tailrec fun sumRecursives(n: Long, semiresult: Long = 0): Long {
    return if (n <= 0){
        semiresult
    }else{
        sumRecursives((n - 1), n + semiresult)
    }
}