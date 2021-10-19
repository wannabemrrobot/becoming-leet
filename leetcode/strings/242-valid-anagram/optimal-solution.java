class Solution {
    public boolean isAnagram(String s, String t) {
        
        // anagram strings are of same size
        if(s.length() != t.length()) return false;
        // frequency array to store the character count
        int[] freqArray = new int[26];
        
        // iterate through the characters in string 's' and add the count in the freqArray
        for(int i=0; i<s.length(); i++) freqArray[s.charAt(i) - 'a']++;
        // iterate through the characters in string 't' and decrement the count of the characters in freqArray.
        // here, if the character exists, it decrements and checks if the count < 0 for count mismatch
        // if the character does not exist in freqArray(means string 's' does not have it), it decrements the count below 0(-ve)
        for(int i=0; i<t.length(); i++) if(--freqArray[t.charAt(i) - 'a']<0) return false;
        return true;
    }
}

// Runtime: 3 ms, faster than 82.31% of Java online submissions for Valid Anagram.
// Memory Usage: 39 MB, less than 92.05% of Java online submissions for Valid Anagram.