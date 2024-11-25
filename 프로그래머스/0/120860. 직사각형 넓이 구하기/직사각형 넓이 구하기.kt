class Solution {
    fun solution(dots: Array<IntArray>): Int {
        val left = dots.minOf{ it[0] }
        val right = dots.maxOf{ it[0] }
        val top = dots.maxOf{ it[1] }
        val bottom = dots.minOf{ it[1] }
        return (right - left) * (top - bottom)
    }
}