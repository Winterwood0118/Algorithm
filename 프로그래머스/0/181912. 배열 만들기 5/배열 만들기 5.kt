class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        return intStrs.map{ str -> 
            str.slice(s until s+l).toInt()
        }.filter{ i -> 
            i > k
        }.toIntArray()
    }
}