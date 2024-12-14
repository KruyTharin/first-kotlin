const val PI = 3.14 // final static

fun main() {
    var name: String =  "JAME"
    name= "test"
    var optional : String? = null;

    val cannotChange: String = "cannotChange" // final
    var age: Int =  10

    var concatString: String = name + age.toString();
    var stringInterpolation: String  = "Name: $name  Age: $age"

    // %s for string
    val email = """
        Welcome to %s
        How are you
    """.trimIndent()

    println(email.format("KOTLIN"))
    println("Name: ${name.lowercase()} Age: $age")
    println("".isEmpty())
}