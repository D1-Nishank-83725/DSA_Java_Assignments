import java.util.Scanner;

public class LinearQueueMain {

	public static void main(String[] args) {
		LinearQueue q = new LinearQueue(5);
		
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
				}
				
				System.out.println("Enter the value you want to push: ");
				int value  = sc.nextInt();
				
				q.push(value);
				break;
				
				
			case 2:
				if(q.isEmpty()) {
					System.out.println("Empty Queue cannot POP");
				}
				q.pop();
				break;
				
				
			case 3:
				System.out.println("Value at Front: " + q.peek());
				break;
			}
			
			
		}
		
//		q.push(10);
//		q.push(20);
//		q.push(30);
//		q.push(40);
//		
//		if(q.isFull()) {
//			System.out.println("Push not possible!");
//		}
//		System.out.println(q.peek());
//		System.out.println(q.pop());
//		System.out.println(q.peek());
//	
		
		
	}

}
