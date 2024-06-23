import java.util.Scanner;

public class Assignment5_Q2Queue {

	public static void main(String[] args) {
		SLLL slll = new SLLL();
//		slll.addFirst(10);
//		slll.addFirst(20);
//		slll.addFirst(30);
//		slll.addFirst(40);
		
		Scanner sc = new Scanner(System.in);
		int choice, value;
		
		while(true){
			System.out.println("");
			System.out.println("0: Exit ");
			System.out.println("1: Display Queue ");
			System.out.println("2: Add Element into Queue ");
			System.out.println("3: Remove Element from Queue ");
			System.out.println("4: PEEK Element from Queue ");
			
			System.out.println("");
			System.out.print("Enter your Choice: ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Thank you for using the Program!");
				System.exit(0);
				break;
				
			case 1:
				slll.display();
				break;
				
				
			case 2:
				System.out.println("Enter ELEMENT to be Added into Queue: ");
				value = sc.nextInt();
				slll.addFirst(value);
				System.out.println(value + " added to queue successfully!");
				break;
				
				
			case 3:
				slll.deleteLast();
				System.out.println("Element removed successfully !");
				break;
				
			
			case 4:
				slll.peekforqueue();
				break;
				

				
			default:
				System.out.println("Invalid Choice! ");
				break;
			}
			
			
		}


	}

}


