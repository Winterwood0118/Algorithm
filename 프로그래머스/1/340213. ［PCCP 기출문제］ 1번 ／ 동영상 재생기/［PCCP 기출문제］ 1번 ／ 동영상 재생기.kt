class Solution {
    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {
        val videoLenInt = video_len.timeToInt()
        var posInt = pos.timeToInt()
        val opStartInt = op_start.timeToInt()
        val opEndInt = op_end.timeToInt()
        
        for(command in commands){
            if(posInt in opStartInt..opEndInt) posInt = opEndInt

            when(command) {
                "next" -> { posInt += 10 }
                "prev" -> { posInt -= 10 }
            }
            
            when {
                posInt > videoLenInt -> { posInt = videoLenInt }
                posInt < 0 -> { posInt = 0 }
            }
            
            if(posInt in opStartInt..opEndInt) posInt = opEndInt

        }
                
        return posInt.IntToTime()
    }
    
    
    fun String.timeToInt(): Int{
        return this.split(":").let { it[0].toInt() * 60 + it[1].toInt() }
    }
    
    fun Int.IntToTime(): String{
        var minutes = (this / 60).toString()
        var seconds = (this % 60).toString()
        
        if(minutes.length == 1) minutes = "0" + minutes
        if(seconds.length == 1) seconds = "0" + seconds

        return "${minutes}:${seconds}"
    }
}