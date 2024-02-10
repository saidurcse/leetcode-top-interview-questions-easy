https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/883/

class Solution {
    fun isPalindrome(s: String): Boolean {
        
        var newString = s.filter {it.isDigit() || it.isLetter()}
        var convert = newString.lowercase()
                
        return convert == convert.reversed()
    }
}

// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun isPalindrome(s: String): Boolean {
        var newString = StringBuilder()
        
        for(i in 0 until s.length) {
            if((s[i] >= 'a' && s[i] <='z') || (s[i] >= '0' && s[i] <='9')) {
                newString =  newString.append(s[i])
            } else if (s[i] >= 'A' && s[i] <='Z') {
                var lowercase = s[i].lowercase()
                newString = newString.append(lowercase)
            }
        }
        
        //var charArray = newString.toCharArray()
        for(i in 0 until newString.length/2) {
            if(newString[i] != newString[newString.length-i-1])
                return false
            
            //print(newString[newString.length-1])
        }
        
        return true
    }
}

// Time complexity: O(n)
// Space complexity: O(n)

