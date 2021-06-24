package `7IfElseStatements`

fun main(){
     // Less than ( < )
     if(4 < 5) {
     	println("yes");
     }

     // Greater than ( > )
     if(5 > 4) {
     	println("yes")
     }

     // Greater than or equal to ( >= )
     if(5 >= 5){
     	println("yes")
     }

     // Less than or equal to ( <= )
     if(5 <= 5){
     	println("yes")
     }

     // Not equal ( != )
     if(5 != 5) {
     	println("yes")
     }else{
     	println("no")
     }

     // Equal to ( == )
     if(5 == 5) {
     	println("yes")
     }

    // Logical or ( || )
    if(5 == 5 || 4 == 5){
        println("yes")
    }else{
        println("no")
    }

    // Logical and ( && )
    if(5 == 5 && 4 == 4){
        println("yes")
    }else{
        println("no")
    }

    // Logical not ( ! )
    if(!(5 == 5 && 4 == 4)){
        println("no")
    }else{
        println("yes")
    }
}