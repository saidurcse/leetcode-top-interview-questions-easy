https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/603/

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        
        var fast = head
        var slow = head

        for(i in 0 until n)
            fast = fast?.next

        if(fast == null) return head?.next

        while(fast?.next != null) {
            fast = fast?.next
            slow = slow ?.next
        }

        slow?.next = slow?.next ?.next

        return head
        
    }
}

// Time complexity: O(1)
// Space complexity: O(1)

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/solutions/1164542/js-python-java-c-easy-two-pointer-solution-w-explanation/

