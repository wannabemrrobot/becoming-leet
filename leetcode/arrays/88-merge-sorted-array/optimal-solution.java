class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int leftPointer = m-1;
        int rightPointer = n-1;
        int insertPointer = m+n-1;
        
        // my optimal approach
        /*
        Three pointer, LP for the elements in nums1 from end, RP for the elements in nums2 from end,
        and IP for the insertion slots from the end.
        Check the elements in the decreasing order from nums1 and nums2.
        Place the largest element in the insertion pointer which is from the last.
        Then decrement the respective(LP or RP) and insertion pointer(IP).
        */
        while(leftPointer >=0 && rightPointer >= 0) {
            if(nums1[leftPointer] < nums2[rightPointer]) {
                nums1[insertPointer] = nums2[rightPointer];
                rightPointer--;
            } else {
                nums1[insertPointer] = nums1[leftPointer];
                leftPointer--;
            }
            insertPointer--;

            // the above LOC inside the while loop can be written as:
            // nums1[insertPointer--] = nums1[leftPointer] < nums2[rightPointer] ? nums2[rightPointer--] : nums1[leftPointer--];
        }
        
        // sometimes the above while loop, stops when the LP becomes negative.
        // In cases like, [4,5,6,0,0,0], [3], [1,2,3], [3]
        // The nums1 numbers are largest and will get places in the nums1 end and the LP becomes negative.
        // Thus, the nums2 with RP is greater than -1, which means there are still elements in the array.
        // Place it, using the IP-Insertion Pointer
        while(rightPointer>=0) {
            nums1[insertPointer--] = nums2[rightPointer--];
        }
    }
}

// Complexity: Time: O(m+n) - O(n), Space: O(1)
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
// Memory Usage: 39.8 MB, less than 6.00% of Java online submissions for Merge Sorted Array.