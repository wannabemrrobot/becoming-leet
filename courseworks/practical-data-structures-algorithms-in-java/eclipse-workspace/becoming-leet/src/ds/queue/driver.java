package ds.queue;

public class driver {
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		
		System.out.println("Adding elements to the list: 10, 20, 30, 40, 50");
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		queue.insert(50);
		
		System.out.println("Viewing the queue after insertion: ");
		queue.viewQueue();
		
		System.out.println("Removing elements from the queue: ");
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println("Viewing the queue after removing: ");
		queue.viewQueue();
		
		System.out.println("Adding more elements after Queue is filled: 40, 50");
		queue.insert(40);
		queue.insert(50);
		queue.viewQueue();
	}
}
