import java.util.Scanner;

import BSTree.Node;


public class Assignment6_Q3Main {

	public static void main(String[] args) {
	

		BSTree bst = new BSTree();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(1);
		bst.addNode(6);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(10);
		bst.addNode(14);
		bst.addNode(13);
		
		Scanner sc = new Scanner(System.in);
		int choice, value;
		
		while(true){
			System.out.println("0: Exit ");
			System.out.println("1: Add Element into BST ");			
			System.out.println("2: Display BST Preorder ");
			System.out.println("3: Display BST Inorder ");
			System.out.println("4: Display BST Postorder ");
			System.out.println("5: Search Element using Key ");
			System.out.println("6: Delete Element using Key ");
			System.out.println("7: DFS Traversal ");
			System.out.println("8: BFS Traversal ");
			System.out.println("9: Print Height of Tree ");
			System.out.println("10: Print Count of leaf nodes in the tree");
			System.out.println("11. Print Count of Non leaf nodes in the tree");
			System.out.println("12. Delete Tree");
			System.out.println("");
			System.out.print("Enter your Choice: ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 0:
				System.out.println("Thank you for using the Program!");
				System.exit(0);
				break;
	
				
			case 1:
				System.out.println("Enter ELEMENT to be Added into BST: ");
				value = sc.nextInt();
				bst.addNode(value);
				System.out.println(value + " added into BST successfully!");
				break;
				

				
			case 2:
				bst.preorder();
				break;
				
				
				
			case 3:
				bst.inorder();
				break;
				
				
				
			case 4:
				bst.postorder();
				break;
				

				
			case 5:
				System.out.println("Enter Value you want to search in BST: ");
				value = sc.nextInt();
				bst.search(value);
//				BSTree.Node searchedNode = bst.search(value);
//				
//				if(searchedNode == null) {
//					System.out.println("Node NOT found!");
//					System.out.println();
//				}
//				else {
//					System.out.println("Node found!");
//				}
				
				break;
				
				
			case 6:
				System.out.println("Enter key of the element you want to delete");
				value = sc.nextInt();
				bst.deleteNode(value);
				System.out.println("Node with value " + value + " successfully deleted!");
				break;
				
			case 7:
				bst.DFSTraversal();
				break;
				

			case 8:
				bst.BFSTraversal();
				break;

			case 9:
				System.out.println("Height of Tree: " + bst.height());
				break;
				
				
			case 10:
				bst.inorderForNodes();
//				System.out.println("Number of Leaf Nodes in BST : " + noln);
				break;
				
				
			case 11:
				bst.inorderForNodes();
//				System.out.println("Number of Non Leaf Nodes in BST : " + nonln);
				break;
				
			case 12:
				bst.deleteAll();
				break;
			
			case 13:
				System.out.println("Enter value of the Node whose DEPTH you want to find in BST: ");
				value = sc.nextInt();
				BSTree.Node n = bst.searchReturningNode(value);
				System.out.println();
			
			default:
				System.out.println("Invalid Choice! ");
				break;
			}
			
		}
	}





}
