package tdd.quadratic.baskara

import java.math.BigDecimal

class Delta {
    companion object{
        fun calculate(a :BigDecimal , b: BigDecimal, c: BigDecimal): BigDecimal = BigDecimal.ONE  //b.pow(2).minus(BigDecimal(4).multiply(a).multiply(c))
    }
}