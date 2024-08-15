class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        val answer = StringBuilder()
        val remain = MutableList<Int>(my_string.length){ it }.filter { !indices.contains(it) }

        for (i in remain){
            answer.append(my_string[i])
        }
        
        return answer.toString()
    }
}