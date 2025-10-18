fun main(){
    val s1: Shape = Shape(22.00, 25.00)
    val s2: Shape = Shape(2.00, 25.00)
    
    println(s1)
    val c1: Circle = Circle(2.5)
    
    println(c1)
    
    // in data classes toString, hasCode, equals and others methods are already overidden
    // data class is useful for creating model classes
}

data class Circle(val radius: Double) // must have to provide primary constructor

class Shape(private val width: Double, private val height: Double){

    val getWidth: Double
        get() = width
    
    val getHeight: Double
        get() = height
    
    init{
        require(width>0) {
            "width must be greater than 0"
        }
    }
    
    override fun equals(other: Any?): Boolean
    {
        if(other is Shape) if(other.width == this.width) return true
        return false
    }
}