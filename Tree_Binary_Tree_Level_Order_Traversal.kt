https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/628/

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()
        var level = 0
        
        traverse(result, 0, root)
        
        return result
    }
    
    fun traverse(result: MutableList<MutableList<Int>>, level: Int, root: TreeNode?) {
        
        if(root == null) return
        
        if(level >= result.size) {
            result.add(mutableListOf())
        }
        
        result[level].add(root.`val`)
        
        traverse(result, level+1, root.left)
        traverse(result, level+1, root.right)
    }
}

// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
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
