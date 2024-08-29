import kotlin.math.max

class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var low = (left / n).toInt() + 1
        var culumn = (left % n).toInt() + 1
        val gap = (right - left).toInt() + 1
        val answer = Array(gap) {
            if (culumn > n) {
                low++
                culumn = 1
            }
            culumn++
            max(low, culumn - 1)
        }.toIntArray()
        return answer
    }

}