class Solution {
    fun solution(s: String): String {
        var answer = StringBuilder()
        for (c in 0 until s.length) {
            if (c == 0 || s[c - 1] == ' ') {
                answer.append(s[c].toUpperCase())
            } else {
                answer.append(s[c].toLowerCase())
            }
        }
        return answer.toString()
    }
}