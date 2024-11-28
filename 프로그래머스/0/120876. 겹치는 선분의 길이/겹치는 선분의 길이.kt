class Solution {
    fun solution(lines: Array<IntArray>): Int {
        val start = lines.minOf{ it[0] }
        val end = lines.maxOf{ it[1] }

        return (start..end).filter{ 
            it in lines[0][0] until lines[0][1] && it in lines[1][0] until lines[1][1] || 
            it in lines[1][0] until lines[1][1] && it in lines[2][0] until lines[2][1] || 
            it in lines[2][0] until lines[2][1] && it in lines[0][0] until lines[0][1]
        }.size
    }
}