package tdd.quadratic.baskara

import java.math.BigDecimal

class Delta {
    companion object{
        fun calculate(a :BigDecimal , b: BigDecimal, c: BigDecimal): BigDecimal {
            val powB = b.pow(2)
            val fourTimesAC = BigDecimal(4).multiply(a).multiply(c)
            return powB.minus(fourTimesAC)
        }
    }
}
