import java.util.Arrays;

public class Assignment2_Q1 {

	public static void main(String[] args) {
		
		int arr[] = {5,4,2,3,1};
		
		System.out.println("Before Sorting the Array : " + Arrays.toString(arr));
		
		int comp = insertionSort(arr);
		
		System.out.println("After Sorting the Array : " + Arrays.toString(arr));
		
		System.out.println("Comparisons Done: " + comp);
		
		

	}

	private static int insertionSort(int[] arr) {
		int comp = 0;
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp) {
				comp++;
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return comp;
	}

}
