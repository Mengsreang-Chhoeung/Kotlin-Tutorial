package Collections.MutableList

fun main(){
    var arrNum: MutableList<Int> = mutableListOf<Int>(10, 40, 60, 30, 20)

    for ((index, item) in arrNum.withIndex()){
        println("Number ${index}: ${item}")
    }

    println("------------------------------------")

    arrNum.add(100)
    arrNum.add(200)
    arrNum.add(7, 300)

    for ((index, item) in arrNum.withIndex()){
        println("Number ${index}: ${item}")
    }

    println("------------------------------------")

    arrNum.remove(100)
    arrNum.remove(200)
    arrNum.removeAt(5)

    for ((index, item) in arrNum.withIndex()){
        println("Number ${index}: ${item}")
    }

    println("------------------------------------")

    var arrNumTwo: MutableList<Double> = mutableListOf<Double>(10.54, 30.52, 20.76, 50.43, 89.54)
    var arrNumThree: MutableList<Double> = mutableListOf<Double>()
    arrNumThree.addAll(arrNumTwo)

    for ((index, item) in arrNumThree.withIndex()){
        println("Number ${index}: ${item}")
    }

    println("------------------------------------")

    var arrNumFour: MutableList<Int> = mutableListOf<Int>()
    arrNumFour.addAll(arrNum)

    for ((index, item) in arrNumFour.withIndex()){
        println("Number ${index}: ${item}")
    }

    println("------------------------------------")

    arrNum.clear()
    println(arrNum)

    println("------------------------------------")

    arrNumThree.removeAll(arrNumTwo)
    println(arrNumThree)

    println("------------------------------------")

    var arrNumFive: MutableList<Int> = mutableListOf<Int>(10, 20, 30, 40, 50)

    arrNumFive.set(0, 100)

    for ((index, item) in arrNumFive.withIndex()){
        println("Number ${index}: ${item}")
    }

    println("------------------------------------")

    println(arrNumFive.subList(0, 3))
}