import java.util.*

class Solution {
    fun solution(arr: IntArray): IntArray {
        val stk = Stack<Int>()
        var idx = 0
        while(idx < arr.size){
            if(stk.isEmpty()){
                stk.push(arr[idx])
                idx ++
            }else if(stk.peek() == arr[idx]){
                stk.pop()
                idx ++
            }else {
                stk.push(arr[idx])
                idx ++
            }
        }
        
        if(stk.isEmpty()){
            stk.push(-1)
        }

        return stk.toIntArray()
    }
}