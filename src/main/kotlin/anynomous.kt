/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    something("hello"){
        println("any thing function")
    }
    
    val anony: () -> Unit =   {
        println ("i am anonymous") // this function doesn't have any name
    }
    
    val  some = :: something
    some("hello2", {"println do anything"})
}

fun something(msg: String, action: () -> Unit) = println("$msg from something with ${action.invoke()}")
fun anything() = "anything"