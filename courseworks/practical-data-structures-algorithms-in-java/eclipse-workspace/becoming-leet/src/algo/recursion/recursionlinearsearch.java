package algo.recursion;

public class recursionlinearsearch {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		System.out.println(linearSearch(array, 0, 5));
	}
	
	public static int linearSearch(int[] array, int index, int key) {
		if(index < array.length) {
			if(array[index] == key) {
				return index;
			} else {

				// Note: In the method args, index++ won't work and will give stack overflow error, cz it's post-increment
				// It means, it increments the index value after the operation is over
				// ++index is pre-increment which increments the value and then executes the operation
				
				System.out.println("index searched: " + index);
				return linearSearch(array, ++index, key);
			}
		}

		return -1;
	}
}
