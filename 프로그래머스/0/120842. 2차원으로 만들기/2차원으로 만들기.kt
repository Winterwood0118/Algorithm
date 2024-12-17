class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        return Array(num_list.size / n){ row ->
            IntArray(n){ col ->
                num_list[n * row + col]
            }
        }
    }
}