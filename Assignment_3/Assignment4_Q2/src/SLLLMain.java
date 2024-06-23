import java.util.Scanner;

public class SLLLMain {

	public static void main(String[] args) {
		
		SLLL slll = new SLLL();
		slll.addFirst(10);
		slll.addFirst(20);
		slll.addFirst(30);
		slll.addFirst(40);
		
		Scanner sc = new Scanner(System.in);
		int choice, value, position;
		
		while(true){
			System.out.println("");
			System.out.println("0: Exit ");
			System.out.println("1: Display SLLL ");
			System.out.println("2: Add Element BEFORE entered Position to SLLL ");
			System.out.println("3: Add Element AFTER entered Position to SLLL ");
			
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
				System.out.println("Enter Position BEFORE which you want to insert Element: ");
				position = sc.nextInt();
				System.out.println("Enter ELEMENT to be entered in SLLL: ");
				value = sc.nextInt();
				slll.addBefore(value, position);
				System.out.println(value + " added successfully BEFORE " + position + " position");
				break;
				
				
			case 3:
				System.out.println("Enter Position AFTER which you want to insert Element: ");
				position = sc.nextInt();
				System.out.println("Enter ELEMENT to be entered in SLLL: ");
				value = sc.nextInt();
				slll.addAfter(value, position);
				System.out.println(value + " added successfully AFTER " + position + " position");
				break;

				
			default:
				System.out.println("Invalid Choice!");
				break;
			}
			
			
		}

	}

}
