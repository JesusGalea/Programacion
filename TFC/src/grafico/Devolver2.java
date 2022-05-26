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

public class Devolver2 {
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
	 */
	public Devolver2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox CBname = new JComboBox();
		CBname.setModel(new DefaultComboBoxModel(libros.toArray(new String[0])));
		CBname.setBounds(186, 21, 226, 22);
		frame.getContentPane().add(CBname);
		
		JLabel lblNewLabel = new JLabel(username);
		lblNewLabel.setBounds(163, 121, 46, 14);
		frame.getContentPane().add(lblNewLabel);
	}
	
	public void setName(String a) {
		username = a;
	}

	private void librear(String a) {
		try {
	           
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
             
            Statement statement = conexion.createStatement(); 
            ResultSet resultSet = statement.executeQuery("SELECT `Titulo` FROM `libros` JOIN `prestamo` ON `libros.ID` = `ID_Libro` WHERE `ID_Cliente` = (SELECT `ID` FROM `clientes` where `Nombre` = `"+username+"`); ");
       
             
            while (resultSet.next()) {
            	if(!libros.contains(resultSet.getString("Titulo"))){
                libros.add(resultSet.getString("Titulo"));
                
            }
            	
            }
            
            
             
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
           
        }
	}
	
	
}
