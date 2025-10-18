fun main(){
    try{
      val s1: Shape = Shape(22.00, 25.00)
      val s2: Shape = Shape(2.00, 25.00)
      println(s1.equals(s2))
    }
    catch(e: IllegalArgumentException){ // cannot write catch(val e: Exception), because catch block in Kotlin uses a parameter, not a property declaration
        println(e.message)
    }
}
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