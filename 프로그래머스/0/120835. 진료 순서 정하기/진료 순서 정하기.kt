class Solution {
    fun solution(emergency: IntArray): IntArray {
        val sortedEmergency = emergency.sortedDescending()
        return emergency.map { sortedEmergency.indexOf(it) + 1 }.toIntArray()
    }
}