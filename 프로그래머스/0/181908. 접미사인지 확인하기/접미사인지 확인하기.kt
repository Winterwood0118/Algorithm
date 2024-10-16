class Solution {
    fun solution(my_string: String, is_suffix: String): Int {
        val myString = my_string.reversed().replace(is_suffix.reversed(), "A")
        
        return if(myString.first() == 'A') 1 else 0
    }
}