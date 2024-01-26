https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/879/

class Solution {
    fun reverseString(s: CharArray): Unit {    
        
        var left = 0
        var right = s.size-1
        
        while(left < right) {
            var ch = s[left]
            s[left++] = s[right--]
            s[right] = ch
            
            //left++
            //right--
        }                
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun reverseString(s: CharArray): Unit {
        
        var len = s.size
        
        for(i in 0 until len/2) {
            val ch = s[i]
            s[i] = s[len-i-1]
            s[len-i-1] = ch
        }
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun reverseString(s: CharArray): Unit {

        s.reverse()
    }
}

// Time complexity: O(n)
// Space complexity: O(1)