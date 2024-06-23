
public class SLLL {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	int count;
	Node head;
	
	public SLLL() {
		count = 0;
		head = null;
	}
	
	public void display() {
		Node trav = head;
		System.out.println("Elements : ");
		do {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}while(trav != null);
	}
	
	
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(head == null) {
			head = newnode;
		}
		
		else {
			newnode.next = head;
			head = newnode;
		}
		
	}
	

	
	public void addBefore(int value, int position) {
		Node newnode = new Node(value);
		Node trav = head;
		if(position <= 1) {
			addFirst(value);
			return;
		}
		for(int i = 1; i < position - 2; i++) {
			trav = trav.next;
		}
		newnode.next = trav.next;
		trav.next = newnode;
		
	}
	
	

	
	public void addAfter(int value, int position) {
		Node newnode = new Node(value);
		Node trav = head;
		if(position <= 0) {
			addFirst(value);
			return;
		}
		for(int i = 1; i < position; i++) {
			trav = trav.next;
		}
		newnode.next = trav.next;
		trav.next = newnode;
		
	}


}
