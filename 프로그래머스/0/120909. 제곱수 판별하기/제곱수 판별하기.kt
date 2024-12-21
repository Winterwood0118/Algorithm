class Solution {
    fun solution(n: Int): Int {
        val sq = IntArray(1000){ (it + 1) * (it + 1) }
        return if(sq.contains(n)) 1 else 2
    }
}