class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = numbers[0] * numbers[1] 
        
        for(i in 0 until numbers.size - 1){
            for(j in i + 1 until numbers.size){
                val result = numbers[i] * numbers[j]
                if(answer < result) answer = result
            }
        }
        
        return answer
    }
}