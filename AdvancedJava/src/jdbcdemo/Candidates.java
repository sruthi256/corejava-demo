package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 7 Nov 2024
* Time   : 3:33:32 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class Candidates {

		Connection con=null;
		PreparedStatement pstmt; //accepts values at runtime - pre compiled statements
		ResultSet rs;
		
		int cnt=0;
		String sqlUpdate;
		Scanner s;
		int eid;
		String lastname;
		
		public void getConnections() throws Exception {
			con = ConnectionUtil.createConnection();
		}
		
		public void UpdateCandidate() throws Exception {
			sqlUpdate = "update candidates set last_name = ? where id = ?";
			pstmt= con.prepareStatement(sqlUpdate);
			
			// prepare data for update
			s=new Scanner(System.in);
			System.out.println("enter Employee id:");
			eid=s.nextInt();
			System.out.println("enter employee's new last name :");
			lastname=s.next();
					
			 // passing values to prepared statement using setter methods
			pstmt.setString(1, lastname);
			pstmt.setInt(2, eid);
			
			cnt=pstmt.executeUpdate();
			System.out.println(String.format("Row affected : %d", cnt));
			
			// reuse the prepared statement
	        lastname = "Clinton";
	        eid = 101;
	        pstmt.setString(1, lastname);
	        pstmt.setInt(2, eid);

	        cnt = pstmt.executeUpdate();
	        System.out.println(String.format("Row affected %d", cnt));
	        con.close();
		}
	

}
