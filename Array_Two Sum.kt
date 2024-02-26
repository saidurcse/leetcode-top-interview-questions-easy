https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/546/

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        var result = IntArray(2)
        
        for(i in 0 until nums.size-1) {
            for(j in 1 until nums.size) {
                if(nums[i] + nums[j] == target && i != j) {
                    result[0] = i
                    result[1] = j
                }
            }            
        }
        
        return result
    }
}

// Time complexity: O(n^2)
// Space complexity: O(n)

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        // inside loop, first we will check two elements arr[i] amd target-arr[i]
        // if exists return the index otherwise add the arr[i]
        
        var result = IntArray(2)
        var hashMap = HashMap<Int, Int>()
        
        for(i in 0 until nums.size) {
            if(hashMap.containsKey(target-nums[i])) {
                 result[0] = i
                 result[1] = hashMap[target-nums[i]]!! 
                  
                 return result
            } 
            
            hashMap[nums[i]] = i
        }
        
        return result
    }
}

// Time complexity: O(n)
// Space complexity: O(1)