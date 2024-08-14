class Solution {
    fun solution(rsp: String): String {
        println(rsp.split(""))
        var answer: String = rsp.split("").map{ 
            when(it){
                "0"-> "5"
                "2" -> "0"
                "5" -> "2"
                else -> ""
            }
        }.joinToString("")
        return answer
    }
}