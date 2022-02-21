fun main() {
    val cloudServices = arrayOf("Microsoft", "Amazon", "Google", "Heroku")
    val cloudServices2 = arrayOf<String>("Microsoft", "Amazon", "Google", "Heroku")

    for(cloudService in cloudServices){
        println(cloudService)
    }
    println(cloudServices.get(0))
    println(cloudServices.get(3))

    cloudServices.set(3, "Digital Ocean")
    println(cloudServices.get(3))

    for(cloudService in cloudServices){
        println(cloudService)
    }

    println("Size of cloudServices array "+ cloudServices.size)

    if ("Amazon" in cloudServices) println("Amazon exists in cloudServices")
    else println("Amazon does not exist in cloudServices")

}