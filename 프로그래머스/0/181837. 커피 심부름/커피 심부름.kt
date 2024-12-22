class Solution {
    fun solution(order: Array<String>): Int {
        return order.fold(0){ acc, i ->
            if(i.contains("cafelatte")) acc + 5000
            else acc + 4500
        }
    }
}