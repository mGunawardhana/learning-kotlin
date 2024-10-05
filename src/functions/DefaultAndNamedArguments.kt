package functions

/** DEFAULT AND NAME ARGUMENTS  */
/** Default arguments allow you to specify default values for function parameters. */
fun greet(name: String = "Guest", greeting: String = "Hello") {
    println("$greeting, $name!")
}

fun main() {
    greet()
    greet("Bob")
    greet(greeting = "Hi", name = "Charlie")
}

/**
 * name: String = "Guest": The name parameter is of type String and has a default value of "Guest".
 *  This means if you don't provide a name when calling the function, it will use "Guest" by default.
 *
 *  greeting: String = "Hello": Similarly, the greeting parameter is a String with a default value of "Hello".
 *  If no greeting is passed, "Hello" will be used.
 *  */

