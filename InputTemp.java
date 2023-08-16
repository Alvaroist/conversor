import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InputTemp extends JFrame implements ActionListener{
	private JLabel textlabel;
	private JTextField textfield;
	private JComboBox list1;
	private JButton okbutton, cancelbutton;
	double temperature;
	String selection;
	

	public InputTemp(){
        setLayout(null);
		setTitle("Temperature");
		textlabel = new JLabel("Ingrese la temperatura a convertir");
     	textlabel.setBounds(15,10,200,30);
     	add(textlabel);

     	textfield = new JTextField();
     	textfield.setBounds(100,50,150,30);
       	add(textfield);
		
		list1 = new JComboBox();
     	list1.setBounds(50,85,230,30);
     	list1.addItem("Grados Celsius a Grados Kelvin");
     	list1.addItem("Grados Celsius a Grados Farenheit");
		list1.addItem("Grados Celsius a Grados Rankine");
		list1.addItem("Grados Farenheit a Grados Celsius");
		list1.addItem("Grados Farenheit a Grados Kelvin");
		list1.addItem("Grados Farenheit a Grados Rankine");
		list1.addItem("Grados Kelvin a Grados Celsius");
		list1.addItem("Grados Kelvin a Grados Farenheit");
		list1.addItem("Grados Kelvin a Grados Rankine");
		list1.addItem("Grados Rankine a Grados Celsius");
		list1.addItem("Grados Rankine a Grados Farenheit");
		list1.addItem("Grados Rankine a Grados Kelvin");
		add(list1);
			
     	okbutton = new JButton("OK");
     	okbutton.setBounds(45,130,100,30);
		okbutton.addActionListener(this);
     	add(okbutton);
     		
     	cancelbutton = new JButton("Cancel");
     	cancelbutton.setBounds(185,130,100,30);
		cancelbutton.addActionListener(this);
     	add(cancelbutton);
   	}

	public void actionPerformed(ActionEvent e){
	   	if(e.getSource() == okbutton){
			temperature = Double.valueOf(textfield.getText()).doubleValue();
       		selection = list1.getSelectedItem().toString();
			switch(selection){
		    	case "Grados Celsius a Grados Kelvin": 
					temperature = temperature + 273;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Kelvin");
	             	break;
		     	case "Grados Celsius a Grados Farenheit":
					temperature = (9*temperature)/5 + 32;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Farenheit");
		            break;
		     	case "Grados Celsius a Grados Rankine":
					temperature = (9*temperature)/5 + 491.6;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Rankine");
             		break;
		     	case "Grados Farenheit a Grados Celsius":
					temperature = (5*temperature)/9 - 32;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Celsius");
             		break;
		     	case "Grados Farenheit a Grados Kelvin":
					temperature = (5*temperature)/9 + 460;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Kelvin");
					break;
		     	case "Grados Farenheit a Grados Rankine":
					temperature = temperature + 460;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Rankine");
		     		break;
		     	case "Grados Kelvin a Grados Celsius":
			  		temperature = temperature - 273;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Celsius");
         		  	break;
		     	case "Grados Kelvin a Grados Farenheit": temperature =(9*temperature)/5 - 460;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Farenheit");
			  		break;
		     	case "Grados Kelvin a Grados Rankine": temperature = 	(9*temperature)/5;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Rankine");
			  		break;
		     	case "Grados Rankine a Grados Celcios": temperature = temperature - 491.6;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Celsius");
			  		break;
		     	case "Grados Rankine a Grados Farenheit": temperature = temperature - 460;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Farenheit");
			  		break;
		     	case "Grados Rankine a Grados Kelvin": temperature = (5*temperature)/9;
					JOptionPane.showMessageDialog(null,"Son "+ temperature +" grados Kelvin");
		     		default: break;
		   	}
      	}
		if(e.getSource() == cancelbutton){
			Converter formulario1 = new Converter();
  	  		formulario1.setBounds(0,0,350,230);
  	  		formulario1.setVisible(true);
  	  		formulario1.setResizable(false);
  	  		formulario1.setLocationRelativeTo(null);
		}
    }
 public static void main (String args[]){
	
 }
}