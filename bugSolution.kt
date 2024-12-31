The `removeIf` function iterates through collections, removing elements based on the predicate. However, the way it handles iteration differs subtly between lists, sets, and maps.

* **Lists:** Iterates sequentially, removing elements in place.  This is generally intuitive.
* **Sets:**  Iteration order is not guaranteed.  The impact is minimal unless you rely on specific order.
* **Maps:**  Iterates through entries (key-value pairs). Removing an entry using the `removeIf` predicate directly modifies the map in place.

The solution is to be aware of these differences. For lists, you'll get predictable behavior.  For sets and maps, be cautious if the iteration order matters.  Consider alternative approaches such as creating a new collection, if strict control over the iteration is necessary.

// Example solution focusing on explicit iteration
fun main() {
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val newMap = mutableMapOf<Int, String>()
    for ((key, value) in map) {
        if (key <=3) {
            newMap[key] = value
        }
    }
    println(newMap) // Output: {1=one, 2=two, 3=three}
}
