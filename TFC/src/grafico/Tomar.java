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

public class Tomar extends Grafico {

	private JFrame frameito;
	private JComboBox CBBook;
    static ArrayList<String> libros = new ArrayList<String>();
    static ArrayList<String> clientes = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tomar window = new Tomar();
					window.frameito.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tomar() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		librear();
		clientear();
    
		frameito = new JFrame();
		frameito.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
              XD().setVisible(true);
            }
        });
		frameito.setBounds(100, 100, 450, 300);
		frameito.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameito.getContentPane().setLayout(null);
		
		

		CBBook = new JComboBox();
		CBBook.setModel(new DefaultComboBoxModel(libros.toArray(new String[0])));
		CBBook.setBounds(10, 70, 226, 22);
		frameito.getContentPane().add(CBBook);
		
		JComboBox CBname = new JComboBox();
		CBname.setModel(new DefaultComboBoxModel(clientes.toArray(new String[0])));
		CBname.setBounds(10, 26, 226, 22);
		frameito.getContentPane().add(CBname);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Logica obj1 = new Logica();
				
				
				Connection conexion;
			
					try {
						conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
						Statement st1 = conexion.createStatement();
						Statement st2 = conexion.createStatement();
						Statement st3 = conexion.createStatement();
						
						ResultSet idRS = st1.executeQuery("SELECT * FROM `clientes` WHERE `Nombre` LIKE '" +CBname.getSelectedItem()+"'");
						ResultSet idRS2 = st2.executeQuery("SELECT * FROM `libros` WHERE `Titulo` LIKE '" +CBBook.getSelectedItem()+"'");
						ResultSet id = st3.executeQuery("SELECT * FROM `prestamo` ORDER BY ID DESC LIMIT 1");
						idRS2.next();
						idRS.next();
						id.next();
						
						
						int numero = id.getInt("ID") + 1;
						int id_libro = idRS2.getInt("ID");
						int id_cliente = idRS.getInt("ID");
						
						
						
						obj1.insertar(numero ,id_libro, id_cliente);
						obj1.update(1, idRS2.getString("Titulo"));
						
						
					} catch (SQLException e1) {
						
						e1.printStackTrace();
					}
					libros.clear();
					SwingUtilities.updateComponentTreeUI(frameito);
					
					
				    
					
					
					
					
					
			
				
				
		        
			}
		});
		btnNewButton.setBounds(147, 227, 89, 23);
		frameito.getContentPane().add(btnNewButton);
		
		
	}

	private void librear() {
		try {
	           
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
             
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `libros` WHERE `Prestado` = 0");
           
             
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
	
	private void clientear() {
		try {
	           
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
             
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `clientes`");
           
             
            while (resultSet.next()) {
            	if(!clientes.contains(resultSet.getString("Nombre"))){
                clientes.add(resultSet.getString("Nombre"));
            }
            	
            }
            
            
             
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
           
        }
	}
}
