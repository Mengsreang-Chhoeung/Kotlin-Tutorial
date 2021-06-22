package `12Functions`

// declare function with parameters that have default value
fun myFunctionThree(fname: String = "Sok", age: Int) {
    println(fname + " Doe is " + age)
}

fun main() {
    // invoke or call function with parameters that have default value
    myFunctionThree(age = 21)
    myFunctionThree(age = 25)
    myFunctionThree("George", 36)
}