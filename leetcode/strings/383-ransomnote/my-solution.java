class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        // array to store the frequency of characters in magazine
        int[] freqArray = new int[26];
        
        // store the frequency of the characters in magazine
        for(int i=0; i<magazine.length(); i++) {
            freqArray[magazine.charAt(i) - 'a']++;
        }
        
        // decrement for every occurence of characters in ransomNote in the array, also
        // subsequently check for any values lesser than 0(ransomNote contains characters that magazine dont have).
        for(int i=0; i<ransomNote.length(); i++) {
            if(--freqArray[ransomNote.charAt(i) - 'a']<0) return false;
        }
        
        return true;
    }
}

// Runtime: 4 ms, faster than 66.56% of Java online submissions for Ransom Note.
// Memory Usage: 42.4 MB, less than 39.87% of Java online submissions for Ransom Note.