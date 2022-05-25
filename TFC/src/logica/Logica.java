package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Logica {

	public void insertar(int a, int b, int c ) throws SQLException {
		
		final String URL ="jdbc:mysql://localhost/biblioteca";
		final String USER = "root";
		final String PASS = "";
		int ID = a;
		int ID_Libro = b;
		int ID_Cliente = c;
		
		
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
					Statement statement = connection.createStatement();
			

				String query = "INSERT INTO `prestamo` VALUES ('"+a+"','"+b+"', '"+c+"', NOW())";
				statement.executeUpdate(query);
			
			
		

		
}
	

	public void update(int a, String b) throws SQLException {
		final String URL ="jdbc:mysql://localhost/biblioteca";
		final String USER = "root";
		final String PASS = "";


		
		
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
					Statement statement = connection.createStatement();
			

				String query = "update libros set Prestado = "+a+" where Titulo = '"+ b + "' ";
				statement.executeUpdate(query);
			
	}

	
}