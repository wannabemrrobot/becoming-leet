class Solution {
    public int removeElement(int[] nums, int val) {
        
        // variable to store the number of elements which are not equal to the input val
        int result = nums.length;
        // variable to store the number of occurence of the input val
        int valCount = 0;
        
        // if the input array contains zero elements return 0
        if(nums.length == 0)
            return 0;
        // if the input element contains one element and
        // if it doesnt contain the input val return the array length else, 0
        else if(nums.length == 1)
            return nums[0] == val ? 0 : nums.length;
        
        // swapping block of code
        // shifts the values that are not equal to the input value to the left
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == val) {
                for(int j=i; j<nums.length; j++) {
                    if(nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        
        // get the count of the elements which are equal to the input val
        for(int i=nums.length-1; i>=0; i--) {
            if(nums[i] == val)
                valCount++;
            else
                break;
        }

        // return array length which contains only the values not equals to val
        return result - valCount;
    }
}

// Runtime: 1 ms, faster than 13.98% of Java online submissions for Remove Element.
// Memory Usage: 37.6 MB, less than 73.85% of Java online submissions for Remove Element.