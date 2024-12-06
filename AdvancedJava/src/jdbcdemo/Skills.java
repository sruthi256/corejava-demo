package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 * Author : Kopparapu.Sruthi
 * Date   : 7 Nov 2024
 * Time   : 4:44:13 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class Skills {
	Connection con;

	CallableStatement cstmt;
	ResultSet rs;

	int id;
	public Skills() throws Exception{
		con = ConnectionUtil.createConnection();
	}
	public void getSkills(int candidateId) throws Exception {
		cstmt = con.prepareCall("{ call get_candidate_skill(?)}");
		cstmt.setInt(1, candidateId);
		rs = cstmt.executeQuery();
		
		if(rs.getRow()==0) {
			System.out.println("No Skills");
		}else {
			do {
				System.out.println(String.format("%s - %s",
						rs.getString("first_name") + " "
								+ rs.getString("last_name"),
								rs.getString("skill")));
			
		}while(rs.next());

		/*while (rs.next()) {
			System.out.println(String.format("%s - %s",
					rs.getString("first_name") + " "
							+ rs.getString("last_name"),
							rs.getString("skill")));
		}*/
		con.close();
	}

}
}
