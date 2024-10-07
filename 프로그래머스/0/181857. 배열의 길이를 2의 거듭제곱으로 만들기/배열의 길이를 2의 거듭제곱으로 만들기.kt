class Solution {
    fun solution(arr: IntArray): IntArray {
        var size = 1
        
        while(size < arr.size){
            size *= 2
        }
        return IntArray(size){ if(it < arr.size) arr[it] else 0 }
    }
}