package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author : Kopparapu.Sruthi
* Date   : 7 Nov 2024
* Time   : 4:17:53 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class DeleteDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		int cnt=0;
		
		try {
			con = ConnectionUtil.createConnection();
			String sql = "delete from candidates where rtrim(last_name) "+"like \'k%g\';";
			
			String sql1= "delete from candidates where id= 101;";
			
			stmt = con.createStatement();
			cnt =stmt.executeUpdate(sql);
			if(cnt>0) {
				System.out.println(cnt + "Records Deleted");
				
			}
			else {
				System.out.println("Records not found");
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
