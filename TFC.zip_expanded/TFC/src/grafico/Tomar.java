package grafico;

import java.awt.EventQueue;
import logica.Logica;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Tomar extends Grafico {

	private JFrame frameito;
	private JComboBox CBBook;
	static ArrayList<String> libros = new ArrayList<String>();
	static ArrayList<String> clientes = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public Tomar(Grafico frame) {
		initialize();
		frameito.setLocationRelativeTo(null);
		frameito.setResizable(false);
		frameito.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		librear();
		clientear();

		frameito = new JFrame();
		frameito.getContentPane().setBackground(new Color(204, 204, 255));
		frameito.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				XD().setVisible(true);
			}
		});
		frameito.setBounds(100, 100, 449, 216);
		frameito.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameito.getContentPane().setLayout(null);

		CBBook = new JComboBox();
		CBBook.setBackground(new Color(204, 255, 255));
		CBBook.setModel(new DefaultComboBoxModel(libros.toArray(new String[0])));
		CBBook.setBounds(183, 69, 226, 22);
		frameito.getContentPane().add(CBBook);

		JComboBox CBname = new JComboBox();
		CBname.setBackground(new Color(204, 255, 255));
		CBname.setModel(new DefaultComboBoxModel(clientes.toArray(new String[0])));
		CBname.setBounds(183, 26, 226, 22);
		frameito.getContentPane().add(CBname);

		JButton btnNewButton = new JButton("Tomar prestado");
		btnNewButton.setBackground(new Color(204, 153, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Logica obj1 = new Logica();

				Connection conexion;

				try {
					conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
					Statement st1 = conexion.createStatement();
					Statement st2 = conexion.createStatement();
					Statement st3 = conexion.createStatement();

					ResultSet idRS = st1.executeQuery(
							"SELECT * FROM `clientes` WHERE `Nombre` LIKE '" + CBname.getSelectedItem() + "'");
					ResultSet idRS2 = st2.executeQuery(
							"SELECT * FROM `libros` WHERE `Titulo` LIKE '" + CBBook.getSelectedItem() + "'");
					ResultSet id = st3.executeQuery("SELECT * FROM `prestamo` ORDER BY ID DESC LIMIT 1");
					idRS2.next();
					idRS.next();
					id.next();

					int numero = id.getInt("ID") + 1;
					int id_libro = idRS2.getInt("IDl");
					int id_cliente = idRS.getInt("ID");

					obj1.insertar(numero, id_libro, id_cliente);
					obj1.update(1, id_cliente);

				} catch (SQLException e1) {

					e1.printStackTrace();
				}
				libros.clear();

			}
		});
		btnNewButton.setBounds(147, 134, 131, 23);
		frameito.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(55, 30, 76, 14);
		frameito.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Libro");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(55, 71, 76, 14);
		frameito.getContentPane().add(lblNewLabel_1);

	}

	private void librear() {
		try {

			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");

			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM `libros` WHERE `Prestado` = 0");

			while (resultSet.next()) {
				if (!libros.contains(resultSet.getString("Titulo"))) {
					libros.add(resultSet.getString("Titulo"));
				}

			}

			resultSet.close();
			statement.close();
		} catch (SQLException ex) {

		}
	}

	private void clientear() {
		try {

			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");

			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM `clientes`");

			while (resultSet.next()) {
				if (!clientes.contains(resultSet.getString("Nombre"))) {
					clientes.add(resultSet.getString("Nombre"));
				}

			}

			resultSet.close();
			statement.close();
		} catch (SQLException ex) {

		}
	}
}
