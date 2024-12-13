class Solution {
    fun solution(my_string: String, n: Int): String {
        val answer = StringBuilder()
        
        for(i in my_string){
            repeat(n){
                answer.append(i)
            }
        }
        
        return answer.toString()
    }
}