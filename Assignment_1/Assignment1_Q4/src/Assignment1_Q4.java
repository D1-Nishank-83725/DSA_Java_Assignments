import java.util.Arrays;
import java.util.Scanner;

class Employee{
		
		int empid;
		String name;
		double salary;
		
		
		public Employee(int empid, String name, double salary) {
			super();
			this.empid = empid;
			this.name = name;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
		}
		
}



public class Assignment1_Q4 {
	
	public static void main(String[] args) {
		
		Employee[] employees = { new Employee(5, "Nishank", 50), new Employee(4, "Pritesh", 40),
                new Employee(3, "Eshwar", 30), new Employee(2, "Vaishak", 20), new Employee(1, "Vijay", 10) 
                };
		
//		System.out.println(Arrays.toString(employees));
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		while (true) {
			System.out.println("1. Search Employee by Employee ID: ");
			System.out.println("2. Search Employee by Employee Name: ");
			System.out.println("3. Search Employee by Employee Salary: ");
			System.out.println("4. Exit: ");
			
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter the ID of the employee you want to find: ");
				int id = sc.nextInt();
				int flag = 0;
				
				for(Employee emp : employees) {
					if(emp.empid == id) {
						System.out.println("Employee Found!");
						System.out.println(emp.toString());
						flag = 1;
						break;
					}
				}
				if(flag == 0) {
					System.out.println("Employee not present in the Array");
				}
				
				break;
			case 2:
				System.out.println("Enter the Name of the employee you want to find: ");
				String name = sc.next();
				
				flag = 0;
				
				for(Employee emp : employees) {
					if(emp.name.equals(name)) {
						System.out.println("Employee Found!");
						System.out.println(emp.toString());
						flag = 1;
						break;
					}
				}
				if(flag == 0) {
					System.out.println("Employee not present in the Array");
				}
				
				break;
				
			case 3:
				System.out.println("Enter the Salary of the employee you want to find: ");
				double salary = sc.nextDouble();
				flag = 0;
				
				for(Employee emp : employees) {
					if(emp.salary == salary) {
						System.out.println("Employee Found!");
						System.out.println(emp.toString());
						flag = 1;
						break;
					}
				}
				if(flag == 0) {
					System.out.println("Employee not present in the Array");
				}
				break;
				
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Choice!");
				break;
			}
		}
		
	}
	
	

}
