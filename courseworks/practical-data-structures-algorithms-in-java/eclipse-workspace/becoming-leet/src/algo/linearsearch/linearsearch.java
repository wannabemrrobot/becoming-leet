package algo.linearsearch;
import java.util.Scanner;

public class linearsearch {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner s = new Scanner(System.in);
		System.out.println("[!] Enter the key you want to find: ");
		int key = s.nextInt();
		int result = linearSearch(array, key);
		System.out.println("Result: " + result);
	}
	
	public static int linearSearch(int[] array, int key) {
		for(int i=0; i<array.length; i++) {
			if(array[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
