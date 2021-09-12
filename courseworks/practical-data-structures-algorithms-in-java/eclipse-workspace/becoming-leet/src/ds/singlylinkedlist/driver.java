package ds.singlylinkedlist;

public class driver {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertFirst(30);
		list.insertFirst(40);
		list.insertFirst(50);
		list.insertLast(00);
		
		list.displayList();
		
		list.deleteFirst();
		list.deleteFirst();
		
		list.displayList();
	}
}
