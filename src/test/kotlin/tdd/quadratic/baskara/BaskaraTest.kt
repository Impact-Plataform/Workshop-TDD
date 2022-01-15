package tdd.quadratic.baskara

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class BaskaraTest {

  @Test
  fun `deve retornar 4 e -3`(){
    val a = BigDecimal(1)
    val b = BigDecimal(-1)
    val c = BigDecimal(-12)
    val expected = setOf<BigDecimal>(BigDecimal(4), BigDecimal(-3))

    val result = Baskara().calculate(a, b, c)
    Assertions.assertEquals(expected, result)
  }

}
