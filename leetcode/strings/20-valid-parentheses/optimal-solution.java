public class Solution {
    public boolean isValid(String s) {
        // OPTIMAL SOLUTION
    
        // This solution works in a way, that instead of pushing the opening braces, 
        // you push the corresponding closing braces and when the closing brace is encountered in
        // the string, you pop the last brace. if it's not the same, return false;
        // at last, check if the stack is empty, 'cause you may encounter only the opening brace and since
        // we dont check for the string equality, the stack may end up having braces.
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}