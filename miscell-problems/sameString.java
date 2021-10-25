package zoho;

import java.util.Scanner;

public class sameString {
	public static void main(String[] args) {
		String string1 = "you are the shadow to my light, in my dream land";
		String string2 = "you are the shadow gonna talking, lead me in the street";
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the word count to check after replacement: ");
		int wordCount = s.nextInt();
		
		String[] stringArray1 = string1.split(" ");
		String[] stringArray2 = string2.split(" ");
		
		String result = "";
		for(int i=0; i<stringArray1.length; i++) {
			if(i<wordCount) {
				result = result + stringArray2[i];
			} else {
				result = result + stringArray1[i];
			}
			
			if(i<stringArray1.length-1)
				result = result + " ";
		}
		
		System.out.println(result);
		System.out.println(result.equals(string1));
	}
}
