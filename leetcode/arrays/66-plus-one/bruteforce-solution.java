class Solution {
    public int[] plusOne(int[] digits) {
        // BRUTEFORCE SOLUTION
        
        // array to store the digits as we iterate through the digits
        int[] temp = new int[digits.length+1];
        // boolean to know if there is a carry bit for addition on next iteration
        Boolean carryBit = false;

        // determine the initial carry bit state,
        // if the last digit is 9, then the carry bit is true
        if(digits[digits.length-1] != 9)
            carryBit = false;
        else
            carryBit = true;
        
        // iterate the digits array
        for(int i=digits.length-1; i>=0; i--) {
            // this condition will be executed when the current digit is to be added by 1, and it's 9
            // if the current digit is 9, then adding one gives a carry bit(carryBit = true)
            // also, the digit will become 0(9+1=10 -> 1 is carried)
            if(digits[i] == 9 && carryBit == true) {
                carryBit = true;
                temp[i+1] = 0;
            // this condition will get executed when the current digit is not 9, but it needs to be added by 1
            // add the digit and set the carryBit to false, so that the subsequent 
            // upcoming(<-digit iteration direction) digits wont get added by carry bit
            } else if(digits[i] != 9 && carryBit == true) {
                temp[i+1] = digits[i]+1;
                carryBit = false;
            // this condition will get executed when the carryBit is false, but its the last digit(also not equal to 9)
            } else if(carryBit == false && i==digits.length-1) {
                temp[i+1] = digits[i]+1;
                carryBit = false;
            // this condition will get executed when the carryBit is false, also it's not the last digit.
            } else {
                temp[i+1] = digits[i];
                carryBit = false;
            }
        }
        
        if(carryBit == true)
            temp[0] = 1;
        else {
            int[] result = new int[temp.length - 1];
            for(int i=1; i<temp.length; i++) {
                result[i-1] = temp[i];
            }
            
            temp = result;
        }
        
        return temp;
    }
}

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
// Memory Usage: 37.6 MB, less than 52.38% of Java online submissions for Plus One.