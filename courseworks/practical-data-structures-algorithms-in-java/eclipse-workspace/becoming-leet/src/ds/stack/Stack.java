package ds.stack;

public class Stack {
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char element) {
		if(isFull()) {
			System.out.println("[!] You are trying to push more number of elements than the stack could hold.");
		} else {
			top++;
			this.stackArray[top] = element;	
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("[!] You are trying to pop out elements in an empty stack");
			return '!';
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
	
	public char peak() {
		return this.stackArray[top];
	}
}
