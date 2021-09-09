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
		rear++;
		this.queueArray[rear] = element;
		totalItems++;
	}
	
	public void remove() {
		
	}
	
	public void viewQueue() {
		System.out.print("[ ");
		for(int i=0; i<this.queueArray.length; i++) {
			System.out.print(this.queueArray[i] + " ");
		}
		System.out.print("]");
	}
	
	public long peak() {
		
	}
}
