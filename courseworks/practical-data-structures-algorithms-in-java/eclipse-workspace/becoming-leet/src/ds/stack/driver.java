package ds.stack;

public class driver {
	public static void main(String[] args) {
		Stack stack = new Stack(10);
		
		System.out.println("Pushing items into the stack...");
		stack.push('d');
		stack.push('a');
		stack.push('t');
		stack.push('a');
		stack.push('s');
		stack.push('t');
		stack.push('r');
		
		System.out.println("Popping out elements: " + stack.pop());
		System.out.println("Printing the last entered element by peak(): " + stack.peak());
		System.out.println("Checking if the stack is empty?: " + stack.isEmpty());
		System.out.println("Checking if the stack is full?: " + stack.isFull());
		
		System.out.println("Pushing more items...");
		stack.push('u');
		stack.push('c');
		stack.push('t');
		stack.push('u');
		stack.push('r');
		stack.push('e');
		stack.push('s');
		
	}
}
