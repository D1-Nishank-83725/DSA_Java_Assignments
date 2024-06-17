import java.util.Arrays;
import java.util.Scanner;

public class Assignment1_Q3 {

	public static void printNoOfComparisons(int[] arr, int key) {
		int comp = 0;
		for(int i = 0; i < arr.length; i++) {
			comp++;
			if(arr[i] == key) {
				break;
			}
		}
		System.out.println("No of Comparison in Linear Search: " + comp);
		
		comp = 0;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	
		int left = 0, right = arr.length - 1, mid;
		while(left < right) {
			comp++;
			mid = (left + right) / 2;
			
			if(arr[mid] == key) {
				break;
			}
			else if(arr[mid] > key) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
					
		
		System.out.println("No of Comparison in Binary Search: " + comp);
		
		
		
	}

	public static void main(String[] args) {
		
		int[] arr = {5,6,7,21,2,4,44,7,12,53,7,3,1};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element you want to find: ");
		int key = sc.nextInt();
		
		printNoOfComparisons(arr, key);
		
		

	}


}
