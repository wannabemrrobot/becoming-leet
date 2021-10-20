class Solution {
    public int maxProfit(int[] prices) {
        
        // BRUTEFORCE APPROACH
        int maxPrice = 0;
            
        // Iterate the array, and find every possible max prices
        // Slow pointer for buying the stocks
        for(int i=0; i<prices.length-1; i++) {
            int curPrice = prices[i];
            
            // fast pointer for selling the stock
            for(int j=i+1; j<prices.length; j++) {
                // selling price must be always greater than the buying price for profit
                if(curPrice < prices[j]) {
                    // set the maximum selling price by choosing the max(previous maximum and difference between SP&FP)
                    maxPrice = Math.max(maxPrice, Math.abs(curPrice - prices[j]));
                }
            }
        }
        
        return maxPrice;
    }
}

// Time Limit Exceeded