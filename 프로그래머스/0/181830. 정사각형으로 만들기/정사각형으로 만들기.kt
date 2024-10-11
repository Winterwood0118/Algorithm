class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        val height = arr.size
        val width = arr[0].size
        
        val size = Math.max(height, width)
        
        return Array<IntArray>(size){ h -> 
            if(h < height){
                IntArray(size){ w ->
                    if(w < width) arr[h][w] else 0
                }   
            }else { 
                IntArray(size){ 0 } 
            }
        }
    }
}