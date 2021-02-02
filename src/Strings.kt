fun main(args: Array<String>) {
    println("Introducing String here")

    val str = "Started practicing string here now will work on the all uses of string"
    println(str)

    val upperCase = str.toUpperCase()
    val lowerCase = str.toLowerCase()

    println(upperCase)
    println(lowerCase)

    val contentEquals = str.contentEquals("string here")
    println(contentEquals)

    val contains = str.contains("Now will", false)
    println(contains)

    // Raw string

    var rawString = """
        this is the sting
              hello there are the data 
            why are finding here 
                are you a developer
        
    """.trimMargin()
    println(rawString)
    // trimMargin will delete all the white space from the start for every line by add the "|" pipe this is the default symbol
    rawString = """
        |this is the sting
              |hello there are the data 
            |why are finding here 
                |are you a developer
    """.trimMargin()
    println(rawString)
    println()
    // either use "|"pipe as default or add any other symbol check the below example
    rawString = """
        -this is the sting
              -hello there are the data 
            -why are finding here 
                -are you a developer
    """.trimMargin("-")
    println(rawString)

    // Concatenation string

    val one = "1"
    val two = 2;
    val three = 3


    // This is the old method for cancaenation the string but kotlin give us the new method
    println("First " + one + " Second " + two + " Third " + three)

    println("First $one Second $two Third $three") //using the $ sign we can cancat


    val subSequence = str.subSequence(3, 10)
    println(subSequence)
}