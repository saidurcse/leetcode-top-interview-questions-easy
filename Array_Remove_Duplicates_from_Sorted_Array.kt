https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/

fun removeDuplicates(nums: IntArray): Int {

   var count = 1

   for(i in 1 until nums.size) {

       if(nums[i] != nums[i-1]) {
           nums[count] = nums[i]
           count++
       }
   }

   return count
}

// Time complexity: O(n)
// Space complexity: O(1)

fun removeDuplicates(nums: IntArray): Int {

   val set = HashSet<Int>()  // Use 'val' for a non-mutable set
   var writeIndex = 0       // Track the index for writing unique elements

   for (num in nums) {
	 // Add returns true if the element was added successfully
       if (set.add(num)) {
	     // Write unique elements to the beginning of the array  
           nums[writeIndex++] = num  
       }
   }

   return set.size
}

// Time complexity: O(n)
// Space complexity: O(n)