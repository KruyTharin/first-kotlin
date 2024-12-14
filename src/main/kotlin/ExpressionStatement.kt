fun main() {
    val gender = ""
    val age = 19

    // Like while loop
    val g = when(gender){
        "F" -> println("Female")
        "M" -> println("Male")
        else -> {
            println("GAY")
        }
    }

    val a = when(age){
        in 13..17 -> println("Teenager")
        !in 0..12 -> println("Adult")
        else -> println("Kid")
    }

    println("age $a")
    println("gender $g")
}