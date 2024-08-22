class Solution {
    fun solution(my_string: String): List<String> {
        val answer = my_string.split(" ").filter{ it != " " && it != "" }
        return answer
    }
}