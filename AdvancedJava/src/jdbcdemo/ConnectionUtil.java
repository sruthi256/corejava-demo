package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
* Author : Kopparapu.Sruthi
* Date   : 7 Nov 2024
* Time   : 12:08:20 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/
//utility class to connect mysql server
public class ConnectionUtil {
	public static Connection createConnection() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","cfg@1234");
		return con;
	}


}
