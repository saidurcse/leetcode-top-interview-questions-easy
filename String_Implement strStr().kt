https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/885/

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        return haystack.indexOf(needle)
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun strStr(haystack: String, needle: String): Int {
         if(haystack.length < needle.length)
            return -1
        
          for(i in 0 until haystack.length-needle.length+1) {
            
              for(j in 0 until needle.length) {
                
                if(haystack[i+j]!=needle[j])
                    break
                
                if(needle.length-1 == j) {
                    return i
                }
            }            
        }
        
        return -1
    }
}

//  Time complexity: O(n×m)O(n×m)
//  Space complexity: O(1)O(1)

