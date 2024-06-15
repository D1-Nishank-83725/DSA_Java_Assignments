import java.util.Scanner;

//iOLOK - Index of last occurrence of Key 

public class Assignment1_Q2 {


	public static int linearSearchIOLOK(int[] arr, int key) {
		int lastoccurenceindex = -1;
		for(int i = 0; i < arr.length; i++) {
			if(key == arr[i]) {
				lastoccurenceindex = i;
			}	
		}
		return lastoccurenceindex;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,2,4,4,2,1,8,9,7,4,2};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element whose last occurence index you want: ");
		int key = sc.nextInt();
		
		int iOLOK = linearSearchIOLOK(arr, key);
		
		System.out.println("Element "+ key + " occured last at " + iOLOK + " position");
		

	}


}
