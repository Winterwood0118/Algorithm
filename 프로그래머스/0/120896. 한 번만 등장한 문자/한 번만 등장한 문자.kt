class Solution {
    fun solution(s: String): String {
        return s.filter{ c -> 
            s.count { it == c } == 1 
        }.sort()
    }
    
    fun String.sort(): String{
        return this.toCharArray().sorted().joinToString("")
    }
}