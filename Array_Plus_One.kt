https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/559/

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var result = IntArray(digits.size+1)

        for(i in digits.size-1 downTo 0) {
            if(digits[i] < 9) {
                digits[i] = digits[i] + 1
                return digits
            } else {
                digits[i] = 0
            }
        }

        result[0] = 1
        for (i in 0 until digits.size) {
            result[i+1] = digits[i]
        }

        return result 
    }
}

// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for(i in digits.size-1 downTo 0) {
            if(digits[i] < 9) {
                digits[i] = digits[i] + 1
                return digits
            } else {
                digits[i] = 0
            }
        }
        
        var result = IntArray(digits.size+1)
        result[0] = 1
    
        return result
    }
}

// Time complexity: O(n)
// Space complexity: O(n)
