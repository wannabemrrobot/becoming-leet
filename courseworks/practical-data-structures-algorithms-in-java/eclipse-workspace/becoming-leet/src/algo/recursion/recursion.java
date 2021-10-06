package algo.recursion;

public class recursion {
	public static void main(String[] args) {
		reduceByOne(10);
	}
	
	public static void reduceByOne(int number) {
		if(number >= 0) {
			reduceByOne(number - 1);
		}
		System.out.println("Completed Call: " + number);
	}
}
