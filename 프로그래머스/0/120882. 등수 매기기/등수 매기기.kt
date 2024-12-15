class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        val scoreList = score.map{
            it[0] + it[1]
        }.sortedDescending()
        
        return IntArray(score.size){
            scoreList.indexOf(score[it][0] + score[it][1]) + 1
        }
    }
}