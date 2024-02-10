https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/578/

// Sorting approach
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        nums.sort()
        
        for(i in 0 until nums.size-1) {
            if(nums[i] == nums[i+1]) {
                return true
            }
        }
        
        return false
    }
}

// Time complexity: O(n log n)
// Space complexity: O(1)

// Optimal approach
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var set = HashSet<Int>()
        
        for(i in 0 until nums.size) {
            if(set.contains(nums[i])){
                return true
            }              
            set.add(nums[i])
        }
        
        return false
    }
}

// Time complexity: O(n)
// Space complexity: O(n)

// Better approach
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var map = mutableMapOf<Int, Int>()
        
        for(i in 0 until nums.size) { 
            var count = map.getOrDefault(nums[i], 0)
            map[nums[i]] = count + 1
        }
        
        for((key, value) in map) {
            if(value>1) {
                return true
            }
        }
        
        return false
    }
}

// Time complexity: O(n)
// Space complexity: O(n)