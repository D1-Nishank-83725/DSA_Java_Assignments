
public class CircularQueue {
	
	int front;
	int rear;
	int arr[];
	int size;
	
	public CircularQueue(int size) {
		this.size = size;
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	
	public void push(int value) {
		arr[(rear+1)%size] = value;
		System.out.println(value + " successfully pushed!");
		rear++;
	}
	
	public int pop() {
		int value = (arr[(front+1)%size]);
		System.out.println(value  + " successfully popped!");
		front++;
		return value;
	}
	
	public int peek() {
		return arr[front+1];
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return rear == size-1;
	}
	

}
