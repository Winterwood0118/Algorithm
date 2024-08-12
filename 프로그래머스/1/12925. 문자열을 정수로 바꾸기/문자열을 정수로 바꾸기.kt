class Solution {
    fun solution(s : String):Int{
        var answer:Int = 0
        if(s.length in 1..5){
            when(s.get(0)){
                '-' -> { answer = 0
                    for (i in 1 until s.length) {
                        answer *= 10
                        answer += s.get(i).toString().toInt()
                    }
                    answer *= (-1)
                    }
                '+' -> { answer = 0
                    for (i in 1 until s.length) {
                        answer *= 10
                        answer += s.get(i).toString().toInt()
                    }
                }
                else -> { answer = 0
                    for (i in s.indices) {
                        answer *= 10
                        answer += s.get(i).toString().toInt()
                    }
                }
            }
        }
        return answer
    }
}