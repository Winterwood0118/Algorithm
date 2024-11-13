class Solution {
    fun solution(arr: IntArray): Int {
        return arr.map { fifty(Pair(it, 0)) }.maxOf{ it.second }
    }

    tailrec fun fifty(pair: Pair<Int, Int>): Pair<Int, Int>{
        return if(pair.first >= 50 && pair.first % 2 == 0){
            fifty((Pair(pair.first / 2 , pair.second + 1)))
        } else if(pair.first < 50 && pair.first % 2 == 1){
            fifty((Pair(pair.first * 2 + 1, pair.second + 1)))
        } else pair
    }
}