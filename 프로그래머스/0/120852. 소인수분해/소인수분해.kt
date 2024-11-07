class Solution {
    fun solution(n: Int): IntArray {
        return (2..n).filter{ pf ->
            n % pf == 0 && (2..pf).filter{ p ->
                pf % p == 0
            }.size == 1 
        }.toIntArray()
    }
}