class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var recent = 0
        val sSplit = s.split(" ")
        
        for(i in sSplit){
            if(i == "Z"){
                answer -= recent
            } else{
                recent = i.toInt()
                answer += recent
            }
        }
        
        
        return answer
    }
}