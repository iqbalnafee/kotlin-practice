fun main(){

    // to call singleton object
    Database.connect()
}

// for singleton pattern

object Database{ //this is not class, this a single object of database
    fun connect() = println("connected to database")
}