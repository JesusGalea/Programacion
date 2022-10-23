package grafico;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import logica.Logica;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Devolver2 {
	Logica obj1 = new Logica();
	Logica obj2 = new Logica();
	static int idc;
	static String username;
	private JFrame frame;
	static ArrayList<String> libros = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Devolver2 window = new Devolver2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws SQLException
	 */
	public Devolver2() throws SQLException {

		initialize();
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws SQLException
	 */
	private void initialize() throws SQLException {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Devolver2.class.getResource("/images/libros.png")));
		frame.getContentPane().setBackground(new Color(204, 204, 255));
		frame.setBounds(100, 100, 445, 183);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("bienvenido/a " + username);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(57, 43, 339, 14);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Devolver Libros");
		btnNewButton.setBackground(new Color(204, 153, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				librear();

			}
		});
		btnNewButton.setBounds(132, 110, 169, 23);
		frame.getContentPane().add(btnNewButton);

	}

	public void setName(String a) {
		username = a;
	}

	private void librear() {
		try {

			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");

			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery(
					"SELECT * from libros WHERE IDl = ( SELECT ID_Libro FROM Prestamo WHERE ID_Cliente = (SELECT ID FROM clientes WHERE Nombre = \""
							+ username + "\" LIMIT 1) LIMIT 1) AND Prestado = 1 ");
			Statement statement2 = conexion.createStatement();
			ResultSet resultSet2 = statement2
					.executeQuery("SELECT * From clientes  where Nombre = \"" + username + "\"");
			// update libros set Prestado = 0 Where IDl = ()

			resultSet.next();

			String tt = resultSet.getString("Titulo");

			resultSet2.next();

			idc = resultSet2.getInt("ID");
			System.out.println(idc);
			obj1.update(0, idc);
			obj2.delete(idc);

			resultSet.close();
			statement.close();
		} catch (SQLException ex) {

		}

	}

}
