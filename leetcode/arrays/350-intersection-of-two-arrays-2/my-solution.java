class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // BRUTEFORCE APPROACH
        
        //hashmap to store the numbers and their counts in the nums1 array
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // arraylist to store the intersected elements in both nums1 and nums2 arrays
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        
        
        // iterate through the nums1 array and take count of the numbers in the hashmap
        for(int i=0; i<nums1.length; i++) {
            if(!map.containsKey(nums1[i])) {
                map.put(nums1[i], 1);
            } else {
                map.put(nums1[i], map.get(nums1[i])+1);
            }
        }
    
        // iterate through the nums2 array
        for(int j=0; j<nums2.length; j++) {
            // if the element is present in hashmap and has count > 0
            if(map.containsKey(nums2[j]) && map.get(nums2[j]) > 0) {
                // intersection is possible, and decrement the count of the number in hashmap
                intersection.add(nums2[j]);
                map.put(nums2[j], map.get(nums2[j])-1);
            }
        }
    
        // arraylist to int[] conversion
        int[] result = intersection.stream().mapToInt(i->i).toArray();
        return result;
    }
}

// Runtime: 7 ms, faster than 17.70% of Java online submissions for Intersection of Two Arrays II.
// Memory Usage: 41 MB, less than 10.14% of Java online submissions for Intersection of Two Arrays II.