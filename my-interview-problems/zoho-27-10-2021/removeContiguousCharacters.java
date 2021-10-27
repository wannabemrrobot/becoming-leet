package zoho;

import java.util.Scanner;
import java.util.Stack;

public class removeContiguousCharacters {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		
		String unique = "";
		Stack<Character> stack = new Stack();
		
		char previous = string.charAt(0);
		
		for(Character c: string.toCharArray()) {
			if(!stack.empty()) {
				if(stack.peek() != c && previous != c) {
					System.out.println("pushing1: " +c);
					stack.push(c);
					previous = c;
				} else if(stack.peek() == c) {
					previous = stack.pop();
					System.out.println("popping: " +previous);
				}	
			} else {
				System.out.println("pushing2: " +c);
				stack.push(c);
				previous = c;
			}
		}
		
		for(int i=0; i<stack.size(); i++) {
			unique = unique + stack.get(i);
		}
		
		System.out.println(unique);
	}
}
