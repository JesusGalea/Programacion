package logica;
/**
 * @author Jesus
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Logica {

	/**
	 * 
	 * @param a = el ID del prestamo
	 * @param b = ID del libro
	 * @param c = ID del cliente
	 * @throws SQLException
	 */
	
	public void insertar(int a, int b, int c) throws SQLException {

		final String URL = "jdbc:mysql://localhost/biblioteca";
		final String USER = "root";
		final String PASS = "";
		int ID = a;
		int ID_Libro = b;
		int ID_Cliente = c;

		Connection connection = DriverManager.getConnection(URL, USER, PASS);
		Statement statement = connection.createStatement();

		String query = "INSERT INTO `prestamo` VALUES ('" + a + "','" + b + "', '" + c + "', NOW())";
		statement.executeUpdate(query);

	}

	/**
	 * 
	 * @param a = estado del libro 0 si esta disponible 1 si esta prestado
	 * @param c = ID del cliente
	 * @throws SQLException
	 */
	
	public void update(int a, int c) throws SQLException {
		final String URL = "jdbc:mysql://localhost/biblioteca";
		final String USER = "root";
		final String PASS = "";

		Connection connection = DriverManager.getConnection(URL, USER, PASS);
		Statement statement = connection.createStatement();

		String query = "update libros left join prestamo on IDl = ID_Libro SET Prestado = " + a + " where ID_Cliente = "
				+ c + " ";
		statement.executeUpdate(query);

	}
	
	/**
	 * 
	 * @param b = ID del cliente
	 * @throws SQLException
	 */

	public void delete(int b) throws SQLException {
		final String URL = "jdbc:mysql://192.168.0.109:3307\n"
				+ "/biblioteca";
		final String USER = "root";
		final String PASS = "";

		Connection connection = DriverManager.getConnection(URL, USER, PASS);
		Statement statement = connection.createStatement();

		String query = "DELETE FROM prestamo WHERE `prestamo`.`ID_Cliente` = " + b + "";
		statement.executeUpdate(query);

	}

}