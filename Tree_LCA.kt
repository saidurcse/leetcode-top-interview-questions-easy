https://leetcode.com/explore/interview/card/top-interview-questions-hard/118/trees-and-graphs/844/

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if (root == null || root == p || root == q) return root 
    
        val left = lowestCommonAncestor(root.left, p, q)
        val right = lowestCommonAncestor(root.right, p, q)

        if (left != null && right != null) return root // If p and q are in different subtrees, current node is LCA

        return left ?: right // Otherwise, return the non-null subtree result
    }
}

// Time complexity: O(n)
// Space complexity: O(h), where h is the heigh of the tree

