class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] tempArray = new int[m+n];
        int leftPointer = 0;
        int rightPointer = 0;
        int tempPointer = 0;
        
        while(leftPointer < m && rightPointer < nums2.length) {
            if(nums1[leftPointer] <= nums2[rightPointer]) {
                tempArray[tempPointer] = nums1[leftPointer];
                leftPointer++;
            } else {
                tempArray[tempPointer] = nums2[rightPointer];
                rightPointer++;
            }
            tempPointer++;
        }
        
        if(leftPointer < m) {
            while(leftPointer < m) {
                tempArray[tempPointer] = nums1[leftPointer];
                leftPointer++;
                tempPointer++;
            }
        } else if(rightPointer < nums2.length) {
            while(rightPointer < nums2.length) {
                tempArray[tempPointer] = nums2[rightPointer];
                rightPointer++;
                tempPointer++;
            }
        }
        
        for(int i=0; i<tempArray.length; i++) {
            nums1[i] = tempArray[i];
        }
    }
}

// Runtime: 1 ms, faster than 22.36% of Java online submissions for Merge Sorted Array.
// Memory Usage: 40 MB, less than 6.00% of Java online submissions for Merge Sorted Array.