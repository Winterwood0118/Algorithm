class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        return when(n){
            1 -> {
                num_list.slice(0..slicer[1]).toIntArray()
            }
            2 -> {
                num_list.slice(slicer[0]..num_list.lastIndex).toIntArray()
            }
            3 -> {
                num_list.slice(slicer[0]..slicer[1]).toIntArray()
            }
            else -> {
                num_list.slice(slicer[0]..slicer[1] step slicer[2]).toIntArray()
            }
        }
    }
}