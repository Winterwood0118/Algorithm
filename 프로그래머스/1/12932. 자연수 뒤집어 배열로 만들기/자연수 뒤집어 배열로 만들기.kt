class Solution {
    fun solution(n: Long): IntArray {
        val nString = n.toString()

        return IntArray(nString.length){ i -> 
            nString[nString.length - i - 1].digitToInt()
        }
    }
}