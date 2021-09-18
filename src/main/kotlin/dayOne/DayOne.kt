package dayOne

import dayOne.DayOneConstants.TARGET
import java.io.File

fun dayOneImpl(inputFile: File): Int {
    println("Executing Day 1.")

    var numbers: List<Int> = inputFile.useLines {
        it.map { str: String -> Integer.parseInt(str) }.toList()
    }

    var answer = 0
    for (num: Int in numbers) {
        val difference = TARGET - num

        if (numbers.contains(difference)) {
            println("Match found: $num + $difference = $TARGET")
            answer = num * difference
            break
        }
    }

    return answer
}

object DayOneConstants {
    const val TARGET: Int = 2020
}
