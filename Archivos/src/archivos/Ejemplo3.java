package archivos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejemplo3 extends JFrame implements ActionListener {
    //contenedores dentro del panel
    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();
    JButton b1 = new JButton("Log in");
    JButton b2 = new JButton("Reset");
    JCheckBox showPassword = new JCheckBox("Show password");
    
    Ejemplo3(){
        setLayoutManager();
        setLocationAndSize();
        add();
        addevent();
    }
    public void setLayoutManager() {
        container.setLayout(null); //como un div
    }
    public void setLocationAndSize() {
          userLabel.setBounds(10,20,300,30);
          passwordLabel.setBounds(10,120,300,30);
          userTextField = new JTextField();
          userTextField.setBounds(10,60,300,30);
          passwordTextField = new JPasswordField();
          passwordTextField.setBounds(10,160,300,30);
          showPassword.setBounds(10,200,300,30);
          b1.setBounds(10, 240, 80, 30);
          b2.setBounds(230, 240, 80, 30);
         
    }
    public void addevent() {
        b1.addActionListener(this);
        b2.addActionListener(this);
        showPassword.addActionListener(this);
        
    }
    public void add() {
          container.add(userLabel);    
          container.add(passwordLabel);
          container.add(userTextField);    
          container.add(passwordTextField);
          container.add(showPassword);
          container.add(b1);
          container.add(b2);
          
    } 
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordTextField.getText();
            if (userText.equalsIgnoreCase("hola") && pwdText.equalsIgnoreCase("ese")) {
                JOptionPane.showMessageDialog(this, "estas dentro churri");
            }else {
                JOptionPane.showMessageDialog(this, "nos vemos primo");
            }
                
            }
        if (e.getSource() == b2) {
            passwordTextField.setText("");
            userTextField.setText("");
            }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordTextField.setEchoChar((char) 0);
            } else {
                passwordTextField.setEchoChar('*');
            }
        }
    }
    public static void main(String[] args) {
        Ejemplo3 frame = new Ejemplo3();
        frame.setTitle("login form");
        frame.setBounds(10,10,370,600);
        frame.setVisible(true);
    }

}