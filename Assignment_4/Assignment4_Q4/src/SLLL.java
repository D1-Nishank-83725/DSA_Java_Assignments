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
	
	public void display() {
		Node trav = head;
		System.out.println("Elements : ");
		do {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}while(trav != null);
	}
	
	
//	
//	public void addinsortedmanner(int value) {
//		Node newnode = new Node(value);
//		Node trav = head;
//		
//			if(head == null) {
//				head = newnode;
//			}
//			
//			else if(trav == head && trav.data <= value){
//				addFirst(value);
//			}
//			
//			else if(trav == head && trav.data > value){
//				trav.next = newnode;
//			}
//			
//			else{
//				while(trav.next.data < value) {
//					trav = trav.next;
//				}
//				newnode.next = trav.next;
//				trav.next = newnode;
//			}
//		}
	
	public void addinsortedmanner(int value) {
		//Used Help
        Node newnode = new Node(value);   
        if (head == null || head.data >= value) {
            newnode.next = head;
            head = newnode;
        } else {
            Node trav = head;
            while (trav.next != null && trav.next.data < value) {
                trav = trav.next;
            }
            newnode.next = trav.next;
            trav.next = newnode;
        }
    }
		
}
	




