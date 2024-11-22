class Solution {
    fun solution(my_string: String): Array<String> {
        return Array<String>(my_string.length){ 
            my_string.slice(it..my_string.lastIndex) 
        }.sorted().toTypedArray()
    }
}