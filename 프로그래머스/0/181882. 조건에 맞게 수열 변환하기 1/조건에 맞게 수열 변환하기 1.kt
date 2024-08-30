class Solution {
    fun solution(arr: IntArray): IntArray {
        return IntArray(arr.size){ idx -> 
            if(arr[idx] % 2 == 0 && arr[idx] >= 50) arr[idx] / 2
            else if(arr[idx] % 2 == 1 && arr[idx] < 50) arr[idx] * 2
            else arr[idx]
        }
    }
}