class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        val numer = numer1 * denom2 + numer2 * denom1
        val denom = denom1 * denom2
        val gcd = getGcd(numer, denom)

        return intArrayOf(
            numer / gcd,
            denom / gcd
        )
    }
    
    fun getGcd(num1: Int, num2: Int): Int{
        for(i in num1 downTo 1){
            if(num1 % i == 0 && num2 % i == 0){
                return i
            }
        }
        return 1
    }
}