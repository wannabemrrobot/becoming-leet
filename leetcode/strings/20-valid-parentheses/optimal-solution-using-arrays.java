public class Solution {
	public boolean isValid(String s) {
        // OPTIMAL SOLUTION USING CHARACTER ARRAYS INSTEAD OF STACK
        
        // character array to store the parentheses
		char[] stack = new char[s.length()];
        // head pointer to stimulate the stack
		int head = 0;
        
        
		for(char c : s.toCharArray()) {
			switch(c) {
                // if the character encountered is the opening brace, then insert it into the array
				case '{':
				case '[':
				case '(':
                    // insert the character and increment the head pointer
					stack[head++] = c;
					break;
                
                // if the character encountered is the closing brace, check if the stack is empty.
                // cause, a valid parentheses seq wont have closing braces in the first.
				case '}':
					if(head == 0 || stack[--head] != '{') return false;
					break;
				case ')':
					if(head == 0 || stack[--head] != '(') return false;
					break;
				case ']':
					if(head == 0 || stack[--head] != '[') return false;
					break;
			}
		}
        // after all the above calculations, we could end up with an array, that has only the opening braces,
        // thus, checking for array emptiness will help
		return head == 0;

	}
}