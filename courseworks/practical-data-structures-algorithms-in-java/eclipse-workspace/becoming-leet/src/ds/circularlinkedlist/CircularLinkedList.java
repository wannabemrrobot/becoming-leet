package ds.circularlinkedlist;

import ds.singlylinkedlist.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		first = null;
		last = null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		// check id linkedlist is empty,
		// if yes, point the last node to newNode
		if(isEmpty()) {
			last = newNode;
		}
		
		newNode.next = first;
		first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		last.next = newNode;
		last = newNode;
		
		if(isEmpty()) {
			first = newNode;
		}
	}
	
	public int deleteFirst() {
		int temp = first.data;
		
		if(first.next == null) {
			last = null;
		}
		
		first = first.next;
		return temp;
	}

	public boolean isEmpty() {
		return first==null;
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
