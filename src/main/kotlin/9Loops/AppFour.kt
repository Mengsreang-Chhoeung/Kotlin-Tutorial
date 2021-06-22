package `9Loops`

fun main(){
    // using for loop with array of numbers
    val nums: Array<Int> = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }

    // using for loop with array of strings
    val cars: Array<String> = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }
}