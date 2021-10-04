package ds.doublylinkedlist;

public class Driver {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertFirst(0);
		list.insertLast(100);
		list.displayForward();
		list.displayBackward();
		
		list.insertAfter(0, 10);
		list.insertBefore(100, 90);
		list.displayForward();
		list.displayBackward();
		list.insertAfter(10, 20);
		list.insertBefore(90, 80);
		list.displayForward();
		list.displayBackward();
		
		list.deleteFirst();
		list.displayForward();
		list.deleteLast();
		list.displayForward();
	}

}
