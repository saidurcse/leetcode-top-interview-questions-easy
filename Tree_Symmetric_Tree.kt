https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/627/

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return isMirror(root, root)
    }
    
    fun isMirror(t1: TreeNode?, t2: TreeNode?): Boolean {
        if(t1 == null && t2 == null) return true
        if(t1 == null || t2 == null) return false
        return t1.`val` == t2.`val` && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left)
    }
}

// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        val queue = LinkedList<TreeNode?>()
        //The root node is added twice to the queue to start the mirroring check
		queue.add(root)
        queue.add(root)

        while(queue.isNotEmpty()) {
            val t1 = queue.poll()
            val t2 = queue.poll()

            if(t1 == null && t2 == null) continue
            if(t1 == null || t2 == null) return false
            if(t1.`val` != t2.`val`) return false

            queue.add(t1?.left)
            queue.add(t2?.right)
            queue.add(t1?.right)
            queue.add(t2?.left)
        }

        return true
    }
}

// Time complexity: O(n)
// Space complexity: O(n)