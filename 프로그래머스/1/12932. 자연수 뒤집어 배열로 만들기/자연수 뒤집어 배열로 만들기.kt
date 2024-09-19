class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        answer = n.toString().reversed().map{ e -> e.toInt()-48}.toIntArray()
        return answer
    }
}