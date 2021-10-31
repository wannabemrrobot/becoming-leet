class Solution {
    public boolean isPalindrome(int x) {
        // MY BRUTEFORCE SOLUTION
        
        String string = String.valueOf(x);
        String palindrome = "";
        
        for(int i=string.length()-1; i>=0; i--) {
            palindrome = palindrome + string.charAt(i);
        }
        
        return (string.equals(palindrome));
    }
}

// Runtime: 22 ms, faster than 12.80% of Java online submissions for Palindrome Number.
// Memory Usage: 39.7 MB, less than 48.42% of Java online submissions for Palindrome Number.