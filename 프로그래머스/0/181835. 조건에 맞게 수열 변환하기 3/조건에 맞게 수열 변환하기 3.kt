class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        return IntArray(arr.size){
            if(k % 2 == 0){
                arr[it] + k
            }else {
                arr[it] * k
            }
        }
    }
}