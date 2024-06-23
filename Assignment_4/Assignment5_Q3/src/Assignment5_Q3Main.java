import java.util.Scanner;

public class Assignment5_Q3Main {

	public static void main(String[] args) {

		BSTree bst = new BSTree();
		
		
		Scanner sc = new Scanner(System.in);
		int choice, value;
		
		while(true){
			System.out.println("0: Exit ");
			System.out.println("1: Display BST Preorder ");
			System.out.println("2: Add Element into BST ");			
			System.out.println("");
			System.out.print("Enter your Choice: ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 0:
				System.out.println("Thank you for using the Program!");
				System.exit(0);
				break;
				
			case 1:
				bst.preorder();
				break;
				

				
			case 2:
				System.out.println("Enter ELEMENT to be Added into BST: ");
				value = sc.nextInt();
				bst.addNode(value);
				System.out.println(value + " added into BST successfully!");
				break;
				
		
				
			default:
				System.out.println("Invalid Choice! ");
				break;
			}
			
			
		}
//		bst.addNode(10);
//		bst.addNode(3);
//		bst.addNode(20);
//		bst.addNode(17);
//		bst.addNode(1);
//		bst.addNode(5);
//		
//	
//		bst.preorder();


	}

}


