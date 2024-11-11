class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        val answer = StringBuilder()
        
        for(i in my_strings.indices){
            answer.append(my_strings[i].slice(parts[i][0]..parts[i][1]))
        }
        
        return answer.toString()
    }
}