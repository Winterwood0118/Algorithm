class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        return IntArray(numbers.size){
            if(direction == "left"){ 
                numbers[(it + 1) % numbers.size]
            } else{
                numbers[(it + numbers.size - 1) % numbers.size]
            }
        }
    }
}