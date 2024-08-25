class Solution {
    fun solution(n: Int): Int {
        val fibonacci = Array<Int>(n+1){0}
        fibonacci[1] = 1
        for (i in 2..n) {
            fibonacci[i] = (fibonacci[i - 2] + fibonacci[i - 1]) % 1234567
        }
        return fibonacci[n]
    }
}