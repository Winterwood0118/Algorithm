class Solution {
    fun solution(board: Array<IntArray>): Int {
        val boardEnd = board.size - 1
        val safeZone = Array<IntArray>(board.size + 2){ i ->
            IntArray(board.size + 2){ j ->
                if(i == 0 || j == 0 || i == board.size + 1 || j == board.size + 1) 1
                else board[i - 1][j - 1]
            }
        }
        var answer = 0
        
        for(i in board.indices){
            for(j in board[0].indices){
                if(board[i][j] == 1){
                    safeZone[i + 2][j + 2] ++
                    safeZone[i + 2][j + 1] ++
                    safeZone[i + 2][j] ++
                    safeZone[i + 1][j + 2] ++
                    safeZone[i + 1][j + 1] ++
                    safeZone[i + 1][j] ++
                    safeZone[i][j + 2] ++
                    safeZone[i][j + 1] ++
                    safeZone[i][j] ++
                }
            }
        }
        
        for(i in safeZone.indices){
            for(j in safeZone[0].indices){
                if(safeZone[i][j] == 0) answer ++
            }
        }

        return answer
    }
}