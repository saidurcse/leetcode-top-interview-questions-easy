https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/ 

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0  
        var buying_price = prices[0]

        for(i in 1 until prices.size) {
            if(prices[i] > buying_price) {
                profit += prices[i] - buying_price
                buying_price = prices[i]
            } else {
                buying_price = prices[i]
            }           
        }

        return profit
    }
}

// Time complexity: O(n)
// Space complexity: O(1)

