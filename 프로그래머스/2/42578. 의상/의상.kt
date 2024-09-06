class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val clothesGroup = clothes.groupBy { it[1] }

        for (i in clothesGroup) {
            answer *= i.value.size + 1
        }
        answer -= 1
        return answer
    }
}