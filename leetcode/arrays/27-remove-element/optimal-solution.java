class Solution {
    public int removeElement(int[] nums, int val) {
        // OPTIMAL SOLUTION
        
        int index = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val)
                nums[index++] = nums[i];
        }
        
        return index;
    }
}

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
// Memory Usage: 37.5 MB, less than 73.85% of Java online submissions for Remove Element.