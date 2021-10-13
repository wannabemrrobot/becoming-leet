class Solution {
    public int maxSubArray(int[] nums) {
        
        // my bruteforce approach
        if(nums.length == 0 || nums == null) {
            return 0;
        }
        
        
        int maxSum = -Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++) {
            int currentSum = 0;
            
            for(int j=i; j<nums.length; j++) {
                currentSum = currentSum + nums[j];
                
                maxSum = Math.max(currentSum, maxSum);
            }
        }        
        return maxSum;
    }
}

// Time Limit Exceeded
// 204/209 test cases passed