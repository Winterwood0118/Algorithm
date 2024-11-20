class Solution() {
    fun solution(n: Int): Array<IntArray> {
        val result = Array(n) { IntArray(n) }
        var num = 1
        var top = 0
        var bottom = n - 1
        var left = 0
        var right = n - 1

        while (top <= bottom && left <= right) {
            for (i in left..right) {
                result[top][i] = num++
            }
            top++

            for (i in top..bottom) {
                result[i][right] = num++
            }
            right--

            // 아래쪽 행: 오른쪽에서 왼쪽
            if (top <= bottom) {
                for (i in right downTo left) {
                    result[bottom][i] = num++
                }
                bottom--
            }

            if (left <= right) {
                for (i in bottom downTo top) {
                    result[i][left] = num++
                }
                left++
            }
        }

        return result
    }
}