class Solution {
    fun solution(arr: IntArray): IntArray {
        val start = arr.indexOfFirst{ it == 2 }
        val end = arr.indexOfLast{ it == 2 }
        
        if (start == -1) return intArrayOf(-1)
        
        val result = arr.sliceArray(start..end)

        return result
    }
}