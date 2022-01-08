package tdd.quadratic.baskara

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class DeltaTest {

    @Test
    fun `deve retornar 49`() {
        val a = BigDecimal(1)
        val b = BigDecimal(-1)
        val c = BigDecimal(-12)
        val expected = 49

        val result = Delta.calculate(a, b, c)
        Assertions.assertEquals(expected,result)
    }
}