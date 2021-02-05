package com.cap.day9.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cap.day8.Employee;

public class EmployeeRepository {
	
	
	public static Connection getConnection() {
		Connection con = null;
		try {
//			1. Load the driver
			Class.forName("com.mysql.jdbc.Driver");  
			
//			2. Create a connection to database
			con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/capdb","root","rootroot");  
			System.out.println("Connected to database");	
		}
		catch(Exception e) {
			System.out.println("Connection couldn't be established");
			e.printStackTrace();
		}
		return con;
	}
	


	public List<Employee> findAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		try {
			
			Connection con = getConnection();

//			3. Fire a sql query
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from employee");  
			
			
//			4. Extract the result from query
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String salaryStr = rs.getString(3);
				System.out.println(id+"  "+ name +"  "+salaryStr); 
				Employee e = new Employee(id, name, Double.parseDouble(salaryStr));
				System.out.println(e);
				employees.add(e);
			}
				
			
//			5. Close the connection to database
			con.close();  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employees;
	}



	public int addEmployee(Employee emp) {
		Connection con = getConnection();
		int count = 0;
		try {
//			3. Fire a sql query
			PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?)"); 
			stmt.setInt(1, emp.getId());
			stmt.setString(2, emp.getName());
			stmt.setString(3, "" + emp.getSalary());
			count = stmt.executeUpdate();
			return count;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}

}
