https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1167104007/ 

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = Int.MAX_VALUE        
        var profit = 0

        for(i in 0 until prices.size) {
            min = minOf(min, prices[i])
            profit = maxOf(profit, prices[i]-min)
        }

        return profit
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

