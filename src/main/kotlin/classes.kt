fun main(){
   val s1: Shape = Shape(21.00, 22.00)
   println("width is ${s1.width} and height is ${s1.height}")
}

class Shape(private val width1: Double, private val height1: Double){
    val width: Double
    val height: Double
    init{
        width = width1
        height = height1
    }
}