package zoho;

import java.util.Scanner;

public class minCurrenciesPrinted {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of states: ");
		int num = s.nextInt();
		System.out.println("Enter the financial need of each state: ");
		int[] finNeed = new int[num];
		
		for(int i=0; i<num; i++) {
			finNeed[i] = s.nextInt();
			s.nextLine();
		}
		
		int[] denomination = new int[num];
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<finNeed.length; i++) {
			if(finNeed[i] < min) {
				min = finNeed[i];
			}
		}
		
		if(min != 1) {
			for(int i=0; i<finNeed.length; i++) {
				if(finNeed[i] % min != 0) {
					denomination = finNeed;
					System.out.println("Minimum denomation is: " + 1);
					break;
				}
				
				denomination[i] = finNeed[i]/min;
			}
		} else if(min == 1) {
			System.out.println("Minimum Denomination is: " + 1);
			denomination = finNeed;
		}
		
		System.out.println("Minimum denomination is: " + min);
		System.out.print("[ ");
		for(int i=0; i<denomination.length; i++) {
			System.out.print(denomination[i] + ", ");
		}
		System.out.println("]");
	}
}
