package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public void insertFirst(int data) {
		// dealing mainly with changing the first reference variable
		Node newNode = new Node();
		newNode.data = data;
		
		// if empty and we are using first and last variables as only reference to the nodes in that position,
		// we have no track of the last node, so assigning the last to the only one element in the list which we add.
		if(isEmpty()) {
			last = newNode;
		} else {
			first.previous = newNode;		// current first node's previous will be newNode
		}
		
		newNode.next = first;			// newNode's next will be the current first node
		first = newNode;				// now change the first reference variable to newNode
		first.previous = null;			// set first's previous to null(no need explicitly BTW)
	}
	
	public void insertLast(int data) {
		// dealing mainly with changing the last reference variable
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		}
		
		newNode.previous = last;		// newNode's previous will be the current last node
		last.next = newNode;			// current last node's next will be newNode
		last = newNode;					// now change the last reference variable to newNode
		last.next = null;				// explicitly assigning last's next to null
	}
	
	// assuming a non-empty list
	public int deleteFirst() {
		int temp = first.data;
		// if only one element exist in the list
		if(first.next == null) {
			last = null;
		}
		first.next.previous = null;
		first = first.next;
		return temp;
	}
	
	// assuming a non-empty list
	public int deleteLast() {
		int temp = last.data;
		// if only one element exist in the list
		if(last.previous == null) {
			first = null;
		}
		last.previous.next = null;
		last = last.previous;
		return temp;
	}

	// assuming a non-empty list
	public boolean insertAfter(int key, int data) {
		Node current = first;
		while(current.data != key) { // loop continues until it finds the given key(node.data)
			current = current.next;
			if(current == null) {	 // if the current is null, then there is no such key in the entire list
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last) {
			// if the current node is the last node, then assign last reference variable
			// to the newNode
			current.next = null;
			last = newNode;
		} else {
			// there wont be any current.next, if current is the last node
			newNode.next = current.next;
			current.next.previous = newNode;
		}
		
		current.next = newNode;
		newNode.previous = current;
		return true;
	}
	
	// assuming a non-empty list
	public boolean insertBefore(int key, int data) {
		Node current = first;
		while(current.data != key) {
			current = current.next;
			if(current == null) {
				return false;
			}
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last) {
			
		}
		
		newNode.next = current;
		newNode.previous = current.previous;
		current.previous.next = newNode;
		return true;
	}
	
	// assuming a non-empty list
	public Node deleteNode(int key) {
		Node current = first;
		while(current.data != key) {
			current = current.next;
			if(current == null) {
				return null;
			}
		}
		
		if(current == first) {
			first = current.next;
		}
		
		if(current == last) {
			last = current.previous;
		}
		
		current.next.previous = current.previous;
		current.previous.next = current.next;
		return current;
	}
	
	public void displayForward() {
		System.out.println("[+] LinkedList Order: First -> Last");
		System.out.print("[   ");
		
		Node current = first;
		while(current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println("   ]");
	}
	
	public void displayBackward() {
		System.out.println("[+] LinkedList Order: Last -> First");
		System.out.print("[   ");
		
		Node current = last;
		while(current != null) {
			current.displayNode();
			current = current.previous;
		}
		System.out.println("   ]");
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}
