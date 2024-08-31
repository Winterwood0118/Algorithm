import kotlin.math.max
class Solution {
    lateinit var dungeon: Array<IntArray>
    lateinit var visited: Array<Boolean>
    var answer: Int = -1
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        visited = Array(dungeons.size) { true }
        dungeon = dungeons

        for (i in dungeon.indices) {
            if (visited[i] && k - dungeon[i][0] >= 0) {
                dfs(k - dungeon[i][1], i, 1)
            }
            visited[i] = true
        }

        return answer
    }

    fun dfs(k: Int, now: Int, count: Int) {
        visited[now] = false
        answer = max(answer, count)
        for (i in dungeon.indices) {
            if (visited[i] && k - dungeon[i][0] >= 0) {
                dfs(k - dungeon[i][1], i, count + 1)
            }
        }
        visited[now] = true
    }
}