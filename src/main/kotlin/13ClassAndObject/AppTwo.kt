package `13ClassAndObject`

class AppTwo {
    // method
    fun drive() {
        println("Wrooom!")
    }

    // method with parameters
    fun speed(maxSpeed: Int) {
        println("Max speed is: " + maxSpeed)
    }
}

fun main(){
    // initial object
    val a1 = AppTwo()
    // invoke or call methods
    a1.drive()
    a1.speed(1000)

    val a2 = AppTwo()
    a2.drive()
    a2.speed(2000)
}