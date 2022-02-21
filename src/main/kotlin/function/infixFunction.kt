package function

class math {
    infix fun square(n: Int): Int {
        return n * n
    }

    infix fun add(num: Int): Int {
        return num + num;
    }
}

fun main(args: Array<String>) {
    val m = math()
    val result = m square 3
    println("The square of a number is: $result")

    val result2 = m add 3;
    print("The sum of a number is: $result2")
}