import java.util.Scanner;

public class SCLLMain {

public static void main(String[] args) {
		
		SCLL scll = new SCLL();
		scll.addFirst(10);
		scll.addFirst(20);
		scll.addFirst(30);
		scll.addFirst(40);
		
		Scanner sc = new Scanner(System.in);
		int choice, value;
		
		while(true){
			System.out.println("");
			System.out.println("0: Exit ");
			System.out.println("1: Display SCLL ");
			System.out.println("2: Add ELEMENT to FIRST to SCLL ");
			System.out.println("3: Add ELEMENT to LAST to SCLL ");
			System.out.println("4: Add ELEMENT to POSITION to SCLL ");
			System.out.println("5: Delete FIRST ELEMENT of SCLL ");
			System.out.println("6: Delete LAST ELEMENT of SCLL ");
			System.out.println("7: Delete ELEMENT from POSITION, SCLL ");
			System.out.println("8: Delete All SCLL Elements ");
			
			System.out.println("");
			System.out.print("Enter your Choice: ");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 0:
				System.out.println("Thank you for using the Program!");
				System.exit(0);
				break;
				
			case 1:
				scll.display();
				break;
				
				
			case 2:
				System.out.println("Enter ELEMENT at FIRST to be entered in SCLL: ");
				value = sc.nextInt();
				scll.addFirst(value);
				System.out.println(value + " added to FIRST successfully!");
				break;
				
				
			case 3:
				System.out.println("Enter ELEMENT at LAST to be entered in SCLL: ");
				value = sc.nextInt();
				scll.addLast(value);
				System.out.println(value + " added to LAST successfully !");
				break;
				
			
			case 4:
				System.out.println("Enter POSITION in which element is to be entered in SCLL: ");
				int position = sc.nextInt();
				System.out.println("Enter ELEMENT to be entered in SCLL: ");
				value = sc.nextInt();
				
				scll.addAtPosition(value, position);
				System.out.println(value + " added to " + position + " successfully !");
				break;
				
			
		
				
			case 5:
				scll.deleteFirst();
				System.out.println("DELETED from FIRST successfully !");
				break;
				
				
			case 6:
				scll.deleteLast();
				System.out.println("DELETED from LAST successfully !");
				break;
				
			case 7:
				System.out.println("Enter POSITION in which element is to be deleted in SCLL: ");
				position = sc.nextInt();
				scll.deleteFromPosition(position);
				System.out.println("Deleted from Position : " + position + " successfully !");
				break;
				
			case 8:
				scll.deleteAll();
				break;
			
			
				
			default:
				System.out.println("Invalid Choice!");
				break;
			}
			
			
		}

	}

	

}
