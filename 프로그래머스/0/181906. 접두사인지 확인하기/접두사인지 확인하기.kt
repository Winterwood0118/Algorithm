class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        return if(my_string[0] != my_string.replace(is_prefix, "1")[0]) 1 else 0
    }
}