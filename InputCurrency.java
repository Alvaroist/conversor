import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InputCurrency extends JFrame implements ActionListener{
	private JLabel textlabel;
	private JTextField textfield;
	private JComboBox list1;
	private JButton okbutton, cancelbutton;
	double money;
	String selection;

	public InputCurrency(){
        setLayout(null);
		setTitle("Currency");
		textlabel = new JLabel("Type the amount of money to convert");
     	textlabel.setBounds(15,10,200,30);
     	add(textlabel);

		textfield = new JTextField();
    	textfield.setBounds(100,50,150,30);
       	add(textfield);
		
		list1 = new JComboBox();
     	list1.setBounds(50,85,230,30);
        list1.addItem("Soles a Dollar");
     	list1.addItem("Soles a Euros");
		list1.addItem("Soles a Libras");
		list1.addItem("Soles a Yenes");
		list1.addItem("Soles a Yuanes");
		list1.addItem("Soles a Won");
		list1.addItem("Dallar a Soles");
		list1.addItem("Euros a Soles");
		list1.addItem("Libras a Soles");
		list1.addItem("Yenes a Soles");
		list1.addItem("Yuanes a Soles");
		list1.addItem("Won a Soles");
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
			money = Double.valueOf(textfield.getText()).doubleValue();
       		selection = list1.getSelectedItem().toString();
			switch(selection){
		     	case "Soles a Dollar": 
					money = money*3.73952;
					JOptionPane.showMessageDialog(null,"Son "+ money +"Dollars");
	             	break;
		     	case "Soles a Euros":
					money = money*0.24651;
					JOptionPane.showMessageDialog(null,"Son "+ money +" Euros");
		            break;
		     	case "Soles a Libras":
					money = money*0.21294;
					JOptionPane.showMessageDialog(null,"Son "+ money +" Libras");
             		break;
		     	case "Soles a Yenes":
					money = money*38.47842;
					JOptionPane.showMessageDialog(null,"Son "+ money +" Yenes");
             		break;
		     	case "Soles a Yuanes":
					money = money*1.95024;
					JOptionPane.showMessageDialog(null,"Son "+ money +" Yuanes");
					break;
		     	case "Soles a Won":
					money = money*355.19111;
					JOptionPane.showMessageDialog(null,"Son "+ money +" Won");
		     		break;
		     	case "Dallar a Soles":
			  		money = money*3.73952;
					JOptionPane.showMessageDialog(null,"Son "+ money +" Soles");
         		  	break;
		     	case "Euros a Soles": money = money*4.05650;
					JOptionPane.showMessageDialog(null,"Son "+ money +" Soles");
			  		break;
		     	case "Libras a Soles": money = money*4.69615;
					JOptionPane.showMessageDialog(null,"Son "+ money +" Soles");
			  		break;
		     	case "Yenes a Soles": money = money*0.02598;
					JOptionPane.showMessageDialog(null,"Son "+ money +" Soles");
			  		break;
		     	case "Yuanes a Soles": money = money*0.51275;
					JOptionPane.showMessageDialog(null,"Son "+ money +" Soles");
			  		break;
		     	case "Won a Soles": money = money*0.00281;
					JOptionPane.showMessageDialog(null,"Son "+ money +" Soles");
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