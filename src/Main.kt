// DiceRunGame.kt
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Welcome to the world of DiceRun!")
    print("What's your name? ")
    val playerName = scanner.nextLine()

    println("Hello, $playerName! Prepare for an exciting dice adventure.")
    println("Roll the dice and see where fate takes you!")
    // Simulate a dice throw (random number between 1 and 6)
    val random = Random()
    val diceResult = random.nextInt(6) + 1

    println("Rolling the dice...")
    Thread.sleep(1000) // Add a little suspense!
    println("You rolled a $diceResult!")

    println("May luck be on your side!")
}
