import org.omg.PortableInterceptor.SUCCESSFUL
import java.lang.Exception

fun main(args: Array<String>) {

    //fun <nameOfFunction>(<argument>:<argumentType>):<ReturnType>
    //making the simple function
    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    //Simple lambda function
    var sumWithLambda = { x: Int, y: Int -> x + y }
    // If we are define the type as well
    var sumWithType: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    println(sum(1, 2))
    println(sumWithLambda(1, 2))
    println(sumWithType(1, 2))

    // Inline Function
    // How to pass lambda as a parameter of another function

    fun downloadDataFromApi(url: String, success: () -> Unit) {
        // Call Api here
        // get the result here
        success() // This is empty function call like no argument function
    }

    //function call 1
    downloadDataFromApi("www.google.com", {
        println("Successfully Completed")
    })
    //function call 2
    //Difference b/w both call is we can define the lambda expersion outside the function
    downloadDataFromApi("www.google.com") {
        println("Successfully Completed")
    }

    fun downloadCarData(url: String, success: (Car) -> Unit) {
        // Call Api here
        // get the result here
        val tesla = Car("Tesla", "ModelS", "Red")
        success(tesla)
    }

    downloadCarData("www.google.com") { car ->
        car.details()
    }

    downloadTruckData("www.text.com",
            { truck, success ->
                if (success) {
                    truck?.details()
                }
            },
            { exception -> println(exception.message) }
    )

}

fun downloadTruckData(url: String, success: (Truck?, Boolean) -> Unit, error: (Exception) -> Unit) {
    val isMakeApiCallSuccess = true

    if (isMakeApiCallSuccess) {
        val truck = Truck("Ford", "F-150", 10000)
        success(truck, isMakeApiCallSuccess)
    } else {
        error(Exception("Truck Data is not available"))
    }

}