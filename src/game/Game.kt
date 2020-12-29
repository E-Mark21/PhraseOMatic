package game

fun main() {
    val options = arrayOf("Камень", "Ножницы", "Бумага")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        print("Пожалуйста введите один из вариантов:")
        for (item in optionsParam) print(" $item")
        println(".")
        val userInput = readLine()
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("Ты должен вести один и предложенных вариатнов.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    if (userChoice == gameChoice) result = "Ничья!"
    else if ((userChoice == "Камень" && gameChoice == "Ножницы") ||
            (userChoice == "Бумага" && gameChoice == "Камень") ||
            (userChoice == "Ножницы" && gameChoice == "Бумага")) result = "Ты победил!"
    else result = "Ты проиграл!"
    println("Ты выбрал $userChoice. Я выбрал $gameChoice. $result")
}