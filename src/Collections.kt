import java.util.*

fun main(args: Array<String>) {
    println("Collections with Kotlin")


    // This is kind immutable list we cannot add the value in the list
    // This does works like Array
    println("............Array...................")
    val listOfImmutable = listOf("Apple", "Mango", "Banana", "Grapes", "Pine Apple", "Water Melon")

    println(listOfImmutable)
    // Sorting the list
    println(listOfImmutable.sorted())

    // Checking with Index Value
    val randomIndex = Random().nextInt(listOfImmutable.count())
    println("Random Index $randomIndex")
    // We can use the both ways to get the value at particular index

    println(listOfImmutable[randomIndex])
    println(listOfImmutable.get(randomIndex))

    println("------------------")

    val iterator = listOfImmutable.listIterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println("............ArrayList...................")
    //This is kind Mutable list we can add the value in the list
    // We can perform all the operation same as Arraylist in the Java
    // Check All the operation in kotlin by un-comment below line
    val listOfMutableData = arrayListOf("Apple", "Mango", "Banana")
    //listOfMutableData.
    println(listOfMutableData)

    println(listOfMutableData[1])
    println(listOfMutableData.get(1))


    listOfMutableData.add("Water Melon")
    println(listOfMutableData)
    val sortedList = listOfMutableData.sorted()
    println(sortedList)


    // Map Kind if Immutable map
    println()
    println("...........Map......................")
    val listImmutablePhoneNumber = mapOf("Abc" to 12345, "Xyz" to 98)
    println(listImmutablePhoneNumber)
    println(listImmutablePhoneNumber.get("Abc"))
    println(listImmutablePhoneNumber["Abc"])
    println(listImmutablePhoneNumber.getOrDefault("abc", "Not Exist"))
    println(listImmutablePhoneNumber.getOrElse("abc", { 1 }))
    println()
    println("...........HashMap......................")

    val listMutablePhoneNumber = hashMapOf("Abc" to 12345, "Xyz" to 98)
    println(listMutablePhoneNumber)
    listMutablePhoneNumber["Abc"] = 123
    println(listMutablePhoneNumber["Abc"])

    listMutablePhoneNumber["EFG"] = 10 // Can also some other alternative operation to add like put
    println(listMutablePhoneNumber)

    println(listMutablePhoneNumber.isEmpty())

}