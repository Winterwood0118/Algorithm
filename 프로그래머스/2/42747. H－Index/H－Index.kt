class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0

        val citationsGroup = citations
            .groupBy { it }
            .map { (k, v) -> k to v.size }
            .sortedByDescending { it.first }

        for (i in citationsGroup){
            answer += i.second
            if(answer > i.first) {
                answer -= i.second
                break
            }
        }

        return answer
    }
}