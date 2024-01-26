https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/881/

class Solution {
    fun firstUniqChar(s: String): Int {

        var hashSet = HashMap<Char, Int>()        
        var result = -1
        
        for(i in 0 until s.length) {
            var count = hashSet.getOrDefault(s[i], 0)
            hashSet[s[i]] = count + 1           
        }
        
        for(i in 0 until s.length) {
            if(hashSet[s[i]] == 1) {
                result = i
                break
            }                
        }
        
        return result
    }
}

// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun firstUniqChar(s: String): Int {

        var result = -1
        
        for(i in 0 until s.length) {
            if (s.indexOf(s[i]) == s.lastIndexOf(s[i])) {
                result = i
                break
            }
        }       
        
        return result
    }
}

// Time complexity: O(n^2)
// Space complexity: O(1)

class Solution {
    fun firstUniqChar(s: String): Int {

        var arr = IntArray(26) {0}
        var result = -1
        
        for(i in 0 until s.length) {
            arr[s[i]-'a']++
        }
        
        for(i in 0 until s.length) {
            if(arr[s[i]-'a'] == 1) {
                result = i
                break
            }
        }
        
        return result
    }
}

// Time complexity: O(n)
// Space complexity: O(1) as arr has fixed size 26.