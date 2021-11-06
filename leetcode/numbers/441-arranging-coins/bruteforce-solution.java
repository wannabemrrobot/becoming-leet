class Solution {
    public int arrangeCoins(int n) {
        // MY BRUTEFORCE SOLUTION
        
        // count coins left after building staircase in every row
        int coinsLeft = n;
        // count of the rows completely built
        int rows = 0;
        
        for(int i=1; i<=n; i++) {
            // on every iteration start, check if the staircase can be built using coinsLeft
            if(coinsLeft < i)
                return rows;
            coinsLeft = coinsLeft - i;
            rows = rows + 1;
        }
        
        return rows;
    }
}

// Runtime: 7 ms, faster than 35.06% of Java online submissions for Arranging Coins.
// Memory Usage: 36.1 MB, less than 71.31% of Java online submissions for Arranging Coins.