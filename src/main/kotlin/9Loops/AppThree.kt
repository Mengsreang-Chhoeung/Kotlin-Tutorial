package `9Loops`

fun main(){
    // using break keyword
    var i: Int = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }
    }

    // using continue keyword
    var j: Int = 0
    while (j < 10) {
        if (j == 4) {
            j++
            continue
        }
        println(j)
        j++
    }
}