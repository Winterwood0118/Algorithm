class Solution {
    fun solution(order: Int): Int {
        var answer = 0
        var temp = order
        
        while(temp != 0){
            val remain = temp % 10
            temp /= 10
            
            if(remain == 3 || remain == 6 || remain == 9) answer ++
        }
        
        return answer
    }
}