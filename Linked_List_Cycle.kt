https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/773/

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var slow = head
        var fast = head

        while(fast != null && fast.next != null) {
            slow = slow?.next
            fast = fast.next?.next

            if(slow == fast)
                return true
        }

        return false
    }
}

// Time complexity: O(n)
// Space complexity: O(1)
// https://www.youtube.com/watch?v=RRSItF-Ts4Q
// https://leetcode.com/problems/linked-list-cycle/solutions/4829834/detecting-cycle-in-a-singly-linked-list-100-beats-two-pointer-java-c-python/
