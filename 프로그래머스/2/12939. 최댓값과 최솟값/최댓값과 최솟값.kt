class Solution {
    fun solution(s: String): String = s.split(" ").map { it.toInt() }.run { "${minOf{it}} ${maxOf{it}}" }
}