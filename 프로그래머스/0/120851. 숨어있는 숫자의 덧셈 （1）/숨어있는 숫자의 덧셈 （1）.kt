class Solution {
    fun solution(my_string: String): Int {
        return my_string.filter{ it in ('0'..'9') }.sumOf { it.digitToInt() }
    }
}