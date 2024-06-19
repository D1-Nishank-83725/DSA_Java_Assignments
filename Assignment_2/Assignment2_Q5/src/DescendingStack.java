
public class DescendingStack {

	int[] arr;
	int size;
	int top;
	
	public DescendingStack(int size) {
		this.size = size;
		top = size;
		arr = new int[size];
	}

	
	public void push(int value) {
		arr[top-1] = value;
		System.out.println(value + " successfully pushed!");
		top--;
	}
	
	public int pop() {
		return arr[top++];
		
	}
	
	public int peek() {
		return arr[top];	
	}
	
	
}
