https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/555/

class Solution {
      
    fun maxDepth(root: TreeNode?): Int {
             
        var result = levelOrder(root)
        
        return result.size
        
    }
    
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()

        if (root == null) return result

        val queue = LinkedList<TreeNode>()
        queue.add(root)

        while (queue.isNotEmpty())
        {
            val levelSize = queue.size
            val levelList = mutableListOf<Int>()

            for (i in 0 until levelSize) {
                val node = queue.poll()!!

                levelList.add(node.`val`)

                if (node.left != null) queue.add(node.left!!)
                if (node.right != null) queue.add(node.right!!)
            }

            result.add(levelList)
        }

        return result
    }

}

// Time complexity: O(n)
// Space complexity: O(n)

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0

    val leftDepth = maxDepth(root.left)
    val rightDepth = maxDepth(root.right)

    return 1 + maxOf(leftDepth, rightDepth)
}

// Time complexity: O(n)
// Space complexity: O(n) best case O(log(n)))