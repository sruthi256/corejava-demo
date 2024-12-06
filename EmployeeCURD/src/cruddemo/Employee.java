package cruddemo;
import java.sql.*;
/**
 * Author : Kopparapu.Sruthi
 * Date   : 7 Nov 2024
 * Time   : 5:11:38 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */
// employee class to implement crud operations
public class Employee {
	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;

	public Connection getConnection()
	{
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "cfg@1234");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return con;
	}

	public void insertEmployee(String name, String city, String contactno)
	{
		try {
			con = getConnection();
			String query = "INSERT INTO employee (name, city, contactno) VALUES (?, ?, ?)";
			ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, city);
			ps.setString(3, contactno);
			ps.executeUpdate();
			System.out.println("** Employee Inserted **");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public void getEmployee()
	{
		try {
			con = getConnection();
			String query = "SELECT * FROM employee";
			st = con.createStatement();
			rs = st.executeQuery(query);
			System.out.println("** Display Employees **");
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") +
						", City: " + rs.getString("city") + ", Contact: " + rs.getString("contactno")+rs.getString("email_id"));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void updateEmployee(int id,String city)
	{
		try {
			con = getConnection();
			String query = "UPDATE employee SET city = ? WHERE id = ?";
			ps = con.prepareStatement(query);
			ps.setString(1, city);
			ps.setInt(2, id);
			ps.executeUpdate();
			System.out.println("** Employee Updated **");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void deleteEmployee(int id)
	{
		try {
			con = getConnection();
			String query = "DELETE FROM employee WHERE id = ?";
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
			System.out.println("** Employee Deleted **");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void updateEmployeeEmail(int id,String email_id) {
		try {
			con = getConnection();
			String query = "UPDATE employee SET email_id = ? WHERE id = ?";
			ps = con.prepareStatement(query);
			ps.setString(1,email_id);
			ps.setInt(2, id);
			ps.executeUpdate();
			System.out.println("** Email_id Updated **");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}



}
}