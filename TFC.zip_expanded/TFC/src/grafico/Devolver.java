package grafico;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

public class Devolver extends Grafico {
	static ArrayList<String> clientes = new ArrayList<String>();
	static ArrayList<String> libros = new ArrayList<String>();
	static JFrame frameito;
	static Devolver uwu;

	public Devolver(Grafico frame) {
		clientear();
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
		frameito.setIconImage(Toolkit.getDefaultToolkit().getImage(Devolver.class.getResource("/images/libros.png")));
		frameito.getContentPane().setBackground(new Color(204, 204, 255));
		frameito.setBackground(Color.LIGHT_GRAY);
		frameito.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				XD().setVisible(true);
			}
		});
		frameito.setBounds(100, 100, 445, 185);
		frameito.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameito.getContentPane().setLayout(null);

		JComboBox CBname = new JComboBox();
		CBname.setBackground(new Color(204, 255, 255));
		CBname.setModel(new DefaultComboBoxModel(clientes.toArray(new String[0])));
		CBname.setBounds(153, 25, 226, 22);
		frameito.getContentPane().add(CBname);

		JLabel LB1 = new JLabel("Usuario:");
		LB1.setFont(new Font("Tahoma", Font.BOLD, 20));
		LB1.setBounds(35, 25, 89, 25);
		frameito.getContentPane().add(LB1);

		JButton B1 = new JButton("Confirmar usuario");
		B1.setForeground(new Color(0, 0, 0));
		B1.setBackground(new Color(204, 153, 153));
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Devolver2 obj2;
				try {
					obj2 = new Devolver2();
					obj2.main(null);
					obj2.setName(CBname.getSelectedItem().toString());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		B1.setBounds(120, 93, 171, 23);
		frameito.getContentPane().add(B1);

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
