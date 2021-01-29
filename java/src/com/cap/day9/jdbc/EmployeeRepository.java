package com.cap.day9.jdbc;
import java.sql.*;

public class EmployeeRepository {

	public static void main(String[] args) {
		
		try {
//			1. Load the driver
			Class.forName("com.mysql.jdbc.Driver");  
			
//			2. Create a connection to database
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/capdb","root","rootroot");  
			System.out.println("Connected to database");
			
//			3. Fire a sql query
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from employee");  
			
//			4. Extract the result from query
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			
//			5. Close the connection to database
			con.close();  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
//		
	}

}
