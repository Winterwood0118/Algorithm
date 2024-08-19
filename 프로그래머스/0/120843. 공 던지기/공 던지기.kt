class Solution {
    //1 3 5 7 9 11 2 
    fun solution(numbers: IntArray, k: Int): Int {
        var answer = (2 * k - 1) % numbers.size
        if(answer == 0) answer = numbers.size
        return answer
    }
}