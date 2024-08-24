// DiceRunGame.kt
import java.util.*
// Creating and Calllling a function.
fun main() {
    //Declaring the useful variaables.
    val scanner = Scanner(System.`in`)
    println("Welcome to the world of DiceRun!")
    print("What's your name? ")
    val playerName = scanner.nextLine()
    // Giving the Greeting message to the user.
    println("Hello, $playerName! Prepare for an exciting dice adventure.")
    println("Roll the dice and see where fate takes you!")
    // Simulate a dice throw (random number between 1 and 6)
    val random = Random()
    val diceResult = random.nextInt(6) + 1

    println("Rolling the dice...")
    Thread.sleep(1000) // Add a little suspense!
    println("You rolled a $diceResult!")

    // Customized message based on the player's name
    if (playerName.length > 5) {
        println("Wow, $playerName! Your name is quite impressive.")
    } else {
        println("Nice to meet you, $playerName!")
    }

    println("May luck be on your side!")
}
