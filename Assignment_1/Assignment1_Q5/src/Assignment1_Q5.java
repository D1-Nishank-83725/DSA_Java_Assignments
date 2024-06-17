import java.util.Scanner;

public class Assignment1_Q5 {

	public static void binarySearch(int[] arr, int key) {
		
		int left = 0, right = arr.length - 1, mid;
		while(left <= right) {
			mid = (left + right) / 2;
			
			if(arr[mid] == key) {
				System.out.println("Array found at position: "+ mid);
				return;
			}
			else if(key > arr[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		System.out.println("Element not present in the Array!");
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {9,8,7,6,5,4,3,2,1};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element you want to find: ");
		int key = sc.nextInt();
		
		binarySearch(arr, key);
		

	}

}
