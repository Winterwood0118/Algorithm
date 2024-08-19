class Solution {
    fun solution(array: IntArray): IntArray {
        val answer: IntArray = IntArray(2){ 0 }
        val maxValue = array.maxOf { it }
        
        answer[0] = maxValue
        answer[1] = array.indexOf(maxValue)
        
        return answer
    }
}