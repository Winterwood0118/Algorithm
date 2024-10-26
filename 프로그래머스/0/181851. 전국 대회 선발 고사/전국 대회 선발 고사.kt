class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var a = Pair(0, 0)
        var b = Pair(0, 0)
        var c = Pair(0, 0)
        
        for(i in rank.indices){
            if(!attendance[i]){
                continue
            } else if(a.first == 0 || rank[i] < a.first){
                c = b
                b = a
                a = Pair(rank[i], i)
            } else if(b.first == 0 || rank[i] < b.first){
                c = b
                b = Pair(rank[i], i)
            } else if(c.first == 0 || rank[i] < c.first){
                c = Pair(rank[i], i)
            }
        }

        return a.second * 10000 + b.second * 100 + c.second
    }
}