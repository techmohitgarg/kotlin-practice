fun main(args: Array<String>) {
    val listOfitems = listOf("Apple", "Mango", "Banana", "Grapes", "Pine Apple", "Water Melon")

    for (item in listOfitems) {
        println(item)
    }

    val listMutablePhoneNumber = hashMapOf("Abc" to 12345, "Xyz" to 98)
    for ((key, value) in listMutablePhoneNumber) {
        println("$key  : $value")
    }


    var i = 0
    while (i < listOfitems.count())
        println(listOfitems[i++])
}
