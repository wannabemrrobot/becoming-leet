class Solution {
    public int maxSubArray(int[] nums) {
        // optimal solution
        // Using Kadane's Algorithm
        
        int globalMax = Integer.MIN_VALUE;
        int localMax = 0;
        
        for(int i=0; i<nums.length; i++) {
            // iterate from the first element, if the element is greater than the maximum subarray of the previous element, 
            // it is the current maximum.
            localMax = Math.max(nums[i], localMax+nums[i]);
            
            if(localMax > globalMax)
                globalMax = localMax;
        }
        return globalMax;
    }
}

// 209 / 209 test cases passed.
// Status: Accepted
// Runtime: 1 ms
// Memory Usage: 49.2 MB