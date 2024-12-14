fun main(){
    val names = arrayOf(
        "Rin",
        "Rak",
        "Bruno Mars"
    )

    if("Brono Murs" in names){
        println("Founded")
    }
    println(names[0])
    println(names.contentToString())


    // Nullable Array
    val arrayOfNull = arrayOfNulls<String>(5)
    arrayOfNull[0] = "Hi"

    println(arrayOfNull)
}


