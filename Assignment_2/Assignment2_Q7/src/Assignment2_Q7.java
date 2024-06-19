import java.util.Arrays;

public class Assignment2_Q7 {

	public static void main(String[] args) {
		
		int[] arr = {11,22,33,44,55};
		
		Stack s = new Stack(arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0 ; i < arr.length ; i++) {
			s.push(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = s.pop();
		}
		
		System.out.println("Reversed Array : "  + Arrays.toString(arr));
		
	}

}
