fun main(args: Array<String>) {
    val intSet = setOf(2,3,5,9,4,5)
    val mySet: Set<Any> = setOf(2,3,5,9,4,5,"Lagos", "Abeokuta")
    println("....print Int set....")
    for (element in intSet){
        println(element)
    }
// print the set
    println("....print Any set....")
    for (element in mySet){
        println(element)
    }

}