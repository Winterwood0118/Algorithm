class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        return if(arr.size % 2 ==0){
            IntArray(arr.size){
                if(it % 2 == 0) arr[it] else arr[it] + n
            }
        } else {
            IntArray(arr.size){
                if(it % 2 == 0) arr[it] + n else arr[it]
            }
        }
    }
}