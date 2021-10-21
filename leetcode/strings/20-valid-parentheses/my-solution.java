class Solution {
    public boolean isValid(String s) {
        // BRUTEFORCE APPROACH
        
        // using Stack data structure to store the parentheses,
        // so that you can pop out the latest first for checking the order
        Stack<Character> stack = new Stack();
        
        // iterate through the string
        for(int i=0; i<s.length(); i++) {
            // if the char is a open brace, then push it to the stack
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            
            // else, considering there is already opening braces in the stack
            // so, pop the corresponding opening brace to the closing brace.
            } else {
                // if, the stack is empty, then the first brace you are going to insert is a closing brace.
                // then return false.
                if(stack.empty())
                    return false;
                
                char closeBrace = s.charAt(i);
                if(stack.peek() == '(' && closeBrace == ')') {
                    stack.pop();
                }
                else if(stack.peek() == '[' && closeBrace == ']') {
                    stack.pop();
                }
                else if(stack.peek() == '{' && closeBrace == '}') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        // if only opening brace is inserted, then the pop operation wont happen.
        // check if the stack still has some opening braces.
        if(!stack.empty())
            return false;
        
        return true;
    }
}


// Runtime: 1 ms, faster than 99.13% of Java online submissions for Valid Parentheses.
// Memory Usage: 37.2 MB, less than 72.85% of Java online submissions for Valid Parentheses.