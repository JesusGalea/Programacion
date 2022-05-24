package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Logica {

	public static void insertar(int a, int b, int c ) throws SQLException {
		
		final String URL ="jdbc:mysql://localhost/biblioteca";
		final String USER = "root";
		final String PASS = "";
		int ID = a;
		int ID_Libro = b;
		int ID_Cliente = c;
		
		
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
					Statement statement = connection.createStatement();
			

				String query = "INSERT INTO `prestamo` (`ID`, `ID_Libro`, `ID_Cliente`, `fecha`) VALUES ('"+a+"', '"+b+"', '"+c+"',  NOW())";
				statement.executeUpdate(query);
			
			
		

		
}
}
