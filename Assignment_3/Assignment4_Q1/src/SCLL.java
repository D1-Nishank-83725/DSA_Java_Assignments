public class SCLL {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
//	private Node head;
	private Node tail;
	private int count;
	
	
//	T.C : O(n)
	public void display() {
		if(tail == null) {
			System.out.println("No elements!");
			return;
		}
		Node trav = tail.next;
		System.out.println("SCLL Values : ");
		do {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}while(trav != tail.next);
		
	}



//	T.C : O(1)
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(tail == null) {
			tail = newnode;
			newnode.next = newnode;
		}
		else {
			newnode.next = tail.next;	
			tail.next = newnode;
		}
		
	}



//	T.C : O(1)
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(tail == null) {
			addFirst(value);
		}
		else {			
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
	}
	


//	T.C : O(1)
	public void deleteFirst() {
		tail.next = tail.next.next;
	}
	
	

//	T.C : O(n)
	public void deleteLast() {
		Node trav = tail;
		do {
			trav = trav.next;
		}while(trav.next != tail);
		trav.next = tail.next;
		tail = trav;
	}



//	T.C : O(1)
	public void deleteAll() {
		tail = null;
		
	}



//	T.C : O(n)
	public void addAtPosition(int value, int position) {
		Node trav = tail.next;
		Node newnode = new Node(value);
		if(tail == null) {
			addFirst(value);
		}
		else if(position <= 1) {
			addFirst(value);
		}
		else {			
			for(int i = 1; i < position - 1; i++) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
		
	}



//	T.C : O(n)
	public void deleteFromPosition(int position) {
		
		Node trav = tail.next;
		if(tail == null) {
			System.out.println("SCLL Empty! Cannot Delete!");
		}
		else if(position <= 1) {
			tail = null;
		}
		else {			
			for(int i = 1; i < position - 1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}
	
	
	

}
