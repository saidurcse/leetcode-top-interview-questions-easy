https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/884/ 

class Solution {
    fun myAtoi(s: String): Int {

        var sign = 1
        var finalVal = 0L

        var i = 0
        while(i < s.length && s[i] == ' ') {
            i++
        }

        if(i < s.length && (s[i] == '+' || s[i] == '-')) {
            if(s[i]== '-')
                sign = -1

            i++
        }

        while(i < s.length && s[i] >= '0' && s[i] <= '9') {
            finalVal = finalVal * 10 + (s[i]-'0')

            if(finalVal * sign > Int.MAX_VALUE) {
                return Int.MAX_VALUE
            }

            if(finalVal * sign < Int.MIN_VALUE) {
                return Int.MIN_VALUE
            }


            i++
        }

        return finalVal.toInt()*sign
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

