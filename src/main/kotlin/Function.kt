fun main() {
    fun greeting(name: String, age: Int = 22){
        println("Hello 👋 $name")
    }

    println(greeting("Tharin"))


    // like callback function
    fun fetchData(callback: (response: String) -> Unit, endpoint: String) {
        println("Fetching data from endpoint: $endpoint...")

        Thread.sleep(1000)
        val fakeResponse = "Data from $endpoint"
        callback(fakeResponse)
    }

    fetchData(
        endpoint = "/api/user",
        callback = { response ->
            println("Received response: $response")
        }
    )

    // function with single expression
    fun double(n:Int) = n * 2

    

}