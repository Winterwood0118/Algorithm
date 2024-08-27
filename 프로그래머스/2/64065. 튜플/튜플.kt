class Solution {
    fun solution(s: String): List<Int> {
        val answer = mutableListOf<Int>()
        val sList = s.split("},{").filter{ it.isNotBlank() }.map{ group ->
            group.replace("{", "").replace("}", "").split(",").filter{ it.isNotBlank() }.map{ it.toInt() }
        }.sortedBy{ it.size }
                
        for(tList in sList){
            val newList = tList.filterNot{ it in answer } 
            answer.add(newList[0])
        }
        
        return answer
    }
}