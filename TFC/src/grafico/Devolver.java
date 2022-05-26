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

public class Devolver extends Grafico{
	static ArrayList<String> clientes = new ArrayList<String>();
	private JFrame frameito;
	

	public Devolver(Grafico frame) {
		clientear();
		initialize();
		frameito.setVisible(true);
	  	
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		JButton B1 = new JButton("Confirmar usuario");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				Devolver2 obj1 = new Devolver2();
				obj1.main(null);
			
			}
		});
		B1.setBounds(33, 184, 117, 23);
		frameito.getContentPane().add(B1);
		
		JButton btnNewButton = new JButton("Devolver libro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(245, 184, 117, 23);
		frameito.getContentPane().add(btnNewButton);
		
		
		JComboBox CBname = new JComboBox();
		CBname.setModel(new DefaultComboBoxModel(clientes.toArray(new String[0])));
		CBname.setBounds(10, 26, 226, 22);
		frameito.getContentPane().add(CBname);
		
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
