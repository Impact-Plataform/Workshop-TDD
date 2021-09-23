package tdd.quadratic.baskara

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class DeltaTest {

    @Test
    fun `should return the value of delta`() {
        Assertions.assertEquals(BigDecimal(49), Delta.calculate(
            a = BigDecimal(1),
            b = BigDecimal(-1),
            c = BigDecimal(-12)
        )
        )
    }
}