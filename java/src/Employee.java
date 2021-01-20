
public class Employee {
	// Fields
		int id;
		String name;
		double salary;
	
	// default constructor	
	public Employee() {
			
	}
		
	// constructor to initialize id, name, salary
//	public Employee(int id, String name, double salary) {
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// Methods
	double incrementSalary() {
		salary += 5000;
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	

}
