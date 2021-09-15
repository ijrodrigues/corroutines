fun main() {
    for (i in 1..10){
        createUser(i)
    }
}



private fun createUser(id : Int) {
    Thread.sleep(5000)
    println("User created id = $id")
}
