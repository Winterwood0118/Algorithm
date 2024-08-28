class Solution {
    fun solution(cipher: String, code: Int): String {
        val answer = StringBuilder()
        for(i in 0..cipher.length step code){
            if(i != 0) answer.append(cipher[i-1])
        }
        
        return answer.toString()
    }
}