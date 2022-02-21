fun main() {
    println("Output when no argument is passed")
    displayBorder()

    println("\n\n")
    println("Output when both argument are passed: ")
    displayBorder('*', 5)

    println("\n")
    displayBorder(Character = '+')
}

fun displayBorder(Character: Char = '=', length: Int = 15) {
    for(i in 1..length){
        print(Character)
    }
}