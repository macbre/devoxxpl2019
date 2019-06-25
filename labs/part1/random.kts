// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.random/-random/index.html
import kotlin.random.Random

val randomValue = Random.nextInt(0, 100)

println("I picked a number from 0 to 100, Try to guess it.")
println("My random: ${randomValue}")

fun playAgain(randomValue:Int, attempt: Int) {
    val your_guess = readLine()?.toInt() ?: 0

    println("You entered ${your_guess}...")

    when {
        your_guess > randomValue -> { println("Aim low"); playAgain(randomValue, attempt+1) }
        your_guess < randomValue -> { println("Aim high"); playAgain(randomValue, attempt+1) }
        your_guess == randomValue -> println("You got it in ${attempt} attempts!")
    }

}

playAgain(randomValue, 1)
