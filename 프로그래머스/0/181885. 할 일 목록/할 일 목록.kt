class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        return todo_list.withIndex().filter{ (idx, work) -> 
            !finished[idx]
        }.map{ (idx, work) -> 
            work
        }.toTypedArray()
    }
}