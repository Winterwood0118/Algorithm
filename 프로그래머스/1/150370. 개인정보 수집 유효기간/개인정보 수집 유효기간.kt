class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val privaciesPair = privacies.map { i ->
            i.substring(0..9).split(".").map { it.toInt() }.let {list ->
                (((list[0]-2000)* 12) + list[1]) * 28 + list[2]
            } to i.last()
        }.toMutableList()
        val todayValue = today.split(".").map { it.toInt() }.let {list ->
            (((list[0]-2000) * 12) + list[1]) * 28 + list[2]
        }
        var answer: IntArray = intArrayOf()

        for (i in privaciesPair.indices){
            for (j in terms){
                if(privaciesPair[i].second == j[0]){
                    privaciesPair[i] = privaciesPair[i].first + j.substring(2).toString().toInt()*28 to privaciesPair[i].second
                }
            }
        }
        privaciesPair.forEachIndexed{ idx, c ->
            if (c.first <= todayValue) answer += idx+1
        }

        return answer
    }
}