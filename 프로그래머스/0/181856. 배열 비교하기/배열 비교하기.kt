class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        return if(arr1.size > arr2.size) 1
        else if(arr1.size < arr2.size) -1
        else if(arr1.sumOf{ it } > arr2.sumOf{ it }) 1
        else if(arr1.sumOf{ it } < arr2.sumOf{ it }) -1
        else 0
    }
}