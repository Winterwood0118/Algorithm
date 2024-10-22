class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        return arr.withIndex().indexOfFirst{ (i, int) -> int == 1 && i >= idx }
    }
}