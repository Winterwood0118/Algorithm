class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)
        if(n in 1..1000){
            for(i in 1..n){
                answer[i-1] = i*x.toLong()
            }
        }
        return answer
    }
}