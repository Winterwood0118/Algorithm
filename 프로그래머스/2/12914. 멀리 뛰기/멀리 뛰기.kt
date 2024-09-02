class Solution {
    fun solution(n: Int): Long = getFibonacci(n + 1)
    private tailrec fun getFibonacci(currentNumber : Int, acc : Long = 0, prevSum : Long = 1) : Long =
        if(currentNumber == 0) acc
        else getFibonacci(currentNumber - 1, prevSum, (prevSum + acc) % 1234567)
}
/*
5(8)     6(13)
11111    111111
1112     11112
1121     11121
1211     11211
2111     12111
122      21111
212      1122
221      1212
         2112
         1221
         2121
         2211
         222
*/