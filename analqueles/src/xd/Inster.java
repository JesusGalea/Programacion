package xd;

import java.sql.*;

public class Inster {

	static final String URL = "jdbc:mysql://localhost/tontitos";
	
	static final String User = "root";
	
	static final String pass = "";
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection(URL, User, pass);
			
			Statement s = c.createStatement();
			
			String rs = ("insert into mamones VALUES('Alvaro', 'Maricón' , 23, 'parqueador')");
			
			s.executeUpdate(rs);
		
	}

}
