class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        
        answer += hp / 5 //장군개미 수
        val remain = hp % 5
        
        answer += remain / 3
        answer += remain % 3
        
        return answer
    }
}