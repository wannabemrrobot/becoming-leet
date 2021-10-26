package zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class removeCommonChars {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// get the string 1 input from the user
		System.out.println("Enter the String 1:");
		String string1 = s.nextLine();
		
		// get the string 2 input from the user
		System.out.println("Enter the String 2:");
		String string2 = s.nextLine();
		
		// string to store the unique characters in both the string
		String unique = "";
		
		// iterate through the first string and check if the character is present in the second string.
		// if not, concatenate with unique string
		for(int i=0; i<string1.length(); i++) {
			char c = string1.charAt(i);
			if(!string2.contains(c + "")) {
				unique = unique + c;
			}
		}
		
		// iterate through the second string and check if the character is present in the first string.
		// if not, concatenate with unique string
		for(int i=0; i<string2.length(); i++) {
			char c = string2.charAt(i);
			if(!string1.contains(c + "")) {
				unique = unique + c;
			}
		}
		
		// if the length of the unique string is 0, then string 1 and 2 contains the same characters
		// and there is not unique characters.
		if(unique.length() < 1)
			System.out.println(-1);
		
		System.out.println(unique);
	}
}
