import java.util.Stack
class Solution {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val endTime = 24 * 60 - 1 // 23시 59분을 분으로 변경
        val record = records
            .map { it.split(" ") }// " " 기준으로 스트링을 자름
            .sortedBy { it[1] } // 차량 번호를 오름차순으로 정리
            .map { strings -> // 시간 데이터를 분단위로 변경
                listOf(
                    strings[0].split(":").let { it[0].toInt() * 60 + it[1].toInt() }.toString(),
                    strings[1],
                    strings[2]
                )
            }.groupBy { it[1] } // 차량 번호로 그룹화

        for (i in record) { 
            val stack = Stack<Int>()
            var times = 0
            for (j in i.value) { // 그룹화 된 데이터에 대해서 차량 번호 별로 출입기록을 확인
                if (j[2] == "IN") { // IN이면 분단위로 바뀐 시간을 스택에 넣음
                    stack.add(j[0].toInt())
                } else { // IN이 아니면 스택에서 빼고 몇분 있었는지 times에 더함(IN하지 않고 OUT하는 경우는 없으므로)
                    times += j[0].toInt() - stack.pop()
                }
            }
            if (stack.size == 1) { // OUT 기록이 없는경우 23시 59분 OUT으로 취급하여 시간을 더함
                times += endTime - stack.pop()
            }
            var charge = fees[1] // 기본요금
            if (times > fees[0]) {
                // 올림처리 방법 -> 간단하게 Ceil 이용해서 올림하는 방법 있음
                val timeCeil = (times - fees[0] + fees[2] - 1) / fees[2] 
                charge += timeCeil * fees[3] 
            }
            answer += charge
        }
        return answer
    }
}