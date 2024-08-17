class Solution {
    fun solution(myString: String): String {
        return myString.map{ it.toUpperCase() }.joinToString("")
    }
}