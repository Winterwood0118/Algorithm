import kotlin.math.sqrt

class Solution {
    fun solution(n: Int, k: Int): Int = n.toString(k)
        .split("0")
        .filter { it != "" }
        .filter { it != "1" }
        .map { it.toLong() }
        .count { long1 ->
            (2..sqrt(long1.toDouble()).toLong()).count { long1 % it == 0L } == 0
        }
}