package dayOne

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals

internal class DayOneKtTest {
    @BeforeEach
    fun setUp() {
    }

    @Test
    internal fun dayOnePartOneSmaller() {
        val expected = 514579
        val actual = dayOneImpl(
            File("src/main/resources/day-one/test-input.txt")
        )

        assertEquals(expected, actual)
    }

    @Test
    internal fun dayOnePartOne() {
        val expected = 1013211
        val actual = dayOneImpl(
            File("src/main/resources/day-one/day-one-input.txt")
        )

        assertEquals(expected, actual)
    }

    @Test
    internal fun dayOnePartTwo() {
        //
    }
}
