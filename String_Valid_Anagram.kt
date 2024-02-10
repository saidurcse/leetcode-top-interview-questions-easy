https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/882/

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        if(s.length != t.length) return false
        
        var sArr = s.toCharArray()
        var tArr = t.toCharArray()
        sArr.sort()
        tArr.sort()
        
        for(i in 0 until sArr.size) {
            if(sArr[i] != tArr[i])
                return false
        }
            
        return true        
    }
}

// Time complexity: O(n log n)
// Space complexity: O(1)

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        if(s.length != t.length) return false
        
        var sArr = IntArray(26) {0}      
       
        for(i in 0 until s.length) {
            sArr[s.get(i) -'a']++
            sArr[t.get(i) -'a']--
        }
        
        for(i in 0 until sArr.size) {
            if(sArr[i] != 0)
                return false
        }
        
        return true
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        if(s.length != t.length) return false
        
        var sArr = mutableMapOf<Char, Int>()    
       
        for(i in 0 until s.length) {
            var index = sArr.getOrDefault(s[i], 0)
            sArr[s[i]] = index + 1
            var index1 = sArr.getOrDefault(t[i], 0)
            sArr[t[i]] = index1 - 1
        }
        
        for((key, value) in sArr) {
            if(value != 0)
                return false
        }
        
        return true
    }
}

// Time complexity: O(n)
// Space complexity: O(n)