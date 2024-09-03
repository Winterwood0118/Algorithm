class Solution {
    fun solution(seoul: Array<String>): String {
        var x : Int = 0
        for(i in 0 until seoul.size){
            if(seoul[i]=="Kim"){
                x = i
                break
            }
        }
        return "김서방은 ${x}에 있다"
    }
}