fun main(args: Array<String>) {
    println("Conditional Logic with kotlin")

    // Operators
    // == != <  >   <=   >=
    // Checking the condition based on Integer values and operators
    var a = 2
    var b = 2;

    if (a == b) {
        println("Condition is true and both are matching")
    }

    a = 3;
    if (a != b) {
        println("Condition is true and both are not matching")
    }

    val price = 50;
    val totalBalance = 100;
    if (totalBalance >= price) {
        println("We can buy the item")
    } else if (price in 39..81) { // Normal Java--> price >= 80 && price <= 40
        println("Item is in the budget")
    } else {
        println("Sorry,Bad Luck!")
    }


    // Checking the condtiion based on Boolean values
    val isHungry = true
    val isBoard = true;

    if (isHungry && isBoard) {
        println("Definitely go for pizza or something else")
    } else if (isHungry && !isBoard) {
        println("Go for pizza or something else if we want to eat")
    } else {
        println("This is your choice")
    }


    // using When

    val x = 5
    when (x) {
        1 -> println("1")
        2 -> println("2")
        3 -> println("3")
        4 -> println("4")
        5, 6 -> println("5 6 ") // this something here when we have more one condition to check and outout would be same
        else -> println("Nothing Match")
    }

    // Checking the string here

    val str1 = "Hello"
    val str2 = "hello"
    println(str1.equals(str2, false))

    println(str1 == str2)

}