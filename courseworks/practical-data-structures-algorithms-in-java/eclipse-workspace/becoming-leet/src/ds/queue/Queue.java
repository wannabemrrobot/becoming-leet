package ds.queue;

public class Queue {
	private int front;
	private int rear;
	private long[] queueArray;
	private int maxQueueSize;
	private int totalItems;
	
	
	public Queue(int size) {
		this.maxQueueSize = size;
		this.queueArray = new long[size];
		rear = -1;
		front = 0;
		totalItems = 0;
	}
	
	public void insert(long element) {
		// implement maxSize check to add items, to prevent ArrayOutOfBound
		
		// Or implement Circular Queue
		if(rear == maxQueueSize-1) {
			rear = -1;
			front = 0;
		}
		
		rear++;
//		System.out.println("rear incremented: " + rear);
		this.queueArray[rear] = element;
//		System.out.println("element added to list: " + element);
		totalItems++;
//		System.out.println("Total number of items incremented: " + totalItems);
	}
	
	public long remove() {
		// Queue always removes the first element inserted
		
		long firstElement = this.queueArray[front];
		front++;
		
		// front == maxQueueSize, when its the last element going to be removed
		// thus, resetting the Queue to insert from first(Circular Queue)
		if(front == maxQueueSize) {
			front = 0;
		}
		
		totalItems--;
		return firstElement;
	}
	
	public long peekFront() {
		return this.queueArray[front];
	}
	
	public boolean isEmpty() {
		return (totalItems == 0);
	}
	
	public boolean isFull() {
		return (totalItems == maxQueueSize);
	}
	
	public void viewQueue() {
		System.out.print("[ ");
		
//		for(int i=front; i<=rear; i++) {
//			System.out.print(this.queueArray[i] + " ");
//		}
		
		for(int i=0; i<this.queueArray.length; i++) {
			System.out.print(this.queueArray[i] + " ");
		}
		
		System.out.print("]");
		System.out.println("");
	}
}
