
public class HeapMain {

	public static void main(String[] args) {
		Heap h = new Heap(5);
//		
		
//		h.addHeap(10);
//		h.addHeap(20);
//		h.addHeap(50);
//		h.addHeap(30);
//		h.addHeap(40);
//		
//		h.display();
		
        int[] array = {10, 4, 7, 1, 3};
        
        System.out.println("Original array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        Heap.heapSort(array);
        
        System.out.println("Sorted array using min-heap:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

		
		
	}

	

}
