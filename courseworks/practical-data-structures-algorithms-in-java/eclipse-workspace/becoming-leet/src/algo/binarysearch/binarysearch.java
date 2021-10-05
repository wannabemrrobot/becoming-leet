package algo.binarysearch;
import java.util.Scanner;

public class binarysearch {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		Scanner s = new Scanner(System.in);
		System.out.println("[!] Enter the key you want to find: ");
		int key = s.nextInt();
		int result = binarySearch(array, key);
		System.out.println("Result: " + result);
	}
	
	public static int binarySearch(int[] array, int key) {
		// assuming that the array is sorted, as binary search only works in sorted array
		int start = 0;
		int end = array.length-1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			
			if(array[mid] == key) {
				return mid;
			} else if(array[mid] > key) {
				end = mid -1;
			} else if(array[mid] < key) {
				start = mid +1;
			}	
		}
		return -1;
	}
}
