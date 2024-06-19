
public class DescendingStackMain {

	public static void main(String[] args) {
		
		DescendingStack ds = new DescendingStack(5);
		
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		
		
		
		System.out.println(ds.peek());
		System.out.println(ds.pop());
		System.out.println(ds.peek());
		

		

	}

}
