class Solution {
    fun solution(myString: String): String {
        val answer = StringBuilder()
        
        myString.forEach{
            if(it < 'l') answer.append("l")
            else answer.append(it)
        }
        
        return answer.toString()
    }
}