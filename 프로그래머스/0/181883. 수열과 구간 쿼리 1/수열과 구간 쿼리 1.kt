class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer: IntArray = arr
        for(i in queries){
            for(j in i[0]..i[1]){
                answer[j] ++
            }
        }
        return answer
    }
}