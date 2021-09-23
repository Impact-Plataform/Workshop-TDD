package tdd.quadratic.baskara

import io.mockk.every
import io.mockk.mockkObject
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class QuadraticTest {

    @Test
    fun `should return the roots of the equation`() {
        Assertions.assertEquals(
            listOf(BigDecimal(4), BigDecimal(-3)), Quadratic().calculate(
                a = BigDecimal(1),
                b = BigDecimal(-1),
                c = BigDecimal(-12)
            )
        )
    }

    @Test
    fun `should return the roots of the equation using mock`() {
       mockkObject(Delta)
        every {
            Delta.calculate(
                a = BigDecimal(1),
                b = BigDecimal(-1),
                c = BigDecimal(-12)
            )
        } returns BigDecimal(49)
        Assertions.assertEquals(
            listOf(BigDecimal(4), BigDecimal(-3)), Quadratic().calculate(
                a = BigDecimal(1),
                b = BigDecimal(-1),
                c = BigDecimal(-12)
            )
        )
    }
}