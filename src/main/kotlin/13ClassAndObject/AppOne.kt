package `13ClassAndObject`

class AppOne {
    // properties
    var brand = ""
    var model = ""
    var year = 0
}

fun main(){
    // Create a a1 object of the AppOne class
    val a1 = AppOne()

    // Access the properties and add some values to it
    a1.brand = "Ford"
    a1.model = "Mustang"
    a1.year = 1969

    println(a1.brand)
    println(a1.model)
    println(a1.year)

    // Multiple Objects
    val a2 = AppOne()
    a2.brand = "BMW"
    a2.model = "X5"
    a2.year = 1999
    println(a2.brand)
    println(a2.model)
    println(a2.year)

    val a3 = AppOne()
    a3.brand = "Lexus"
    a3.model = "L5"
    a3.year = 2001
    println(a3.brand)
    println(a3.model)
    println(a3.year)
}