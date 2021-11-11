class Solution {
    public int removeElement(int[] nums, int val) {
        
        int result = nums.length;
        
        if(nums.length == 0)
            return 0;
        else {
            // iterate the array backward
            for(int i=nums.length-1; i>=0; i--) {
                // swap if only nums[i] is not the input val
                if(nums[i] != val) {
                    for(int j=i; j>=0; j--) {
                        if(nums[j] == val) {
                            int temp = nums[i];
                            nums[i] = nums[j];
                            nums[j] = temp;
                            result = result - 1;
                            break;
                        }
                    }
                } else {
                    // reduce the size, if the array pos already contains input val
                    result = result - 1;
                }
            }
        }
        
        return result;
    }
}

// Runtime: 1 ms, faster than 13.98% of Java online submissions for Remove Element.
// Memory Usage: 38 MB, less than 38.51% of Java online submissions for Remove Element.