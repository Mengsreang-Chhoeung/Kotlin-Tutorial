package `3DataTypes`

fun main(){
    // Type Conversion
    /* -----------------------------------
     *  val x: Int = 5
     *  val y: Long = x
     *  println(y) // Error: Type mismatch
     * --------------------------------- */

    // toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toString()

    // Int to Long
    val x: Int = 5
    val y: Long = x.toLong()
    println(y)

    // Long to Int
    val a: Long = 100000000L
    val b: Int = a.toInt()
    println(b)

    // Byte to Int
    val c: Byte = 10
    val d: Int = c.toInt()
    println(d)

    // Int to Byte
    val e: Int = 100
    val f: Byte = e.toByte()
    println(f)

    // Short to Int
    val g: Short = 200
    val h: Int = g.toInt()
    println(h)

    // Int to Short
    val i: Int = 400
    val j: Short = i.toShort()
    println(j)

    // Float to Double
    val k: Float = 1.345F
    val l: Double = k.toDouble()
    println(l)

    // Double to Float
    val m: Double = 3.56778
    val n: Float = m.toFloat()
    println(n)

    // Int to Double
    val o: Int = 3000
    val p: Double = o.toDouble()
    println(p)

    // Double to Int
    val q: Double = 34.567
    val r: Int = q.toInt()
    println(r)

    // Char to String
    val s: Char = 'A'
    val t: String = s.toString()
    println(t)

    // String to Char
    val u: String = "Hello World"
    val v: Char = u[0]
    println(v)

    // Int to String
    val w: Int = 3400
    val ww: String = w.toString()
    println(ww)

    // String to Double
    val z: String = "56.77"
    val zz: Double = z.toDouble()
    println(zz)
}