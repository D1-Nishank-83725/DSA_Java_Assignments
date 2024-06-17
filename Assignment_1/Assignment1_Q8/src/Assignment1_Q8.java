import java.util.Arrays;
import java.util.Scanner;

public class Assignment1_Q8 {

	public static void main(String[] args) {
		
		
		int[] arr = {10, 20, 15, 3, 4, 4, 1};
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element whose rank you want: ");
		int key = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("Rank of Element : " + (i+1) );
				System.exit(0);
			}
		}
		System.out.println("Element does not exist");
		
		
		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Element whose rank you want: ");
//		int key = sc.nextInt();
//		
//		int rankofelement = getRank(arr, key);
//		
//		if(rankofelement == -1) {
//			System.out.println("Element not present in Array!");
//			
//		}
//		else {			
//			System.out.println("The rank of element : " + rankofelement);
//		}
		
	}



}
