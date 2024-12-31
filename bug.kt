fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 3 }
    println(list) // Output: [1, 2, 3]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 3 }
    println(set) // Output: [1, 2, 3]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    map.removeIf { it.key > 3 }
    println(map) // Output: {1=one, 2=two, 3=three}
}