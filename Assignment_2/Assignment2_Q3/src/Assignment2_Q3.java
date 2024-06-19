

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


public class Assignment2_Q3 {

	
	private static void sortempbasedonsalary(Employee[] employees) {
		for(int i = 1; i < employees.length; i++) {
			Employee temp = employees[i];
			int j = i - 1;
			
			
			while(j >= 0 && employees[j].salary > temp.salary) {
				employees[j+1] = employees[j];
				j--;
			}
			employees[j+1] = temp;
			
		}
		
	}
	

	public static void main(String[] args) {
		
		Employee[] employees = { new Employee(5, "Nishank", 50), new Employee(4, "Pritesh", 40),
                new Employee(3, "Eshwar", 30), new Employee(2, "Vaishak", 20), new Employee(1, "Vijay", 10) 
                };
		
		
		System.out.println("Before Sorting : ");
		
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		
		sortempbasedonsalary(employees);
		
		System.out.println("");
			
		System.out.println("After Sorting based on Salary (Ascending): ");
		
		for(Employee e : employees) {
			System.out.println(e);
		}
		

	}

	

}
