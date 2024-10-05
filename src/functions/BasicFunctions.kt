package functions
/** BASIC FUNCTIONS */
/** Functions in Kotlin are declared using the fun keyword. */
fun greet(name: String): String {
    return "Hello, $name!"
}

fun main() {
    println(greet("Alice"))
}

/** name: String: This is a parameter for the function.
 * The function accepts a single parameter, name, which is of type String.
 * When the function is called, you must provide a String value.
 * : String: This specifies the return type of the function. The function is expected to return a String. */

/** $name syntax is used for string interpolation, meaning the value of the name parameter is inserted into the string.
 *  For example, if name is "Alice", the function will return "Hello, Alice!". */


