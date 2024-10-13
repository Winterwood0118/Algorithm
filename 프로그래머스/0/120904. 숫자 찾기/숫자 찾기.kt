class Solution {
    fun solution(num: Int, k: Int): Int {
        val answer = num.toString().indexOf(k.toString())
        return if(answer == -1) answer else answer + 1
    }
}