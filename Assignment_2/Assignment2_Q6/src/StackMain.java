import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		
		Stack s = new Stack(5);
	
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		while(true) {
			System.out.println("0. Exit");
			System.out.println("1. Push into Stack");
			System.out.println("2. Pop from Stack");
			System.out.println("3. Peek into Stack");
			System.out.println("4. Get Max Element of Stack");

			System.out.println("Enter your choice - ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 0:
				System.exit(0);
				break;

			case 1:
				if(s.isFull()) {
					System.out.println("Cannot push into Stack FULL!");
				}
				else {
					
					System.out.println("Enter the value you want to push: ");
					int value  = sc.nextInt();
					
					s.push(value);
				}
				
				break;
				
				
			case 2:
				if(s.isEmpty()) {
					System.out.println("Empty Stack cannot POP");
				}
				else {
					int value = s.pop();
					System.out.println(value + " successfully popped");
					
				}
				break;
				
				
			case 3:
				if(s.isEmpty()) {
					System.out.println("Empty Stack cannot PEEK");
					
				}
				else {	
					System.out.println("Value at Front: " + s.peek());
					break;
					
				}
				
			case 4:
				int maxele = s.getMax();
				System.out.println("Max Element of Stack : " + maxele);
				
				break;
			}
			

				
				
			}
			
						
		}

		
		
		

	}


