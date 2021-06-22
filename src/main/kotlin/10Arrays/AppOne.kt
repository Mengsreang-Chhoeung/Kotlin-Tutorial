package `10Arrays`

fun main(){
    // use the arrayOf()
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    // print element of an array
    println(cars[0])
    // change an array element
    cars[0] = "Opel"
    println(cars[0])

    // find out how many elements an array have, use the size property
    val carTwo = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(carTwo.size)
}