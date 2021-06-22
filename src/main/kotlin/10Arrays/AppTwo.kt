package `10Arrays`

fun main(){
    // Check if an Element Exists by using in
    val nums = arrayOf(2, 4, 6, 8)
    if (2 in nums) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    // Loop Through an Array
    val carTwo = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in carTwo) {
        println(x)
    }
}