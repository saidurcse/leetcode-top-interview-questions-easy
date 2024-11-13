https://leetcode.com/explore/featured/card/top-interview-questions-easy/93/linked-list/771/

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        
        var result = ListNode(0)
        var l1 = list1
        var l2 = list2
        var current = result
        
        while(l1 != null && l2 != null) {
            if(l1.`val` < l2.`val`) {
                current.next = l1
                l1 = l1.next
            } else {
                current.next = l2
                l2 = l2.next
            }
            current = current.next            
        } 
        
        if(l1 != null) current.next = l1
        if(l2 != null) current.next = l2
        
        return result.next
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

