fun main() {
    var mutableListInt: MutableList<Int> = mutableListOf<Int>()
    var mutableListString: MutableList<String>  = mutableListOf<String>()
    var mutableListAny: MutableList<Any> = mutableListOf<Any>()

    // Add to mutable list of type Int
    mutableListInt.add(2)
    mutableListInt.add(4)
    mutableListInt.add(12)
    mutableListInt.add(3,15)

    // Add to mutable list of type string
    mutableListString.add("Heroku")
    mutableListString.add("Amazon")
    mutableListString.add("Azure")

    //Add to mutable list of type Any
    mutableListAny.add("Camry")
    mutableListAny.add(10)
    mutableListAny.add(2)
    mutableListAny.add("Venza")

    // print the element in mutable list Int
    println("....print Int type....")
    for (element in mutableListInt){
        println(element)
    }
    println()
    println("....print String type....")
    for (element in mutableListString){
        println(element)
    }

    println()
    println("....print Any type....")
    for (element in mutableListAny){
        println(element)
    }

}