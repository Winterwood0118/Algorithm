class Solution {
    fun solution(num: Int, total: Int): IntArray {
        val start = (total - num * (num - 1) / 2) / num
        return IntArray(num){ it + start }
    }
}