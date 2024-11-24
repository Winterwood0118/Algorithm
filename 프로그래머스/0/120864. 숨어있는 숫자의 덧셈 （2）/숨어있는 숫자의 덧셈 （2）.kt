class Solution {
    fun solution(my_string: String): Int {
        val numbers = Regex("\\d+").findAll(my_string).map { it.value.toInt() }
        return numbers.sum()
    }
}