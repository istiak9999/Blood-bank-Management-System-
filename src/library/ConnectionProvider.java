package library;
import java.sql.*;
public class ConnectionProvider {
	public static Connection  getcon()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jbdc:mysql://localhost:3306/bbms","root","12345678");
			return con;
		} catch (Exception e) {
			// TODO: handle exception
			return null ;
		}
		
		
		
	}
	
	
}
