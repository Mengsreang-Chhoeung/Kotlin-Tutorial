package `3DataTypes`

fun main(){
    val myGrade: Char = 'B'
    println(myGrade)

    // Unlike Java, you cannot use ASCII values to display certain characters. The value 66 would output a "B" in Java, but will generate an error in Kotlin
    /* -----------------------------------------------------------------------------------------------------------------------------------------------------
     *  val myLetter: Char = 66
     *  println(myLetter) // Error
     * ----------------------------------------------------------------------------------------------------------------------------------------------------- */

    val myText: String = "Hello World"
    println(myText)
}