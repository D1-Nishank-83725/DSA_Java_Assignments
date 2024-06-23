
public class PriorityQueue {
	
	private Heap h;
	private final int pSIZE;
	
	public PriorityQueue(int pSIZE) {
		this.pSIZE = pSIZE;
		h = new Heap(pSIZE);
	}
	
	
	
	public void push(int value) {
		h.addHeap(value);
	}
	public void pop() {
		h.deleteHeap();
	}
	
	public void peek() {
		h.getMax();
	}
	
	public void isEmpty() {
		h.isEmpty();
	}
	public void isFull() {
		h.isFull();
	}
	
	
	public void display() {
		h.display();
	}
	

}
