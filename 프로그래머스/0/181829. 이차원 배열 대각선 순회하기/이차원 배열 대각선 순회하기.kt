class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0
        
        for(i in 0..k){
            if(i >= board.size) break
            for(j in 0..(k - i)){
                if(j >= board[0].size) break
                answer += board[i][j]
            }
        }
        
        return answer
    }
}