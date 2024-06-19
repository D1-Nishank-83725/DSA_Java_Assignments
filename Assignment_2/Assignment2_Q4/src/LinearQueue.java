
public class LinearQueue {
	
	private int front;
	private int rear;
	private final int size;
	private int arr[];
	
	
	public LinearQueue(int size) {
		this.size = size;
		front = 0;
		rear = 0;
		arr = new int[size];
	}
	
	public void push(int value) {
		arr[rear++] = value;
		System.out.println(value + " successfully pushed!");
	}
	
	public int pop() {
		return arr[front++];
		
	}
	
	public int peek() {
		return arr[front];	
	}
	
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return rear == size-1;
	}
	
	
	
}
