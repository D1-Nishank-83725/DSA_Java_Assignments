import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
		 System.out.print("Preorder Traversal : ");
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
			System.out.print(" " + trav.data);
		}
		
	}




	//Inorder
	
	public void inorder() {
		System.out.print("Inorder Traversal : ");
		inorder(root);
		System.out.println();
	}
	
	
	
	private void inorder(Node trav) {
		if(trav == null) {
			return;
		}
		else {
			inorder(trav.left);
			System.out.print(" " + trav.data);
			inorder(trav.right);
		}
	}




	//Postorder
	
	public void postorder() {
		
			System.out.print("postorder Traversal : ");
			postorder(root);
			System.out.println();
		
	}

	
	public void postorder(Node trav) {
		if(trav == null) {
			return;
		}
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data + " ");
	}
	
	
	
	public void search(int value) {
		if(root == null) {
			System.out.println("Tree Empty!");
		}
		else {
			Node trav = root;
			while(trav != null) {
				if(trav.data == value) {
					System.out.println("Key Found!");
					return;
				}
				else if(trav.data >value) {
					trav = trav.left;
				}
				else {
					trav = trav.right;
				}
			}

			System.out.println("Key Not Found!");
			return;
		}
	}
	
	
	public Node[] binarySearchWithParent(int value) {
		Node trav = root;
		Node parent = null;
		if(root == null) {
			System.out.println("Tree Empty!");
		}
		else {
			while(trav != null) {
				if(trav.data == value) {
					break;
				}
				parent = trav;
				if(trav.data >value) {
					trav = trav.left;
				}
				else {
					trav = trav.right;
				}
			}

		}
		return new Node[]{trav, parent};
	}
	
	
	
	public void deleteNode(int value) {
		Node arr[] = binarySearchWithParent(value);
		Node nodeToDelete = arr[0];
		Node parent = arr[1];
		
		
		if(nodeToDelete == null) {
			return;
		}
		
		if(nodeToDelete.left != null && nodeToDelete.right != null) {
			Node successor = nodeToDelete.right;
			parent = nodeToDelete;
			while(successor.left != null) {
				parent = successor;
				successor = successor.left;
			}
			nodeToDelete.data = successor.data;
			nodeToDelete = successor;
		}
		
		if(nodeToDelete.left == null) {
			if(nodeToDelete == root) {
				root = nodeToDelete.right;
			}
			else if(nodeToDelete == parent.left) {
				parent.left = nodeToDelete.right;
			}
			else if(nodeToDelete == parent.right) {
				parent.right = nodeToDelete.right;
			}
		}

		if(nodeToDelete.right == null) {
			if(nodeToDelete == root) {
				root = nodeToDelete.left;
			}
			else if(nodeToDelete == parent.left) {
				parent.left = nodeToDelete.left;
			}
			else if(nodeToDelete == parent.right) {
				parent.right = nodeToDelete.left;
			}
		}
		
		
	}
	
	
	
	public void DFSTraversal() {
		System.out.println("DFS Traversal : ");
		Stack<Node> s = new Stack<BSTree.Node>();
		s.push(root);
		while(!s.isEmpty()) {
			Node trav = s.pop();
			System.out.print(trav.data + " ");
			if(trav.right != null) {
				s.push(trav.right);
			}
			if(trav.left != null) {
				s.push(trav.left);
			}
		}
		System.out.println();
	}
	
	
	
	public void BFSTraversal() {
		System.out.println("DFS Traversal : ");
		Queue<Node> q = new LinkedList<BSTree.Node>();
		q.offer(root);
		while(!q.isEmpty()) {
			Node trav = q.poll();
			System.out.print(trav.data + " ");
			if(trav.left != null) {
				q.offer(trav.left);
			}
			if(trav.right != null) {
				q.offer(trav.right);
			}
		}
		System.out.println();
	}
	
	
	
	public int height(Node trav) {
		if(trav == null) {
			return -1;
		}
		int hl = height(trav.left);
		int hr = height(trav.right);
		
		int max = hl > hr ? hl : hr;
		
		return max + 1;
	
	}
	
	public int height() {
		return height(root);
	}
	
	

}

