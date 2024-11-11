https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/560/

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        
        if(head == null || head.next == null) {
            return head
        }
        
        var prev: ListNode? = null
        var current: ListNode? = head
        var nextNode: ListNode? = null
        
        while(current != null) {
            nextNode = current.next
            current.next = prev
            prev = current

            current = nextNode
        }

        return prev    
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

// https://leetcode.com/problems/reverse-linked-list/solutions/4903834/easy-solution-optimal-solution-c-java-python3-kotlin

