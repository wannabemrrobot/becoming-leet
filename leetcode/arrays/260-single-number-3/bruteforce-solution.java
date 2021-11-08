class Solution {
    public int[] singleNumber(int[] nums) {
        // array to store only 2 unique elements
        ArrayList<Integer> unique = new ArrayList();
        
        // iterate the array in a sliding window pattern, window of 2 slots
        for(int i=0; i<nums.length-1; i++) {
            int ele1 = nums[i];
            int ele2 = nums[i+1];
            
            // check the above 2 elements exists in the arraylist, 
            // remove if exists else add the elements
            if(unique.contains(ele1))
                unique.remove(unique.indexOf(ele1));
            else
                unique.add(ele1);
            
            if(unique.contains(ele2))
                unique.remove(unique.indexOf(ele2));
            else
                unique.add(ele2);
            
            // to get the window slot 2
            i = i+1;
        }
        
        int[] uniq = unique.stream().mapToInt(i->i).toArray();
        return uniq;
    }
}