https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/567/

class Solution {
    fun moveZeroes(nums: IntArray): Unit {      
        
        var count = 0    
            
        for(i in 0 until nums.size) {
            if(nums[i] != 0) {
                nums[count++] = nums[i]
            }
        }
        
        while(count < nums.size) {
            nums[count++] = 0
        }
    }
}

// Time complexity: O(n)
// Space complexity: O(1)