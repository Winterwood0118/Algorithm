class Solution {
    fun solution(polynomial: String): String {
        var xCoef = 0
        var constNum = 0

        polynomial.split(" + ").forEach{ str ->
            if(str.contains("x")){
                if(str == "x") xCoef ++
                else xCoef += str.dropLast(1).toInt()
            }else {
                constNum += str.toInt()
            }
        }

        val xCoefStr = when(xCoef){
            0 -> ""
            1 -> "x"
            else -> "${xCoef}x"
        }

        val constNumStr = when(constNum){
            0 -> ""
            else -> "$constNum"
        }

        val result = StringBuilder()

        result.append(xCoefStr)
        if(xCoef * constNum != 0) result.append(" + ")
        result.append(constNumStr)

        return result.toString()
    }
}