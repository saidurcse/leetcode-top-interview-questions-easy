https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/549/

class Solution {
    fun singleNumber(nums: IntArray): Int {
        nums.sort()
     
        for(i in 1 until nums.size step 2) {
            if(nums[i] != nums[i-1])
                return nums[i-1]
        } 
        
        return nums[nums.size-1]
    }
}

// Time complexity: O(n log n)
// Space complexity: O(1)

// Optimal approach
class Solution {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        
        for(i in 0 until nums.size) {
            result = nums[i] xor result            
        }
        
        return result
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

