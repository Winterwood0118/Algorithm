class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        val answer = Array<String>(quiz.size){ idx -> 
            quiz[idx].split(" ").let { 
                var result = 0
                when(it[1]){
                    "+" -> result = it[0].toInt() + it[2].toInt()
                    "-" -> result = it[0].toInt() - it[2].toInt()
                    else -> result = 0
                }
                
                if(result == it[4].toInt()) "O"
                else "X"
            }
        }
                
        return answer
    }
}