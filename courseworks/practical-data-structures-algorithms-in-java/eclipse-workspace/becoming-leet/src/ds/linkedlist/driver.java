package ds.linkedlist;

public class driver {
	public static void main(String[] args) {
		
		Node nodeA = new Node();
		nodeA.data = 2;
		
		Node nodeB = new Node();
		nodeB.data = 4;
		
		Node nodeC = new Node();
		nodeC.data = 6;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		// these connections are what makes the linked list.
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		
		// print the lengths of the given node lists
		System.out.println("Length of nodeA: "+ listLength(nodeA));
		System.out.println("Length of nodeB: "+ listLength(nodeB));
		System.out.println("Length of nodeC: "+ listLength(nodeC));
		System.out.println("Length of nodeD: "+ listLength(nodeD));
	}
	
	// a method to return the length of the linked lists
	public static int listLength(Node node) {
		int length = 0;
		Node currentNode = node;
		while(currentNode != null) {
			length++;
			currentNode = currentNode.next;
		}
		
		return length;
	}
}
