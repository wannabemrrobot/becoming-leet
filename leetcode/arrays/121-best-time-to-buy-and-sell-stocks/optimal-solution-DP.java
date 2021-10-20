class Solution {
    public int maxProfit(int[] prices) {
        
        // OPTIMAL APPROACH - DYNAMIC PROGRAMMING
        
        // minimum price of the stock
        int min = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int i=0; i<prices.length; i++) {
            // check if the stock price is low, to buy
            if(prices[i] < min) {
                min = prices[i];
            // if this condition satisfied, then the transaction is profitable
            } else {
                // the profit will get updated, if there's a profit larger than the previous one
                profit = Math.max(profit, prices[i] - min);
            }
        }
        
        return profit;
    }
}

// Runtime: 1 ms, faster than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.
// Memory Usage: 51.8 MB, less than 90.33% of Java online submissions for Best Time to Buy and Sell Stock.