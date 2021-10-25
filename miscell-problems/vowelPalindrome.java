package zoho;

import java.util.ArrayList;
import java.util.Arrays;

public class vowelPalindrome {
	public static void main(String[] args) {
		String string = "aeiouuoiea";
		String result = "";
		ArrayList<Character> vowels = new ArrayList(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		
		for(Character c: string.toCharArray()) {
			if(vowels.contains(c)) {
				result = result + c;
			}
		}
		
		String palindrome = "";
		for(int i=result.length()-1; i>=0; i--) {
			palindrome = palindrome + result.charAt(i);
		}
		
		if(result.equals(palindrome)) {
			System.out.println(result);
			System.out.println(palindrome);
			System.out.println(true);
		}
		else {
			System.out.println(result);
			System.out.println(palindrome);
			System.out.println(false);
		}	
	}
}
