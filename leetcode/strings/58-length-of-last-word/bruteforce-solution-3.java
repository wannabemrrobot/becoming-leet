class Solution {
    public int lengthOfLastWord(String s) {
        // BRUTEFORCE APPROACH WITHOUT USING STRING.SPLIT() METHOD
        
        boolean lastWordSpace = false;
        int strLength = 0;
        
        for(int i=s.length()-1; i>=0; i--) {
            if(lastWordSpace == true && s.charAt(i) == ' ') {
                break;
            }
            
            if(s.charAt(i) != ' ') {
                strLength = strLength + 1;
                lastWordSpace = true;
            }
        }
        
        return strLength;
    }
}

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
// Memory Usage: 37.2 MB, less than 81.73% of Java online submissions for Length of Last Word.