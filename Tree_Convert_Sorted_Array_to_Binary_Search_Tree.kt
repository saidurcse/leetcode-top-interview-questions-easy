https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/631

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    private lateinit var nums: IntArray

    private fun helper(left: Int, right: Int): TreeNode? {
        if (left > right) return null

        // Always choose the left middle node as the root
        val p = (left + right) / 2

        // Preorder traversal: node -> left -> right
        val root = TreeNode(nums[p])
        root.left = helper(left, p - 1)
        root.right = helper(p + 1, right)
        return root
    }

    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        this.nums = nums
        return helper(0, nums.size - 1)
    }
}

// Time complexity: O(n)
// Space complexity: O(log(n)))

