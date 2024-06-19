
public class Stack {
	int arr[];
	int size;
	int top;
	int maxStack[];
    int maxTop;
	
	public Stack(int size) {
		this.size = size;
		arr = new int[size];
		top = -1;
		maxStack = new int[size];
		maxTop = -1;
	}
	
	
	public void push(int value) {
		arr[top+1] = value;
		System.out.println(value + " successfully pushed!");
		if(maxTop == -1 || value > maxStack[maxTop]) {
			maxStack[maxTop + 1] = value;
			maxTop++;
		}
		top++;
	}
	
	public int pop() {
		int poppedvalue = arr[top--];
		if(poppedvalue == maxStack[maxTop]) {
			maxTop--;
		}
		return poppedvalue;
		
	}
	
	public int peek() {
		return arr[top];	
	}


	public boolean isFull() {
		return top == size-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	
	public int getMax() {
		
		if(maxTop == -1) {
			System.out.println("Stack is Empty!");
			return -1;
		}
		return maxStack[maxTop];
	}
		
}
