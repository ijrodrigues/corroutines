import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    for (i in 1..50) {
         launch { createUser(i) }
    }
}



private suspend fun createUser(id: Int) {
    delay(5000)
    println("User created id = $id")
}
