import java.math.*

class Solution {
    fun solution(balls: Int, share: Int): Int {
        return (factorial(balls) / (factorial(share) * (factorial(balls - share)))).toInt()
    }

    private fun factorial(n: Int): BigInteger {
        var result = BigInteger("1")

        for(i in 1..n){
            result *= i.toBigInteger()
        }

        return result
    }
}