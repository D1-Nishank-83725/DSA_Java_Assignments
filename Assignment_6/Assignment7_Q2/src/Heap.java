
public class Heap {
	
	int SIZE;
	int arr[];
	
	public Heap(int size) {
		SIZE = 0;
		arr = new int[size + 1];
	}
	
	
	
	public void addHeap(int value) {
		SIZE++;
		arr[SIZE] = value;
		
		int ci = SIZE;
		int pi = ci/2;
		
		while(pi >= 1) {
			if(arr[pi] < arr[ci]) {
				break;
			}
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			ci = pi;
			pi = ci / 2;
			
			
		}
			
		
	}
	
	public int deleteHeap() {
		int min = arr[1];
		arr[1] = arr[SIZE];
		arr[SIZE] = min;
		
		SIZE--;
		
		int pi = 1;
		int ci = 2*pi;
		
		while(ci <= SIZE) {
			
			if((ci + 1) <= SIZE && arr[ci + 1] > arr[ci]) {
				ci = ci+1;
			}
			
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			pi = ci;
			ci = pi * 2;
		}
		
		return min;
	}
	
	
	
	public void display() {
		System.out.println("Heap Elements : ");
		for(int i = 1; i < SIZE + 1; i++) {
			System.out.print(arr[i] + " "); 
		}
		System.out.println();
		
	}

	
	public boolean isEmpty() {
		return SIZE == 0;
	}
	
	public boolean isFull() {
		return SIZE == arr.length-1;
	}
	
	public int getMax() {
		return arr[1];
	}
	
	
	public static void heapSort(int arr[]) {
		  Heap minHeap = new Heap(arr.length);

	        // Build min-heap
//	        for (int value : arr) {
//	            minHeap.addHeap(value);
//	        }
	        
	        for (int i = 0; i < arr.length; i++) {
	            minHeap.addHeap(arr[i]);
	        }

	        // Extract elements from heap and place them back in the arr in sorted order
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = minHeap.deleteHeap();
	        }	
	        
	}
	

}
