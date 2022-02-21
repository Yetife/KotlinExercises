fun main() {
    val name = arrayOf<String>("Seyi", "Tunde", "Wunmi", "Chucks", "Becca", "Tunde")

    val distinct = name.distinct()
    for(names in distinct) {
        println(names)
    }

    val result = name.drop(2)
    for(name in result){
        println(name)
    }

    val result2 = name.dropLast(2)
    println()
    for(name in result2) {
        println(name)
    }
}