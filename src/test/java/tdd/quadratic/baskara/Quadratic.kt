package tdd.quadratic.baskara

import java.math.BigDecimal
import java.math.MathContext

class Quadratic {

    fun calculate(a: BigDecimal, b: BigDecimal, c: BigDecimal): List<BigDecimal> {
        val squareRootDelta = Delta.calculate(a, b, c).sqrt(MathContext(10))
        val twoTimesA = BigDecimal(2).multiply(a)
        val minusB = b.negate()
        return listOf<BigDecimal>(
            minusB.plus(squareRootDelta).divide(twoTimesA),
            minusB.minus(squareRootDelta).divide(twoTimesA)
            )
    }
}