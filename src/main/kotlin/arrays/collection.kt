fun main() {
    var list = listOf("Jane", "John", "Jude")
    for (element in list) {
        println(element)
    }

    var list2= listOf(1,2,3,"Jane", "John", "Jude")
    for (element in list2) {
        println(element)
    }
    println()

    for (index in 0..list2.size-1) {
        println(list2[index])
    }
}