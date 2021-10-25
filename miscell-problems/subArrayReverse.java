package zoho;

import java.util.Scanner;

public class subArrayReverse {
	public static void main(String[] args) {
		int[] array = new int[] {0,1,2,3,4,5,6,7,8,9};
		
		Scanner s = new Scanner(System.in);
		int startIndex = s.nextInt();
		s.nextLine();
		
		int endIndex = s.nextInt();
		s.nextLine();
		
		if(startIndex <= endIndex) {
			int[] result = new int[endIndex - startIndex + 1];
			int index = 0;
			for(int i=endIndex; i>=startIndex; i--) {
				result[index] = array[i];
				index = index + 1;
			}
			
			for(Integer num: result) {
				System.out.println(num);
			}
		} else {
			System.out.println("Enter valid start and end index");
		}
	}
}
