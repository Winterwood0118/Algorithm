class Solution {
    fun solution(sides: IntArray): Int {
        return sides.sorted().let{
            (it[1] - it[0]) until (it[1] + it[0])
        }.count() - 1
    }
}