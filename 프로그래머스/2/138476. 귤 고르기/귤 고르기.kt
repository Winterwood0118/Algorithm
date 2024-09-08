class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var count = 0
        tangerine.groupBy { it }
            .map { it.key to it.value.count() }
            .sortedBy { it.second }
            .reversed()
            .forEach{
                count += it.second
                answer ++
                if(count >= k) return answer
            }
        return answer
    }
}