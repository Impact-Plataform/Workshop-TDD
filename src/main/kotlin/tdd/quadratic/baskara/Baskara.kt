package tdd.quadratic.baskara

import java.math.BigDecimal

interface Baskara {
    fun calculate(a: BigDecimal, b: BigDecimal, c: BigDecimal): List<BigDecimal>
}