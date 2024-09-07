import java.util.Stack
class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer: IntArray = IntArray(numbers.size) { -1 }
        val numbersWithIndex = numbers.mapIndexed { i, c -> i to c }.toTypedArray()
        val stack = Stack<Pair<Int, Int>>()
        for (i in numbersWithIndex) {
            if (stack.isEmpty()) stack.push(i)
            else {
                var peek = stack.peek()
                while (peek.second < i.second) {
                    answer[peek.first] = i.second
                    stack.pop()
                    if (stack.isEmpty()) break
                    peek = stack.peek()
                }
                stack.push(i)
            }
        }

        return answer
    }
}