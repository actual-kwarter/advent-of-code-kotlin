import MainConstants.BASE_PATH
import dayOne.dayOneImpl
import java.io.File

fun main(args: Array<String>) {
    println(dayOneImpl(File("${BASE_PATH}/day-one/day-one-input.txt")))
}

object MainConstants {
    const val BASE_PATH = "src/main/resources/"
}
