class Solution {
    fun solution(strArr: Array<String>) = strArr.toList().mapIndexed { i, str ->
        if(i % 2 == 0){
            str.toLowerCase()
        }else {
            str.toUpperCase()
        }
    }
}