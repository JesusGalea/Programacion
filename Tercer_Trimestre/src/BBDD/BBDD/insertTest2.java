package BBDD;
import java.sql.*;
public class insertTest2 {

	
		static final String DB_URL = "jdbc:mysql://localhost/tallercoches";
		static final String USER = "root";
		static final String PASS = "root";

		public static void main(String[] args) {
		    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = conn.createStatement();){
		        System.out.println("Insertando datos...");
		    } catch(SQLException e) {
		        e.printStackTrace();
		    }
		}
		}
	


