class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.slice(n-1..num_list.lastIndex).toIntArray()
    }
}