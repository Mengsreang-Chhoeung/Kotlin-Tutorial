package `12Functions`

// declare return value function
fun myFunctionFour(x: Int): Int {
    return (x + 5)
}

// declare return value function with default value
fun myFunctionFive(x: Int, y: Int = 10): Int {
    return (x + y + 5)
}

fun main(){
    // invoke or call return value function
    var result = myFunctionFour(3)
    println(result)
    result = myFunctionFour(6)
    println(result)

    // invoke or call return value function with default value
    result = myFunctionFive(x = 10)
    println(result)
    result = myFunctionFive(x = 20, y = 30)
    println(result)
}