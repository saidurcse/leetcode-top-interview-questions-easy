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

class Solution {
    
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
            
        TreeNode head = helper(nums, 0, nums.length - 1);
        return head;
    }
        
   private TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        
        int mid = left + (right - left) / 2; // Pick the middle element as root
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1); // Check if any elements remaining on the left side // add left subtree
        root.right = helper(nums, mid + 1, right); // Check if any elements remaining on the right side // add right subtree
        
        return root;
    }
}