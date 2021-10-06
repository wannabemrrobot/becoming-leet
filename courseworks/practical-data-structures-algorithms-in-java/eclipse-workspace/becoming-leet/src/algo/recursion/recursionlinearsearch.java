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

// OUTPUT: 

//index searched: 0
//index searched: 1
//index searched: 2
//index searched: 3
//4

// Here, 4 is the resultant index. By means of recursion, the result 4 is actually returned to the
// method which invoked it, which is the method that resulted [index searched: 2], which inturn returned
// to the method which invoked it. Finally, the result was printed in the last method which is invoked.

