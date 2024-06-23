
public class BSTree {
	

	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	private Node root;
	private int count;
	

	
	
	public BSTree() {
		count = 0;
		root = null;
	}
	
	
	
	public boolean isEmpty() {
		return root == null;
	}
	
	
	
	public void deleteAll() {
		root = null;
		System.out.println("BSTree Deleted Successfully!");
	}
	
	
	public void addNode(int value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			root = newnode;
		}
		
		else {
			Node trav = root;
			while(true) {
				if(value < trav.data) {
					if(trav.left == null) {
						trav.left = newnode;
						count++;
						break;
					}
					else {
						trav = trav.left;
					}
				}
				else {
					if(trav.right == null) {
						trav.right = newnode;
						count++;
						break;
					}
					else {
						trav = trav.right;
					}
				}
			}
		}
	}
	
	
	
	public void preorder(Node trav) {
		if(trav == null) {
			return;
		}
		System.out.print(trav.data + " ");
		preorder(trav.left);
		preorder(trav.right);
	}
	
	public void preorder() {
		if(root == null) {
			System.out.println("Tree Empty!");
		}
		else {			
			System.out.print("Preorder Traversal : ");
			preorder(root);
			System.out.println();
		}
		
	}
	

	
	
}
