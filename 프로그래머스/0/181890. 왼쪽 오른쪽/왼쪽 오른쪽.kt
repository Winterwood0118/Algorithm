class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        val answer: Array<String> = arrayOf<String>()
        for((i, c) in str_list.withIndex()){
            if(c == "l"){
                return Array<String>(i){ str_list[it] }
            } else if(c == "r") {
                return Array<String>(str_list.lastIndex - i){ str_list[i + it + 1] }
            }
        }
        return answer
    }
}