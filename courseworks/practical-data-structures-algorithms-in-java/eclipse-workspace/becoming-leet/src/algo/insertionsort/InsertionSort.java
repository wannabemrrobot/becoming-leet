package algo.insertionsort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] array = {1,5,6,2,4,3,8,9,7,0};
		insertionSort(array);
		
		System.out.print("[ ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("]");
	}
	
	public static int[] insertionSort(int[] array) {
		for(int i=1; i<array.length; i++) {
			int element = array[i];
			int j=i-1;
			
			while(j>=0 && element < array[j]) {
				array[j+1] = array[j];
				j--;
			}
			
			array[j+1] = element;
		}
		return array;
	}
}
