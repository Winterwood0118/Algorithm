class Solution {
    fun solution(my_string: String): IntArray {
        return my_string.filter{
            it in ('0'..'9')
        }.map{
            it.digitToInt()
        }.sorted().toIntArray()
    }
}