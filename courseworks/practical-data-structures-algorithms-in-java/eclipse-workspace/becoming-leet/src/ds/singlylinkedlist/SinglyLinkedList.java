package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;
	private Node last;
	
	public SinglyLinkedList() {
		
	}
	
	// insert a new node to the first of the linkedlist
	public void insertFirst(int data) {
		// NOTE: In Java, Objects are accessed by references. 
		// References are just a variable that points to objects.
		Node newNode = new Node();		// create a new node to insert
		newNode.data = data;
		newNode.next = first;			// assign the first node's reference to the newNode's next reference (changing references)
		first = newNode;				// assign this newNode as the first node (changing object)
	}
	
	// insert a new node to the end of the linkedlist
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			current = current.next;
		}
		
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		current.next = newNode;
	}
	
	// delete the first node
	public Node deleteFirst() {
		Node oldFirst = first;
		first = first.next;				// assign the second node(first.next holds the reference for second) to first
		return oldFirst;
	}
	
	public boolean isEmpty() {
		// linkedlist will be empty if first node points to null
		return (first == null);
	}
	
	public void displayList() {
		System.out.println("[+] LinkedList Order: First -> Last");
		System.out.print("[   ");
		
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("   ]");
	}
	
}
