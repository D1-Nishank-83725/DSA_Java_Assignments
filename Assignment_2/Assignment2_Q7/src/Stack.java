
public class Stack {
	int arr[];
	int size;
	int top;
	
	public Stack(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
	}
	
	
	public void push(int value) {
		arr[top+1] = value;
		System.out.println(value + " successfully pushed!");
		top++;
	}
	
	public int pop() {
		return arr[top--];
		
	}
	
	public int peek() {
		return arr[top];	
	}
		
}
