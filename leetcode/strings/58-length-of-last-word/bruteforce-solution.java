class Solution {
    public int lengthOfLastWord(String s) {
        // BRUTEFORCE APPROACH USING STRING.SPLIT() METHOD
        
        String[] strList = s.split(" ");
        
        for(int i=strList.length-1; i>=0; i--) {
            if(strList[i] != " ") {
                return strList[i].length();
            }    
        }
        
        return strList[strList.length-1].length();
    }
}

// Runtime: 1 ms, faster than 53.37% of Java online submissions for Length of Last Word.
// Memory Usage: 37.6 MB, less than 60.49% of Java online submissions for Length of Last Word.