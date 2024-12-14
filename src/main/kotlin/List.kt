fun main() {

    // like arrayList in java
    val names: List<String> = listOf(
        "Peter",
        "Bruno Mars",
        "James"
    )

    println(names.contains("Peter"))
    println(names.size)
    println(names.get(1))

    // that mean we can mutate array from the about list
    val mutateNames: MutableList<String>  = mutableListOf(
        "Peter",
        "Bruno Mars",
        "James"
    )

    mutateNames.add("Eric")
    mutateNames.add(0, "Alex")
    mutateNames.remove("Peter")
    println(mutateNames)
}