package `5StringMethods`

fun main(){
    // access the characters
    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)

    // length of a string
    var txtTwo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txtTwo string is: " + txtTwo.length)

    // string functions
    var txtThree = "Hello World"
    println(txtThree.toUpperCase())   // Outputs "HELLO WORLD"
    println(txtThree.toLowerCase())   // Outputs "hello world"

    // function compares two strings
    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))  // Outputs 0 (they are equal)

    // function returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)
    var txtFour = "Please locate where 'locate' occurs!"
    println(txtFour.indexOf("locate"))  // Outputs 7

    // String Concatenation
    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)

    // or can use plus function
    var firstNameSecond = "John "
    var lastNameSecond = "Doe"
    println(firstNameSecond.plus(lastNameSecond))

    // Multiline String
    var mulString: String = """
        Hello World
        and Bye
    """.trimIndent()
    println(mulString)
}