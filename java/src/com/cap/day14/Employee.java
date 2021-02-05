package com.cap.day14;

public class Employee implements Comparable<Employee> {
	// Fields
		private int id;
		private String name;
		private Double salary;
		
	
	// default/no-arg constructor	
	public Employee() {
			
	}
	
	
	
	
//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		Employee e = (Employee) obj;
//		return (e.name.equals(this.name));
//	}

		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}




	// constructor to initialize id, name, salary
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public boolean isAvailable() {
		return false;
	}
	
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	// String representation of an object
	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		return this.id - e.id;
//		return e.id - this.id;
//		return this.name.compareTo(e.name);
//		return (int)(this.salary - e.salary);
		
		
//		return e.salary.compareTo(this.salary);
//		if(this.id < e.id) {
//			return -1;
//		}
//		else if(this.id == e.id){
//			return 0;
//		}
//		else {
//			return 1;
//		}
	}




	public double incrementSalary(double incrementValue) {
		if(incrementValue < 0) {
			throw new RuntimeException("Salary increment cannot be negative");
		}
		this.salary += incrementValue;
		return this.salary;
	}


	

}
