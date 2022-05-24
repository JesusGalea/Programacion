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
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;

public class Tomar extends Grafico {

	private JFrame frameito;
	private JTextField textField;
	private JComboBox comboBox;
   static ArrayList<String> libros = new ArrayList<String>();

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
		try {
           
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca", "root", "");
             
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from libros");
             
             
            while (resultSet.next()) {
                libros.add(resultSet.getString("Titulo"));
            }
             
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
           
        }
             
    
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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Logica obj1 = new Logica();
				try {
					obj1.insertar(1, 2, 3);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(147, 227, 89, 23);
		frameito.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(10, 25, 86, 20);
		frameito.getContentPane().add(textField);
		textField.setColumns(10);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel<String>(libros.toArray(new String[0])));
		comboBox.setBounds(10, 70, 226, 22);
		frameito.getContentPane().add(comboBox);
	}
}
