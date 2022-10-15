package grafico;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTextField;

import logica.Logica;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;

public class Usuarios extends Grafico {

	private JFrame frameito;
	private JTextField TF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the application.
	 * 
	 * @param j1
	 * @wbp.parser.entryPoint
	 */
	public Usuarios(Grafico frame) {
		initialize();
		frameito.setLocationRelativeTo(null);
		frameito.setResizable(false);
		frameito.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameito = new JFrame();
		frameito.getContentPane().setBackground(new Color(204, 204, 255));
		frameito.setIconImage(Toolkit.getDefaultToolkit().getImage(Usuarios.class.getResource("/images/libros.png")));
		frameito.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				XD().setVisible(true);
			}
		});
		frameito.setBounds(100, 100, 377, 230);
		frameito.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameito.getContentPane().setLayout(null);

		TF = new JTextField();
		TF.setBounds(196, 44, 155, 20);
		frameito.getContentPane().add(TF);
		TF.setColumns(10);

		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBackground(new Color(204, 153, 153));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String n = TF.getText();
				Connection conexion;

				try {
					conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
					Statement st3 = conexion.createStatement();
					Statement statement = conexion.createStatement();

					ResultSet id = st3.executeQuery("SELECT * FROM `clientes` ORDER BY ID DESC LIMIT 1");

					id.next();

					int numero = id.getInt("ID") + 1;

					String query = "INSERT INTO `clientes` VALUES ('" + numero + "', '" + n + "')";
					statement.executeUpdate(query);

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(54, 145, 109, 23);
		frameito.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setBackground(new Color(204, 153, 153));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String n = TF.getText();
				Connection conexion;

				try {
					conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
					Statement statement = conexion.createStatement();

					String query = "Delete FROM clientes WHERE Nombre = \"" + n + "\" ";
					statement.executeUpdate(query);

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(218, 145, 89, 23);
		frameito.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("Nombre de usuario:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 37, 184, 30);
		frameito.getContentPane().add(lblNewLabel);
	}
}
