class Solution {
    fun solution(arr: Array<IntArray>): Int {
        var answer: Int = 1
        
        for (i in arr.indices){
            for (j in i+1 until arr.size){
                if(arr[i][j] != arr[j][i]) {
                    answer = 0 
                    break
                }
            }
        }
        
        
        return answer
    }
}