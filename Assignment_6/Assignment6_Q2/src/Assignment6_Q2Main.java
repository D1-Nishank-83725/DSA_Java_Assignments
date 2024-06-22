import java.util.Scanner;


public class Assignment6_Q2Main {

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
				
				
				
			default:
				System.out.println("Invalid Choice! ");
				break;
			}
			
		}
	}
}
