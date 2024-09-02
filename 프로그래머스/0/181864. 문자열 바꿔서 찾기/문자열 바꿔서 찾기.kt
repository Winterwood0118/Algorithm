class Solution {
    fun solution(myString: String, pat: String): Int {
        val patSwap = pat.map{ if(it == 'A') 'B' else 'A'}.joinToString("")
        return if(myString.contains(patSwap)) 1 else 0
    }
}