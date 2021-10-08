package algo.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {1,0,8,6,55,32,46,100,85,7,6};
		selectionSort(array);
		
		System.out.print("[ ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("]");
	}
	
	public static int[] selectionSort(int[] array) {
		for(int i=0; i<array.length; i++) {
			int min = i;
			
			for(int j=i+1; j<array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		return array;
	}
	
	// my first approach
//	public static int[] selectionSort(int[] array) {
//		for(int i=0; i<array.length; i++) {
//			int min = array[i];
//			
//			for(int j=i+1; j<array.length; j++) {
//				if(array[j] < array[i]) {
//					int temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//					min = array[i];
//				}
//			}
//		}
//		return array;
//	}

}
