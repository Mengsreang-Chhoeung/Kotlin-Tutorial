package `13ClassAndObject`

// class with constructors
class AppThree(var brand: String, var model: String, var year: Int){
    fun output() {
        println("${this.brand} ${this.model} ${this.year}")
    }
}

fun main() {
    // initial object with constructor
    val a1 = AppThree("Ford", "Mustang", 1969)
    val a2 = AppThree("BMW", "X5", 1999)
    val a3 = AppThree("Tesla", "Model S", 2020)
    // output
    a1.output()
    a2.output()
    a3.output()
}