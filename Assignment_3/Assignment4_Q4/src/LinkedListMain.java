import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		

		SLLL slll = new SLLL();
		slll.addinsortedmanner(10);
		slll.addinsortedmanner(20);
//		slll.addinsortedmanner(30);
//		slll.addinsortedmanner(40);
//		slll.addFirst(10);
//		slll.addFirst(20);
//		slll.addFirst(30);
//		slll.addFirst(40);
		
		Scanner sc = new Scanner(System.in);
		int choice, value, position;
		
		while(true){
			System.out.println("");
			System.out.println("0: Exit ");
			System.out.println("1: Display SLLL ");			
			System.out.println("2: Add First in SLLL");
			
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
				System.out.println("Enter value to be added FIRST in SLLL: ");
				value = sc.nextInt();
				slll.addinsortedmanner(value);
				System.out.println(value + " successfully added!");
				break;
	
				
			default:
				System.out.println("Invalid Choice!");
				break;
			}

		}
	}

}
