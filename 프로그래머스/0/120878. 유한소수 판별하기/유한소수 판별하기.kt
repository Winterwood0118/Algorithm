class Solution {
    fun solution(a: Int, b: Int): Int {
        var temp = b
        
        while(temp % 5 == 0){
            temp = temp / 5
        }
        
        while(temp % 2 == 0){
            temp = temp / 2
        }
        
        return if(a % temp == 0 || temp % a == 0) 1 else 2
    }
}