package com.example.headfirstpractice


fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(gameChoice, userChoice)
}


fun getGameChoice(optionparam: Array<String>) =
    optionparam[(Math.random() * optionparam.size).toInt()]

fun getUserChoice(optionparam: Array<String>): String? {
    var isValidchoice = false
    var userchoice = ""
    while (!isValidchoice) {
        println("Please enter one of the following")
        for (item in optionparam) print(item)
        val userInput = readLine()
        if (userInput != null && userInput in optionparam) {
            isValidchoice = true
            userchoice = userInput
        }
        if (!isValidchoice) println("You must enter a valid choice")
    }
    return userchoice
}

fun printResult(gameChoice: String, userChoice: String?) {
    val result: String
    if (userChoice == gameChoice) result = "Tie"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") || (userChoice == "Paper" && gameChoice == "Rock") || (userChoice == "Scissors" && gameChoice == "Paper")) result =
        "You win"
    else result = "You Lose"
    println("You chopse $userChoice I chose $gameChoice result $result")
}

