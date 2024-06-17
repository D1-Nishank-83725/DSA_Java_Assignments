import java.util.Scanner;

public class Assignment1_Q6 {
	
	
	public static int linearSearchIONOK(int[] arr, int key, int n) {
		int nthoccurenceindex = -1;
		int nthoccurenceindexcount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(key == arr[i]) {
				nthoccurenceindex = i;
				nthoccurenceindexcount++;
			}	
			if(nthoccurenceindexcount == n) {
				return nthoccurenceindex;
			}
		}
		return -1;
	}
	

	public static void main(String[] args) {

	int[] arr = {1,3,5,2,4,4,2,1,8,9,7,4,2};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element whose index you want: ");
		int key = sc.nextInt();
		System.out.println("Enter the number of occurence you want: ");
		int noOfOccurence = sc.nextInt();
		
		int iOLOK = linearSearchIONOK(arr, key, noOfOccurence);
		
		System.out.println("Element "+ key + " occured "+ noOfOccurence +"th time at " + (iOLOK+1) + " position");
		
	}

}
