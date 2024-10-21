class Solution {
    fun solution(n: Int): Int {
        val answer = IntArray(n){ getDivisors(it + 1) }
        return answer.count { it > 2 }
    }
    
    private fun getDivisors(n: Int): Int {
        if(n < 2) return 1
        
        var count = 0
        
        for(i in 1..n){
            if(n % i  == 0) count ++
        }
        
        return count
    }
}