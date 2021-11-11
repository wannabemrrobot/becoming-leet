class Solution {
    public boolean isHappy(int n) {
        // BRUTEFORCE SOLUTION
        
        Boolean happy = false;
        
        // loop until happy boolean becomes explicitly true
        while(!happy) {
            // sum variable to keep track of sum
            int sum = 0;
            int number = n;
            
            // calculate the sum of squares of the digits
            while(number > 0) {
                int digit = number % 10;
                sum = sum + (digit * digit);
                number = number / 10;
            }
            
            // if the sum equals 1, then it is a happy number
            if(sum == 1) {
                happy = true;
            // the unhappy number will have a sum - 4 in a cycle
            } else if(sum == 4) {
                happy = false;
                break;
            // else, assign the sum of the squares of the digits to the number
            // and continue the loop
            } else {
                n = sum;
            }
        }
        
        return happy;
    }
}

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Happy Number.
// Memory Usage: 35.9 MB, less than 77.22% of Java online submissions for Happy Number.