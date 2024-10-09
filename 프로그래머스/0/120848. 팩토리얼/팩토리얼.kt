class Solution {
    fun solution(n: Int): Int {
        var temp = 1
        var count = 2
        
        while(true){
            temp *= count
            if(temp == n) return count
            else if(temp > n) return count - 1
            count ++
        }
        
        return 0
    }
}