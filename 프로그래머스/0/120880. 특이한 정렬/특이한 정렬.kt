class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        return numlist.map { 
            Pair<Int, Int>(it, if(it > n ) it - n else n - it ) 
        }.sortedByDescending { 
            it.first 
        }.sortedBy { 
            it.second 
        }.map { 
            it.first 
        }.toIntArray()
    }
}