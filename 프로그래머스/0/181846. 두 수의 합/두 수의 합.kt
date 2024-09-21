import java.math.BigInteger

class Solution {
    fun solution(a: String, b: String): String {
        /* val answer = StringBuilder()
        
        val longger = if( a.length >= b.length ) a else b
        val shorter = if( a.length >= b.length ) b else a
        
        var remain = 0

        for(i in longger.indices){
            if(i > shorter.lastIndex) break
            
            var sum = longger[i].digitToInt() + shorter[i].digitToInt() + remain
            
            remain = 0
            
            if(sum >= 10) {
                remain = sum / 10
                sum = sum % 10
            }
            
            answer.append(sum.toString())
            
        }
        
        return answer.toString().reversed()*/
        
        return (a.toBigInteger() + b.toBigInteger()).toString()
    }
}