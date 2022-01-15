package tdd.quadratic.baskara

import java.math.BigDecimal
import java.math.MathContext

class Baskara {
    fun calculate(a: BigDecimal, b: BigDecimal, c: BigDecimal): Set<BigDecimal> {
        val twoTimesA = a.multiply(BigDecimal(2))
        val squareRootDelta = Delta.calculate(a,b,c).sqrt(MathContext(10))
        val minusB = b.negate()

        return setOf(
            minusB.plus(squareRootDelta).divide(twoTimesA),
            minusB.minus(squareRootDelta).divide(twoTimesA)
        )

    }
}
