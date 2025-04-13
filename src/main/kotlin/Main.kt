package org.example

//you must specify the type of each parameter
fun myFunc(myName: String): String {
    return "Hello my name is $myName"
}

fun main() {
    var name = "John"
    var year = 2025

    //    The difference between var and val is that
    //    variables declared with the var keyword can be changed/modified, while val variables cannot.


    /* we can also declare a variable without assigning the value,
    and assign the value later. However, this is only possible when you specify the type:*/
    var myName: String
    myName = "Nafees"

    println("Hello " + myName)
    println("Hello $myName")

    /*The Byte data type can store whole numbers from -128 to 127.
    This can be used instead of Int or other integer types to save memory when
    you are certain that the value will be within -128 and 127*/

    val myByte: Byte = 100

    /*The Short data type can store whole numbers from -32768 to 32767: -2^15 to 2^15*/

    var txt: String = "Hello World"
    println(txt[0])

    // kotlin when
    val day = 7
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(result)

    /*Unlike Java and other programming languages, there is no traditional for loop in Kotlin.*/
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (num in nums)
        println(num)

    for (char in 'a'..'x')
        println(char)
}