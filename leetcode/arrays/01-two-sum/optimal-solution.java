class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};   
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

// Runtime: 1 ms, faster than 99.64% of Java online submissions for Two Sum.
// Memory Usage: 39.2 MB, less than 69.83% of Java online submissions for Two Sum.