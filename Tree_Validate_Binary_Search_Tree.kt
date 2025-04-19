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

// Inroder Solution

class Solution {
    private var prev: Int? = null

    fun isValidBST(root: TreeNode?): Boolean {
        return inorder(root)
    }

    private fun inorder(node: TreeNode?): Boolean {
        if (node == null) return true

        if (!inorder(node.left)) return false

        if (prev != null && node.`val` <= prev!!) return false
        prev = node.`val`

        return inorder(node.right)
    }
}

Explanation:
prev keeps track of the previously visited node's value.
During the inorder traversal, we check if the current node's value is greater than prev.
If not, it's not a valid BST.

// Time complexity: O(n)
// Space complexity: Worst case: O(n) Best case (balanced tree): O(log n)
