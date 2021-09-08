package ds.stack;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string to be reversed: ");
		String string = s.nextLine();
		
		int stackMaxSize = string.length();			// get the size of the string
		Stack stack = new Stack(stackMaxSize);		// initialize stack with the max size of string
		
		for(int i=0; i<stackMaxSize; i++) {
			stack.push(string.charAt(i));
		}
		
		String result = "";
		while(!stack.isEmpty()) {
			char c = stack.pop();
			result = result + c;
		}
		
		System.out.println("Reversed string: " + result);
	}
}
