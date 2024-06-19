import java.util.Arrays;

public class Assignment2_Q2 {
	
	private static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] < temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	

	public static void main(String[] args) {
			
		int arr[] = {5,4,2,3,1};
		
			System.out.println("Before Sorting the Array : " + Arrays.toString(arr));
		
			insertionSort(arr);
		
			System.out.println("After Sorting the Array (Descending order) : " + Arrays.toString(arr));

	}
	
	

}
