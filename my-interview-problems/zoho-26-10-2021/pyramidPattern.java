package zoho;

import java.util.Scanner;

public class pyramidPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern:");
		int rows = s.nextInt();

		// loop will iterate for (rows) times
		for(int i=1; i<=rows; i++) {
			// print spaces to get the pyramid form
			System.out.print(" ".repeat(rows-i));
			
			// increment to (rows)numbers horizontally
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			
			// decrement from (rows) number horizontally
			for(int k=i-1; k>=1; k--) {
				System.out.print(k + " ");
			}
			
			System.out.print("\n");
		}
	}

}
