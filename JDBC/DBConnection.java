package JDBC;
import java.sql.*;
/*
 * 1. import --> java.sql
 * 2. load  and register the driver --> com.mysql.jdbc.Driver
 * 3. Create Connection
 * 4. Create a Statement
 * 5. execute the query
 * 6. process the results
 * 7. close
*/

public class DBConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/employees";
		String uname = "root";
		String pass = "root";
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		
		/*Or we can directly pass the url, username and password for the db connection
		 * Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
		 * This is static connection and this is usually not preferred as we might need to code for each 
		 * connection seperately.
		 * For this, we usually make functions for db connection and Exception must be handled properly 
		 */
		st.close();
		con.close();
	}

}
