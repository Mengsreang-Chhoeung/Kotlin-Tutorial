package `12Functions`

// declare return value function with a short way
fun myFunctionSix(x: Int, y: Int) = x + y

// declare return value function with a short way(default value)
fun myFunctionSeven(x: Int, y: Int = 30) = x + y

fun main(){
    // invoke or call return value function with a short way
    var result = myFunctionSix(3, 6)
    println(result)
    result = myFunctionSix(6, 9)
    println(result)

    // invoke or call return value function with a short way(default value)
    result = myFunctionSeven(x = 10)
    println(result)
    result = myFunctionSeven(x = 20, y = 30)
    println(result)
}