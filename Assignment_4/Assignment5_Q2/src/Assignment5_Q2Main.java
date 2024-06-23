import java.util.Scanner;

public class Assignment5_Q2Main {

	public static void main(String[] args) {
		DLLL dlll = new DLLL();
//		dlll.addFirst(10);
//		dlll.addFirst(20);
//		dlll.addFirst(30);
//		dlll.addFirst(40);
		
		Scanner sc = new Scanner(System.in);
		int choice, value;
		
		while(true){
			System.out.println("");
			System.out.println("0: Exit ");
			System.out.println("1: Display Deque ");
			System.out.println("2: Add Element into Deque from Back ");
			System.out.println("3: Add Element into Deque from Front ");
			System.out.println("4: Remove Element from Deque from Back ");
			System.out.println("5: Remove Element from Deque from Front ");
			System.out.println("6: Peek Front Element from Deque ");
			System.out.println("7: Peek Back Element from Deque ");
			
			System.out.println("");
			System.out.print("Enter your Choice: ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Thank you for using the Program!");
				System.exit(0);
				break;
				
			case 1:
				dlll.display();
				break;
				
				
			case 2:
				System.out.println("Enter ELEMENT to be Added from Back into Deque: ");
				value = sc.nextInt();
				dlll.addLast(value);
				System.out.println(value + " added to Deque Back successfully!");
				break;
				
				
			case 3:
				System.out.println("Enter ELEMENT to be Added from Front into Deque: ");
				value = sc.nextInt();
				dlll.addFirst(value);
				System.out.println(value + " added to Deque Front successfully!");
				break;

				
			case 4:
				dlll.deleteLast();
				break;
				
			
			case 5:
				dlll.deleteFirst();
				break;

			case 6:
				dlll.peekfront();
				break;
				
			case 7:
				dlll.peekback();
				break;

				
			default:
				System.out.println("Invalid Choice! ");
				break;
			}
			
			
		}


	}

}


