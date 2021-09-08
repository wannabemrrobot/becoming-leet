package ds.stack;

public class driver {
	public static void main(String[] args) {
		Stack stack = new Stack(10);
		
		System.out.println("Pushing items into the stack...");
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		System.out.println("Popping out elements: " + stack.pop());
		System.out.println("Printing the last entered element by peak(): " + stack.peak());
		System.out.println("Checking if the stack is empty?: " + stack.isEmpty());
		System.out.println("Checking if the stack is full?: " + stack.isFull());
		
		System.out.println("Pushing more items...");
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
	}
}
