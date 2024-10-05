fun main() {

    /** IF STATEMENT *//* Works similarly to other languages but can also return values. */

    val number = 5

    if (number > 0) {
        println("Positive number")
    } else {
        println("Negative number")
    }

    val value = 6
    println(if (value > 5) "Greater than 5" else "Less than 5")

    /** WHEN STATEMENT *//* Similar to switch in other languages but more powerful. */

    val day = 5
    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        in 4..5 -> "Weekday"
        else -> "Weekend"
    }
    println("Day $day is $dayName")

    /** FOR LOOP *//* Used to iterate over a range, array, or a collection. */

    /** 1..5 is a range in Kotlin. It represents a sequence of numbers starting from 1 and ending at 5, inclusive. */
    for (i in 1..5) {
        println(i)
    }
    println()

    /** WHILE LOOP *//* Executes a block of code repeatedly as long as a given condition is true. */

    var count = 3
    while (count > 0) {
        println("Count: $count")
        count--
    }


}

