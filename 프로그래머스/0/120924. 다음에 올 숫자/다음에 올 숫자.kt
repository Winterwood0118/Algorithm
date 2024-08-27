class Solution {
    fun solution(common: IntArray): Int {
        if(common[0] - common[1] == common[1] - common[2]) {
            return common.last() + common[1] - common[0]
        } else {
            return common.last() * common[1] / common[0]
        }
    }
}