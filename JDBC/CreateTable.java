package JDBC;
import java.sql.*;

/*No use of Exception Handling. Must use exception Handling Concepts in practical implementation
 * This is only for exam point of view
*/
public class CreateTable {

	public static void main(String[] args) throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/employees";
		String uname = "root";
		String pass = "root";
		String query = "CREATE TABLE registration"+
						"(id INTEGER PRIMARY KEY AUTO_INCREMENT,"+
						"full_name VARCHAR(255),"+
						"age INTEGER )"
						;
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Syccessfully executed");
		
		st.close();
		con.close();
	}

}
