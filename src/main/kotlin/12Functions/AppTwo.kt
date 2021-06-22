package `12Functions`

// declare function with parameter
fun myFunction(fname: String) {
    println(fname + " Doe")
}

// declare function with multiple parameters
fun myFunctionTwo(fname: String, age: Int) {
    println(fname + " is " + age)
}

fun main(){
    // invoke or call function with parameter
    myFunction("John")
    myFunction("Jane")
    myFunction("George")

    // invoke or call function with multiple parameters
    myFunctionTwo("John", 35)
    myFunctionTwo("Jane", 32)
    myFunctionTwo("George", 15)
}