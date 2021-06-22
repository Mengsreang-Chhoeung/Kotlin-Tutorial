package `6NumberMethods`

import kotlin.math.*

fun main(){
    // absolute value
    var a: Double = -4.5
    println(abs(a))

    // given value to an integer towards positive infinity
    var b: Double = 4.5
    println(ceil(b))

    // given value to an integer towards negative infinity
    var c: Double = 4.5
    println(floor(c))

    // given value to an integer towards positive or negative according to the floating number
    var d: Double = 4.5
    println(round(d))
    d = 4.6
    println(round(d))
    // round to int
    println(d.roundToInt())

    // returns the greater of two values
    var e: Double = max(4.5, 9.5)
    println(e)

    // returns the smaller of two values
    var f: Double = min(4.5, 9.5)
    println(f)

    // power of value
    var g: Double = 4.5
    println(g.pow(2))

    // positive square root value
    var h: Double = 25.0
    println(sqrt(h))

    // rounds the given value to an integer towards zero
    var i: Double = 3.5
    println(truncate(i))
}