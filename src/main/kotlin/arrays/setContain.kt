fun main(args: Array<String>) {
    val mySet: Set<Any> = setOf(2,3,5,9,4,5,"Lagos", "Abeokuta")
    val intSet = setOf(5,4,28)
    println("....print Any set....")
    for (element in mySet){
        println(element)
    }

    println("...mySet.contains\"Lagos\"...")
    println(mySet.contains("Lagos"))
    println("...mySet.contains(10)...")
    println(mySet.contains(10))
    println("...mySet.containsAll(intSet)...")
    println(mySet.containsAll(intSet))

    //delete first four element
    val remainList = mySet.drop(4)
   val convertToList = mySet.toList()
    println(convertToList)
    println("....print Set after myset.drop(4)....")
    for (element in remainList){
        println(element)
    }
}