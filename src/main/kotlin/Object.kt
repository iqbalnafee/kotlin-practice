fun main(){

    // to call singleton object
    Database.connect()

    val listener: ButtonClickListener = object :ButtonClickListener(){
        override fun onClick(){
            println("Button Clicked from listener")
        }
    }
}

// for singleton pattern

object Database{ //this is not class, this a single object of database
    fun connect() = println("connected to database")
}

abstract class ButtonClickListener {
    abstract fun onClick()
}