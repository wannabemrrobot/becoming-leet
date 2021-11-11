class Solution {
    public int[] plusOne(int[] digits) {
        // OPTIMAL SOLUTION
        
        // iterate the array in backwards
        for(int i=digits.length-1; i>=0; i--) {
            // if the digit is less than 9, add the digit and return the digits array
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // else, make it as 0 and in the next iteration the subsequent bit will be added by carry bit
            digits[i] = 0;
        }
        
        
        // this part of code is executed only if the array contains all zeroes
        int[] result = new int[digits.length+1];
        result[0] = 1;
        
        return result;
    }
}

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
// Memory Usage: 37.5 MB, less than 63.97% of Java online submissions for Plus One.