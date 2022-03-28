package tres;


import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Radio {
	public static void main(String[] args) {
	IHM2 ihm2 = new IHM2();
	}
}

class IHM2 {
	
	public IHM2() {
	
		
		CheckboxGroup miCheckboxGroup = new CheckboxGroup();
		
		Button miBoton =  new Button("Aceptar");
		miBoton.addActionListener(new MiActionListener(miCheckboxGroup));
		
		
		//Colocamos el objeto Choice sobre el Frame
		Frame miFrame = new Frame("Tutorial de JAva, AWT");
		miFrame.setLayout(new FlowLayout());
		miFrame.add(new Checkbox("A",true,miCheckboxGroup));
		miFrame.add(new Checkbox("B",false,miCheckboxGroup));
		miFrame.add(new Checkbox("C",false,miCheckboxGroup));
		miFrame.add(new Checkbox("D",false,miCheckboxGroup));
		miFrame.add(miBoton);
		miFrame.setSize(250,150);
		miFrame.setVisible(true);
		
		miFrame.addWindowListener(new Conclusion2() );
	}
	
}


class MiActionListener implements ActionListener{

	CheckboxGroup oCheckBoxGroup;
	
	MiActionListener(CheckboxGroup checkBGroup){
		
		oCheckBoxGroup = checkBGroup;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(oCheckBoxGroup.getSelectedCheckbox().getName() + " " + oCheckBoxGroup.getSelectedCheckbox().getLabel());
		
	}
	
	
	
}

class Conclusion2 extends WindowAdapter {
	public void windowClosing(WindowEvent evt) {
		System.exit(0);
	}
}


