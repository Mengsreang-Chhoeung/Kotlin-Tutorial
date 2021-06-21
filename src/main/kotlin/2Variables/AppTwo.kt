package `2Variables`

fun main(){
    // This works fine
    var name: String
    name = "John"
    println(name)

    // This will generate an error:
    /* ----------------------------
     *  var birthYear
     *  name = "John"
     *  println(name)
     * ----------------------------*/
}