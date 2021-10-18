class Solution {
    public int firstUniqChar(String s) {
        
        // a list of size 26, cz the constraint is it only contains 26 small alphabets
        int[] freqList = new int[26];
        
        // iterate the string and place the alphabets in their position in the order of their occurence
        // in the array, also increment the values on subsequent occurences
        for(int i=0; i<s.length(); i++) {
            freqList[s.charAt(i) - 'a']++;
        }
        
        // iterate the string, and see which character has 1 occurence
        for(int i=0; i<s.length(); i++) {            
            if(freqList[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }
}

// Runtime: 8 ms, faster than 81.50% of Java online submissions for First Unique Character in a String.
// Memory Usage: 39.2 MB, less than 94.73% of Java online submissions for First Unique Character in a String.