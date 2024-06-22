
public class SLLL {
	
	//Fields

	public static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
		
	}
	
	private Node head;
	private Node tail;
	private int count;
	
	
	//Constructor
	
	public SLLL() {
		head = tail = null;
		count = 0;
	}
	
	
	//Display Method
	
	public void display() {
		if(head == null) {
			System.out.println("Stack/Queue Empty!");
			return;
		}
		Node trav = head;
		System.out.print("Stack : ");
		while(trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println("");
	}
	
	
	public void peek() {
		Node trav = head;
		System.out.println("Topmost Element : " + trav.data);
	}
	
	
	public void peekforqueue() {
		if(head == null) {
			System.out.println("Stack/Queue Empty!");
			return;
		}
		Node trav = head;
		System.out.print("Stack : ");
		while(trav.next != null) {
			trav = trav.next;
		}
		System.out.println("Topmost Element : " + trav.data);
	}
	
	
	//AddFirst Method
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
		count++;
	}
	
	//AddLast Method
	
	public void addLast(int value) {
		if(head == null) {
			addFirst(value);
			count++;
			return;
		}
		Node trav = head;
		while(trav.next != null) {
			trav = trav.next;
		}
		Node newnode = new Node(value);
		trav.next = newnode;
		count++;
	}


	public void deleteFirst() {
		if(head == null) {
			System.out.println("SLLL is Empty! Cannot Delete");
		}
		head = head.next;
		count--;
		
	}


	public void deleteLast() {
		Node trav = head;
		while(trav.next.next != null) {
			trav = trav.next;
		}
		trav.next = null;
		count--;
		
	}
	
	public void deleteAll() {
		head = null;
		count = 0;
	}

	
	
	

	public void addAtPosition(int value, int position) {
		Node trav = head;
		Node newnode = new Node(value);
		if(head == null) {
			head = newnode;
		}
		else if(position <= 1) {
			addFirst(value);
		}
		else {			
			for(int i = 0; i < position - 1; i++) {
				trav = trav.next;
			}
			newnode.next = trav.next; 
			trav.next = newnode;
		}
		
	}
	
	
	public void deleteFromPosition(int position) {
		if(head == null) {
			return;
		}
		else if(position <= 1) {
			deleteFirst();
		}
		else if(head.next == null) {
			head = null;
		}
		else {
			Node trav = head;
			
			for(int i = 1; i < position - 1 && trav.next.next != null; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
		
	}
	
	
}
