class Solution {
    fun solution(my_string: String): String {
        var answer: String = my_string.toSet().joinToString("")
        return answer
    }
}