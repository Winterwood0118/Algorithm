class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer = 0
        var temp = myString.indexOf(pat)

        while (temp != -1){
            answer ++
            temp = myString.indexOf(pat, temp + 1)
        }

        return answer
    }
}