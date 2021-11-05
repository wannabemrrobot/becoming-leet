class Solution {
    public int lengthOfLastWord(String s) {
        // BRUTEFORCE APPROACH WITHOUT USING STRING.SPLIT() METHOD
        
        boolean lastWordSpace = false;
        String lastWord = "";
        
        for(int i=s.length()-1; i>=0; i--) {
            if(lastWordSpace == true && s.charAt(i) == ' ') {
                return lastWord.length();
            }
            
            if(s.charAt(i) != ' ') {
                lastWord = lastWord + s.charAt(i);
                lastWordSpace = true;
            }
        }
        
        return lastWord.length(); 
    }
}

// 58 / 58 test cases passed.
// Status: Accepted
// Runtime: 4 ms
// Memory Usage: 37.7 MB