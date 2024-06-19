import java.util.Scanner;

public class CircularQueueMain {

	public static void main(String[] args) {
		
		CircularQueue q = new CircularQueue(5);
		Scanner sc = new Scanner(System.in);
		
		int choice;
		while(true) {
			System.out.println("0. Exit");
			System.out.println("1. Push into Queue");
			System.out.println("2. Pop from Queue");
			System.out.println("3. Peek into Queue");

			System.out.println("Enter your choice - ");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 0:
				System.exit(0);
				break;

			case 1:
				if(q.isFull()) {
					System.out.println("Cannot push into Queue FULL!");
					break;
				}
				else {					
					System.out.println("Enter the value you want to push: ");
					int value  = sc.nextInt();
					
					q.push(value);
				}
				
				break;
				
				
			case 2:
				if(q.isEmpty()) {
					System.out.println("Empty Queue cannot POP");
					break;
				}
				else {					
					q.pop();
				}
				break;
				
				
			case 3:
				System.out.println("Value at Front: " + q.peek());
				break;
			}
			
			
		}

	}

}
