class Solution {
    fun solution(rsp: String) = rsp.split("").map{ 
            when(it){
                "0"-> "5"
                "2" -> "0"
                "5" -> "2"
                else -> ""
            }
        }.joinToString("")
}