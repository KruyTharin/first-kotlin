fun main() {
    var tv = smartDevice()
    tv.brand = "Samsung"
    tv.price = 100.00
    tv.turnOff()

    var phone = smartDevice()
    phone.brand = "Iphone"
    phone.price = 1200.00
    phone.turnOff()

    var headPhone = classWithContructor("Sony", 100.00, true)
    println("This${headPhone.brand} price is :${headPhone.price}")

}

class smartDevice{
    // properties
    var brand: String = ""
    var price: Double = 0.0

    // methods
    fun turnOn(){
        println("Turn on $brand")
    }

    fun turnOff() {
        println("Turn off $brand")
    }
}

class classWithContructor constructor(
    brand: String,
    price: Double,
    isOn: Boolean
){
    var brand: String = ""
    var price: Double = 0.0
    var isSwitchOn: Boolean = false
}