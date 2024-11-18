class Solution {
    fun solution(strArr: Array<String>): Int {
        return strArr.groupBy{ it.length }.maxOf{ it.value.size }
    }
}