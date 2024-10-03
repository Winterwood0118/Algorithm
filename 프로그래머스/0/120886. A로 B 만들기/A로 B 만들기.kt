class Solution {
    fun solution(before: String, after: String): Int {
        val beforeGroup = before.groupBy{ it }
        val afterGroup = after.groupBy{ it }
        
        return if(beforeGroup == afterGroup) 1 else 0
    }
}