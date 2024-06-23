import java.util.Scanner;

public class Assignment5_Q1Stack {

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
			System.out.println("1: Display Stack ");
			System.out.println("2: PUSH Element into Stack ");
			System.out.println("3: POP Element from Stack ");
			System.out.println("4: PEEK Element from Stack ");
			
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
				System.out.println("Enter ELEMENT to be PUSHED into Stack: ");
				value = sc.nextInt();
				slll.addFirst(value);
				System.out.println(value + " added to FIRST successfully!");
				break;
				
				
			case 3:
				slll.deleteFirst();
				System.out.println("Element popped successfully !");
				break;
				
			
			case 4:
				slll.peek();
				break;
				

				
			default:
				System.out.println("Invalid Choice! ");
				break;
			}
			
			
		}

	}

}
