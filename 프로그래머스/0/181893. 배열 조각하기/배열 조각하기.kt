class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer: List<Int> = arr.toList()
        
        for((i, c) in query.withIndex()){
            if(i % 2 == 0){
                answer = answer.slice(0..c)
            } else {
                answer = answer.slice(c..answer.lastIndex)
            }
        }
        
        return answer.toIntArray()
    }
}