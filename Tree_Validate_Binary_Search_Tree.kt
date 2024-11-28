https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/625/

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        return isValidBSTHelper(root, null, null)        
    }
    
    private fun isValidBSTHelper(root: TreeNode?, low: Int?, high: Int?) : Boolean {
        if(root == null) return true
        
        if(low != null && root.`val` <= low) return false
        if(high != null && root.`val` >= high) return false
        
        return isValidBSTHelper(root.left, low, root.`val`) && 
        isValidBSTHelper(root.right, root.`val`, high)
    }
    
}

// Time complexity: O(n)
// Space complexity: O(n)

