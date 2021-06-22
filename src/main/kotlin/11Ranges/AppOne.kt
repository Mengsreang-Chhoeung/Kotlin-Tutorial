package `11Ranges`

fun main(){
    // Print the whole alphabet
    for (chars in 'a'..'z') {
        println(chars)
    }

    // ranges of numbers from 5 to 15
    for (nums in 5..15) {
        println(nums)
    }

    // using break keyword in ranges
    for (nums in 5..15) {
        if (nums == 10) {
            break
        }
        println(nums)
    }

    // using continue keyword in ranges
    for (nums in 5..15) {
        if (nums == 10) {
            continue
        }
        println(nums)
    }
}