import java.util.Stack

class Solution {
    fun solution(order: IntArray): Int {
        var answer: Int = 0 // n번째 표현
        val subContainer = Stack<Int>()
        var latestBox = 0
        for(i in 1..order.size){ // 박스 만들기
            if(i == order[answer]) answer ++ // i번 박스가 answer + 1 번째에 들어가는지 확인
            else subContainer.push(i)
            while(!subContainer.isEmpty()){
                latestBox = subContainer.pop()
                if(latestBox == order[answer]) answer ++
                else {
                    subContainer.push(latestBox) 
                    break
                }
            }
        }
        return answer
    }
}