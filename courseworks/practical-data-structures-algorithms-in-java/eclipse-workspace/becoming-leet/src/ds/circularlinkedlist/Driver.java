package ds.circularlinkedlist;

import ds.singlylinkedlist.SinglyLinkedList;

public class Driver {

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.insertFirst(10);
		list.insertLast(100);
		list.displayList();
		
		list.insertLast(200);
		list.displayList();
		
		list.insertFirst(0);
		list.displayList();
		
		list.deleteFirst();
		list.displayList();
		
		list.deleteFirst();
		list.displayList();
		
		list.deleteFirst();
		list.displayList();
		
		list.deleteFirst();
		list.displayList();
		
		list.deleteFirst();
		list.displayList();
	}

}
