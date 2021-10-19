package JDBC;
import java.sql.*;

public class Fetchvalues {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/employees";
		String uname = "root";
		String pass = "root";
		String query = "select * from registration" ;
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			System.out.print("Id: "+rs.getInt("id"));
			System.out.print(" ,Full Name: "+rs.getString("full_name"));
			System.out.print(" ,Age: "+rs.getInt("age"));
			System.out.println("");
		}
		st.close();
		con.close();

	}
}
