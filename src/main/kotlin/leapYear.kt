fun main(args: Array<String>) {
    val year = 2020

    when(year % 4 == 0 || year % 400 == 0) {
        true -> println("$year is a leap year")
        else -> println("$year is not a leap year")
    }

}