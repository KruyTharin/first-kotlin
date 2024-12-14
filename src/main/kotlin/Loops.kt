fun main(){
    val names = listOf<String>(
        "Eric",
        "Junior",
        "James",
    )

    val gender = charArrayOf(
        'M',
        'F',
        'G'
    )

    for (index in gender.indices){
        println(gender[index])
    }
    for(name in names) println(name)

    for(i in 1..5) println(i)
    for(i in 5 downTo 1) println(i)

    // like skip 2 1->3->5
    for(i in 1..5 step 2) println(i)

    val name = "Amazing"
    for (n in name) println(n)
}