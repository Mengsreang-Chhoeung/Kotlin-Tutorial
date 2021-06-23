package `2Variables`

fun main(){
    /* -----------------------------------------------------
     *  val name: String = "John"
     *  name = "Robert"  // Error (Val cannot be reassigned)
     *  println(name)
     * ----------------------------------------------------- */

    // When using var, you can change the value whenever you want...
    var name: String = "John"
    name = "Robert"
    println(name)
}