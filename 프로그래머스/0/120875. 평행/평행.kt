class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val slopes = listOf(
            getSlope(dots[0], dots[1]),
            getSlope(dots[0], dots[2]),
            getSlope(dots[0], dots[3]),
            getSlope(dots[1], dots[2]),
            getSlope(dots[1], dots[3]),
            getSlope(dots[2], dots[3])
        )
        
        return if(slopes[0] == slopes[5] || slopes[1] == slopes[4] || slopes[2] == slopes[3]) 1 else 0
    }
    
    private fun getSlope(dot1: IntArray, dot2: IntArray): Double{
        val xGap = dot1[0] - dot2[0]
        val yGap = dot1[1] - dot2[1]
        
        return if(yGap == 0) Double.POSITIVE_INFINITY
        else (xGap.toDouble() / yGap.toDouble())
    }
}
