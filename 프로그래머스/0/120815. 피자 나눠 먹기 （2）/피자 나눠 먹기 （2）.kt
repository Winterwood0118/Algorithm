class Solution {
    fun solution(n: Int): Int {
        var gcd = 1
        
        if(n % 2 == 0) gcd *= 2
        if(n % 3 == 0) gcd *= 3
        
        return n / gcd
    }
}