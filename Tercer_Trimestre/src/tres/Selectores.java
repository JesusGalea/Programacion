package tres;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Selectores {
public static void main(String args[]) {

    IHM ihm= new IHM();

}


}
class IHM{

    public IHM() {


    Choice miChoice= new Choice();
    miChoice.add("Primer choice");
    miChoice.add("Segundo choice");
    miChoice.add("Tercer choice");

    //valor por defecto
    miChoice.select("Tercer choice");

    //Instanciamos y registramos un objeto ItemListener
    miChoice.addItemListener(new MiItemListener(miChoice));

    //colocamos el objeto choice sobre el Frame
    Frame miFrame= new Frame("Tutorial de Java,AWT");
    miFrame.setLayout(new FlowLayout());
    miFrame.add(miChoice);
    miFrame.setSize(250,150);
    miFrame.setVisible(true);

    miFrame.addWindowListener(new Conclusion());

    }


}


//clase para recibir los eventos
class MiItemListener implements ItemListener{


    Choice oChoice;

    MiItemListener(Choice choice){

        oChoice= choice;


    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        System.out.println(oChoice.getSelectedItem());
    }




}

class Conclusion extends WindowAdapter{
    public void windowClosing(WindowEvent evt) {

        System.exit(0);
    }


}