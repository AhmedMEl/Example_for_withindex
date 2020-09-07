fun main() {
    val withIndexArray = arrayOf("Ahmed", "Ali", "Saleh")
    for (element in withIndexArray) {
        print("$element ")
    }

    for ((index, element) in withIndexArray.withIndex()) {
        println("Item at $index is $element\n")
    }
//    *********************************************

    val withIndexListOf = listOf(10,20,40)
    for (number in withIndexListOf) {
        println(number)
    }

    for ((index, value) in withIndexListOf.withIndex()) {
        println("$index: $value")
    }
}