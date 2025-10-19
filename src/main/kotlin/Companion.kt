fun main(){

    // to call static like
    println(Calculator.pi)
    
}

// for static pattern, like java: public static float pi = 3.1416

class Calculator{
    companion object {
        val pi = 3.1416
    }
}