import java.util.Arrays;

public class Assignment1_Q9 {

	public static void main(String[] args) {

		int[] arr = {10, 20, 15, 3, 4, 4, 1};
		int comp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				comp++;
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Number of comparisons : " + comp);
	}

}
