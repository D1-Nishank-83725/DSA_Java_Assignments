
public class DLLL {
	

	static class Node{
		int data;
		Node prev;
		Node next;
		
		public Node(int value) {
			data = value;
			prev = next = null;
		}
	}
		
	int count;
	Node head;
	Node tail;
	
	

	
	public DLLL(){
		count = 0;
		head = null;
		tail = null;
	}
	
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	
	
	public void deleteAll() {
		head = tail = null;
		System.out.println("Linked List Deleted Successfully!");
	}
	
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(head == null) {
			head = tail = newnode;
		}
		else {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if(head == null) {
			addFirst(value);
			return;
		}
		Node trav = head;

		while(trav.next != null) {
			trav = trav.next;
		}
		newnode.prev = trav;
		trav.next = newnode;
		tail = newnode;
	}
	
	
	public void deleteFirst() {
		System.out.println(head.data + " deleted successfully!");
		head = head.next;
		head.prev = null;
	}
	
	public void deleteLast() {
		System.out.println(tail.data + " deleted successfully!");
		
		Node trav = head;
		if(head == tail) {
			deleteFirst();
		}

		while(trav.next.next != null) {
			trav = trav.next;
		}
		tail.prev = null;
		trav.next = null;
		tail = trav;
		
	}
	
	
	
	
	

	public void display() {
		if(head == null) {
			System.out.println("Deque Empty!");
			return;
		}
		Node trav = head;
		System.out.print("Elements : ");
		
		do {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}while(trav != null);
		
//		System.out.println("Head Data: " + head.data);
//
//		System.out.println("Tail Data: " + tail.data);
		
	}


	public void peekfront() {
		System.out.println("Value at front : " + head.data);
	}
	

	public void peekback() {
		System.out.println("Value at back : " + tail.data);
	}
	
	
	
	
	
}
	
	

