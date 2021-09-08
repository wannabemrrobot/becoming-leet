package ds.stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}
	
	public void push(long element) {
		if(isFull()) {
			System.out.println("[!] You are trying to push more number of elements than the stack could hold.");
		} else {
			top++;
			this.stackArray[top] = element;	
		}
	}
	
	public long pop() {
		if(isEmpty()) {
			System.out.println("[!] You are trying to pop out elements in an empty stack");
			return -1;
		} else {
			int old_top = top;
			top--;
			return this.stackArray[old_top];	
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == this.maxSize-1);
	}
	
	public long peak() {
		return this.stackArray[top];
	}
}
