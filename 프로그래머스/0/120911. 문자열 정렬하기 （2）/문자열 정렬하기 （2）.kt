class Solution {
    fun solution(my_string: String): String {
        return my_string.map { it.lowercase() }.sorted().joinToString("")
    }
}