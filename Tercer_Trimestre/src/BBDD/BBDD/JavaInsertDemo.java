package BBDD;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.*;
import java.sql.*;
import com.mysql.cj.*;

public class JavaInsertDemo {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception excep) {
			excep.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					conn.close();
			}catch (SQLException se) {}
			
			try {
				if(conn != null)
					conn.close();
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}