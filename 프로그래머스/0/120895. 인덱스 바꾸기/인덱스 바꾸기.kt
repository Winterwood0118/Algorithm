class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        val answer = StringBuilder()

        for (i in my_string.indices) {
            answer.append(
                when (i) {
                    num1 -> my_string[num2]
                    num2 -> my_string[num1]
                    else -> my_string[i]
                }
            )
        }

        return answer.toString()
    }
}