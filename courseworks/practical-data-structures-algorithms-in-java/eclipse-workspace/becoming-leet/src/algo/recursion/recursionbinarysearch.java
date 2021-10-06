package algo.recursion;

public class recursionbinarysearch {
	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		int start = 0, end = array.length-1, mid=0;
		int key = 59;
		
		System.out.println("Index: " + recursiveBinarySearch(array, key, start, end, mid));
	}
	
	public static int recursiveBinarySearch(int[] array, int key, int start, int end, int mid) {
		System.out.println("[ " + start + "..." + end + " ]");
		if(start <= end) {
			mid = (start + end)/2;
			if(key < array[mid]) {
				end = mid-1;
				return recursiveBinarySearch(array, key, start, end, mid);
			} else if(key > array[mid]) {
				start = mid+1;
				return recursiveBinarySearch(array, key, start, end, mid);
			} else {
				return mid;
			}
		}
		
		return -1;
	}
}
