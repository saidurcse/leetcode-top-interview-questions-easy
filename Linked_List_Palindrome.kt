https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/772/

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null || head.next == null) return true
        
        var slow: ListNode? = head
        var fast: ListNode? = head
        
        while (fast != null && fast.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }
        
        val reverseHead = reverse(slow)
        var temp1: ListNode? = head
        var temp2: ListNode? = reverseHead
        
        while (temp2 != null) {
            if (temp1?.`val` != temp2.`val`) return false
            temp1 = temp1.next
            temp2 = temp2.next
        }
        
        return true
    }
    
    fun reverse(head: ListNode?): ListNode? {
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
// https://leetcode.com/problems/palindrome-linked-list/solutions/4908050/using-two-pointer-easy-explanation-c-java-python3-kotlin/
