package algo.mergesort;

public class mergeSort {
	public static void main(String[] args) {
		int[] array = {8,6,4,5,7,2,1,3,9,0,1,3,9,8,8,88,100,33,54};
		sort(array, 0, array.length-1);
		
		System.out.print("[ ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("]");
	}
	
	// split and sort the elements into sub-arrays (DIVIDE part)
	public static void sort(int[] array, int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			sort(array, start, mid);
			sort(array, mid+1, end);
			merge(array, start, mid, end);
		}
	}
	
	// merge the partially sorted arrays (CONQUER part)
	public static void merge(int[] inputArray, int start, int mid, int end) {
		// initialize a new temp array to get the sorted elements merged
		int[] tempArray = new int[end - start +1];
		
		int leftSlot = start;		// variable traversing the left part
		int rightSlot = mid+1;		// variable traversing the right part
		int k = 0;					// variable for inserting slot in the tempArray
		
		// continue traversing the loop until leftSlot reaches the end of the subarray
		// and rightSlot reaches the end of the right subarray
		while(leftSlot <= mid  &&  rightSlot <= end) {
			if(inputArray[leftSlot] < inputArray[rightSlot]) {
				tempArray[k] = inputArray[leftSlot];
				leftSlot++;
			} else {
				tempArray[k] = inputArray[rightSlot];
				rightSlot++;
			}
			k++;
		}
		
		// if it gets here, it means all the elements are sorted
		
		// still elements left over in left subarray (sorted already)
		if(leftSlot <= mid) {
			while(leftSlot <= mid) {
				tempArray[k] = inputArray[leftSlot];
				k++;
				leftSlot++;
			}
		// still elements left over in right subarray (sorted already)
		} else if(rightSlot <= end) {
			while(rightSlot <= end) {
				tempArray[k] = inputArray[rightSlot];
				k++;
				rightSlot++;
			}
		}
		
		for(int i=0; i<tempArray.length; i++) {
			inputArray[start + i] = tempArray[i];
		}
	}
}
