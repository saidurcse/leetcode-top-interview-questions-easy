https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/646/

class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        
        var prev = nums[0]
        val n = nums.size
        val copy = nums.copyOf()

        for(i in 0 until nums.size) {
            nums[(i+k)%n] = copy[i]
        }
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        
        var k = k % nums.size

        var i = 0
        var j = nums.size - 1
        var len = nums.size        
        reverse(nums, i, len - k - 1)
        reverse(nums, len - k, len - 1)
        reverse(nums, i, len - 1)
    }

    fun reverse(nums: IntArray, s: Int, e: Int) {
        var start = s
        var end = e
        while (start < end) {
            var temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start++
            end--
        }
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

fun rotateArray(arr: IntArray, rotations: Int) {
   var rotations = rotations
   val length = arr.size // 5
   var rotations  = rotations  % length

   val tempList = ArrayList<Int>()
   for (i in length - rotations until length) {
       tempList.add(arr[i]) // 4,5
   }

   for (i in length - 1 downTo rotations) {
       arr[i] = arr[i - rotations] // 1,2,3
   }

   for (i in 0 until rotations) {
       arr[i] = tempList[i]
   }

   for(x in arr)
		print("$x ")
}

// Time complexity: O(n)
// Space complexity: O(n)