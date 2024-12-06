package jdbcdemo;
import java.sql.*;

/**
* Author : Kopparapu.Sruthi
* Date   : 7 Nov 2024
* Time   : 12:12:26 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/
// demonstrate projection
public class SelectDemo1 {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		ResultSet rs;
		
		try {
			con = ConnectionUtil.createConnection();
			stmt = con.createStatement();
			
			//projection
			rs= stmt.executeQuery("SELECT first_name, last_name, email from candidates order by last_name");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString("last_name")+"\t"+rs.getString("email"));
			}
			con.close();
			
		}
		catch(Exception ex){
			System.out.println(ex);
			
		}

	}

}
