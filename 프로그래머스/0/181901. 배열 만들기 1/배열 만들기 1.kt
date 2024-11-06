class Solution {
    fun solution(n: Int, k: Int): IntArray {
        return IntArray(n / k){ (it + 1) * k }
    }
}