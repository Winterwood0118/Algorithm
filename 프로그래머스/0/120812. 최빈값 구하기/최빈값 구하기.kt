class Solution {
    fun solution(array: IntArray): Int {
        var answer = 0
        val countArray = IntArray(array.maxOf{ it } + 1)
        
        for(i in array){
            countArray[i] ++
        }
        
        val mod1 = countArray.maxOf{ it }
        
        if(countArray.indexOfFirst{ it == mod1 } == countArray.indexOfLast{ it == mod1 }){
            answer = countArray.indexOf(mod1)
        } else {
            answer = -1
        }
        
        return answer
    }
}