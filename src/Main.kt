fun main() {

    /** In Kotlin, variables can be declared using var (mutable) or val (read-only). */

    /** IMMUTABLE VARIABLES */
    /** immutable, meaning that once a value is assigned, it cannot be changed. *//* val immutableVariable:String = 20; */

    /** If val is referencing a mutable object, the object itself can be modified: */
    val list = mutableListOf(1, 2, 3)
    list.add(4)  // The content of the list can be modified
    println(list)  // Output: [1, 2, 3, 4]


    /** MUTABLE VARIABLES */
    /** mutable, meaning its value can be changed after it has been initialized. */
    var mutableVariable: String = "Hello"
    println(mutableVariable)  // Output: Hello

    mutableVariable = "World"
    println(mutableVariable)  // Output: World

    /** TYPE INFERENCE */
    /** Kotlin can infer types, so explicit type declaration is optional. */

    var number = 10        // Type inferred as Int
    val message = "Hello"  // Type inferred as String

    println(number.javaClass)  // Output: Int
    println(message.javaClass)  // Output: class java.lang.String

    /** BASIC DATA TYPES */
    /** Kotlin has the following basic data types: */
    /* Numbers: Byte, Short, Int, Long, Float, Double */
    /* Characters: Char */
    /* Booleans: Boolean */
    /* Strings: String */

}