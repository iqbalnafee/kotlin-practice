package org.example

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
}