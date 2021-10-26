package zoho;

import java.util.Scanner;

public class uniqueChars {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// get the string 1 input from the user
		System.out.println("Enter the String 1:");
		String string1 = s.nextLine();
		
		// get the string 2 input from the user
		System.out.println("Enter the String 2:");
		String string2 = s.nextLine();
		
		int[] alphabets = new int[26];
		
		// O(m) -> m - length of str1
		for(int i=0; i<string1.length(); i++) {
			alphabets[string1.charAt(i) - 'a']++;
		}
		// O(n) -> n - length of str2
		for(int j=0; j<string2.length(); j++) {
			alphabets[string2.charAt(j) - 'a']++;
		}
		
		String unique = "";
		
		// O(26)
		for(int i=0; i<alphabets.length; i++) {
			if(alphabets[i] == 1) {
				unique = unique + ((char)(i + 'a'));
			}
		}
		
		if(unique.length() < 1)
			System.out.println(-1);
		System.out.println(unique);
	}

}
