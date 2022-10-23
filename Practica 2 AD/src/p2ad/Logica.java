package p2ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Logica {

	public void insertar(String a, String b, int c) throws SQLException {

		Connection conexion = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.109:3307/Hospital", "root", "root");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		}

		String sentenciaSql = "INSERT INTO `Pacientes` (`Nombre`, `Apellidos`, `ID Doctor`, `ID`) VALUES ('" + a
				+ "', '" + b + "', '" + c + "', NULL)";
		PreparedStatement sentencia = null;

		try {
			sentencia = conexion.prepareStatement(sentenciaSql);

			sentencia.executeUpdate();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			if (sentencia != null)
				try {
					sentencia.close();
				} catch (SQLException sqle) {
					sqle.printStackTrace();
				}
		}

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
		final String URL = "jdbc:mysql://192.168.0.109:3307\n" + "/hospital";
		final String USER = "root";
		final String PASS = "";

		Connection connection = DriverManager.getConnection(URL, USER, PASS);
		Statement statement = connection.createStatement();

		String query = "DELETE FROM prestamo WHERE `prestamo`.`ID_Cliente` = " + b + "";
		statement.executeUpdate(query);

	}
}
