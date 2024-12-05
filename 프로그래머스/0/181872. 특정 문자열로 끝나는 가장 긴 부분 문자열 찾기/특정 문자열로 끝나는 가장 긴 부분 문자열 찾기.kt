class Solution {
    fun solution(myString: String, pat: String): String {
        val patIndex = myString.lastIndexOf(pat) + pat.length
        return myString.slice(0 until patIndex)
    }
}