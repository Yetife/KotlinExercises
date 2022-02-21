fun main() {
    var result = sumRecursive(10000)
    println(result)
}

fun sumRecursive(n: Long): Long {
    return if (n <= 1){
        n
    }else{
        n + sumRecursive(n - 1)
    }
}