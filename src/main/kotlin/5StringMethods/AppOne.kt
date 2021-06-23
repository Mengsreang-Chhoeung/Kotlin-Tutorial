package `5StringMethods`

fun main(){
    // access the characters
    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)
    println(txt.get(4)) // fifth element (o)

    // length of a string
    var txtTwo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txtTwo string are: " + txtTwo.length)
    println("The count of the txtTwo string are: " + txtTwo.count())

    // string functions
    var txtThree = "hello world"
    println(txtThree.toUpperCase())   // Outputs "HELLO WORLD"
    println(txtThree.toLowerCase())   // Outputs "hello world"
    println(txtThree.capitalize()) // Outputs "Hello World"
    println(txtThree.decapitalize()) // Outputs "hello world"

    // function compares two strings
    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2, ignoreCase = true))  // Outputs 0 (they are equal)
    println(txt1.equals(txt2, ignoreCase = true)) // Outputs true (they are equal)

    // function returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)
    var txtFour = "Please locate where 'locate' occurs!"
    println(txtFour.indexOf("locate"))  // Outputs 7

    // String Concatenation
    var firstName = "John"
    var lastName = "Doe"
    println(firstName + " " + lastName)
    println("${firstName} ${lastName}")

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

    var trimString: String = "             Hello World            "
    println(trimString.trim())

    // Cut String
    var str: String = "Hello my name is John Doe!"
    println(str.subSequence(17, 25)) // Outputs "John Doe"

    // Drop String
    var dropString: String = "Hello Kotlin"
    println(dropString.drop(6)) // Outputs "Kotlin"
    println(dropString.dropLast(7)) // Outputs "Hello"

}