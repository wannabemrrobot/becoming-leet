class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // my optimal approach
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}


// my optimal solution

// Runtime: 13 ms, faster than 20.32% of Java online submissions for Contains Duplicate.
// Memory Usage: 53.6 MB, less than 19.05% of Java online submissions for Contains Duplicate.