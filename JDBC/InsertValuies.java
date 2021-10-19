package JDBC;

import java.sql.*;
public class InsertValuies {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/employees";
		String uname = "root";
		String pass = "root";
		String query = "INSERT INTO registration(full_name, age) "
				+ "VALUES ('Ramesh Shah',20),"
				+ "('Shankarnath Sharma',19),"
				+ "('Ramnath Kandel',21)";
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		st.executeUpdate(query);
		System.out.println("Syccessfully executed");
		st.close();
		con.close();

	}

}
