package jdbcdemo;

import java.sql.Connection;
import java.sql.*;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 7 Nov 2024
 * Time   : 10:50:04 am
 * Email  : Kopparapu.Sruthi@coforge.com
 */
public class SimpleJDBCApplication {

	public static void main(String[] args) {
		try {
			//load the jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//establish the connection
			String url="jdbc:mysql://localhost:3306/classicmodels";
			String username="root";
			String password="cfg@1234";
			Connection connection=DriverManager.getConnection(url,username,password); 


			//execute the query
			Statement statement = connection.createStatement();
			String sql ="SELECT *  FROM employees";
			ResultSet resultSet = statement.executeQuery(sql);
			
			System.out.println("EmployeeNumber \t First Name \t Designation");

			//process the results
			while(resultSet.next()) {
				int id = resultSet.getInt("employeeNumber");
				String name = resultSet.getString("firstName");
				System.out.println( id + "\t\t"+ name+"\t\t"+ resultSet.getString("jobTitle"));
			}

			//close the resources
			resultSet.close();
			statement.close();
			connection.close();

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


