package jdbcdemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
* Author : Kopparapu.Sruthi
* Date   : 7 Nov 2024
* Time   : 2:59:57 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class InsertDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		int count;
		
		try {
			con = ConnectionUtil.createConnection();
			String str = "INSERT into skills(name) values('Angular')";
			stmt = con.createStatement();
			count = stmt.executeUpdate(str);
			
			if(count > 0) {
				System.out.println("Record Inserted Successfully");
				
			}
			//count total number of records in the table
			String str1= "select count(id) from skills";
			rs= stmt.executeQuery(str1);
			int cnt = 0;
			while(rs.next()) {
				cnt = rs.getInt(1);
				
			}
			System.out.println("Total no of records  is : "+cnt);
		}
		catch(Exception e ) {
			System.out.println(e);

		}

	}

}
