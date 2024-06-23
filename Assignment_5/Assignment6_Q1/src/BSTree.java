
public class BSTree {


	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			data = value;
			left = right = null;
				
		}
	}
	
	
	private int count;
	private Node root;
	
	public BSTree() {
		root = null;
	}
	
	


	public boolean isEmpty() {
		return root == null; 
	}
	
	public void deleteAll() {
		root = null;
		System.out.println("Tree deleted Successfully");
	}
	
	
	public void addNode(int value) {		
		if(root == null) {
			root = new Node(value);
		}
		else {
			addNode(root, value);
		}
	}
	
	
	
	
	//addNode - done using recursion, just like traversal, we cannot access method, therefore we make a wrapper method for it, structure is the same, that is recursive call until going/reaching to the desired node then executing the making of the node and placing it properly and exiting
	
	public void addNode(Node trav, int value) {
		
//		Quite Redundant to the case, already handled above
//		if(isEmpty()) {
//			root = trav;
//		}
//			Node newnode = new Node(value);
// 			Why this was avoided, as during each recursion call newnode will be made, even if 
// 			there will be no place to insert the node, therefore we made it just before exiting
		
				if(value < trav.data) {
					if(trav.left == null){
						trav.left = new Node(value);
						count++;
						return;
					}
					else {
						addNode(trav.left, value);
					}
					
				}
				else {
					if(trav.right == null) {
						
						trav.right = new Node(value);
						count++;
						return;
					}
					else {
						addNode(trav.right, value);
					}
				}
			
	}
	
	

	//Preorder
	
	 public void preorder() {
		 System.out.println("Preorder Traversal : ");
		 preorder(root);
		 System.out.println();
	 }
	 
	
	
	
	

	private void preorder(Node trav) {
		if(trav == null) {
			return;
		}
		else {
			preorder(trav.left);
			preorder(trav.right);
			System.out.println(" " + trav.data);
		}
		
	}




	//Inorder
	
	public void inorder() {
		System.out.println("Inorder Traversal : ");
		inorder(root);
		System.out.println();
	}
	
	
	
	private void inorder(Node trav) {
		if(trav == null) {
			return;
		}
		else {
			inorder(trav.left);
			System.out.println(" " + trav.data);
			inorder(trav.right);
		}
	}




	//Postorder
	
	public void postorder() {
		
			System.out.print("postorder Traversal : ");
			postorder(root);
			System.out.println();
		
	}

	
	private void postorder(Node trav) {
		if(trav == null) {
			return;
		}
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data + " ");
	}
	
	
	
	
	
	
}
