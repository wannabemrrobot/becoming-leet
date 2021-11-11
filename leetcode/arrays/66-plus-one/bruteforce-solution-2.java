import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        // BRUTEFORCE SOLUTION - 2
        
        // string to store the digits
        String num = "";
        for(int i=0; i<digits.length; i++) {
            num = num + (digits[i] + "");
        }
        
        // using BigInteger class(to store large numbers), convert string num to bigint.
        BigInteger number = new BigInteger(num);
        // normal arithmetic operators wont work with bigint
        // they have methods to perform arithmetic operations
        number = number.add(BigInteger.ONE);
        
        // result array to store the number digits after addition
        int[] result = new int[(number+"").length()];
        // index to insert the digits into the result array
        int index = result.length-1;
        
        while(number.compareTo(BigInteger.ZERO) == 1) {
            // obtain the last digit by getting the remainder after mod by 10
            BigInteger lastDigit = number.mod(BigInteger.TEN);
            result[index--] = lastDigit.intValue();
            // remove the last digit from the number by, dividing by 10
            number = number.divide(BigInteger.TEN);
        }
        
        return result;
    }
}

// Runtime: 14 ms, faster than 6.04% of Java online submissions for Plus One.
// Memory Usage: 39.4 MB, less than 6.01% of Java online submissions for Plus One.