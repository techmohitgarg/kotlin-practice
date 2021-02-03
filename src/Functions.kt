fun main(args: Array<String>) {
    println("Functions with Kotlin")

    testOK()

    withSingleArgument("Passing the Single argument value here")

    withMultipleArgument("Argument 1 Value here", 1)

    val result = returnSomething("Pass the Argument here")
    println(result)

    val sum = returnSomething(1, 2)
    println(sum)

    // Whenever we setting some default value in the function than we don't mandatory to pass the argument value
    // When we are passing the new value it will override the default value
    withDefaultValue()
    withDefaultValue("Hey Now i am passing new value")

    // When we have function with some default value and some  than we have to specify the value with name of argument
    // Calling function using different ways
    withDefaultValueOrNot(args1 = 1)
    withDefaultValueOrNot("", 1)
}

/**
 * This is the syntax for function when we don't have return type and argument also
 *
 * fun <nameOfFunction>(){}
 */

// Function with No argument
fun testOK() {
    println("Tested OK ")
}

/**
 * This is the syntax for function when we don't have return type
 *
 * fun <nameOfFunction>(<argument>:<argumentType>){}
 */

// Function with single argument
fun withSingleArgument(args: String) {
    println(args)
}

// Function with multiple argument we can add n number of argument as required like below add in the function
fun withMultipleArgument(args: String, args1: Int) {
    println(args)
}


/**
 * This is the syntax for function when we have return type
 *
 * fun <nameOfFunction>(<argument>:<argumentType>):<ReturnType>{}
 */

// Function will return the String result We can change the return type
fun returnSomething(args: String): String {
    return args
}

fun returnSomething(args: Int, args1: Int): Int {
    // Return the Integer value as result here because we have Integer type to return.
    return args + args1
}

//Function with default value
fun withDefaultValue(args: String = "AnyTime") {
    println(args)
}

fun withDefaultValueOrNot(args: String = "AnyTime", args1: Int) {
    println(args)
}

