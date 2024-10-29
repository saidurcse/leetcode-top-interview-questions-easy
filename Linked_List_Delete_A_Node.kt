https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/553/

class Solution {
    fun deleteNode(node: ListNode?){
         if (node != null) {
            node.`val` = node.next.`val`
            node.next = node.next.next
        }
    }
}

// Time complexity: O(1)
// Space complexity: O(1)

// Note: We are not actually removing/deleting given node, as question might imply. 
// To actually delete the node, we need to change the reference of the previous node's next pointer to skip over the given node. 
// However, we do not have access to the previous node.

